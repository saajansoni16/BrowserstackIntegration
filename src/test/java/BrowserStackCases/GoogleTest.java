package BrowserStackCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.*;

public class GoogleTest extends BrowserStackTestNGTest{

    @Test(priority = 0)
    public void searchEpam(){
        jse.executeScript("browserstack_executor: {\"action\": \"setSessionName\", \"arguments\": {\"name\":\"EpamSearch\" }}");
        driver.findElement(By.name("q")).sendKeys("EPAM");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//div[@class='Ftghae']/div[2]/h2/span")).isDisplayed();
        String title = driver.findElement(By.xpath("//div[@class='Ftghae']/div[2]/h2/span")).getText();
        Assert.assertEquals(title, "EPAM Systems");
        jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"Passed\", \"reason\": \"Working as expected\"}}");
    }

    @Test(priority = 1)
    public void searchIndore(){
        jse.executeScript("browserstack_executor: {\"action\": \"setSessionName\", \"arguments\": {\"name\":\"IndoreSearch\" }}");
        driver.findElement(By.name("q")).sendKeys("Indore");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//div[@class='fYOrjf kp-hc']/descendant::h2/span")).isDisplayed();
        String title = driver.findElement(By.xpath("//div[@class='fYOrjf kp-hc']/descendant::h2/span")).getText();
        Assert.assertEquals(title, "Indore");
        jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"Passed\", \"reason\": \"Working as expected\"}}");
    }

    @Test(priority = 2)
    public void searchPune(){
        jse.executeScript("browserstack_executor: {\"action\": \"setSessionName\", \"arguments\": {\"name\":\"PuneSearch\" }}");
        driver.findElement(By.name("q")).sendKeys("Pune");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//div[@class='fYOrjf kp-hc']/descendant::h2/span")).isDisplayed();
        String title = driver.findElement(By.xpath("//div[@class='fYOrjf kp-hc']/descendant::h2/span")).getText();
        Assert.assertEquals(title, "Punee");
        jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"Passed\", \"reason\": \"Working as expected\"}}");
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
