Feature: Buscar puestos de trabajo
  Scenario: El postulante puede ver las propuestas de trabajo.
    Given el postulante desea buscar puestos de trabajo.
    When busca estos puestos, le aparecen unas recomendaciones dependiendo de su perfil.
    Then encuentra con facilidad estas propuestas.

  Scenario: El postulante no puede encontrar puestos de trabajo.
    Given el postulante busca puestos de trabajo.
    When no encuentra lo que está buscando.
    Then revisa su perfil de usuario sobre los datos que puso o envía un correo de ayuda.

  Scenario: El postulante no puede encontrar puestos de trabajo
    Given el postulante  quiere buscar puestos de trabajo
    When busca según sus criterios
    Then se muestra una o varias ofertas de trabajo