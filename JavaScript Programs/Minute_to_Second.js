const prompt = require('prompt-sync')();

function toSeconds(minute)
{
    var second = minute * 60;
    return second;
}

var minute = prompt("Enter time in minutes : ");

console.log("The time in seconds is11",toSeconds(minute),"seconds");

