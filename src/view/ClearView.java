package view;

import interface_adapter.clear_users.ClearState;
import interface_adapter.clear_users.ClearViewModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

import javax.swing.*;

public class ClearView
    extends JDialog implements ActionListener, PropertyChangeListener {
    public final String viewName = "clear";

    private final ClearViewModel clearViewModel;
    private final JList<String> deletedUsers;
    private final JButton ok;

    public ClearView(ClearViewModel clearViewModel) {
        this.clearViewModel = clearViewModel;
        ClearView.this.clearViewModel.addPropertyChangeListener(this);

        JLabel title = new JLabel(ClearViewModel.TITLE_LABEL);
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        deletedUsers = new JList<String>();
        this.deletedUsers.setAlignmentX(Component.CENTER_ALIGNMENT);

        this.ok = new JButton(ClearViewModel.OK_LABEL);
        this.ok.setAlignmentX(Component.CENTER_ALIGNMENT);

        ok.addActionListener(this);

        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));

        this.add(title);
        this.add(this.deletedUsers);
        this.add(this.ok);

        this.pack();
        this.setMinimumSize(new Dimension(300, 300));
    }

    public void actionPerformed(ActionEvent evt) {
        this.setVisible(false);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        ClearState state = (ClearState) evt.getNewValue();

        ArrayList<String> deletedUsers = state.getDeletedUsers();
        String[] usersArray = new String[deletedUsers.size()];

        for (int i = 0; i < deletedUsers.size(); i++) {
            usersArray[i] = deletedUsers.get(i);
        }

        this.deletedUsers.setListData(usersArray);
    }
}
