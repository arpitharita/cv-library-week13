package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utilities.Utility;

public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage(){
        PageFactory.initElements(driver,this);

    }
    public String verifyTextSuccessfully(String text){
        WebElement result = driver.findElement(By.xpath("//h1[contains(text(),'"+text+"')]"));
        return getTextFromElement(result);
    }
}
