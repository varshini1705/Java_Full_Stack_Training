const prompt = require('prompt-sync')();

var fname = prompt("Enter your first name : ");
var lname = prompt("Enter your last name : ");
var gender = prompt("Enter your gender : ");
var age = prompt("Enter your age : ");
var country = prompt("Enter your country : ");
var marital_status = prompt("Enter your marital status : ");

console.log("Your details are : ",fname,lname,gender,age,country,marital_status);