Feature: El usuario visualiza los apartados dentro de ofertas
  Scenario: usuario visualiza apartados de ofertas relampago y top living
    Given el usuario ingresa a mercado libre
    When click en ofertas
    Then visualiza apartado de ofertas relampago
    And visualiza apartado de liquidacion