package com.wikia.webdriver.pageobjectsfactory.componentobject.modalwindows;

import com.wikia.webdriver.pageobjectsfactory.pageobject.WikiBasePageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by wikia on 2015-08-19.
 */
public class curatedContentToolModal extends WikiBasePageObject {
  @FindBy(css = "#CuratedContentToolModal")
  protected WebElement CuratedContentToolModal;

  public curatedContentToolModal(WebDriver driver) {
    super(driver);
  }

  public void verifyModal() {
    wait.forElementVisible(CuratedContentToolModal);
  }
}
