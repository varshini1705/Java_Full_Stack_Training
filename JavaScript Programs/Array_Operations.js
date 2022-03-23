const scores = new Array(40);       // Create an array with 40 undefined elements:

const flowers = [];      //Decalres an empty array

flowers[0] = "Rose";        //Adding elements to array
flowers[1] = "Jasmine";
flowers[2] = "Hibiscus";
flowers[3] = "Sunflower";
flowers[4] = "Lily";
flowers[5] = "Lotus";

flowers.push("Mariegold");           //adds a new element into array
flowers.push("Tulip");
flowers.push("Daffodil");
flowers.push("Daisy");

console.log("The flowers in the array are : ",flowers);

let type = typeof fruits;
console.log("The type of array elements is : ",type);

var count = 0;              //to find the length of the array

for(let i=0; i<flowers.length; i++)          // for loop for iteration
{
    count += 1;
}

console.log("The length of the array without length function is :",count);

console.log("The length of the array using length function is :",flowers.length);

console.log("The sorted array is :",flowers.sort());        //sorts the array