var today;
switch (new Date().getDay()) {
    case 0:
        today = "Sunday";
        break;
    case 1:
        today = "Monday";
        break;
    case 2:
        today = "Tuesday";
        break;
    case 3:
        today = "Wednesday";
        break;
    case 4:
        today = "Thursday";
        break;
    case 5:
        today = "Friday";
        break;
    case 6:
        today = "Saturday";
}
console.log("\nToday is " + today);
