import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrelloDeleteList {

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
        driver.findElement(By.id("login")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("login-submit")).click();
        Thread.sleep(5000);
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys("Rainbow02");
        driver.findElement(By.id("login-submit")).click();
        Thread.sleep(5000);

//        ----Open 'QA 4 Auto' board--------
        driver.findElement(By.xpath("//div[@class='board-tile-details is-badged']")).click();
        Thread.sleep(5000);

//      -----Add a new list------
        driver.findElement(By.cssSelector(".placeholder")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".list-name-input"))
                .sendKeys("New List");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(5000);


//      -----Delete New list------

        driver.findElement(By.xpath("//div[4]//div[1]//div[1]//div[2]//a[1]")).click();
        Thread.sleep(5000);




        driver.quit();
    }
}

