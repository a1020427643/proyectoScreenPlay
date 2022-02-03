#Autor: Eric Espinosa

@stories
Feature: Academy Choucair
  AS a user, I want to learn to automate in screenplay at Choucair Academy with the automation course

  @scenario
  Scenario: Search automation course
    Given that 'Maritza' wants to learn automation at the Academy Choucair
    When she searches for the course "Recursos Automatización Bancolombia" on the choucair academy platform
    Then she finds the course called "Recursos Automatización Bancolombia"