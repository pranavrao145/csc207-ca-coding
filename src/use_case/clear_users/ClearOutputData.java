package use_case.clear_users;

import java.util.ArrayList;

public class ClearOutputData {
    private final ArrayList<String> usersDeleted;


    public ClearOutputData(ArrayList<String> usersDeleted) {
        this.usersDeleted = usersDeleted;
    }

    public ArrayList<String> getUsersDeleted() {
        return usersDeleted;
    }
}
