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
#		| draftNumber       | merchantCode | merchantName | potentialOutboundFee | deliveryNotes              | productCode             | isProductFbb | isDisabled | storageLocation | warehouseName                | distribution | proposedQuantity | availableQuantity | confirmedQuantity | sellerNotes             | shippingType         | pickupPointCode | pickupPointName       | pickupPointAddress                                                 | sellerPicName | sellerPicPhoneNumber | emergencyContactEmail    | emergencyContactNumber | preferredDate | preferredTime |
#		| CF-DRAFT/2501/001 | FBB-60021    | FBB-60021    | 150.00               | Handle with care           | FBB-60021-00001-00001   | false        | true       | Loc-001         | Bandung Kiaracondong         | Regular      | 10               | 8                 | 7                 | Urgent delivery needed  | SHIPPED_BY_MERCHANT | PUP-001         | Bandung Pickup Point  | Jl. Ibrahim Adjie No.338, Kelurahan Binong, Kecamatan Batununggal  | John Doe      | +62-812-3456-7890   | johndoe@example.com      | +62-812-1111-2222     | 2025-01-30   | 10:00 AM      |

	  When the POST request is sent to save draft
	  Then the status code is validated
	  And the draft number is saved

	@ApiTest
	Scenario: get draft consignment
	  When draft number from previous api call is used to send GET request
	  Then the status code is validated
	  And the response is saved in a draftResponse POJO

#	@ApiTest
#	Scenario: get all drafts
#	  When a GET request to fetch all drafts is sent
#	  Then the status code is validated
#	  And check if previous draft is present in the current response
