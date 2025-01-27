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
#	Scenario: Draft form is created using product details
#
	  Given response from previous api call is passed to draft request
	  When the POST request is sent to save draft
	  Then the status code is validated
	  And the draft number is saved
#
#	@ApiTest
#	Scenario: get draft consignment
#	  When draft number from previous api call is used to send GET request
#	  Then the status code is validated
#	  And the response is saved in a draftResponse POJO
#
#	@ApiTest
#	Scenario: get all drafts
#	  When a GET request to fetch all drafts is sent
#	  Then the status code is validated
#	  And check if previous draft is present in the current response
