function printHello() {
    console.log('Hello Varshini!');
}
function getTime() {
    return new Date().getTime();
}
function add(a, b) {
    return a + b;
}
function sub(a, b) {
    return a - b;
}
function mul(a, b) {
    return a * b;
}
function div(a, b) {
    return a / b;
}
function rem(a, b) {
    return a % b;
}
console.log(printHello());
console.log("\nToday's date is : ", getTime());
var a = 50;
var b = 25;
console.log("\nThe sum of the two numbers", a, "and", b, "is", add(a, b));
console.log("\nThe difference of the two numbers", a, "and", b, "is", sub(a, b));
console.log("\nThe product of the two numbers", a, "and", b, "is", mul(a, b));
console.log("\nThe quotient of the two numbers", a, "and", b, "is", div(a, b));
console.log("\nThe remainder of the two numbers", a, "and", b, "is", rem(a, b));
