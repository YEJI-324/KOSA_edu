readme.txt

>> JSON
String:value
number:value
boolean:value
Object:value {}
array:value []

객체 타입이면 이렇게
{
	"phone_number":"010-0000-0000",
	"age":10,
	"isAgree":false,
	"account":
	[ // 이건 배열안에 객체
		{
			"email":"kej@gmail.com",
			"password":"1234"
		},
		{
			"email":"yeji@gmail.com",
			"password":"1234"
		}
	]
}


// user 조회하는 경우
{ // 이건 객체안에 배열
	"user_list" : [
				
				],
				[
					
				],
				[
					
				]
}

{
	"account":"김예지",
	"email":"kej@gmail.com",
	"address":"seoul",
	"password":"1234",
	"phone_number":"010-0000-0000"
}