
// Falsey Examples
let whatever; //whatever is undefined
	
if(whatever) {	
	console.log(true);	
} else {	
	console.log(false); //this would run	
}

	
if(!whatever){
	console.log(false); //this would run
}
	
	
if(false || 0 || null){
	console.log(true); //since none of these evaluate to true, this will not run
}

// combinining conditionals
true && true 	// true
true && false 	// false
false && true 	// false
false && false 	// false

true || true 	// true
true || false 	// true
false || true 	// true
false || false 	// false

// Challenge 2
// Create a variable for the temperature and set it to 80
// Write a statement that outputs the temperature as "The temperature is 80 degrees."
// If the temp is greater than 80, output "time to swim" (set temp to 60, 90) and test.
// Create a precipitation variable and set it to false.
// Only output "time to swim" if temp is greater than 80 and it's not raining.
// Set the precipitation variable to "raining" or "snowing" and only output "time to swim" if there is no precipitation.
// Create an "indoors" variable and set it to true.
// If indoors, then output "time to swim" regardless of the temp and precipitation.

let temp = 85;
let precipitation = false;
let indoors = true;

console.log("The temperature is " + temp + " degrees");

if (temp > 80 && precipitation === false) {
  console.log("time to swim!");
} 
else if (indoors) {
  console.log("time to swim!");
}

// for loop
for (let i = 0; i <= 9; i++) {
    console.log(i);
}

// Challenge 3
// Using a for loop:
// Write a simple version of "99 bottles of root beer on the wall."
//     Note: make sure you're logging the result to the console​
// Once you get the program running, log "Hey! We need more root beer!" to the console when your counter hits 0.

for (let i = 99; i >= 0; i--){
    console.log(i + " bottles of root beer on the wall.");
    if (i == 0){
        console.log("Hey! We need more root beer!");
    }
}

// while loop
let x = 0;
while(x < 10) {
    x = x + 1;
    // or x +=1
    // or x++
}

// do while
// use this if you need the code to run at least once 
// EXAMPLE: check if a user input is valid and loop if it is not
// and keep looping until it is valid
x = 0;
do {
    x = x + 1;
    // or x +=1
    // or x++
} while(x < 10);

// break statement
for(let i = 0; i < 10; i++) {
	console.log(i);
	console.log('before break'); // will only print once
	break; // exits the next loop
	console.log('after break'); //never happens
}

// NOTE: A break in a nested loop will only break out of the inner loop. 
// The outer loop will continue to run 

// continue statement
for(let i = 0; i < 10; i++) {
	console.log(i);
	console.log('before continue'); // will print 10 times
	continue; // continues to the next iteration
	console.log('after continue'); //never happens
}

// Switch statement
// because there is no break after case 1, it will also run case 2
// and it will keep going down the cases until a break is reached.
// Like the break in case 2
x = 1
switch(x) {
	case 3:
		console.log('three')
	case 1:
		console.log(1);
		//break;
	case 2:
		console.log(2);
		break;
	default:
		console.log('default')
}

// Var vs Let
for (let i = 0; i < 10; i++){
    console.log(i); // possible because i is within the scope
  }
  console.log(i); // undefined because i only existed in the loop

for (var i = 0; i < 10; i++){
    console.log(i); //
  }
  console.log(i); // will log 9, the final value of i in the for loop, 
            //because var declared it globally


// "let" declares a variable only within the scope of its block. In most cases, this is more useful.
let test2 = true; 
if(test2){   
    let test2 = false; //this is a completely new variable that only exists in this scope  
    console.log(test2); //console: false 
}   
console.log(test2); //console: true


// If we wanted to change the value of global "test", we would not re-declare the variable.
let test3 = true;
console.log(test3); // true
if(test3){
  test3 = false;
  console.log(test3); // false
}

// For loops with Var and Let
for (let i = 0; i < 10; i++){
    console.log(i); // possible because i is within the scope
  }
  console.log(i); // undefined because i only existed in the loop

for (var i = 0; i < 10; i++){
    console.log(i); //
  }
  console.log(i); // will log 9, the final value of i in the for loop, 
              //because var declared it globally
