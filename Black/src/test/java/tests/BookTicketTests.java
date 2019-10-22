package tests;

import com.headout.constants.BaseConstant;
import com.headout.helper.BookTicketHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.lang.model.util.Elements;
import java.util.List;

public class BookTicketTests {
    WebDriver driver=null;

    @BeforeMethod
    public void getChromeDriver(){
        driver =new  BookTicketHelper().getDriver();
    }

    @Test
    public void OpenHome() throws InterruptedException {
        driver.get(BaseConstant.URL);
        driver.findElement(By.id("ctl00_MainContent_BookingBoxControl_BookButtonHL")).click();

        driver.findElement(By.xpath("//a[contains(@data-performance,'" + BaseConstant.BookingDate + "')]")).click();

        Thread.sleep(6000);

        Point point = driver.findElement(By.id("PlanCanvas")).getLocation();
        int xcord = point.getX();
        int ycord = point.getY();
        System.out.println(" X " + xcord + " Y " +ycord);

        Actions builder = new Actions(driver);
        new Actions(driver).moveToElement(driver.findElement(By.id("PlanCanvas")), 88, 111).click().perform();

    }

    @AfterClass
    public void CloseHome(){
        driver.close();
    }
}
