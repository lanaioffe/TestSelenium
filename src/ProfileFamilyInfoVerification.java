import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProfileFamilyInfoVerification {
    public static void main(String[] args) throws InterruptedException {
        // --------- Enter to the system Mishpahug------
        WebDriver driver = new ChromeDriver();
        driver.get("https://mishpahug.co.il/");
        driver.manage().window().fullscreen();
        Thread.sleep(10000);
        driver.findElement(By.id("closedIntro")).click();
        Thread.sleep(5000);
        // -------- Login to the system ---------
        driver.findElement(By.id("idsignin")).click();
        Thread.sleep(5000);
        WebElement loginInput = driver.findElement(By.id("logininput"));
        WebElement passwordInput = driver.findElement(By.id("passwordinput"));
        loginInput.click();
        loginInput.clear();
        loginInput.sendKeys("marinaA");
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys("marina1!");
        driver.findElement(By.id("signinrequest")).click();
        Thread.sleep(5000);
        // -------- Enter to profile page --------------------
        driver.findElement(By.id("profile")).click();
        Thread.sleep(5000);
        //--------- Save confession, language, food values on profile page -------
        String confessionProfile = driver.findElement(By.id("fieldobjconfession")).getText();
        String languagesProfile = driver.findElement(By.id("fieldobjlanguages")).getText();
        String foodProfile = driver.findElement(By.id("fieldobjfoodPreferences")).getText();
        System.out.println(confessionProfile + " " + languagesProfile + " " + foodProfile + " ");
        // --------- Enter to family page
        driver.findElement(By.id("family")).click();
        Thread.sleep(5000);
        //--------- Compare confession, language, food values with corresponding values on profile page
        System.out.println("Confessions values are the same: " +
                driver.findElement(By.id("fieldobjconfession")).getText().equals(confessionProfile));
        System.out.println("Languages values are the same: " +
                driver.findElement(By.id("fieldobjlanguages")).getText().equals(languagesProfile));
        System.out.println("Food values are the same: " +
                driver.findElement(By.id("fieldobjfoodPreferences")).getText().equals(foodProfile));
        //------- Return to profile page
        driver.findElement(By.id("profile")).click();
        Thread.sleep(5000);
        //-------- sign out from the system-------
        driver.findElement(By.id("idbtnsignoutprofile")).click();
        Thread.sleep(5000);


        driver.quit();


    }
}