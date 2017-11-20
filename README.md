# Case interview


######Description

Implementing a scenario for creating a insurance system


######Implemented

_integrationlayer_: A Rest Service for creating a new insurance.  Also includes a simple rest client for sending request to fagsystem

_fagsystem(lack of a good english name)_ : Dummy service pretending to create customer and insurance

_commons_:  Common classes used by both of the above services



######Not implemented**
letter service <br/>
tests


###### Improvements
Error handling<br/>
Service documents describing the services<br/>
Model resource describing the format of the body of requests<br/>
Service registry, currently the integrationlayer is sending request to fagsystem. The url is hardcoded<br/>
Service documents describing the services<br/>
Storage<br/>
asynchronous call to letter service<br/>
more validation of requests<br/>


######Other

I´ve used Postman to send request to the integrationlayer and test.

A POST request to the service:

POST /integrationlayer/integration/insurance HTTP/1.1 <br/>
Host: localhost:8080<br/>
Content-Type: application/json<br/>
Cache-Control: no-cache<br/>
Postman-Token: 22df7212-a954-fcba-d62f-135ec15c2679<br/>
<br/>
{<br/>
	"civilRegistrationNumber" : "25028211111",<br/>
	"firstName":"espen",<br/>
	"lastName":"Segelvik",<br/>
	"insuranceType" : "CAR"<br/>
}<br/>


response:<br/>
200 OK
<br/>
{
    "insuranceNumber": 1511199668761,<br/>
    "status": "sent_customer"<br/>
}