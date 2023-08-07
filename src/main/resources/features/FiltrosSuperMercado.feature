Feature: El usuario puede visualizar diversos filtros en la seccion de super mercado
  Scenario: Usuario visualiza los siguientes categorias en super mercado:OFERTAS, CUIDADO PERSONAL, BELLEZA, BEBIDAS
    Given el usuario ingresa a mercado libre
    When click en supermercado
    Then usuario visualiza ofertas
    And usuario visualiza cuidado personal
    And usuario visualiza belleza
    And usuario visualiza bebidas