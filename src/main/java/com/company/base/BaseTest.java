package com.company.base;

import com.company.pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver;
    public static Properties prop;
//    public static ContactUsPage contactUsPage;
//    public static LoginPortalPage loginPortalPage;
//    public static ButtonClickPage buttonClickPage;
    public static ToDoListPage toDoListPage;
//    public static MainPage mainPage;
//    public static PageObjectModelPage pageObjectModelPage;
//    public static AccordionPage accordionPage;
//    public static DropDownPage dropDownPage;
//    public static AjaxLoaderPage ajaxLoaderPage;
//    public static ActionsPage actionsPage;
//    public static ScrollingAroundPage scrollingAroundPage;
//    public static PopUpAndAlertsPage popUpAndAlertsPage;
//    public static IFramePage iFramePage;
//    public static HiddenElementsPage hiddenElementsPage;
//    public static AutocompletePage autocompletePage;
//    public static FileUploadPage fileUploadPage;
//    public static DatepickerPage datepickerPage;

    public BaseTest() {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream("src/main/resources/config.properties");
            prop.load(ip);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public CharSequence selectPathToTheFile(){
        String filePath = new File(prop.getProperty("path")).getAbsolutePath();
        return filePath;
    }

    protected void logMessage(String message) {
        Reporter.log(message, true);
    }

    public void changeWindow() {
        Set<String> handles = driver.getWindowHandles();
        String current = driver.getWindowHandle();
        if (handles.size() > 1) {
            handles.remove(current);
        }
        String newTab = handles.iterator().next();
        driver.switchTo().window(newTab);
    }

    public void switchWindow() {
        Set<String> handles = driver.getWindowHandles();
        String current = driver.getWindowHandle();
        if (handles.size() > 1) {
            handles.remove(current);
        }
        String newTab = handles.iterator().next();
        driver.switchTo().window(newTab);
    }

    protected static void initialization() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        _initObjects();
    }

    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void useImplicitTimeOut(int newTime) {

        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void waitUntilVisibility(WebElement element) {
        WebDriverWait pleaseWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        pleaseWait.until(ExpectedConditions.visibilityOf(element));
    }

    private static void _initObjects(){
//        contactUsPage = new ContactUsPage();
//        loginPortalPage = new LoginPortalPage();
//        buttonClickPage = new ButtonClickPage();
        toDoListPage = new ToDoListPage();
//        mainPage = new MainPage();
//        pageObjectModelPage = new PageObjectModelPage();
//        accordionPage = new AccordionPage();
//        dropDownPage = new DropDownPage();
//        ajaxLoaderPage = new AjaxLoaderPage();
//        actionsPage = new ActionsPage();
//        scrollingAroundPage = new ScrollingAroundPage();
//        popUpAndAlertsPage = new PopUpAndAlertsPage();
//        iFramePage = new IFramePage();
//        hiddenElementsPage = new HiddenElementsPage();
//        autocompletePage = new AutocompletePage();
//        fileUploadPage = new FileUploadPage();
//        datepickerPage = new DatepickerPage();
    }

    public static WebElement element(By ByElement) {
        return driver.findElement(ByElement);
    }

    public List<WebElement> elements(By e) {
        return driver.findElements(e);
    }
}
