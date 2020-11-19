Feature: Create a post

Scenario: 
Given test restful service
| uri			                             | uid | id  | title            | body             | criteria | Status_code |
| https://jsonplaceholder.typicode.com |  11 | 101 | Selenium         | Jason Huggins    | unique   |         201 |
| https://jsonplaceholder.typicode.com |  11 | 102 | Appium           | Srinivasan Sekar | unique   |         201 |
| https://jsonplaceholder.typicode.com |  11 | 103 | Rest Assured     | Johan Haleby     | unique   |         201 |
| https://jsonplaceholder.typicode.com |  11 | 104 | Java             | Sun Microsystems | unique   |         201 |
| https://jsonplaceholder.typicode.com |  11 | 105 | TestNG           | Apache           | unique   |         201 |
| https://jsonplaceholder.typicode.com |  11 | 106 | Cucumber         | BDD              | unique   |         201 |
| https://jsonplaceholder.typicode.com |  11 | 107 | Keyword Driven   | PNR              | unique   |         201 |
| https://jsonplaceholder.typicode.com |  11 | 108 | POM              | Simon Stewart    | unique   |         201 |
| https://jsonplaceholder.typicode.com |  11 | 109 | Wiremock         | TomAkehurst      | unique   |         201 |
| https://jsonplaceholder.typicode.com |  11 | 110 | android          | Sundar pichai    | unique   |         201 |
| https://jsonplaceholder.typicode.com |  12 | 111 | IOS              | Steve Jobs       | unique   |         201 |
| https://jsonplaceholder.typicode.com |  12 | 112 | Cloud Management | Satya Nadella    | unique   |         201 |
