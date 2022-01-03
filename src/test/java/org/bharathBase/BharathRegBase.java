package org.bharathBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.bharathPageObject.BharathRegPageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BharathRegBase {
	public static WebDriver driver;
	static BharathRegPageObject b1;
	public static void url(String url) {
	
		driver.get(url);
		 b1=new BharathRegPageObject();
	       
	}
	public static void btnClick(WebElement e) {
		e.click();

	}
	public static void fillTexBox(WebElement e,String a) {
		e.sendKeys(a);
	}
	
	public static void select(WebElement e,String a) {
		Select s1=new Select(e);
		s1.selectByValue(a);
	}
	
	   public static void switchChooseBrowser(String ch) {
		   switch(ch)  
		    {  
		    case "Chrome": WebDriverManager.chromedriver().setup();
			                driver=new ChromeDriver();
			                driver.manage().window().maximize();
			                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                   break;
		    case "Edge": WebDriverManager.edgedriver().setup();
                        driver=new EdgeDriver();
                        driver.manage().window().maximize();
                        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                 break;
                    
		    case "Firefox": WebDriverManager.firefoxdriver().setup();
                          driver=new FirefoxDriver();
                          driver.manage().window().maximize();
                          driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                break;
              
		    case "Opera": WebDriverManager.operadriver().setup();
                        driver=new OperaDriver();
                        driver.manage().window().maximize();
                        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                break;
   
            
		    }
	   }
	public static void excel(WebElement e,int a,int b) throws IOException {

		File f=new File("C:\\Users\\dindi\\Desktop\\Book1.xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook book=new XSSFWorkbook(fin);
		Sheet sh = book.getSheet("Sheet1");
		Row r = sh.getRow(a);
		Cell excelpass = r.getCell(b);
		DataFormatter format=new DataFormatter();
		String r21 = format.formatCellValue(excelpass);
		e.sendKeys(r21);
	}
	public static String excelString(int a,int b) throws IOException {

		File f=new File("C:\\Users\\dindi\\Desktop\\Book1.xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook book=new XSSFWorkbook(fin);
		Sheet sh = book.getSheet("Sheet1");
		Row r = sh.getRow(a);
		Cell excelpass = r.getCell(b);
		DataFormatter format=new DataFormatter();
		String r21 = format.formatCellValue(excelpass);
	        return r21;
	}
	
	   public static void switchChooseProfile(String ch) {
		   switch(ch)  
		    {  
		    case "Son": btnClick(b1.getProfileSon());  
            
            break;
		    case "Daughter": btnClick(b1.getProfileDaughter());  
            
            break;
		    case "Sister": btnClick(b1.getProfileSister());  
            
            break;
		    case "Brother": btnClick(b1.getProfileBrother());  
            
            break;
		    case "Myself Male": btnClick(b1.getProfileMyself()); 
		                        btnClick(b1.getProfileMale());
            break;
		    case "Myself Female": btnClick(b1.getProfileMyself());  
		                          btnClick(b1.getProfileFemale());
            break;
		    case "Relative Male": btnClick(b1.getProfileRelative());  
		                          btnClick(b1.getProfileMale());
            break;
		    case "Relative Female": btnClick(b1.getProfileRelative());  
		                            btnClick(b1.getProfileFemale());
            break;
		    case "Friend Male": btnClick(b1.getProfileFriend());  
		                        btnClick(b1.getProfileMale());
            break;
		    case "Friend Female": btnClick(b1.getProfileFriend());  
		                          btnClick(b1.getProfileFemale());
            break;

	}
	   
	   
	}
	   public static void switchChooseReligion(String ch) {
		   switch(ch)  
		    {  
		    case "Hindu": select(b1.getReligion(), "1");
            
            break;
             case "Muslim - Shia": select(b1.getReligion(), "10");
            
            break;  
            
            case "Muslim - Sunni": select(b1.getReligion(), "11");
 
              break;
            case "Muslim - Others": select(b1.getReligion(), "2");
 
             break;
            case "Christian": select(b1.getReligion(), "3");
 
             break;
            case "Sikh": select(b1.getReligion(), "4");
 
              break;
           case "Jain - Digambar": select(b1.getReligion(), "15");
 
              break;
           case "Jain - Shwetambar": select(b1.getReligion(), "16");
 
                break;
           case "Jain - Others": select(b1.getReligion(), "5");
           
           break;
           case "Parsi": select(b1.getReligion(), "6");
           
           break;
           case "Buddhist": select(b1.getReligion(), "7");
           
           break;
           case "Inter-Religion": select(b1.getReligion(), "b");
           
           break;       
                    
		    }
	
	   }
	   
	   public static void switchChooseMotherTongue(String ch) {
		   switch(ch)  
		    {  
		    case "Bengali": select(b1.getMotherTongue(), "4");
             break;
		    case "Gujarati": select(b1.getMotherTongue(), "14");
            break;
		    case "Hindi": select(b1.getMotherTongue(), "17");
            break;
		    case "Kannada": select(b1.getMotherTongue(), "19");
            break;
		    case "Malayalam": select(b1.getMotherTongue(), "31");
            break;
		    case "Marathi": select(b1.getMotherTongue(), "33");
            break;
		    case "Marwari": select(b1.getMotherTongue(), "34");
            break;
		    case "Oriya": select(b1.getMotherTongue(), "40");
            break;
		    case "Punjabi": select(b1.getMotherTongue(), "41");
            break;
		    case "Sindhi": select(b1.getMotherTongue(), "45");
            break;
		    case "Tamil": select(b1.getMotherTongue(), "47");
            break;
		    case "Telugu": select(b1.getMotherTongue(), "48");
            break;
		    case "Urdu": select(b1.getMotherTongue(), "51");
            break;
  
		    }
	   }
	
	   public static void switchChooseMaritalStatus(String ch) {
		   switch(ch)  
		    {  
		    case "Never Married": btnClick(b1.getNeverMarried());
             break;
		    case "Widowed": btnClick(b1.getWidowed());
            break;
		    case "Divorced": btnClick(b1.getWidowed());
            break;
		    case "Awaiting Divorce": btnClick(b1.getAwaitingDivorce());
            break;

		    }
	   }
	   
	   public static void switchChooseChildren(String ch) {
		   switch(ch)  
		    {  
		    case "None": btnClick(b1.getNonechildren());
             break;
		    case "1 Children Living With Me": btnClick(b1.getChild1());
		                              btnClick(b1.getLivingWithME());
            break;
		    case "1 Children Not Living With Me": btnClick(b1.getChild1());
		                                 btnClick(b1.getNotLivingWithME());
            break;
		    case "2 Children Living With Me": btnClick(b1.getChild2());
		                            btnClick(b1.getLivingWithME());
            break;
		    case "2 Children Not Living With Me": btnClick(b1.getChild2());
		                                  btnClick(b1.getNotLivingWithME());
            break;
		    case "3 Children Living With Me": btnClick(b1.getChild3());
		                             btnClick(b1.getLivingWithME());
            break;
		    case "3 Children Not Living With Me": btnClick(b1.getChild3());
		                                 btnClick(b1.getNotLivingWithME());
            break;
		    case "4 And Above Children Living With Me": btnClick(b1.getAbove4Child());
		                                       btnClick(b1.getLivingWithME());
            break;
		    case "4 And Above Children Not Living With Me": btnClick(b1.getAbove4Child());
		                                          btnClick(b1.getNotLivingWithME());
            break;
		  

		    }
	   } 
	   
	   
	   
	   
	   public static void switchChooseFamilyStatus(String ch) {
		   switch(ch)  
		    {  
		    case "Middle Class":btnClick(b1.getMiddleClass());
             break;
		    case "Upper Middle Class": btnClick(b1.getUpperMiddleClass());
            break;
		    case "Rich": btnClick(b1.getRich());
            break;
		    case "Affluent": btnClick(b1.getAffluent());
            break;
		
		    }
	   }
	   
	   public static void switchChooseFamilyType(String ch) {
		   switch(ch)  
		    {  
		    case "Joint": btnClick(b1.getJoint());
             break;
		    case "Nuclear":btnClick(b1.getNuclear());
            break;
		 
		    }
	   }
	   
	   public static void switchChooseFamilyValues(String ch) {
		   switch(ch)  
		    {  
		    case "Orthodox":btnClick(b1.getOrthodox());
             break;
		    case "Traditional":btnClick(b1.getTraditional());
            break;
		    case "Moderate": btnClick(b1.getFamilySwitchModerate());
            break;
		    case "Liberal": btnClick(b1.getLiberal());
            break;

		    }
	   }
	   
	   public static void switchChooseAnyDisability(String ch) {
		   switch(ch)  
		    {  
		    case "None":btnClick(b1.getNone());
             break;
		    case "Physically Challenged":btnClick(b1.getPhysicallyChallenged());
            break;
             
		    }
	   }
	   
	   public static void switchChooseEmployed(String ch) {
		   switch(ch)  
		    {  
		    case "Government/PSU":btnClick(b1.getGovernmentPSU());
             break;
		    case "Private":btnClick(b1.getPrivate());
            break;
		    case "Business":btnClick(b1.getBusiness());
            break;
		    case "Defence":btnClick(b1.getDefence());
            break;
		    case "Self Employed":btnClick(b1.getSelfEmployed());
            break;
		    case "Not Working":btnClick(b1.getNotWorking());
            break;
		   
             
		    }
	   }
	
	
}
