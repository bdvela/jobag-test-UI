Feature: Creación del perfil empresarial
  Scenario:  El empleador logra especificar los datos de la empresa.
    Given  el empleador desea ingresar los datos de la empresa
    When  entra al perfil de la empresa o al registrarse
    Then el empleador puede colocar en los campos, la información de la empresa

  Scenario: El empleador no logra especificar los datos de la empresa
    Given el empleador desea ingresar los datos de la empresa
    When entra al perfil de la empresa o en el momento del registro, llena los datos con datos inválidos
    Then se muestra un mensaje de error indicando que los datos ingresados son inválidos

  Scenario: El empleador no logra guardar los datos
    Given el empleador quiere ingresar los datos de la empresa
    When entra al perfil de la empresa o en el momento del registro, llena los datos, pero de manera incompleta
    Then Se muestra un mensaje de error indicando que no se puede dejar campos vacíos