export class Person{
    private firstName : string;
private lastName: string;

// constructor(){
//     this.firstName = '';
//     this.lastName = ' ';
// }
constructor(firstName: string ,lastName: string){
    this.firstName = firstName;
    this.lastName = lastName;
}
getFullName(){
    return this.lastName + this.firstName;
}
greet(){
    console.log("Welcome to Java Full Stack");
}
};

// var objectPerson = new Person("captain","america");
// // objectPerson.firstName = "hulk";
// console.log(objectPerson.firstName);
// console.log(objectPerson.lastName);
// var fullName = objectPerson.getFullName();
// console.log(fullName);

class Programmer extends Person{
    greet(){
        console.log("Hello"); //overriding +dominant(1st priority)
    }
    greetLikeNormalPeople(){
        // this.greet();//afternoon
        super.greet(); // morning -> parent

    }

}

var objectProgrammer = new Programmer("Hello","Varshini");
objectProgrammer.greetLikeNormalPeople();
objectProgrammer
// objectProgrammer.
var checkType ;
checkType = new Programmer("cheese","pizza");