import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToMishpahug {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mishpahug.co.il/");
        driver.manage().window().fullscreen();
        Thread.sleep(10000);
        driver.findElement(By.id("closedIntro")).click(); // close window
        Thread.sleep(5000);
        driver.findElement(By.id("idsignin")).click(); // click on login
        Thread.sleep(5000);
        WebElement loginInput = driver.findElement(By.id("logininput"));
        WebElement passwordInput = driver.findElement(By.id("passwordinput"));
        loginInput.click();
        loginInput.clear();
        loginInput.sendKeys("marinaA"); //put username
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys("marina1!"); // put password
        driver.findElement(By.id("signinrequest")).click(); // click sign in
        Thread.sleep(5000);
        WebElement listEvents = driver.findElement(By.id("idtitletypesearchevents"));
        System.out.println("listEvents text - " + listEvents.getText());
        WebElement profileIcon = driver.findElement(By.id("profile"));
        System.out.println("profileIcon title - " + profileIcon
                .getAttribute("title"));

        driver.close();
    }
}
