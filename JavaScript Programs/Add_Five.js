const prompt = require('prompt-sync')();

var num = parseInt(prompt("Enter the number :"));
console.log("The number after adding 5 to the given number is :",addFive(num));

function addFive(num)
{
    return (num+5);
}