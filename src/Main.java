import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main (String[] args) throws InterruptedException {
//        System.out.println ("Hello");
        WebDriver driver = new ChromeDriver();
//        driver.manage().window().fullscreen();
//        Dimension d = new Dimension(480,690);
//        driver.manage().window().setSize(d);
//        driver.manage().window().fullscreen();
//        driver.get("https://www.google.com/");
//        Thread.sleep (3000) ;
//        System.out.println("Title - " + driver.getTitle());
        driver.get("https:/www.yandex.ru/");
        Thread.sleep (3000);
        System.out.println("Title - " + driver.getTitle());
//        driver.navigate().back();
//        Thread.sleep(3000);
//        System.out.println("Title - " + driver.getTitle());
//        driver.navigate().forward();
//        System.out.println("Title - " + driver.getTitle());
        System.out.println("Text of link - " + driver.findElement(By.xpath("//a[@data-id='video']")).getText());
        driver.close();
    }
}