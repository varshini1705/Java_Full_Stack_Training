const prompt = require('prompt-sync')();

var num = prompt("Enter the number : ");
getOpposite(num);

function getOpposite(num)
{
    if(num == 0)
        console.log("0");

    else if(num % 1 ==0)
        console.log(-num);

    else
        console.log("1");
}