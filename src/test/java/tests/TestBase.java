package tests;

import manager.AppllicationManager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

   static AppllicationManager app=new AppllicationManager();

   @BeforeSuite
   public void setApp(){
       app.init();
   }

   @AfterSuite
   public void tearDown(){
       app.stop();
   }
}
