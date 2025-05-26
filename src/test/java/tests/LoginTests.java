package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{


    @BeforeMethod
    public void preCondition(){
        //if Sign Out present ---> logout
        if(app.getHelperUser().isLogged()){
            app.getHelperUser().logout();
            logger.info("Before method finish logout");
        }
    }

    @Test
    public void loginSuccess(){
        logger.info("Start test with name 'loginSuccess'");
        app.getHelperUser().openLoginRegistrationForm();
        app.getHelperUser().fillLoginRegistrationForm("margo@gmail.com","Mmar123456$");
        logger.info("Test data --> email: 'margo@gmail.com' & password: 'Mmar123456$'");
        app.getHelperUser().submitLogin();

//       Assert.assertEquals();
//       Assert.assertNotEquals();
//       Assert.assertTrue();
//       Assert.assertFalse();

        Assert.assertTrue(app.getHelperUser().isLogged());
        logger.info("Assert check is element button 'Sign out' present");

    }

    @Test
    public void loginSuccessModel(){
        app.getHelperUser().openLoginRegistrationForm();
        app.getHelperUser().fillLoginRegistrationForm("margo@gmail.com","Mmar123456$");
        logger.info("Test data --> email: 'margo@gmail.com' & password: 'Mmar123456$'");
        app.getHelperUser().submitLogin();

        Assert.assertTrue(app.getHelperUser().isLogged());
        logger.info("Assert check is element button 'Sign out' present");

    }

    @Test
    public void loginWrongEmail(){
        app.getHelperUser().openLoginRegistrationForm();
        app.getHelperUser().fillLoginRegistrationForm("maragmail.com","Mmar123456$");
        logger.info("Test data --> email: 'maragmail.com' & password: 'Mmar123456$'");
        app.getHelperUser().submitLogin();
        Assert.assertTrue(app.getHelperUser().isAlertPresent("Wrong email or password"));
        logger.info("Assert check is  alert present with text 'Wrong email or password'");

    }
    @Test
    public void loginWrongPassword(){
        app.getHelperUser().openLoginRegistrationForm();
        app.getHelperUser().fillLoginRegistrationForm("mara@gmail.com","Mmar123");
        logger.info("Test data --> email: 'mara@gmail.com' & password: 'Mmar123'");

        app.getHelperUser().submitLogin();
        Assert.assertTrue(app.getHelperUser().isAlertPresent("Wrong email or password"));
        logger.info("Assert check is  alert present with text 'Wrong email or password'");

    }
    @Test
    public void loginWrongUnregisteredUser(){
        app.getHelperUser().openLoginRegistrationForm();
        app.getHelperUser().fillLoginRegistrationForm("boris@gmail.com","Bbor123456$");
        logger.info("Test data --> email: 'boris@gmail.com' & password: 'Bbor123456$'");

        app.getHelperUser().submitLogin();
        Assert.assertTrue(app.getHelperUser().isAlertPresent("Wrong email or password"));
        logger.info("Assert check is  alert present with text 'Wrong email or password'");

    }

}
