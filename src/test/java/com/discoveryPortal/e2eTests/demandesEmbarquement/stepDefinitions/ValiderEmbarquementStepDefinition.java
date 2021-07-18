package com.discoveryPortal.e2eTests.demandesEmbarquement.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.discoveryPortal.e2eTests.demandesEmbarquement.pages.ValiderEmbarquementPage;
import com.discoveryPortal.e2eTests.utils.CommunMethods;
import com.discoveryPortal.e2eTests.utils.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValiderEmbarquementStepDefinition {

	public WebDriver driver;
	private CommunMethods communMethods = new CommunMethods();

	public ValiderEmbarquementStepDefinition() {
		driver = Setup.driver;
		PageFactory.initElements(driver, ValiderEmbarquementPage.class);
	}

	@When("^Je clique sur le sous menu Demandes d'embarquement$")
	public void je_clique_sur_le_sous_menu_Demandes_d_embarquement() throws Throwable {
		Thread.sleep(7000);
		communMethods.clickElementWithJavascriptExecutor(ValiderEmbarquementPage.menuDemandeEmbarquement);
	}

	@When("^Je saisi l'adresse mail du compte embarqué \"([^\"]*)\" dans le champ Rechercher un embarquement$")
	public void je_saisi_l_adresse_mail_du_compte_embarqué_dans_le_champ_Rechercher_un_embarquement(String compteEmb)
			throws Throwable {
		Thread.sleep(5000);
		communMethods.writeText(ValiderEmbarquementPage.placeHolderRechercherEmbarquement, compteEmb);
	}

	@When("^Je clique sur la loop Rechercher un embarquement$")
	public void je_clique_sur_la_loop_Rechercher_un_embarquement() throws Throwable {
		Thread.sleep(5000);
		communMethods.clickElementWithJavascriptExecutor(ValiderEmbarquementPage.iconeRechercherEmbarquement);
	}

	@When("^Je clique sur l'action valider l'embarquement$")
	public void je_clique_sur_l_action_valider_l_embarquement() throws Throwable {
		Thread.sleep(5000);
		communMethods.clickElementWithJavascriptExecutor(ValiderEmbarquementPage.embarquementChoisit);
		Thread.sleep(5000);
		communMethods.clickElementWithJavascriptExecutor(ValiderEmbarquementPage.actionValiderEmbarquement);
	}

	@Then("^La demande d'embarquement est validé \"([^\"]*)\"$")
	public void la_demande_d_embarquement_est_validé(String statutEmb) throws Throwable {
		Thread.sleep(5000);
		communMethods.mouseHover(ValiderEmbarquementPage.statutEmbarquement);
		String statutHover = communMethods.readText(ValiderEmbarquementPage.statutEmbarquement);
		Assert.assertTrue(statutHover.contains(statutEmb));
		System.out.println("Embarquement validé");
		Thread.sleep(5000);
		
	}
}
