Feature: Get Employees details

@regression
Scenario Outline: Get some employee posts one by one w.r.t id
Given registered uri/endpoint is "<uri>"
When create a default HTTP request
And submit request to service via GET method with path parameter as "posts" and id as "<id>" and get response
Then status code is "200" and content type is "application/json" with id value as "<id>" in response body

Examples:
|								uri									| id |
|http://jsonplaceholder.typicode.com|  1 |
|http://jsonplaceholder.typicode.com|  2 |
|http://jsonplaceholder.typicode.com|  3 |
|http://jsonplaceholder.typicode.com|  4 |
|http://jsonplaceholder.typicode.com|  5 |
|http://jsonplaceholder.typicode.com|  6 |
|http://jsonplaceholder.typicode.com|  7 |
|http://jsonplaceholder.typicode.com|  8 |
|http://jsonplaceholder.typicode.com|  9 |
|http://jsonplaceholder.typicode.com|  10|