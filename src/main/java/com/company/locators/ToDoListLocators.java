package com.company.locators;

import com.company.base.BaseTest;
import org.openqa.selenium.By;

public class ToDoListLocators extends BaseTest {

    public final static By TO_DO_TEXT = By.xpath("//h1");
    public final static By ADD_NEW_ELEMENT = By.xpath("//input");
    public final static By GO_TO_POTION_CLASS_STRING = By.xpath("//li[contains(text(), 'Go to')]");
    public final static By BUY_NEW_ROBES_STRING = By.xpath("//li[contains(text(), 'Buy new')]");
    public final static By PRACTICE_MAGIC_STRING = By.xpath("//li[contains(text(), 'magic')]");
    public final static By ALL_ELEMENTS = By.xpath("//li");
    public final static By TRASH_FOR_GO_TO = By.xpath("//li[contains(text(), 'Go')]//i");
    public final static By TRASH_FOR_BUY_NEW_ROBES = By.xpath("//li[contains(text(), 'Buy')]//i");
    public final static By TRASH_FOR_MAGIC = By.xpath("//li[contains(text(), 'magic')]//i");
    public static By REMOVE_MY_STRING(int li){
        return By.xpath("//*[@id='container']/ul/li["+ li +"]/span/i");
    }
}

