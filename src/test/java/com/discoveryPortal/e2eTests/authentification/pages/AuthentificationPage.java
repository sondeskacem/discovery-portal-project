package com.discoveryPortal.e2eTests.authentification.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AuthentificationPage {
	

	/*Locators*/
	final static String BUTTON_AUTORISER_COOKIES_ID = "onetrust-accept-btn-handler";
	final static String BUTTON_SE_CONNECTER_XPATH = "//*[@id=\"gigya-login-form\"]/div[2]/div[1]/a[1]";
	final static String EMAIL_ID = "i0116";
	final static String BUTTON_SUIVANT_ID = "idSIButton9";
	final static String MOT_DE_PASSE_ID = "passwordInput";
	final static String BUTTON_CONNEXION_ID = "submitButton";
	final static String USER_TITLE_XPATH = "/html/body/div[1]/div[1]/div/div[1]/div[1]/div[3]/span[1]";
	/*FindBy*/
	@FindBy(how=How.ID, using=BUTTON_AUTORISER_COOKIES_ID)
	public static WebElement cookies;
	@FindBy(how=How.XPATH, using=BUTTON_SE_CONNECTER_XPATH)
	public static WebElement btnSeConnecter;
	@FindBy(how=How.ID, using=EMAIL_ID)
	public static WebElement email;
	@FindBy(how=How.ID, using=BUTTON_SUIVANT_ID)
	public static WebElement btnSuivant;
	@FindBy(how=How.ID, using=MOT_DE_PASSE_ID)
	public static WebElement motDePasse;
	@FindBy(how=How.ID, using=BUTTON_CONNEXION_ID)
	public static WebElement btnConnexion;
	@FindBy(how=How.XPATH, using=USER_TITLE_XPATH)
	public static WebElement userTitle;
	/*Methods*/

}
