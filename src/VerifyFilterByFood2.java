import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyFilterByFood2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        //===========Enter to Mishpahug system====
        driver.get("https://mishpahug.co.il/");
        driver.manage().window().fullscreen();
        Thread.sleep(5000);
        driver.findElement(By.id("closedIntro")).click();
        Thread.sleep(5000);

        // ============Events filtering by food====
        Select filterByFood = new Select(driver.findElement(By.cssSelector("select[name='selectfood']")));
        filterByFood.selectByValue("Kosher");
        Thread.sleep(5000);
        System.out.println("by locators css and xpath");

        // ==========Events info verification =====
        int counter=0;
        for (WebElement element : driver.findElements(By.xpath("//div[@class='itemEventInsert']"))) {
            counter++;
            System.out.println("Kosher Event#" + counter + " - " + element.findElement(By
                    .xpath(".//i[@class='fa fa-cutlery']/..")).getText().equals(" Kosher  "));
            System.out.println("Description: " + element.findElement(By
                    .xpath(".//div[@class='divTitleItemEvents']/div")).getText());
            System.out.println("Confession: " + element.findElement(By.xpath(".//i[@class='fa fa-book']/..")).getText());
            System.out.println("Languages: " + element.findElement(By.xpath(".//i[@class='fa fa-globe']/..")).getText());
            System.out.println(element.findElement(By.xpath(".//div[@class = 'familyNameItemEvents']")).getText());

            System.out.println();
        }
        driver.quit();
    }
}
