package tests;

import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
    public void loginSuccess(){

        app.getHelperUser().openLoginRegistrationForm();

        app.getHelperUser().fillLoginRegistrationForm("atteloiv963@gmail.com", "Atteloiv369!");

        app.getHelperUser().submitLogin();
    }
}
