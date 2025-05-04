package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppllicationManager {

    WebDriver wd;

    public void init(){
        wd=new ChromeDriver();
     // wd.get("https://telranedu.web.app");
        wd.navigate().to("https://telranedu.web.app");
    }

    public void stop(){
        wd.quit();
    }
}
