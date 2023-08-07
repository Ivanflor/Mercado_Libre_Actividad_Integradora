Feature: El usuario desea visualizar el costo de envio de unproducto antes de de realizar la compra
  Scenario: El usuario busca un pruducto especifico y visualiza el costo del envio antes de realizar la compra
    Given el usuario ingresa a mercado libre
    When usuario realiza la busqueda cubrebocas
    When usuario da click en elemento previo seleccionado
    Then usuario visualiza envio gratis