Feature: Registrarse como postulante
  Scenario: El postulante logra registrarse con éxito.
    Given el postulante ingresa a la aplicación.
    When presiona la opción de registrarse afiliando sus datos personales, correo, número de celular y una contraseña.
    And se logea en la aplicación
    Then ingresa al home de la aplicación

  Scenario: El postulante no logra registrarse.
    Given el postulante entra a la aplicación.
    When presiona la opción de registrarse y no llena  los datos.
    Then vuelve a la pantalla de login porque proceso de registro no se realiza.
    And ingresa su informacion e intenta logearse
    Then le sale un mensaje de error porque sus credenciales no son validas

  Scenario: El postulante no logra registrarse por ingresar campos vacíos
    Given el postulante ingresa a la aplicación
    When presiona sobre la opción de registrarse y no llena adecuadamente los datos
    Then el proceso de registro no se realiza porque debe digitar datos válidos.
