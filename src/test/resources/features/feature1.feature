Feature: Get Employees details

Background:
Given registered uri/endpoint is "http://jsonplaceholder.typicode.com"
When create a default HTTP request

Scenario: Get all posts
And submit request to service via GET method with path parameter as "posts" and get response
Then status code is "200" and content type is "application/json"

@smoketest
@regression
Scenario: Get Specific employee post
And submit request to service via GET method with path parameter as "posts" and id as "1" and get response
Then status code is "200" and content type is "application/json" with id value as "1" in response body