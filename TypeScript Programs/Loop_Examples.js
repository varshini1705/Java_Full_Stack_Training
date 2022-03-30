var sum1 = 0;
for (var i = 1; i <= 10; i++) {
    sum1 += i;
}
console.log("\nThe sum of first 10 natural numbers is : " + sum1);
var sum2 = 0;
var j = 0;
while (j < 10) {
    sum2 += j;
    j++;
}
console.log("\nThe sum of first 10 whole numbers is : " + sum2);
console.log("\nThe array elements are : ");
var arr = [10, 20, 30, 40];
//for..of loop
for (var _i = 0, arr_1 = arr; _i < arr_1.length; _i++) {
    var val = arr_1[_i];
    console.log(val); // prints values: 10, 20, 30, 40
}
//for..in loop
var array = [10, 20, 30, 40];
console.log("\nThe indices of the array elements are : ");
for (var index1 in array) {
    console.log(index1); // prints indexes: 0, 1, 2, 3
}
console.log("\nElement at index", index1, "is :", array[index1]); //OK, prints 3 
var num = 1;
do {
    console.log(num);
    num++;
} while (num <= 20);
