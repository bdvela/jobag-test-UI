Feature: Crear una solicitud de empleo
  Scenario: El postulante puede ver las propuestas de trabajo y puede postular a un trabajo.
    Given el postulante desea postular a puestos de trabajo.
    When postula a estos puestos aparece un mensaje de confirmación en la app.
    Then ha postulado exitosamente.

  Scenario:El postulante puede postular a varios trabajos
    Given el postulante desea postular a diversos puestos de trabajos
    When postula se notificará el número de trabajos postulados actualmente.
    Then aparecerá un mensaje de confirmación en la app.

  Scenario:El postulante no puede postular para el mismo trabajo
    Given el postulante postula a puestos de trabajo
    When intenta postular por segunda vez a un mismo trabajo
    Then se mostrará un mensaje de error indicando que no es posible postular más de una vez al mismo trabajo