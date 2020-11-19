Feature: Create a post

Scenario Outline: create a new post
Given registered uri/endpoint is "http://jsonplaceholder.typicode.com"
When create a default HTTP request
And attach data to be sent to service like "<uid>","<id>","<title>","<body>"
And submit request to service via POST method with path parameter as "posts" and get response
Then status code is "201" and content type is "application/json"

    Examples: 
      | uid | id  | title            | body             |
      |  11 | 101 | Selenium         | Jason Huggins    |
      |  11 | 102 | Appium           | Srinivasan Sekar |
      |  11 | 103 | Rest Assured     | Johan Haleby     |
      |  11 | 104 | Java             | Sun Microsystems |
      |  11 | 105 | TestNG           | Apache           |
      |  11 | 106 | Cucumber         | BDD	     	      |
      |  11 | 107 | Keyword Driven   | PNR              |
      |  11 | 108 | POM              | Simon Stewart    |
      |  11 | 109 | Wiremock         | TomAkehurst      |
      |  11 | 110 | android          | Sundar pichai    |
      |  12 | 111 | IOS              | Steve Jobs       |
      |  12 | 112 | Cloud Management | Satya Nadella    |