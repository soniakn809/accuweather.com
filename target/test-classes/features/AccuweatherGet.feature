@GET
Feature: Scenarios for GET Weather endpoint.
  The scenario get us the value of Weather with given city name

		
	Scenario Outline: List of Temprature details and verify status code
  	Given I have header with key "Authorization" and value "<token>"
  	And query param "q" with value "<query_param>"
		When I do a "GET" request with path "data/2.5/weather"
		Then verify status code is <status_code>	
		
	Examples:
		|token|query_param|status_code|
		|Bearer 7fe67bf08c80ded756e598d6f8fedaea|Bengaluru|200|
		