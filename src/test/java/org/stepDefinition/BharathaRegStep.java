package org.stepDefinition;

import java.io.IOException;

import org.bharathBase.BharathRegBase;
import org.bharathPageObject.BharathRegPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;

public class BharathaRegStep extends BharathRegBase {  
	
	BharathRegPageObject b;
	@Given("The user should be in BharathMatrimony Registation page {string} and {string}")
	public void the_user_should_be_in_BharathMatrimony_Registation_page_and(String url, String browser) {
		switchChooseBrowser(browser);
	     url(url);
	   b=new BharathRegPageObject();

	}


	@When("The user has to fill Requried Credential")
	public void the_user_has_to_fill_Requried_Credential() throws IOException {
		  btnClick(b.getSelect());
			switchChooseProfile("Myself Male");
			excel(b.getName(), 1, 1);
			excel(b.getMobile(), 1, 2);
	   
	}

	@When("The user has to click Register free")
	public void the_user_has_to_click_Register_free() {
		btnClick(b.getRegister());
	}

	@When("The user hast to fill basic details")
	public void the_user_hast_to_fill_basic_details() throws IOException {
		excel(b.getDob(), 1, 3);
		switchChooseReligion(excelString(1, 4));
		switchChooseMotherTongue(excelString(1, 5));

		excel(b.getEmail(), 1, 6);
		excel(b.getPassword(), 1, 7);
	   
	}

	@When("The user has to click first Continue button")
	public void the_user_has_to_click_first_Continue_button() {
		btnClick(b.getContinuebutton());
	}

	@When("The user hast to fill Religion details")
	public void the_user_hast_to_fill_Religion_details() throws IOException, InterruptedException {
		btnClick(b.getCastClick()); 
	    fillTexBox(b.getCasteChoose(), excelString(1, 8)+Keys.ENTER);
		 Thread.sleep(2000);
		 boolean displayedSubcasteClick = b.getSubcasteClick().isDisplayed();
		 boolean displayedSendkeysSubcaste = b.getSubcasteSendKeys().isDisplayed();
		 boolean displayedgothuram = b.getGothuramClick().isDisplayed(); 
		 boolean displayedsendkeygothuram= b.getGothuramSendKeys().isDisplayed();
		 //Caste and Sub caste compulsory
		 if(displayedSubcasteClick & displayedsendkeygothuram & !excelString(1, 9).equals("Others")){
			     btnClick(b.getSubcasteClick());
			     fillTexBox(b.getSubcasteChoose(), excelString(1, 9)+Keys.ENTER);
			         if( excelString(1,22) != null){
				           fillTexBox(b.getGothuramSendKeys(), excelString(1,22));
			             }
			
		 }
		 //Sub caste(others)
		 else if(excelString(1, 9).equals("Others")){
			 try{
			    btnClick(b.getSubcasteClick());
			    fillTexBox(b.getSubcasteChoose(), excelString(1, 9)+Keys.ENTER);
			    fillTexBox(b.getSubcasteOthersSendkey(), excelString(1, 24));
			    btnClick(b.getGothuramClick());
			    fillTexBox(b.getGothuramChoose(),excelString(1,22)+Keys.ENTER);
			 }
			 catch(Exception  ex){
			       btnClick(b.getSubcasteClick());
			       fillTexBox(b.getSubcasteChoose(), excelString(1, 9)+Keys.ENTER);
			       fillTexBox(b.getSubcasteOthersSendkey(), excelString(1, 24));
			 }
		   }
		       //caste  compulsory
		 else if(displayedSendkeysSubcaste){
			      if(excelString(1, 9) != null ){
			       fillTexBox(b.getSubcasteSendKeys(), excelString(1, 9));
			      }
			        if(excelString(1,22) != null){
			        fillTexBox(b.getGothuramSendKeys(), excelString(1,22));
			        }
		 }
		 //caste , sub caste and gothuram compulsory
		 else if(displayedgothuram & displayedSubcasteClick){
			 btnClick(b.getSubcasteClick());
			 fillTexBox(b.getSubcasteChoose(), excelString(1, 9)+Keys.ENTER);
			 btnClick(b.getGothuramClick());
			 fillTexBox(b.getGothuramChoose(),excelString(1,22)+Keys.ENTER); 
		 }
		 
		
		// subcasechoose.sendKeys("Adi"+Keys.ENTER);
		 
		/*btnClick(b.getCastClick());
		fillTexBox(b.getCasteChoose(),excelString( 1, 8)+Keys.ENTER);
		try{
		     btnClick(b.getSubcasteClick());
		 	fillTexBox(b.getSubcasteChoose(), excelString(1, 9)+Keys.ENTER);
		    btnClick(b.getGothuramClick());
		    fillTexBox(b.getGothuramChoose(), excelString(1, 22)+Keys.ENTER);
		}
		catch(Exception e){
		       
	     	try{
	     		 fillTexBox(b.getSubcasteSendKeys(), excelString(1, 9));
		     fillTexBox(b.getGothuramSendKeys(), excelString(1, 22));
		        }
		   catch(Exception r){
		            }
		}
		*/	
	}

	@When("The user has to click second Continue button")
	public void the_user_has_to_click_second_Continue_button() throws InterruptedException {
		btnClick(b.getContinue1());
	    
	}

	@When("The user hast to fill personal details")
	public void the_user_hast_to_fill_personal_details() throws IOException {
		switchChooseMaritalStatus(excelString(1, 10));
		try{switchChooseChildren(excelString(1, 23));
		     btnClick(b.getHeightClick());
		}
		catch(Exception e){
			 btnClick(b.getHeightClick());
		}
		fillTexBox(b.getHeightChoose(), excelString(1, 11)+Keys.ENTER);
		switchChooseFamilyStatus(excelString(1, 12));
		switchChooseFamilyType(excelString(1, 13));
		switchChooseFamilyValues(excelString(1, 14));
		switchChooseAnyDisability(excelString(1, 15));
	    
	}

	@When("The user has to click third Continue button")
	public void the_user_has_to_click_third_Continue_button() {
		btnClick(b.getContinue2());
	    
	}

	@When("The user hast to fill Professional details")
	public void the_user_hast_to_fill_Professional_details() throws InterruptedException, IOException {
		btnClick(b.getEducatiobClick());
		fillTexBox(b.getEducationChoose(),excelString(1, 16)+Keys.ENTER);
		Thread.sleep(1000);
		switchChooseEmployed(excelString(1, 17));
		if(!excelString(1, 17).equals("Not Working")){
		     try{
		    	 System.out.println("1");
		         btnClick(b.getOccupationClick());
		         Thread.sleep(1000);
		         fillTexBox(b.getOccupationchoose(),excelString(1, 18)+Keys.ENTER);
	          	btnClick(b.getIncomeclick());
	        	}
	     	catch(Exception e){
			   Actions a=new Actions(driver);
			   a.sendKeys(Keys.TAB);
			   a.build().perform();
		    	btnClick(b.getOccupationClick());
			    Thread.sleep(1000);
		    	fillTexBox(b.getOccupationchoose(),excelString(1, 18)+Keys.ENTER);
			    btnClick(b.getIncomeclick());	
		      }
		      fillTexBox(b.getIncomeChoose(), excelString(1, 19)+Keys.ENTER);
		      btnClick(b.getStateClick());
		      fillTexBox(b.getStateChoose(), excelString(1, 20)+Keys.ENTER);
		      Thread.sleep(1000);
		      btnClick(b.getCityClick());
		      fillTexBox(b.getCityChoose(), excelString(1, 21)+Keys.ENTER);
         	}
		
		else{
			try{
				 
			    btnClick(b.getOccupationClick());
			    Thread.sleep(1000);
			    fillTexBox(b.getOccupationchoose(),excelString(1, 18)+Keys.ENTER);
			   btnClick(b.getStateClick());
			}
			catch(Exception r){
				 Actions a=new Actions(driver);
				   a.sendKeys(Keys.TAB);
				   a.build().perform();
			    	btnClick(b.getOccupationClick());
				    Thread.sleep(1000);
				    fillTexBox(b.getOccupationchoose(),excelString(1, 18)+Keys.ENTER);
			    	btnClick(b.getStateClick());
				
			}
		       fillTexBox(b.getStateChoose(), excelString(1, 20)+Keys.ENTER);
		      Thread.sleep(1000);
		      btnClick(b.getCityClick());
		      fillTexBox(b.getCityChoose(), excelString(1, 21)+Keys.ENTER);
		}
	
	
	
	
	
	}
	
	
	
	
	@When("The user has to click forth Continue button")
	public void the_user_has_to_click_forth_Continue_button() throws InterruptedException {
		Thread.sleep(3000);
		btnClick(b.getContinue3());
	}

	@When("The user hast to write comments")
	public void the_user_hast_to_write_comments() {
	   
	}

	@When("The user has to click fifth Continue button")
	public void the_user_has_to_click_fifth_Continue_button() {
		btnClick(b.getFinalSummit());
		driver.quit();
	   
	}

	@When("The user has to complete mobile verification")
	public void the_user_has_to_complete_mobile_verification() {
	 
	}

	@Then("The user navigate to nextpage")
	public void the_user_navigate_to_nextpage() {
	    
	}

}
