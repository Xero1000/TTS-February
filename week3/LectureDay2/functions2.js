// hoisted(); // logs "foo"

// function hoisted() {
//   console.log("foo");
// }

// let notHoisted = function() {
//     console.log("bar");
// }

// notHoisted(); // Because notHoisted is a function assignment to a variable
//               // if notHoisted(); came before let notHoisted, it would give an error

// // anonymous function
// let calculator = {
//     add: function(a,b) {
//         return a + b;
//     }
// }

// calculator.add(2,3) // 5          

// // scope
// // greeting is within the scope of getGreeting
// // Therefore it can't be accessed outside like on line 31
// function getGreeting(name) {
// 	let greeting = "hello ";
// 	return greeting + name;
// }
// console.log(getGreeting('Shane')); // 'Hello Shane'
// //console.log(greeting) // undefined

// //Immediately Invoked Function Expressions
// (function(){
// 	let myVar = "look mom, private variables!";

// 	//Do some stuff with myVar...
// })();

// //console.log(myVar); //undefined;

// // Scope Chain and Closures
// // city exists in global scope so it can be accessed in a function scope
// // let city = 'New Orleans';
// // let greet = function() {
// // 	console.log('Hello ' + city);
// // }

// // greet(); // Hello New Orleans

// // Nested Scope
// function outer() {
// 	let x = 'x';
// 	function inner() {
// 		let y = 'y';
// 		console.log(x); //'x'
// 	}
// 	console.log(x); // 'x'
// 	//console.log(y); // ReferenceError: y is not defined
// }

// // Another example of nested scope
// let landscape = function() {
//     let result = "";

//     let flat = function(size) {
//         for (let count = 0; count < size; count++)
//             result += " _ ";
//     };

//     let mountain = function(size) {
//         result += "/";
//         for (let count = 0; count < size; count++)
//             result += " '";
//         result += "\\";
//     };

//     flat(3);
//     mountain(4);
//     flat(6);
//     mountain(1);
//     flat(1);
//     return result;
// };

// console.log(landscape());

// Variable Name Conflicts
// let name = 'David'; // global scope
// let greet = function() {
// 	let name = 'Matt' // function scope of greet
// 	console.log(name);
// }

// console.log(name); // David because global context
// greet(); // Matt because function scope context

// // Another Variable Name Conflicts Example
    // let name = 'David';
    // let greet = function(name) {
    // 	console.log(name);
    // }
    // greet('joe'); // 'joe'

//equivalant to

    // let name = 'David';
    // let greet = function(mySuperUniqueVariableName) {
    //     let name = mySuperUniqueVariableName;
    //     console.log(name);
    // }
    // greet('joe'); // 'joe'

//equivalant to
	
    // let name = 'David';
        
    // let greet = function(mySuperUniqueVariableName) {	
    // 	let name = mySuperUniqueVariableName;	
    // 	console.log(name);	
    // }
    // greet('joe'); // 'joe'

// Challenge 3
// Declare two variables, a and b in the outer function's scope and set them to a string and an object respectively. Log their values immediately.

// Log the values of a and b in the inner function.

// Update the inner function to take two parameters named a and b.

// Pass a and b in as arguments when you execute inner().

// Inside the inner function, assign new values to a and b and log them at the end of the function AND after the execution of inner(a,b).

// Inside the inner function, update a property of the b object.

function outer(){
    a = 'string';
    b = 5;
    console.log(a, b);

    function inner(a, b) {
        a = 'STRING';
        b = 10;
        console.log(a, b);
    }
  
    inner(a, b);
    console.log(a, b);
  }
  
  outer();

