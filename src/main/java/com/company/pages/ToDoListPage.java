package com.company.pages;

import com.company.base.BaseTest;
import com.company.locators.MainLocators;
import com.company.locators.ToDoListLocators;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ToDoListPage extends BaseTest {

    public ToDoListPage() {
        PageFactory.initElements(driver, this);
    }

    public void toDoListClick() {

        element(MainLocators.TO_DO_LIST).click();
    }

    public void checkAllElements() {
        int expectedSize = 3;
        int size = elements(ToDoListLocators.ALL_ELEMENTS).size();
        Assert.assertEquals(expectedSize, size);
        for (WebElement webElement : elements(ToDoListLocators.ALL_ELEMENTS)) {
            Assert.assertTrue(webElement.isDisplayed());
        }

        boolean addNewElement = element(ToDoListLocators.ADD_NEW_ELEMENT).isDisplayed();
        Assert.assertTrue(addNewElement, "string for adding element is absent");

        boolean string = element(ToDoListLocators.TO_DO_TEXT).isDisplayed();
        Assert.assertTrue(string, "heading of page is absent");
    }

    public void deleteGoToPotion() {
        WebElement goTo = element(ToDoListLocators. GO_TO_POTION_CLASS_STRING);
        Actions action = new Actions(driver);
        action.moveToElement(goTo).build().perform();
        element(ToDoListLocators.TRASH_FOR_GO_TO).click();
    }

    public void deleteBuyNewRobes() {
        WebElement buyNew = element(ToDoListLocators.BUY_NEW_ROBES_STRING);
        Actions action = new Actions(driver);
        action.moveToElement(buyNew).build().perform();
        element(ToDoListLocators.TRASH_FOR_BUY_NEW_ROBES).click();
    }

    public void deletePracticeMagic() {
        WebElement magic = element(ToDoListLocators.PRACTICE_MAGIC_STRING);
        Actions action = new Actions(driver);
        action.moveToElement(magic).build().perform();
        element(ToDoListLocators.TRASH_FOR_MAGIC).click();
    }

    public void addingNewElements(){

       WebElement adding = element(ToDoListLocators.ADD_NEW_ELEMENT);
       Actions action = new Actions(driver);
        action.moveToElement(adding).click().sendKeys("The new cool string!").sendKeys(Keys.ENTER).
                build().perform();

        action.moveToElement(adding).click().sendKeys("The second new cool string!").sendKeys(Keys.ENTER).
                build().perform();
    }

    public void deletingNewElements(){
        WebElement firstString = element(ToDoListLocators.PRACTICE_MAGIC_STRING);
        Actions action = new Actions(driver);
        action.moveToElement(firstString).build().perform();
        element(ToDoListLocators.REMOVE_MY_STRING(4)).click();
        sleep(1);

        WebElement secondString = element(ToDoListLocators.PRACTICE_MAGIC_STRING);
        Actions action1 = new Actions(driver);
        action1.moveToElement(secondString).build().perform();

        element(ToDoListLocators.REMOVE_MY_STRING(4)).click();
        sleep(1);
    }
}
