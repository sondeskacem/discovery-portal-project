package com.discoveryPortal.e2eTests.demandesEmbarquement.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ValiderEmbarquementPage {

	
	/*Locators*/
	final static String MENU_DEMANDE_EMBARQUEMENT_XPATH = "/html/body/div[1]/div[1]/div/div[1]/div[2]/div/div[2]/button";
	final static String PLACE_HOLDER_RECHERCHER_EMBARQUEMENT_XPATH ="//*[@id=\"app\"]/div[1]/div[1]/div[1]/input";
	final static String ICNONE_RECHERCHE_EMBARQUEMENT_XPATH = "//*[@id=\"app\"]/div[1]/div[1]/div[1]/i";
	final static String EMBARQUEMENT_CHOISIT_XPATH = "//*[@id=\"app\"]/div/div[2]/div[1]/table/tr/td[2]";
	final static String ACTION_VALIDER_EMBARQUEMENT_XPATH = "//*[@id=\"app\"]/div/div[2]/div[1]/table/tr/td[2]/div/div/span[2]";
	final static String STATUT_EMBARQUEMENT_XPATH ="//*[@id=\"app\"]/div/div[2]/div[1]/table/tr[7]/td[1]/div[1]";

	/*FindBy*/
	@FindBy(how=How.XPATH, using=MENU_DEMANDE_EMBARQUEMENT_XPATH)
	public static WebElement menuDemandeEmbarquement;
	@FindBy(how=How.XPATH, using=PLACE_HOLDER_RECHERCHER_EMBARQUEMENT_XPATH)
	public static WebElement placeHolderRechercherEmbarquement;
	@FindBy(how=How.XPATH, using=ICNONE_RECHERCHE_EMBARQUEMENT_XPATH)
	public static WebElement iconeRechercherEmbarquement;
	@FindBy(how=How.XPATH, using=EMBARQUEMENT_CHOISIT_XPATH)
	public static WebElement embarquementChoisit;
	@FindBy(how=How.XPATH, using=ACTION_VALIDER_EMBARQUEMENT_XPATH)
	public static WebElement actionValiderEmbarquement;
	@FindBy(how=How.XPATH, using=STATUT_EMBARQUEMENT_XPATH)
	public static WebElement statutEmbarquement;
}
