Feature: Crear una solicitud de empleo
  Scenario: El empleador crea una nueva entrevista.
    Given el empleador quiere programar una entrevista.
    When entra a la sección de un anuncio “Crear una nueva entrevista” debe ingresar una fecha y asigna postulantes.
    Then el empleador genera una nueva entrevista.

  Scenario:El empleador modifica la fecha y hora de una entrevista.
    Given el empleador desea cambiar la fecha y/o hora de alguna entrevista creada
    When entre a la información de la entrevista y le de click a modificar
    Then se le abrirá un formulario para que el empleador ingrese los nuevos datos para la entrevista.

  Scenario:El empleador visualiza su entrevista en el calendario de su dispositivo.
    Given el empleador quiere visualizar sus entrevistas en el calendario de su celular
    When entre a su perfil y active la opción de conectar con calendario
    Then visualizará todas sus entrevistas programadas en el calendario del celular.