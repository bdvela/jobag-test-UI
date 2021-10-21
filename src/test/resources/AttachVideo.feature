Feature: Adjuntar videos mostrando tus capacidades de trabajo
  Scenario: El postulante desea presentarse ante el empleador de manera más dinámica con un video
    Given el postulante quiere adjuntar un video
    When encuentra la opción adjuntar video
    Then el postulante selecciona esa opción puede adjuntar el enlace del vídeo.

  Scenario: El postulante no logra adjuntar correctamente el link del video
    Given el postulante quiere adjuntar un video
    When encuentra la opción adjuntar video, selecciona la opción e ingresa el enlace del video con formato incorrecto
    Then se muestra un mensaje de error indicando que el enlace tiene formato inválido

  Scenario: El postulante no logra adjuntar el enlace del video
    Given el postulante quiere adjuntar un video
    When encuentra la opción adjuntar video, selecciona la opción e ingresa el enlace del video alojado en un servidor distinto a YouTube
    Then se muestra un mensaje de error indicando que solo está permitido los enlaces de video de YouTube