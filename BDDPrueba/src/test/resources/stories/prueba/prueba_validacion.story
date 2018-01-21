Meta:
@Automatizador:Luis Mongui

Narrative:
Yo como usuario deseo poder realizar el ingreso a la
aplicacion y poder realizar la busqueda de productos

Scenario: presentar resultado de navegacion
Given acceder a la url: https://www.carnival.com/cruise-search
When seleccionar opcion de navegacion:
|sailto  |sailfrom |
|Cuba    |Tampa, FL|
Then validacion cantidad de opciones:
|cantidad    |
|6 RESULTS|
Examples:
||
||


Scenario: mensaje error login invalido
Meta:
@manual
Given acceder a la url: https://www.carnival.com
When se ingresa el usuario y password:
|usuario    |password |
|luis.mongui|123468533|
Then el sistema presenta un mensaje de error: Login was unsuccessful. Please correct the errors and try again.
Examples:
||
||

