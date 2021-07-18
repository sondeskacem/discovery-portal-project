@embarquement
Feature: Lancer un embarquement
    En tant que collaborateur KPMG je souhaite lancer une demande d'embarquement multirapport

  Background: 
    Given Je me connecte à l'application Discovery Portal
    When Je clique sur autoriser les cookies
    And Je clique  sur le bouton Se connecter en tant que collaborateur
    And Je saisi l'email "skacem@kpmg.fr"
    And Je clique sur le bouton suivant
    And Je saisi le mot de passe "Kpmg2434"
    And Je clique sur le bouton Connexion

  #@cnx
  #Scenario: Authentification - Discovery Portal
  #  Then Redirection vers l'application Discovery Portal
  @lancer-embarquement
  Scenario: Lancer une demande d'embarquement
    When Je clique sur l'application Embarquement
    And Je saisi "1000230270" dans le champ Rechercher un client parmi la liste
    And Je clique sur la loop de recherche client
    And Je sélectionne le client SMOKE TEST COMBINE
    And Je clique sur le bouton Suivant Client
    And Je saisi "2507199400" dans le champ Rechercher un engagement parmi la liste
    And Je clique sur la loop de recherche engagement
    And Je sélectionne l'engagement TMA_Discovrey
    And Je clique sur le bouton Suivant Engagement
    And Je sélectionne l'offre Multirapports
    And Je clique sur le bouton Suivant Offre
    And Je clique sur Ajouter un contact
    And Je rempli le champ Titre "TitreContact" dans le formulaire
    And Je rempli le champ Nom "NContact" dans le formulaire
    And Je rempli le champ Prénom "PContact" dans le formulaire
    And Je rempli le champ Email "kpmgtest_qa_003@outlook.fr" dans le formulaire
    #And Je click sur la liste des roles
    #And Je sélectionne le role Assistant
    And Je rempli le champ Téléphone "0021655555555" dans le formulaire
    And Je clique sur le bouton Ajouter dans le formulaire
    And Je clique sur le bouton Valider pour vérifier le numéro saisie
    And Je clique sur le bouton Suivant Contact
    And Je clique sur le bouton  Lancer l’embarquement
    Then La popup "Demande d'embarquement lancée" s'affiche
