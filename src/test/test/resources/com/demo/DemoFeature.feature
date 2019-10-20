Feature: Testing A Demo feature

    Background:
        Given message testServiceRequest
        And <testServiceRequest> header Content-Type is "application/json"
        And <testServiceRequest> header citrus_http_method is "GET"

        Given message testServiceResponse
        And <testServiceResponse> header Content-Type is "@equalsIgnoreCase('application/json;charset=UTF-8')@"
        And <testServiceResponse> header citrus_http_status_code is "200"
        And <testServiceResponse> header citrus_http_reason_phrase is "OK"
        And <testServiceResponse> payload is
    		"""
    		{
    		    "fname":"Ram",
    		    "lname":"Das",
    		    "roll":10
    		 }
    		"""

    @SOMEPROCESSOR1
    Scenario: Send test service GET, then see

    When <testApiClient> sends message <testServiceRequest>
    And <testApiClient> should receive JSON message <testServiceResponse>




