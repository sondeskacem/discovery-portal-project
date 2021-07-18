package com.discoveryPortal.e2eTests.nouvelEmbarquement.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NouvelEmbarquementPage {

	/*Locators*/
	final static String BOUTTON_ACCEDER_APPLI_EMBARQUEMENT_XPATH = "/html/body/div[1]/div[1]/div/div[1]/div[2]/div/div[2]/button";
	final static String RECHERCHER_CLIENT_XPATH = "/html/body/div[1]/div[1]/div/div[2]/div[1]/div/div[3]/div/div/div[1]/input";
	final static String CLIENT_SMOKE_TEST_XPATH = "/html/body/div[1]/div[1]/div/div[2]/div[1]/div/div[3]/div/div/div[2]/div[1]/table/tr/td[2]";
	final static String BOUTTON_SUIVANT_CLIENT_XPATH = "/html/body/div[1]/div[1]/div/div[2]/div[1]/div/div[4]/div[2]/button";
	final static String RECHERCHER_ENGAGEMENT_XPATH = "/html/body/div[1]/div[1]/div/div[2]/div[1]/div/div[3]/div/div/div[2]/input";
	final static String ENGAGEMENT_TMA_DISCOVERY_XPATH = "/html/body/div[1]/div[1]/div/div[2]/div[1]/div/div[3]/div/div/div[3]/div[1]/table/tr[1]/td[2]";
	final static String BOUTTON_SUIVANT_ENGAGEMENT_XPATH = "/html/body/div[1]/div[1]/div/div[2]/div[1]/div/div[4]/div[2]/button";
	final static String OFFRE_MULTIRAPPORT_XPATH = "/html/body/div[1]/div[1]/div/div[2]/div[1]/div/div[3]/div/div/div[3]/div[2]/div";
	final static String BOUTTON_SUIVANT_OFFRE_XPATH = "/html/body/div[1]/div[1]/div/div[2]/div[1]/div/div[4]/div[2]";
	final static String BOUTTON_AJOUTER_CONTACT_XPATH = "/html/body/div[1]/div[1]/div/div[2]/div[1]/div/div[3]/div/div/div[4]/div/button/span";
	final static String PLACE_HOLDER_TITRE_CONTACT_XPATH = "/html/body/div[1]/div[1]/div/div[2]/div[1]/div/div[3]/div/div/div[7]/div[2]/div[1]/input";
	final static String PLACE_HOLDER_NOM_CONTACT_XPATH = "/html/body/div[1]/div[1]/div/div[2]/div[1]/div/div[3]/div/div/div[7]/div[2]/div[2]/input";
	final static String PLACE_HOLDER_PRENOM_CONTACT_XPATH = "/html/body/div[1]/div[1]/div/div[2]/div[1]/div/div[3]/div/div/div[7]/div[3]/div[1]/input";
	final static String PLACE_HOLDER_EMAIL_CONTACT_XPATH = "/html/body/div[1]/div[1]/div/div[2]/div[1]/div/div[3]/div/div/div[7]/div[3]/div[2]/input";
	final static String PLACE_HOLDER_TELEPHONE_CONTACT_XPATH = "/html/body/div[1]/div[1]/div/div[2]/div[1]/div/div[3]/div/div/div[7]/div[4]/div[1]/input";
	final static String LISTE_ROLE_CONTACT_XPATH = "/html/body/div[1]/div[1]/div/div[2]/div[1]/div/div[3]/div/div/div[7]/div[4]/div[2]/div/div/div[1]";
	final static String ROLE_ASSISTANT = "//*[@id=\"list-item-73-0\"]/div";
	final static String BOUTTON_AJOUTER_CONTACT_DANS_FORMULAIRE_XPATH = "/html/body/div[1]/div[1]/div/div[2]/div[1]/div/div[3]/div/div/div[7]/div[5]/div[2]/button";
	final static String BOUTON_VALIDER_TELEPHONE_XPATH = "/html/body/div[1]/div[1]/div/div[2]/div[1]/div/div[3]/div/div/div[9]/div[2]/button[1]";
	final static String BOUTON_SUIVANT_CONTACT_XPATH = "/html/body/div[1]/div[1]/div/div[2]/div[1]/div/div[4]/div[2]/button";
	final static String BOUTON_LANCER_EMBARQUEMENT_XPATH = "/html/body/div[1]/div[1]/div/div[2]/div[1]/div/div[3]/div/div/div[14]/button";
	final static String POPUP_DEMANDE_EMBARQUEMENT_LANCE_XPATH = "//*[@id=\"swal2-title\"]";


	/*FindBy*/
	@FindBy(how=How.XPATH, using=BOUTTON_ACCEDER_APPLI_EMBARQUEMENT_XPATH)
	public static WebElement appliEmbarquement;
	@FindBy(how=How.XPATH, using=RECHERCHER_CLIENT_XPATH)
	public static WebElement rechercheClient;
	@FindBy(how=How.XPATH, using=CLIENT_SMOKE_TEST_XPATH)
	public static WebElement clientSmokeTest;
	@FindBy(how=How.XPATH, using=BOUTTON_SUIVANT_CLIENT_XPATH)
	public static WebElement btnSuivantClient;
	@FindBy(how=How.XPATH, using=RECHERCHER_ENGAGEMENT_XPATH)
	public static WebElement rechercheEngagement;
	@FindBy(how=How.XPATH, using=ENGAGEMENT_TMA_DISCOVERY_XPATH)
	public static WebElement engagementTmaDiscovery;
	@FindBy(how=How.XPATH, using=BOUTTON_SUIVANT_ENGAGEMENT_XPATH)
	public static WebElement btnSuivantEngagement;
	@FindBy(how=How.XPATH, using=OFFRE_MULTIRAPPORT_XPATH)
	public static WebElement offreMultirapport;
	@FindBy(how=How.XPATH, using=BOUTTON_SUIVANT_OFFRE_XPATH)
	public static WebElement btnSuivantOffre;
	@FindBy(how=How.XPATH, using=BOUTTON_AJOUTER_CONTACT_XPATH)
	public static WebElement btnAjouterContact;
	@FindBy(how=How.XPATH, using=PLACE_HOLDER_TITRE_CONTACT_XPATH)
	public static WebElement placeHolderTitreContact;
	@FindBy(how=How.XPATH, using=PLACE_HOLDER_NOM_CONTACT_XPATH)
	public static WebElement placeHolderNomContact;
	@FindBy(how=How.XPATH, using=PLACE_HOLDER_PRENOM_CONTACT_XPATH)
	public static WebElement placeHolderPrenomContact;
	@FindBy(how=How.XPATH, using=PLACE_HOLDER_EMAIL_CONTACT_XPATH)
	public static WebElement placeHolderEmailContact;
	@FindBy(how=How.XPATH, using=PLACE_HOLDER_TELEPHONE_CONTACT_XPATH)
	public static WebElement placeHolderTelephoneContact;
	@FindBy(how=How.XPATH, using=LISTE_ROLE_CONTACT_XPATH)
	public static WebElement listeRoleContact;
	@FindBy(how=How.XPATH, using=ROLE_ASSISTANT)
	public static WebElement roleAssistant;
	@FindBy(how=How.XPATH, using=BOUTTON_AJOUTER_CONTACT_DANS_FORMULAIRE_XPATH)
	public static WebElement btnAjouterContactDansFormulaire;
	@FindBy(how=How.XPATH, using=BOUTON_VALIDER_TELEPHONE_XPATH)
	public static WebElement btnValiderTelephone;
	@FindBy(how=How.XPATH, using=BOUTON_SUIVANT_CONTACT_XPATH)
	public static WebElement btnSuivantContact;
	@FindBy(how=How.XPATH, using=BOUTON_LANCER_EMBARQUEMENT_XPATH)
	public static WebElement btnLancerEmbarquement;
	@FindBy(how=How.XPATH, using=POPUP_DEMANDE_EMBARQUEMENT_LANCE_XPATH)
	public static WebElement popupDemandeEmbarquement;
}
