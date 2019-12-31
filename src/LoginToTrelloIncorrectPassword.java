import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToTrelloIncorrectPassword  {

    public static void main(String[] args) throws InterruptedException {
//    ----------------enter to trello----------
        WebDriver driver = new ChromeDriver();
        driver.get("https://trello.com/");
        Thread.sleep(3000);
//        -------- Login to the system ---------
        driver.findElement(By.xpath("//a[@class='btn btn-sm btn-link text-white']")).click();
        Thread.sleep(5000);
        WebElement loginInput = driver.findElement(By.id("user"));
        loginInput.click();
        loginInput.clear();
        loginInput.sendKeys("lanaioffe@mail.ru");
        Thread.sleep(5000);
        driver.findElement(By.id("login")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("login-submit")).click();
        Thread.sleep(5000);
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys("abcdefjh2");
        driver.findElement(By.id("login-submit")).click();
        Thread.sleep(5000);
        System.out.println("Message: " + driver.findElement(By.xpath("//div[@id='login-error']")).getText());

        Thread.sleep(3000);


        driver.quit();
    }
}



