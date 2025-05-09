package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelperUser extends HelperBase{

    public HelperUser(WebDriver wd) {
        super(wd);
    }

    public void openLoginRegistrationForm(){
       // WebElement loginTab= wd.findElement(By.xpath("//a[text()='Login']"));
       // WebElement loginTab= wd.findElement(By.cssSelector("a[href='/login']"));
       // loginTab.click();

        click(By.cssSelector("a[href='/login']"));
    }

    public void fillLoginRegistrationForm(String login, String password){
    //   emailInput=wd.findElement(By.name("email"));
    //   emailInput.click();
    //   emailInput.clear();
    //   emailInput.sendKeys(login);

    //   WebElement passwordInput=wd.findElement(By.xpath("//input[last()]"));
    //   passwordInput.click();
    //   passwordInput.clear();
    //   passwordInput.sendKeys(password);

        type(By.name("email"), login);
        type(By.xpath("//input[last()]"), password);
    }

    public void submitLogin(){
        click(By.xpath("//button[text()='Login']"));
    }

    public boolean isLogged() {
        return isElrmentPresent(By.xpath("//button[text()='Sign Out']"));
    }

    public void logout() {
        click(By.xpath("//button[text()='Sign Out']"));
    }
}
