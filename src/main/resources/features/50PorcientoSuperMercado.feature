Feature: el usuario filtra los productos de supermercado
  Scenario: usuario filtra por 50% de descuento en articulos de supermercado
    Given el usuario ingresa a mercado libre
    When click en supermercado
    And click ofertas supermercado
    And click en 50 off
    Then usuario visualiza la etiqueta de 50 off