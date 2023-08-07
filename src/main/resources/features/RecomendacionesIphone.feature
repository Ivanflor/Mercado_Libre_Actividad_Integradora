Feature: El usuario realiza la busqueda de un producto y al regresar a la pagina de inicio esta le muestra recomendaciones relacionadas a su busqueda
  Scenario: Usuario busca Iphone y al regresal al inicio ve recomendaciones relacionadas a la busqueda
    Given el usuario ingresa a mercado libre
    When usario realiza la busqueda Iphone
    And click elemento seleccionado
    And click en boton para regresar al inicio
    Then visualiza un partado con recomendaciones