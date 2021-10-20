Feature: Crear anuncios de trabajo
  Scenario: El postulante puede ver las propuestas de trabajo y puede postular a un trabajo.
    Given el empleador desea publicar una propuesta de trabajo
    When presiona en la opción publicar, la seleccione y luego ponga su propuesta
    Then en el perfil del empleador se muestra la propuesta de trabajo hecha por este.

  Scenario: El empleador modifica sus propuestas de trabajo.
    Given el empleador desea editar la información de alguna propuesta de trabajo que ya haya subido
    When presione el botón de editar en su propuesta de trabajo
    Then cambiará los datos respectivos y se actualizará la información.

  Scenario:El empleador no completa todos los datos necesarios en la publicación de una propuesta de trabajo.
    Given el empleador dejo incompleto los datos de la propuesta de trabajo
    When se disponga a publicar el puesto de trabajo
    Then  le saldrá un mensaje de error indicando que los datos están incompletos.