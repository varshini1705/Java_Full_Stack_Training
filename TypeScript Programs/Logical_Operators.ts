var avg:number = 20; 
var percentage:number = 90; 
 
console.log("\nValue of Average :",avg);
console.log("\nValue of Percentage :",percentage);
 
var result:boolean = ((avg > 50) && (percentage > 80)); 
console.log("\n(Average > 50) && (Percentage > 80) :",result);
 
var result:boolean = ((avg>50)||(percentage>80)); 
console.log("\n(Average > 50) || (Percentage > 80) :",result);
 
var result:boolean=!((avg>50)&&(percentage>80)); 
console.log("\n!((Average > 50) && (Percentage > 80)) :",result);