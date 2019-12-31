import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToMishpahugNegative {
    public static void main (String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mishpahug.co.il/");
        Thread.sleep (3000);
        driver.findElement(By.id("closedIntro")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("idsignin")).click();
        Thread.sleep(3000);
        WebElement loginInput = driver.findElement(By.id("logininput"));
        WebElement passwordInput = driver.findElement(By.id("passwordinput"));
        loginInput.click();
        loginInput.clear();
        loginInput.sendKeys("GuestFamily1");
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys("1234567");
        driver.findElement(By.id("signinrequest")).click();
        Thread.sleep(5000);

        System.out.println("Message - " + driver.findElement(By.id("wrongloginorpassword")).getText());
        driver.close();
    }

}
