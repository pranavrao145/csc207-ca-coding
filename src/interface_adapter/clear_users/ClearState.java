package interface_adapter.clear_users;

import java.util.ArrayList;

public class ClearState {
    private ArrayList<String> deletedUsers = new ArrayList<String>();

    public ClearState(ClearState copy) {
        this.deletedUsers = copy.deletedUsers;
    }

    public ClearState() {
    }

    public ArrayList<String> getDeletedUsers() { return deletedUsers; }

    public void setDeletedUsers(ArrayList<String> deletedUsers) {
        this.deletedUsers = deletedUsers;
    }
}
