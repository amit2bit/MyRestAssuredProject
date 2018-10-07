Feature: Testing of get method

  Scenario Outline: Test my Get Method with Parameters
    #Given  user start the rest asured test
    When user hit the get request
    Then user checks the count or size
    #Then user checks at path "MRData.CircuitTable.Circuits.circuitId[0]" with the "albert_park" value
    Then user checks at path "<path>" with the "<value>" value

    Examples: 
      | path                                      | value       |
      | MRData.CircuitTable.Circuits.circuitId[0] | albert_park |
      | MRData.CircuitTable.Circuits.circuitId[1] | americas    |
      | MRData.CircuitTable.Circuits.circuitId[2] | bahrain     |
