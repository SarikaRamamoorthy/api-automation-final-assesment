Feature: Product draft management

  	Background:
	  Given the header is set with header authentication email and base URI

  	@ApiTest
	Scenario: Get product details and validate details

	  When a GET request is sent to fetch product details for given parameters
	  Then the response is saved in a POJO
	  And the status code is validated
	  And the schema is validated


	@ApiTest
	Scenario: Draft form is created using product details

	  Given response from previous api call is passed to draft request
	  When the POST request is sent to save draft
	  Then the status code is validated
	  And validate data is not empty
	  And validate errors are empty
	  And the draft number is saved

	@ApiTest
	Scenario: get draft consignment
	  When draft number from previous api call is used to send GET request
	  Then the status code is validated
	  And the response is saved in a draftResponse POJO
	  And validate the response data

  	@ApiTest
	Scenario: delete consignment draft using draft number
	  When a DELETE request is sent with the draft number as a query parameter
	  Then the status code is validated
