@valider-embarquement
Feature: Validation d'un embarquement
    En tant que collaborateur KPMG je souhaite valider la demande d'embarquement multirapport

  Background: 
    Given Je me connecte à l'application Discovery Portal
    When Je clique sur autoriser les cookies
    And Je clique  sur le bouton Se connecter en tant que collaborateur
    And Je saisi l'email "rbelhaj@kpmg.fr"
    And Je clique sur le bouton suivant
    And Je saisi le mot de passe "Kpmg2428"
    And Je clique sur le bouton Connexion

  @valider-embarquement
  Scenario: Valider une demande d'embarquement
    When Je clique sur l'application Embarquement
    And Je clique sur le sous menu Demandes d'embarquement
    And Je saisi l'adresse mail du compte embarqué "kpmgtest_qa_002@outlook.fr" dans le champ Rechercher un embarquement
    And Je clique sur la loop Rechercher un embarquement
    And Je clique sur l'action valider l'embarquement
    Then La demande d'embarquement est validé "Embarquement validé"
