const prompt = require('prompt-sync')();

var num1 = parseInt(prompt("Enter the first number : "));
var num2 = parseInt(prompt("Enter the second number : "));

//do
while(true)
{
    console.log("\nChoose your option\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");

    var choice = parseInt(prompt("\nEnter your choice :"));
    
    if(choice>5)
    {
        console.log("\nEnter Valid Choice");
        
    }
        
    else
    {
        switch(choice)
        {
            case 1 :
                    { 
                        var sum = num1 + num2;
                        console.log("\nThe sum of the two numbers is :",sum);  
                        break;
                    }
                    
                 
            case 2 :{ 
                        var diff = num1 - num2;
                        console.log("\nThe difference of the two numbers is :",diff);
                        break;
                    }
                 
            case 3 :{ 
                        var prod = num1 * num2;
                        console.log("\nThe product of the two numbers is :",prod);
                        break;
                    }
                 
            case 4 :{ 
                        var quo = num1 / num2;
                        console.log("\nThe quotient of the two numbers is :",quo);
                        break;
                    }
             
            case 5 : process.exit(1);
                     break;
        }
    }
} //while(choice!==5);