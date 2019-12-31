import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class VerifyFilterByFood {
    public static void main(String[] args) throws InterruptedException {
        // --------- Enter to the system Mishpahug------
        WebDriver driver = new ChromeDriver();
        driver.get("https://mishpahug.co.il/");
        Thread.sleep(3000);
        driver.findElement(By.id("closedIntro")).click();
        Thread.sleep(3000);

//       ----------------- filter by Kosher------------
        Select filterByFood = new Select(driver.findElement(By.cssSelector("select[name='selectfood']")));
        filterByFood.selectByValue("Kosher");
        Thread.sleep(3000);

//        ------are all Kosher?-----
        List<WebElement> foodList = driver.findElements(By.xpath("//i[@class='fa fa-cutlery']/.."));
        int counter=0;
        for(WebElement element: foodList) {
            counter++;
            System.out.println("Event#" + counter + " - " + element.getText().equals(" Kosher  "));
        }
        Thread.sleep(5000);

//        ------------------print title------
      List<WebElement> listTitle = driver.findElements(By.cssSelector("div[class='divfullflexcenter titleItemEvents shadowtextblack']"));
        for (WebElement element: listTitle) {
            System.out.println("Title: " + element.getText());
        }
        Thread.sleep(3000);


//        -------print confession------
        for(WebElement element: driver.findElements(By.xpath("//i[@class= 'fa fa-book']/.."))){    // /.. move down
            System.out.println("Confession: "  + element.getText());
        }
        Thread.sleep(5000);

//        ------------------print languages-------
        for (WebElement element: driver.findElements(By.className("fa fa-globe"))) {
            System.out.println("Language: " + element.getText());
        }
//        ------------------print holiday-------
        List<WebElement> listHoliday = driver.findElements(By.className("holidayItemEvents"));
        for (WebElement element: listHoliday) {
            System.out.println("Holiday: " + element.getText());
        }
        Thread.sleep(5000);

//        ------------------print family-------
        List<WebElement> listFamilyName = driver.findElements(By.cssSelector("div[class='familyNameItemEvents']"));
        for (WebElement element: listFamilyName) {
            System.out.println(element.getText());
        }
        Thread.sleep(5000);

        driver.quit();
    }
}
