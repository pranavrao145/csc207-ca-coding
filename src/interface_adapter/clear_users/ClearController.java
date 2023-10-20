package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;

public class ClearController {
    final ClearInputBoundary clearUserSignUpInteractor;

    public ClearController(ClearInputBoundary clearUserSignUpInteractor) {
        this.clearUserSignUpInteractor = clearUserSignUpInteractor;
    }

    public void execute() {
        clearUserSignUpInteractor.execute();
    }
}
