const prompt = require('prompt-sync')();

var num1 = prompt("Enter the first number :"); 
 
var num2 = prompt("Enter the second number :"); 

var num3 = prompt("Enter the third number :"); 

console.log("\nThe sum of the 3 numbers is :",(num1+num2+num3));
console.log("\nThe difference of the 3 numbers is :",(num1-num2-num3));
console.log("\nThe product of the 3 numbers is :",(num1*num2*num3));
console.log("\nThe quotient of the 3 numbers is :",(num1/num2/num3));