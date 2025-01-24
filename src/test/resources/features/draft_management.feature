Feature: Product draft management

  	Background:
	  Given the header is set with header authentication email and base URI

  	@ApiTest
	Scenario: Get product details and validate details

	  When a GET request is sent to fetch product details for given parameters
	  Then the response is saved in a POJO
	  And the status code is validated
	  And the schema is validated


#	@ApiTest
#	Scenario: