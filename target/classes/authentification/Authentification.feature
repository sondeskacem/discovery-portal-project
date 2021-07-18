@cnx
Feature: Authentification - Discovery Portal
  En tant que collaborateur KPMG je souhaite m'authentifier à l'application Discovery Portal

  Background: 
    Given Je me connecte à l'application Discovery Portal

  @cnx
  Scenario: Authentification - Discovery Portal
    When Je clique sur autoriser les cookies
    And Je clique  sur le bouton Se connecter en tant que collaborateur
    And Je saisi l'email "skacem@kpmg.fr"
    And Je clique sur le bouton suivant
    And Je saisi le mot de passe "Kpmg2434"
    And Je clique sur le bouton Connexion
    Then Redirection vers l'application Discovery Portal
