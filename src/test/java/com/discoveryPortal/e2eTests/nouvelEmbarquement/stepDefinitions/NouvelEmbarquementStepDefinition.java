package com.discoveryPortal.e2eTests.nouvelEmbarquement.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.discoveryPortal.e2eTests.nouvelEmbarquement.pages.NouvelEmbarquementPage;
import com.discoveryPortal.e2eTests.utils.CommunMethods;
import com.discoveryPortal.e2eTests.utils.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NouvelEmbarquementStepDefinition {

	public WebDriver driver;
	private CommunMethods communMethods = new CommunMethods();

	public NouvelEmbarquementStepDefinition() {
		driver = Setup.driver;
		PageFactory.initElements(driver, NouvelEmbarquementPage.class);
	}

	@When("^Je clique sur l'application Embarquement$")
	public void jeCliqueSurLApplicationEmabarquement() throws Throwable {
		Thread.sleep(5000);
		communMethods.clickElementWithJavascriptExecutor(NouvelEmbarquementPage.appliEmbarquement);
	}

	@When("^Je saisi \"([^\"]*)\" dans le champ Rechercher un client parmi la liste$")
	public void jeSaisiDansLeChampRechercherUnClientParmiLaListe(String clientSmoke) throws Throwable {
		Thread.sleep(15000);
		communMethods.writeText(NouvelEmbarquementPage.rechercheClient, clientSmoke);
		Thread.sleep(5000);
	}

	@When("^Je clique sur la loop de recherche client$")
	public void jeCliqueSurLaLoopDeRecherche() throws Throwable {
		Thread.sleep(5000);
		//communMethods.clickElementWithJavascriptExecutor(NouvelEmbarquementPage.rechercheClient);
		NouvelEmbarquementPage.rechercheClient.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
	}

	@When("^Je sélectionne le client SMOKE TEST COMBINE$")
	public void jeSélectionneLeClientSMOKETESTCOMBINE() throws Throwable {
		Thread.sleep(2000);
		communMethods.clickElementWithJavascriptExecutor(NouvelEmbarquementPage.clientSmokeTest);
		Thread.sleep(3000);
	}

	@When("^Je clique sur le bouton Suivant Client$")
	public void jeCliqueSurLeBoutonSuivant() throws Throwable {
		Thread.sleep(5000);
		communMethods.clickElementWithJavascriptExecutor(NouvelEmbarquementPage.btnSuivantClient);
	}

	@When("^Je saisi \"([^\"]*)\" dans le champ Rechercher un engagement parmi la liste$")
	public void jeSaisiDansLeChampRechercherUnEngagementParmiLaListe(String engTmaDiscovery) throws Throwable {
		Thread.sleep(5000);
		communMethods.writeText(NouvelEmbarquementPage.rechercheEngagement, engTmaDiscovery);
	}

	@When("^Je clique sur la loop de recherche engagement$")
	public void je_clique_sur_la_loop_de_recherche_engagement() throws Throwable {
		NouvelEmbarquementPage.rechercheEngagement.sendKeys(Keys.ENTER);
	}

	@When("^Je sélectionne l'engagement TMA_Discovrey$")
	public void je_sélectionne_l_engagement_TMA_Discovrey() throws Throwable {
		Thread.sleep(5000);
		communMethods.clickElementWithJavascriptExecutor(NouvelEmbarquementPage.engagementTmaDiscovery);
	}

	@When("^Je clique sur le bouton Suivant Engagement$")
	public void je_clique_sur_le_bouton_Suivant_Engagement() throws Throwable {
		communMethods.clickElementWithJavascriptExecutor(NouvelEmbarquementPage.btnSuivantEngagement);
	}

	@When("^Je sélectionne l'offre Multirapports$")
	public void je_sélectionne_l_offre_Multirapports() throws Throwable {
		Thread.sleep(5000);
		communMethods.clickElementWithJavascriptExecutor(NouvelEmbarquementPage.offreMultirapport);
	}

	@When("^Je clique sur le bouton Suivant Offre$")
	public void je_clique_sur_le_bouton_Suivant_Offre() throws Throwable {
		communMethods.clickElementWithJavascriptExecutor(NouvelEmbarquementPage.btnSuivantOffre);
	}

	@When("^Je clique sur Ajouter un contact$")
	public void jeCliqueSurAjouterUnContact() throws Throwable {
		Thread.sleep(5000);
		communMethods.clickElementWithJavascriptExecutor(NouvelEmbarquementPage.btnAjouterContact);
	}

	@When("^Je rempli le champ Titre \"([^\"]*)\" dans le formulaire$")
	public void jeRempliLeChampTitreDansLeFormulaire(String titreCont) throws Throwable {
		Thread.sleep(5000);
		communMethods.writeText(NouvelEmbarquementPage.placeHolderTitreContact, titreCont);
	}

	@When("^Je rempli le champ Nom \"([^\"]*)\" dans le formulaire$")
	public void jeRempliLeChampNomDansLeFormulaire(String nomCont) throws Throwable {
		Thread.sleep(5000);
		communMethods.writeText(NouvelEmbarquementPage.placeHolderNomContact, nomCont);
	}

	@When("^Je rempli le champ Prénom \"([^\"]*)\" dans le formulaire$")
	public void jeRempliLeChampPrénomDansLeFormulaire(String prenomCont) throws Throwable {
		Thread.sleep(5000);
		communMethods.writeText(NouvelEmbarquementPage.placeHolderPrenomContact, prenomCont);
	}

	@When("^Je rempli le champ Email \"([^\"]*)\" dans le formulaire$")
	public void jeRempliLeChampEmailDansLeFormulaire(String emailCont) throws Throwable {
		Thread.sleep(5000);
		communMethods.writeText(NouvelEmbarquementPage.placeHolderEmailContact, emailCont);
	}

	//	@When("^Je click sur la liste des roles$")
	//	public void je_click_sur_la_liste_des_roles() throws Throwable {
	//		Thread.sleep(5000);
	//		communMethods.clickElementWithJavascriptExecutor(NouvelEmbarquementPage.listeRoleContact);
	//	}

	//	@When("^Je sélectionne le role Assistant$")
	//	public void je_sélectionne_le_role_Assistant() throws Throwable {
	//		Thread.sleep(5000);
	//		communMethods.clickElementWithJavascriptExecutor(NouvelEmbarquementPage.roleAssistant);
	//		Thread.sleep(5000);
	//	}

	@When("^Je rempli le champ Téléphone \"([^\"]*)\" dans le formulaire$")
	public void jeRempliLeChampTéléphoneDansLeFormulaire(String telephoneCont) throws Throwable {
		Thread.sleep(5000);
		communMethods.writeText(NouvelEmbarquementPage.placeHolderTelephoneContact, telephoneCont);
	}

	@When("^Je clique sur le bouton Ajouter dans le formulaire$")
	public void je_clique_sur_le_bouton_Ajouter_dans_le_formulaire() throws Throwable {
		Thread.sleep(5000);
		communMethods.clickElementWithJavascriptExecutor(NouvelEmbarquementPage.btnAjouterContactDansFormulaire);
	}

	@When("^Je clique sur le bouton Valider pour vérifier le numéro saisie$")
	public void jeCliqueSurLeBoutonValiderPourVérifierLeNuméroSaisie() throws Throwable {
		Thread.sleep(5000);
		communMethods.clickElementWithJavascriptExecutor(NouvelEmbarquementPage.btnValiderTelephone);
	}

	@When("^Je clique sur le bouton Suivant Contact$")
	public void je_clique_sur_le_bouton_Suivant_Contact() throws Throwable {
		Thread.sleep(5000);
		communMethods.clickElementWithJavascriptExecutor(NouvelEmbarquementPage.btnSuivantContact);
	}

	@When("^Je clique sur le bouton  Lancer l’embarquement$")
	public void jeCliqueSurLeBoutonLancerLEmbarquement() throws Throwable {
		Thread.sleep(5000);
		communMethods.clickElementWithJavascriptExecutor(NouvelEmbarquementPage.btnLancerEmbarquement);
	}

	@Then("^La popup \"([^\"]*)\" s'affiche$")
	public void la_popup_s_affiche(String demandeMessage) throws Throwable {
		Thread.sleep(5000);
		String popup = communMethods.readText(NouvelEmbarquementPage.popupDemandeEmbarquement);
		Assert.assertTrue(popup.contains(demandeMessage));
		System.out.println(demandeMessage);
		Thread.sleep(5000);

	}
}


