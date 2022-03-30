var sum1 : number = 0;

for(let i = 1; i<=10 ; i++)
{
    sum1 += i;
}

console.log("\nThe sum of first 10 natural numbers is : "+sum1);

var sum2 : number = 0;
var j : number = 0;  
while (j < 10)  
{  
    sum2 += j;
    j++;
}

console.log("\nThe sum of first 10 whole numbers is : "+sum2);
console.log("\nThe array elements are : ")
let arr = [10, 20, 30, 40];

//for..of loop
for (var val of arr)
{
    console.log(val);                       // prints values: 10, 20, 30, 40
}

//for..in loop
let array = [10, 20, 30, 40];
console.log("\nThe indices of the array elements are : ")
for (var index1 in array) 
{
  console.log(index1); // prints indexes: 0, 1, 2, 3
}
console.log("\nElement at index",index1,"is :",array[index1]); //OK, prints 3 

var num : number = 1;  
do 
{   
    console.log(num);
    num++;
}  while (num <= 20);