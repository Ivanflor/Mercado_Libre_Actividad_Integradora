Feature: El usuari vizualiza el orden de los productos por categorias predeterminadas
  Scenario: usuario ingresa a mercado apgo ofertas y visualiza los productos por mayor relevancia
    Given el usuario ingresa a mercado libre
    When click en supermercado
    And click ofertas supermercado
    Then visualiza texto ordenados por mayor relevancia

