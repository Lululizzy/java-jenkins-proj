package com.company.locators;

import org.openqa.selenium.By;

public class MainLocators {

    public final static By WEB_DRIVER_LINK = By.xpath("//img[@id='udemy-promo-code-webdriverio']");
    public final static By CUCUMBER_LINK = By.xpath("//img[@id='udemy-promo-code-webdriverio']");
    public final static By CONTACT_US_LINK = By.partialLinkText("CONTACT US");
    public final static By LOGIN_PORTAL = By.partialLinkText("LOGIN PORTAL");
    public final static By BUTTON_CLICKS = By.partialLinkText("BUTTON CLICKS");
    public final static By TO_DO_LIST = By.partialLinkText("TO DO LIST");
    public final static By PAGE_OBJECT_MODEL = By.partialLinkText("PAGE OBJECT MODEL");
    public final static By ACCORDION_TEXT_AFFECTS = By.xpath("//h1[contains(text(), 'ACCORDION')]");
    public final static By DROPDOWN_CHECKBOXES_RADIO_BUTTON = By.xpath( "//h1[contains(text(), 'RADIO')]");
    public static final By AJAX_LOADER = By.partialLinkText("AJAX LOADER");
    public static final By ACTIONS = By.partialLinkText("ACTIONS");
    public static final By SCROLLING_AROUND = By.partialLinkText("SCROLLING AROUND");
    public final static By I_FRAME_ELEMENT = By.partialLinkText("IFRAME");
    public final static By POPUP_ALERTS_LINK = By.xpath("//h1[text()='POPUP & ALERTS']");
    public final static By HIDDEN_ELEMENTS = By.partialLinkText("HIDDEN ELEMENTS");
    public final static By DATA_TABLES = By.xpath( "//h1[contains(text(), 'DATA')]");
    public final static By AUTOCOMPLETE_TEXT_FIELD = By.xpath( "//h1[contains(text(), 'AUTOCOMPLETE')]");
    public final static By FILE_UPLOAD = By.partialLinkText("FILE UPLOAD");
    public final static By DATEPICKER = By.partialLinkText("DATEPICKER");
    public final static By ALL_MAIN_SECTIONS = By.xpath("//h1");

}
