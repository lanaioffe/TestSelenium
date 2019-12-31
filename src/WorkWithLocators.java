
//video from class "L"essonHaifa QA-4 Auto Sel-03-part1 2019-12-17", "LessonHaifa QA-4 Auto Sel-03-part2 2019-12-17"
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WorkWithLocators {
    public static void main(String[] args) throws InterruptedException {
        // --------- Enter to the system Mishpahug------
        WebDriver driver = new ChromeDriver();
        driver.get("https://mishpahug.co.il/");
        driver.manage().window().fullscreen();
        Thread.sleep(10000);
        driver.findElement(By.id("closedIntro")).click();
        Thread.sleep(5000);
        //------ By locator "Name" -------
        List<WebElement> listOfSelects = driver.findElements(By.tagName("select"));
        for(WebElement element: listOfSelects){
            System.out.println("Name: " + element.getAttribute("name"));
        }
        System.out.println("Quantity of select-elements: " + listOfSelects.size());

        //------- By ClassName----------------------
        List<WebElement> listEvents = driver.findElements(By
                .className("divTitleItemEvents"));
        for(WebElement element: listEvents){
            System.out.println("Class: " + element.getAttribute("class"));
        }
        //---------- By linkText ---------------
        List<WebElement> listAnchorsMore = driver.findElements(By.
                linkText("more..."));
        for(WebElement element: listAnchorsMore){
            System.out.println("Link to: " + element.getAttribute("href"));
        }
        //--------- By locators CSS and XPath---------------
        Select filterByHoliday = new Select(driver
                .findElement(By.cssSelector("select[name='selectholidays']")));
        filterByHoliday.selectByValue("Shabbat");
        Thread.sleep(5000);
        for(WebElement element: driver.findElements(By
                .xpath("//div[@class='holidayItemEvents']"))){
            System.out.println(element.getText());
        }
        Thread.sleep(3000);
        //[id='selectholidays'] select
        //- //*[@id='selectholidays']//select
        // #selectholidays select

        //------- list of select-elements inside element with class = 'itemfilter'
        List<WebElement> listSelectElements = driver.findElements(By
                .cssSelector("div[class='itemfilter'] select"));
        for(WebElement element: listSelectElements){
            System.out.println("Name: " + element.getAttribute("name"));
        }
        //div.itemfilter select


        driver.quit();
    }
}