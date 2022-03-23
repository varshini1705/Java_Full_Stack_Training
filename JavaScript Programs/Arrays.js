/* global element */

flowers = ["Rose","Jasmine",'Lily','Sunflower'];

console.log("The array elements are : ",flowers);

console.log("\nThe length of the array is :",flowers.length);   //To obtain length of the array

console.log("\nThe sorted array is :",flowers.sort());    //To sort the array

flowers.push("Mariegold");      //To add new element to the array
flowers.push("Lotus");
flowers.push("Tulip");
console.log("\nThe array elements are : ",flowers);

console.log("\nThe sorted array is :",flowers.sort());

flowers.pop();
console.log("The array elements are : ",flowers);