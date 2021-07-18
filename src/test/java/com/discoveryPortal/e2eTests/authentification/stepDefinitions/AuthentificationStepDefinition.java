package com.discoveryPortal.e2eTests.authentification.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.discoveryPortal.e2eTests.authentification.pages.AuthentificationPage;
import com.discoveryPortal.e2eTests.utils.CommunMethods;
import com.discoveryPortal.e2eTests.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthentificationStepDefinition {

	public WebDriver driver;
	private CommunMethods communMethods = new CommunMethods();

	public AuthentificationStepDefinition() {
		driver = Setup.driver;
		PageFactory.initElements(driver, AuthentificationPage.class);
	}


	@Given("^Je me connecte à l'application Discovery Portal$")
	public void jeMeConnecteÀLApplicationDiscoveryPortal() throws Throwable {
		communMethods.openApplicationWithConfigFile("url-ppr");
	}

	@When("^Je clique sur autoriser les cookies$")
	public void jeCliqueSurAutoriserLesCookies() throws Throwable {
		communMethods.clickElementWithJavascriptExecutor(AuthentificationPage.cookies);
	}

	@When("^Je clique  sur le bouton Se connecter en tant que collaborateur$")
	public void jeCliqueSurLeBoutonSeConnecterEnTantQueCollaborateur() throws Throwable {
		Thread.sleep(5000);
		communMethods.click(AuthentificationPage.btnSeConnecter);
	}

	@When("^Je saisi l'email \"([^\"]*)\"$")
	public void jeSaisiLEmail(String login) throws Throwable {
		Thread.sleep(5000);
		communMethods.writeText(AuthentificationPage.email, login);
	}

	@When("^Je clique sur le bouton suivant$")
	public void jeCliqueSurLeBoutonSuivant() throws Throwable {
		communMethods.click(AuthentificationPage.btnSuivant);
	}

	@When("^Je saisi le mot de passe \"([^\"]*)\"$")
	public void jeSaisiLeMotDePasse(String password) throws Throwable {
		Thread.sleep(5000);
		communMethods.writeText(AuthentificationPage.motDePasse, password);
	}

	@When("^Je clique sur le bouton Connexion$")
	public void jeCliqueSurLeBoutonConnexion() throws Throwable {
		communMethods.click(AuthentificationPage.btnConnexion);
	}

	@Then("^Redirection vers l'application Discovery Portal$")
	public void redirectionVersLApplicationDiscoveryPortal() throws Throwable {
		//String account = AuthentificationPage.userTitle.getText();
		//Assert.assertTrue(account.contains("userTitle"));
	}
}
