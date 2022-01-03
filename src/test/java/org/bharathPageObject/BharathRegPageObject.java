package org.bharathPageObject;

import org.bharathBase.BharathRegBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BharathRegPageObject extends BharathRegBase {
	public BharathRegPageObject() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="dd")
	private WebElement select;
	@FindBy(xpath="(//label[@for='regpro3'])[2]")
	private WebElement profile;
	@FindBy(xpath="//*[@id='8']/label")
	private WebElement profileSon;
	
	@FindBy(xpath="//*[@id='9']/label")
	private WebElement profileDaughter;
	
	@FindBy(xpath="//*[@id='11']/label")
	private WebElement profileSister;
	
	@FindBy(xpath="//*[@id='10']/label")
	private WebElement profileBrother;
	
	@FindBy(xpath="//*[@id='1']/label")
	private WebElement profileMyself;
	
	@FindBy(xpath="//*[@id='GENDER_VALUE']/li[1]/label")
	private WebElement profileMale;
	
	@FindBy(xpath="//*[@id='GENDER_VALUE']/li[2]/label")
	private WebElement profileFemale;
	
	@FindBy(xpath="//*[@id='4']/label")
	private WebElement profileRelative;
	
	@FindBy(xpath="//*[@id='5']/label")
	private WebElement profileFriend;
	
	@FindBy(xpath="//*[@id='s2id_SUBCASTE_SEL']/a")
	private WebElement subcasteClick;
	
	@FindBy(xpath="//*[@id='OTHER_CASTE_TXT']")
	private WebElement subcasteSendKeys;
	
	@FindBy(xpath="//*[@id='s2id_GOTHRA_SEL']/a")
	private WebElement gothuramClick;
	
	@FindBy(xpath="//*[@id='s2id_autogen4_search']")
	private WebElement gothuramChoose;
	
	@FindBy(xpath="//*[@id='GOTHRA_OTHER_TXT']")
	private WebElement gothuramSendKeys;	
	@FindBy(id="NAME")
	private WebElement name;
	@FindBy(id="MOBILENO")
	private WebElement mobile;
	@FindBy(xpath="//button[@class='regfreebtn']")
	private WebElement down1;
	@FindBy(xpath="//button[@id='scroll2']")
	private WebElement down2;
	@FindBy(xpath="//input[@class='hp-button hp-regbtn dh-btn']")
	private WebElement register;

	@FindBy(id="DOBVALUE")
	private WebElement dob;

	@FindBy(id="RELIGION")
	private WebElement religion;

	@FindBy(id="MOTHERTONGUE")
	private WebElement motherTongue;


	@FindBy(id="EMAIL")
	private WebElement email;


	@FindBy(id="PASSWORD")
	private WebElement password;


	@FindBy(xpath="//button[@class='hp-button']")
	private WebElement continuebutton;

	@FindBy(xpath="//a[@class='select2-choice']")
	private WebElement castClick;

	@FindBy(xpath="//input[@id='s2id_autogen1_search']")
	private WebElement casteChoose;
	
	@FindBy(xpath="//*[@id='s2id_autogen3_search']")
	private WebElement subcasteChoose;
	
	@FindBy(xpath="//*[@id='SUBCASTE_OTHER_TXT']")
	private WebElement subcasteOthersSendkey;
	

	@FindBy(xpath="(//input[@class='hp-button'])[1]")
	private WebElement continue1;


	@FindBy(xpath="//label[@for='MARITAL_STATUS1']")
	private WebElement maritalStatus;

	@FindBy(xpath="(//a[@class='select2-choice'])[5]")
	private WebElement heightClick;
	@FindBy(id="s2id_autogen5_search")
	private WebElement heightChoose;  


	@FindBy(xpath="//*[@id='MatriForm']/div/div[6]/div[2]/div/div[2]/div[2]/label[1]")
	private WebElement neverMarried;

	@FindBy(xpath="//*[@id='ms_label']")
	private WebElement Widowed;

	@FindBy(xpath="//*[@id='MatriForm']/div/div[6]/div[2]/div/div[2]/div[2]/label[3]")
	private WebElement divorced;
	
	@FindBy(xpath="//*[@id='MatriForm']/div/div[6]/div[2]/div/div[2]/div[2]/label[4]")
	private WebElement awaitingDivorce;
	
	
	@FindBy(xpath="//*[@id='CHILDREN_TIPS']/label[1]")
	private WebElement nonechildren;
	
	@FindBy(xpath="//*[@id='CHILDREN_TIPS']/label[2]")
	private WebElement child1;
	
	@FindBy(xpath="//*[@id='CHILDREN_TIPS']/label[3]")
	private WebElement child2;
	
	@FindBy(xpath="//*[@id='CHILDREN_TIPS']/label[4]")
	private WebElement child3;
	
	@FindBy(xpath="//*[@id='CHILDREN_TIPS']/label[5]")
	private WebElement above4Child;
	

	@FindBy(xpath="//*[@id='childlive_div']/label[1]")
	private WebElement livingWithME;
	

	@FindBy(xpath="//*[@id='childlive_div']/label[2]")
	private WebElement NotLivingWithME;
	
	@FindBy(xpath="//*[@id='subcaste_div']/div[2]/label[1]")
	private WebElement governmentPSU;
	
	@FindBy(xpath="//*[@id='subcaste_div']/div[2]/label[2]")
	private WebElement Private;
	
	@FindBy(xpath="//*[@id='subcaste_div']/div[2]/label[3]")
	private WebElement Business;
	
	@FindBy(xpath="//*[@id='subcaste_div']/div[2]/label[4]")
	private WebElement Defence;
	
	@FindBy(xpath="//*[@id='subcaste_div']/div[2]/label[5]")
	private WebElement SelfEmployed;
	
	@FindBy(xpath="//*[@id='subcaste_div']/div[2]/label[6]")
	private WebElement notWorking;
	
	
	@FindBy(xpath="//*[@id='familystatus']/label[1]")
	private WebElement middleClass;
	
	@FindBy(xpath="//*[@id='familystatus']/label[2]")
	private WebElement upperMiddleClass;
	
	@FindBy(xpath="//*[@id='familystatus']/label[3]")
	private WebElement rich;
	
	@FindBy(xpath="//*[@id='familystatus']/label[4]")
	private WebElement affluent;
	
	@FindBy(xpath="//*[@id='familytype']/label[1]")
	private WebElement joint;
	
	@FindBy(xpath="//*[@id='familytype']/label[2]")
	private WebElement nuclear;
	
	@FindBy(xpath="//*[@id='familyvalue']/label[1]")
	private WebElement orthodox;
	
	@FindBy(xpath="//*[@id='familyvalue']/label[2]")
	private WebElement traditional;
	
	@FindBy(xpath="//*[@id='familyvalue']/label[3] ")
	private WebElement familySwitchModerate;
	
	@FindBy(xpath="//*[@id='familyvalue']/label[4]")
	private WebElement liberal;
	
	@FindBy(xpath="//*[@id='physical_status']/label[1]")
	private WebElement none;
	
	@FindBy(xpath="//*[@id='physical_status']/label[2]")
	private WebElement physicallyChallenged;


	@FindBy(xpath="(//input[@class='hp-button'])[2]")
	private WebElement continue2;

	@FindBy(xpath="(//a[@class='select2-choice'])[7]")
	private WebElement educatiobClick;

	@FindBy(xpath="//input[@id='s2id_autogen7_search']") 
	private WebElement educationChoose;

	@FindBy(xpath="//label[@for='OCCUPATIONCATEGORY3']")
	private WebElement employedIn;

	@FindBy(xpath="(//a[@class='select2-choice'])[8]")
	private WebElement occupationClick;

	@FindBy(xpath="//input[@id='s2id_autogen8_search']")
	private WebElement occupationchoose;
	
	@FindBy(xpath="(//a[@class='select2-choice'])[10]")
	private WebElement incomeclick;
	
	@FindBy(xpath="//input[@id='s2id_autogen10_search']")
	private WebElement incomeChoose;
	
	@FindBy(xpath="(//a[@class='select2-choice'])[12]")
	private WebElement stateClick;
	@FindBy(xpath="//input[@id='s2id_autogen12_search']")
	private WebElement stateChoose;
	@FindBy(xpath="(//a[@href='javascript:void(0)'])[13]")
	private WebElement cityClick;
	@FindBy(xpath="//input[@id='s2id_autogen13_search']")
	private WebElement cityChoose;
	@FindBy(xpath="(//input[@class='hp-button'])[3]")
	private WebElement continue3;
	@FindBy(xpath="//input[@id='submitform']")
	private WebElement finalSummit;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public WebElement getStateChoose() {
		return stateChoose;
	}




	public WebElement getSubcasteOthersSendkey() {
		return subcasteOthersSendkey;
	}




	public WebElement getFamilySwitchModerate() {
		return familySwitchModerate;
	}
	
	
	
	
	public WebElement getLivingWithME() {
		return livingWithME;
	}
	public WebElement getNotLivingWithME() {
		return NotLivingWithME;
	}
	public WebElement getNonechildren() {
		return nonechildren;
	}
	public WebElement getChild1() {
		return child1;
	}
	public WebElement getChild2() {
		return child2;
	}
	public WebElement getChild3() {
		return child3;
	}
	public WebElement getAbove4Child() {
		return above4Child;
	}
	public WebElement getGovernmentPSU() {
		return governmentPSU;
	}
	public WebElement getPrivate() {
		return Private;
	}
	public WebElement getBusiness() {
		return Business;
	}
	public WebElement getDefence() {
		return Defence;
	}
	public WebElement getSelfEmployed() {
		return SelfEmployed;
	}
	public WebElement getNotWorking() {
		return notWorking;
	}
	public WebElement getNeverMarried() {
		return neverMarried;
	}
	public WebElement getWidowed() {
		return Widowed;
	}
	public WebElement getDivorced() {
		return divorced;
	}
	public WebElement getAwaitingDivorce() {
		return awaitingDivorce;
	}
	public WebElement getMiddleClass() {
		return middleClass;
	}
	public WebElement getUpperMiddleClass() {
		return upperMiddleClass;
	}
	public WebElement getRich() {
		return rich;
	}
	public WebElement getAffluent() {
		return affluent;
	}
	public WebElement getJoint() {
		return joint;
	}
	public WebElement getNuclear() {
		return nuclear;
	}
	public WebElement getOrthodox() {
		return orthodox;
	}
	public WebElement getTraditional() {
		return traditional;
	}

	public WebElement getLiberal() {
		return liberal;
	}
	public WebElement getNone() {
		return none;
	}
	public WebElement getPhysicallyChallenged() {
		return physicallyChallenged;
	}
	public WebElement getSelect() {
		return select;
	}
	public WebElement getProfile() {
		return profile;
	}
	public WebElement getName() {
		return name;
	}
	public WebElement getMobile() {
		return mobile;
	}
	public WebElement getDown1() {
		return down1;
	}
	public WebElement getDown2() {
		return down2;
	}
	public WebElement getRegister() {
		return register;
	}
	public WebElement getDob() {
		return dob;
	}
	public WebElement getReligion() {
		return religion;
	}
	public WebElement getMotherTongue() {
		return motherTongue;
	}
	public WebElement getEmail() {
		return email;
	}
	
	public WebElement getSubcasteClick() {
		return subcasteClick;
	}
	public WebElement getSubcasteSendKeys() {
		return subcasteSendKeys;
	}
	public WebElement getGothuramClick() {
		return gothuramClick;
	}
	public WebElement getGothuramChoose() {
		return gothuramChoose;
	}
	public WebElement getGothuramSendKeys() {
		return gothuramSendKeys;
	}
	public WebElement getProfileSon() {
		return profileSon;
	}
	public WebElement getProfileDaughter() {
		return profileDaughter;
	}
	public WebElement getProfileSister() {
		return profileSister;
	}
	public WebElement getProfileBrother() {
		return profileBrother;
	}
	public WebElement getProfileMyself() {
		return profileMyself;
	}
	public WebElement getProfileMale() {
		return profileMale;
	}
	public WebElement getProfileFemale() {
		return profileFemale;
	}
	public WebElement getProfileRelative() {
		return profileRelative;
	}
	public WebElement getProfileFriend() {
		return profileFriend;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getContinuebutton() {
		return continuebutton;
	}
	public WebElement getCastClick() {
		return castClick;
	}
	public WebElement getCasteChoose() {
		return casteChoose;
	}
	public WebElement getSubcasteChoose() {
		return subcasteChoose;
	}
	public WebElement getContinue1() {
		return continue1;
	}
	public WebElement getMaritalStatus() {
		return maritalStatus;
	}
	public WebElement getHeightClick() {
		return heightClick;
	}
	public WebElement getHeightChoose() {
		return heightChoose;
	}
	

	public WebElement getContinue2() {
		return continue2;
	}
	public WebElement getEducatiobClick() {
		return educatiobClick;
	}
	public WebElement getEducationChoose() {
		return educationChoose;
	}
	public WebElement getEmployedIn() {
		return employedIn;
	}
	public WebElement getOccupationClick() {
		return occupationClick;
	}
	public WebElement getOccupationchoose() {
		return occupationchoose;
	}
	public WebElement getIncomeclick() {
		return incomeclick;
	}
	public WebElement getIncomeChoose() {
		return incomeChoose;
	}
	public WebElement getStateClick() {
		return stateClick;
	}

	public WebElement getCityClick() {
		return cityClick;
	}
	public WebElement getCityChoose() {
		return cityChoose;
	}
	public WebElement getContinue3() {
		return continue3;
	}
	public WebElement getFinalSummit() {
		return finalSummit;
	}
	
	
	
	

}
