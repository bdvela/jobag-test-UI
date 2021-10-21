Feature: Listar las solicitudes de puestos de trabajos
  Scenario: El empleador visualiza las solicitudes de puestos de trabajo.
    Given el empleador quiere ver las solicitudes
    When  ingresa a la información de cada anuncio
    Then el empleador visualiza las solicitudes de trabajo.

  Scenario: El empleador filtra las solicitudes de trabajo según la edad de los postulantes
    Given el empleador desea filtrar las solicitudes de los postulantes menores de 25 años
    When ingrese a la información del anuncio y en la función de filtro llene la especificación de la edad
    Then visualizará las solicitudes que cumplan con la especificación ingresada.

  Scenario: El empleador preselecciona a un postulante.
    Given el empleador desea preseleccionar a unos cuantos postulantes para luego evaluarlos con mayor precisión
    When este visualizando la solicitud del postulante en cuestión y presione en la opción de preselección
    Then la solicitud del postulante será guardada en el apartado de preselección
