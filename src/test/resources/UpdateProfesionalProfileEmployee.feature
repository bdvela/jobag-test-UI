Feature: Actualizar perfil empresarial.
  Scenario:  El empleador logra crear la plantilla de la empresa.
    Given  el empleador quiere registrar su empresa.
    When  entre en la pantalla principal con el rol de “empleador”
    Then el empleador puede generar una plantilla para empresa a través de una opción en la pantalla.

  Scenario: El empleador no logra crear la plantilla de la empresa
    Given  el empleador desea registrar su empresa
    When se encuentre en la pantalla principal con el rol de empleador, llena los campos con datos inválidos y envía los datos
    Then se muestra un mensaje de error indicando que los datos son inválidos

  Scenario: El empleador no puede crear la plantilla de la empresa
    Given El empleador quiere registrar su empresa
    When se encuentre en la pantalla principal con el rol de “empleador”, no llena todos los campos y envía los datos
    Then se muestra un mensaje de error indicando que no debe dejar campos vacíos