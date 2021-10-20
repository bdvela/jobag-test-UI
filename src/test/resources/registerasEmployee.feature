Feature: Registrarse como Empleador
  Scenario: El empleador logra registrarse con éxito.
    Given el empleador ingresa a la aplicación.
    When  presiona la opción de registrarse afiliando datos de la empresa, RUC y una contraseña.
    Then se le notifica por mensaje de texto que el registro se realizó correctamente.

  Scenario: El empleador no logra registrarse.
    Given el empleador entra en la aplicación.
    When presiona la opción de registrarse y no llena adecuadamente los datos.
    Then El proceso de registro no se realiza porque debe digitar datos válidos.

  Scenario: El empleador no logra registrarse por ingresar campos vacíos
    Given El empleador entra a la aplicación
    When presiona sobre la opción de registrarse y deja campos vacíos
    Then se muestra un mensaje de error indicando que no se puede dejar campos vacíos
