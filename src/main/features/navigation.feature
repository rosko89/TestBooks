# Gherkin language structure

Feature: Navigation
Scenario: Navigate using header links as guest user
	Given the home page is opened
	When I click on Registration Page link in the header
	Then Registration Page is opened