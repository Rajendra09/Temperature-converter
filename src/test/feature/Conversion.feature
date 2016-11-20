Feature: Tempreture converture

Scenario: Convert to celsius frommm Fahrenheit
  Given I want to convert 98.6 Fahreneit to celsium
  When I input the value of Fahreneit as 98.6 in text field
  Then It should be converted to Celsius as 37 degree
