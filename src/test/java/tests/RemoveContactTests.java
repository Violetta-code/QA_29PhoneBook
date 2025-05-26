package tests;

import models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveContactTests extends TestBase{

    @BeforeMethod
    public void preCondition(){
        if(!app.getHelperUser().isLogged()){
            app.getHelperUser().login(new User().withEmail("margo@gmail.com").withPassword("Mmar123456$"));
        }

        app.getHelperContact().provideContacts();///if list of contact <3 --> add 3 contacts
    }

    @Test
    public void removeFirstContact(){
        Assert.assertEquals(app.getHelperContact().removeOneContact(),1);
    }

    @Test
    public void removeAllContacts(){
        //"No Contacts Here"
        app.getHelperContact().removeAllContacts();
        Assert.assertTrue(app.getHelperUser().isNoContactsHereDisplayed());
    }


}