Feature: usuario realiza un busqueda con ayuda de los filtro
  Scenario: usuario realiza un busqueda por filtros en la seccion de calzados por precio y hubicacion
    Given el usuario ingresa a mercado libre
    When click en moda
    And click en calzado
    And click en filtros
    Then visualizar etiquetas de los filtro aplicados