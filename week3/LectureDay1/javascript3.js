//Simple if statement
let x = true;
if(x) {
	console.log(true);
} else if (x == true) {
	console.log("this won't run"); // because the first statement alrady ran
} else {
	console.log(false);
}

let temp = 60;

if (temp > 45) {
    console.log("I'm going hiking!");
} 
else {
    console.log("It's too cold to go hiking");
}

//loose equality
x = 10;
if(x == '10') { //Type coersion is happening here!
	console.log(true); //true
}

if(x === '10') {
	console.log(true); //false
}

// (0 ==  '0') // true
// (0 === '0') // false

// ('' ==  0 ) // true, the string will implicitly be converted to an integer
// ('' === 0 ) // false, no implicit cast is being made

//Challenge 1
let cups = 3;

if (cups < 3){
    console.log("Yes I'll take another cup of coffee.");
}
else {
    console.log("I think I'm okay for now.");
}