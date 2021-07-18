@connexion
Feature: Authentification - Discovery Portal
  En tant que collaborateur KPMG je souhaite m'authentifier à l'application Confirmation Portal
  
  Background:
    Given Je me connecte à l'application Discovery Portal

  @cnx-outline
  Scenario Outline: Authentification - Discovery Portal
    When Je clique sur autoriser les cookies
    When Je clique  sur le bouton Se connecter en tant que collaborateur
    And Je saisi l'email "<email>"
    And Je clique sur le bouton suivant
    And Je saisi le mot de passe "<password>"
    And Je clique sur le bouton Connexion
    Then Redirection vers l'application Discovery Portal

    Examples: 
      | email             | password  |
      | skacem@kpmg.fr    | Kpmg2434  |
      | mmahmoudi@kpmg.fr | Kpmg2429  |
      | rbelhaj@kpmg.fr   | P@ssw0rdKPMG@2021# |
