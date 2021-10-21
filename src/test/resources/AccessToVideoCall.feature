Feature: Acceder a videollamada para la entrevista
  Scenario: El postulante puede ver una videollamada disponible para entrar
    Given el postulante desea ingresar a una entrevista para el puesto de trabajo
    When da clic en el botón de “acceder a la videollamada”.
    Then entra a la videollamada exitosamente.

  Scenario: El postulante no logra ingresar a la videollamada
    Given el postulante desea ingresar a una entrevista para el puesto de trabajo
    When da clic en el botón de “acceder a la videollamada”.
    Then la url a la que se dirige no existe

  Scenario: El campo del link de la videollamada está vacío
    Given el postulante desea ingresar a una entrevista para el puesto de trabajo
    When da clic en el botón de “acceder a la videollamada”.
    Then se muestra un mensaje de que el link no ha sido configurado