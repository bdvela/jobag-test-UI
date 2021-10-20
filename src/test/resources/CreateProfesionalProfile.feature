Feature: Crear perfil profesional
  Scenario: El postulante desea crear su perfil profesional.
    Given el postulante quiere crear su perfil profesional
    When  está registrado, se muestra la opción de crear perfil profesional.
    Then selecciona esa opción y comienza a responder ciertas preguntas, además de añadir información adicional sobre el postulante como cualidades propias del postulante para el trabajo.

  Scenario: El postulante desea modificar su perfil profesional.
    Given el postulante quiere modificar/editar su perfil profesional.
    When está creado su perfil profesional, se muestra la opción de “Editar perfil”.
    Then selecciona esa opción y comienza a editar las preguntas, además de modificar la información añadida anteriormente.

  Scenario: El postulante no logra modificar su perfil profesional
    Given el postulante quiere modificar su perfil profesional
    When presione sobre la opción Editar perfil, modifique los datos que requiera, pero de manera incorrecta
    Then se mostrará un mensaje de error indicando que no se pudo guardar los cambios
