var a:number = 2;   
var b:number = 3;
 
var result; 
 
result = (a & b);     
console.log("\n(a & b) => ",result);
 
result = (a | b);          
console.log("\n(a | b) => ",result);  
 
result = (a ^ b);  
console.log("\n(a ^ b) => ",result);

result = (~a); 
console.log("\n(~a) => ",result);

result = (~b); 
console.log("\n(~b) => ",result);
 
result = (a << b); 
console.log("\n(a << b) => ",result); 
 
result = (a >> b); 
console.log("\n(a >> b) => ",result);