# Customer
JSON Format
{
	"name":"Waqar Bukhari",
	"details": {
		"sex":"M",
		"dob":"28-03-1998",
		"native_place":"nyc"
	},
	"accountType": "Seller",
	"businessRequirements": ["IT", "SEO", "Expert"],
	"contractType":"fulltime"
}
Endpoints
POST /customers for creating a customer
GET /customers/{id} for retrieving a customer by ID
PUT /customers/{id} for updating a customer
DELETE /customers/{id} for deleting a customer
