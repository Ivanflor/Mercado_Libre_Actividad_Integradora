Feature: El usuario desea ver multiples metodos de pago
  Scenario: El usuario debe visualizar los metodos de pago por tarjeta de credito, debito o billertera virtual
    Given el usuario ingresa a mercado libre
    When click en elige como pagar
    Then visualizar tarjetas de credito y debito
    And visualiza mercado pago
