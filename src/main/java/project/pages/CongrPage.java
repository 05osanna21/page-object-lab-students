package project.pages;

import org.openqa.selenium.By;

public class CongrPage extends BasePage {

   private By congMessage =  By.xpath("//h1[text()='Your Account Has Been Created!']");

   public String getCongMessage(){
       String actualResualt = find(congMessage).getText();
       return actualResualt;
   }
}
