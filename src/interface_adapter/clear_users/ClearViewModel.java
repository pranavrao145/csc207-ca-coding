package interface_adapter.clear_users;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import interface_adapter.ViewModel;

public class ClearViewModel extends ViewModel {
    private ClearState state = new ClearState();

    public static final String TITLE_LABEL = "Last Cleared Users";
    public static final String OK_LABEL = "OK";

    public ClearViewModel() {
        super("clear");
    }

    public ClearState getState() {
        return state;
    }

    public void setState(ClearState state) {
        this.state = state;
    }

    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    public void firePropertyChanged() {
        support.firePropertyChange("clearState", null, this.state);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

}
