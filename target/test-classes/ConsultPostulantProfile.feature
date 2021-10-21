Feature: Consultar perfil de Postulante
  Scenario: El empleador visualiza el perfil de los interesados en su propuesta de trabajo
    Given el empleador quiere ver quienes respondieron a su propuesta de trabajo.
    When ve quienes están interesados, aparece la opción de consultar perfil de usuario
    Then se visualiza el perfil del postulante solicitado.

  Scenario: El empleador guarda el perfil de un postulante
    Given el empleador visualiza y se interesa en el perfil de un postulante
    When el empleador visualiza y se interesa en el perfil de un postulante
    Then se guardará el perfil del postulante en cuestión.

  Scenario: El empleador visualiza su lista de postulantes guardados
    Given el empleador desea ver los perfiles de los postulantes que ha guardado
    When le dé click al apartado de postulantes guardados
    Then se le mostrará una lista de los perfiles que guardo previamente.
