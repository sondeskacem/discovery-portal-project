$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("nouvelEmbarquement/LancerEmbarquement.feature");
formatter.feature({
  "line": 2,
  "name": "Lancer un embarquement",
  "description": "  En tant que collaborateur KPMG je souhaite lancer une demande d\u0027embarquement multirapport",
  "id": "lancer-un-embarquement",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@embarquement"
    }
  ]
});
formatter.before({
  "duration": 2237642900,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "Je me connecte à l\u0027application Discovery Portal",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Je clique sur autoriser les cookies",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Je clique  sur le bouton Se connecter en tant que collaborateur",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Je saisi l\u0027email \"skacem@kpmg.fr\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Je clique sur le bouton suivant",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Je saisi le mot de passe \"Kpmg2434\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Je clique sur le bouton Connexion",
  "keyword": "And "
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeMeConnecteÀLApplicationDiscoveryPortal()"
});
formatter.result({
  "duration": 4310468600,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeCliqueSurAutoriserLesCookies()"
});
formatter.result({
  "duration": 37204200,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeCliqueSurLeBoutonSeConnecterEnTantQueCollaborateur()"
});
formatter.result({
  "duration": 5821618600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "skacem@kpmg.fr",
      "offset": 18
    }
  ],
  "location": "AuthentificationStepDefinition.jeSaisiLEmail(String)"
});
formatter.result({
  "duration": 5195007400,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeCliqueSurLeBoutonSuivant()"
});
formatter.result({
  "duration": 66420000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Kpmg2434",
      "offset": 26
    }
  ],
  "location": "AuthentificationStepDefinition.jeSaisiLeMotDePasse(String)"
});
formatter.result({
  "duration": 6039024000,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeCliqueSurLeBoutonConnexion()"
});
formatter.result({
  "duration": 8885419900,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 14,
      "value": "#@cnx"
    },
    {
      "line": 15,
      "value": "#Scenario: Authentification - Discovery Portal"
    },
    {
      "line": 16,
      "value": "#  Then Redirection vers l\u0027application Discovery Portal"
    }
  ],
  "line": 18,
  "name": "Lancer une demande d\u0027embarquement",
  "description": "",
  "id": "lancer-un-embarquement;lancer-une-demande-d\u0027embarquement",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@lancer-embarquement"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "Je clique sur l\u0027application Embarquement",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Je saisi \"1000230270\" dans le champ Rechercher un client parmi la liste",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Je clique sur la loop de recherche client",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Je sélectionne le client SMOKE TEST COMBINE",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Je clique sur le bouton Suivant Client",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Je saisi \"2507199400\" dans le champ Rechercher un engagement parmi la liste",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Je clique sur la loop de recherche engagement",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Je sélectionne l\u0027engagement TMA_Discovrey",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Je clique sur le bouton Suivant Engagement",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Je sélectionne l\u0027offre Multirapports",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Je clique sur le bouton Suivant Offre",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Je clique sur Ajouter un contact",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Je rempli le champ Titre \"TitreContact\" dans le formulaire",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Je rempli le champ Nom \"NContact\" dans le formulaire",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Je rempli le champ Prénom \"PContact\" dans le formulaire",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Je rempli le champ Email \"kpmgtest_qa_003@outlook.fr\" dans le formulaire",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 35,
      "value": "#And Je click sur la liste des roles"
    },
    {
      "line": 36,
      "value": "#And Je sélectionne le role Assistant"
    }
  ],
  "line": 37,
  "name": "Je rempli le champ Téléphone \"0021655555555\" dans le formulaire",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "Je clique sur le bouton Ajouter dans le formulaire",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Je clique sur le bouton Valider pour vérifier le numéro saisie",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "Je clique sur le bouton Suivant Contact",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "Je clique sur le bouton  Lancer l’embarquement",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "La popup \"Demande d\u0027embarquement lancée\" s\u0027affiche",
  "keyword": "Then "
});
formatter.match({
  "location": "NouvelEmbarquementStepDefinition.jeCliqueSurLApplicationEmabarquement()"
});
formatter.result({
  "duration": 5197337600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1000230270",
      "offset": 10
    }
  ],
  "location": "NouvelEmbarquementStepDefinition.jeSaisiDansLeChampRechercherUnClientParmiLaListe(String)"
});
formatter.result({
  "duration": 20220863100,
  "status": "passed"
});
formatter.match({
  "location": "NouvelEmbarquementStepDefinition.jeCliqueSurLaLoopDeRecherche()"
});
formatter.result({
  "duration": 10135844500,
  "status": "passed"
});
formatter.match({
  "location": "NouvelEmbarquementStepDefinition.jeSélectionneLeClientSMOKETESTCOMBINE()"
});
formatter.result({
  "duration": 5118405400,
  "status": "passed"
});
formatter.match({
  "location": "NouvelEmbarquementStepDefinition.jeCliqueSurLeBoutonSuivant()"
});
formatter.result({
  "duration": 5094621000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2507199400",
      "offset": 10
    }
  ],
  "location": "NouvelEmbarquementStepDefinition.jeSaisiDansLeChampRechercherUnEngagementParmiLaListe(String)"
});
formatter.result({
  "duration": 5173975400,
  "status": "passed"
});
formatter.match({
  "location": "NouvelEmbarquementStepDefinition.je_clique_sur_la_loop_de_recherche_engagement()"
});
formatter.result({
  "duration": 50291800,
  "status": "passed"
});
formatter.match({
  "location": "NouvelEmbarquementStepDefinition.je_sélectionne_l_engagement_TMA_Discovrey()"
});
formatter.result({
  "duration": 5113544200,
  "status": "passed"
});
formatter.match({
  "location": "NouvelEmbarquementStepDefinition.je_clique_sur_le_bouton_Suivant_Engagement()"
});
formatter.result({
  "duration": 67456700,
  "status": "passed"
});
formatter.match({
  "location": "NouvelEmbarquementStepDefinition.je_sélectionne_l_offre_Multirapports()"
});
formatter.result({
  "duration": 5088121600,
  "status": "passed"
});
formatter.match({
  "location": "NouvelEmbarquementStepDefinition.je_clique_sur_le_bouton_Suivant_Offre()"
});
formatter.result({
  "duration": 45578900,
  "status": "passed"
});
formatter.match({
  "location": "NouvelEmbarquementStepDefinition.jeCliqueSurAjouterUnContact()"
});
formatter.result({
  "duration": 5099705100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TitreContact",
      "offset": 26
    }
  ],
  "location": "NouvelEmbarquementStepDefinition.jeRempliLeChampTitreDansLeFormulaire(String)"
});
formatter.result({
  "duration": 5226851100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NContact",
      "offset": 24
    }
  ],
  "location": "NouvelEmbarquementStepDefinition.jeRempliLeChampNomDansLeFormulaire(String)"
});
formatter.result({
  "duration": 5227407100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PContact",
      "offset": 27
    }
  ],
  "location": "NouvelEmbarquementStepDefinition.jeRempliLeChampPrénomDansLeFormulaire(String)"
});
formatter.result({
  "duration": 5165774300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kpmgtest_qa_003@outlook.fr",
      "offset": 26
    }
  ],
  "location": "NouvelEmbarquementStepDefinition.jeRempliLeChampEmailDansLeFormulaire(String)"
});
formatter.result({
  "duration": 5205432900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0021655555555",
      "offset": 30
    }
  ],
  "location": "NouvelEmbarquementStepDefinition.jeRempliLeChampTéléphoneDansLeFormulaire(String)"
});
formatter.result({
  "duration": 5209778500,
  "status": "passed"
});
formatter.match({
  "location": "NouvelEmbarquementStepDefinition.je_clique_sur_le_bouton_Ajouter_dans_le_formulaire()"
});
formatter.result({
  "duration": 5113739000,
  "status": "passed"
});
formatter.match({
  "location": "NouvelEmbarquementStepDefinition.jeCliqueSurLeBoutonValiderPourVérifierLeNuméroSaisie()"
});
formatter.result({
  "duration": 5102577900,
  "status": "passed"
});
formatter.match({
  "location": "NouvelEmbarquementStepDefinition.je_clique_sur_le_bouton_Suivant_Contact()"
});
formatter.result({
  "duration": 5103679300,
  "status": "passed"
});
formatter.match({
  "location": "NouvelEmbarquementStepDefinition.jeCliqueSurLeBoutonLancerLEmbarquement()"
});
formatter.result({
  "duration": 5105212700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Demande d\u0027embarquement lancée",
      "offset": 10
    }
  ],
  "location": "NouvelEmbarquementStepDefinition.la_popup_s_affiche(String)"
});
formatter.result({
  "duration": 5070702100,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"swal2-title\"]\"}\n  (Session info: chrome\u003d91.0.4472.124)\n  (Driver info: chromedriver\u003d90.0.4430.24 (4c6d850f087da467d926e8eddb76550aed655991-refs/branch-heads/4430@{#429}),platform\u003dWindows NT 10.0.19041 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 65 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.47.1\u0027, revision: \u0027unknown\u0027, time: \u00272015-07-30 11:02:44\u0027\nSystem info: host: \u0027DESKTOP-MS3E63D\u0027, ip: \u0027172.20.10.4\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.9\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:55449}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, webauthn:extension:largeBlob\u003dtrue, unexpectedAlertBehaviour\u003dignore, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d90.0.4430.24 (4c6d850f087da467d926e8eddb76550aed655991-refs/branch-heads/4430@{#429}), userDataDir\u003dC:\\Users\\LENOVO\\AppData\\Local\\Temp\\scoped_dir20172_1994563474}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d91.0.4472.124, browserConnectionEnabled\u003dfalse, proxy\u003d{}, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, webauthn:virtualAuthenticators\u003dtrue}]\nSession ID: 7f95c1a142fdb7ec649c5a42bf3b91b8\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"swal2-title\"]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:595)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:348)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:445)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:358)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:340)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy20.getText(Unknown Source)\r\n\tat com.discoveryPortal.e2eTests.utils.CommunMethods.readText(CommunMethods.java:67)\r\n\tat com.discoveryPortal.e2eTests.nouvelEmbarquement.stepDefinitions.NouvelEmbarquementStepDefinition.la_popup_s_affiche(NouvelEmbarquementStepDefinition.java:168)\r\n\tat ✽.Then La popup \"Demande d\u0027embarquement lancée\" s\u0027affiche(nouvelEmbarquement/LancerEmbarquement.feature:42)\r\n",
  "status": "failed"
});
formatter.write("Current page url is https://discovery.pprod.ext.net.kpmg.fr/app/onboarding/newonboarding");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1631753100,
  "status": "passed"
});
});