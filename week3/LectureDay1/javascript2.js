// implicit coercion 
// //let x = 7 + 7 + 7 //= 21;
//         // Straight arithmetic resulting in a Number value.
// //console.log(x);
// //console.log(typeof(x));

	
// x = 7 + 7 + "7";
//         // The first two 7's are calculated (14), the last 7
	
//         // is concatenated onto the 14 as a string.
	
//         // resulting in a string value
	
//         // "14" + "7" = "147"

// console.log(x);
// console.log(typeof(x));
	
// x = "7" + 7 + 7;
	
//         // The entire expression is implicitly converted
	
//         // into a string and concatenated.
	
//         // "7" + 7 = "77"; "77" + 7 = "777"
// console.log(x);
// console.log(typeof(x));

// y = 66;
// y = 66 + 6;
// console.log(y);
// y = y + "6";
// console.log(y);

// let zebra = "2";
// zebra = zebra + 2;
// console.log(zebra);

// //explicit coercion
// let amountRaisedSoFar = 1000;
// let donation = prompt("How much would you like to donate?"); 
// amountRaisedSoFar = Number(donation) + amountRaisedSoFar;
// console.log("We have now raised: " + amountRaisedSoFar + "!");

// let x = parseInt("10"); // 10
// x = parseFloat("10.55"); // 10.55
// x = toString(10.55); // "10.55";

//string concatenation 
// let greeting = "Hello,"; 
// let entity = "World";
// console.log(greeting + " " + entity + "!"); //output "Hello, World!"" 

//template literal example
// use ` instead of ' for the quotes with template literals
// let name = "Shane"; 
// let age = 25;

// console.log(`Happy Birthday ${name}! How is ${age+1} treating you?`);

//undefined variable
// let something;
// console.log(typeof something) // "undefined"

//null variable
// foo does not exist, it is not defined and has never been initialized:
//console.log(foo); // "ReferenceError: foo is not defined"

// foo is known to exist now but it has no type or value:
// let foo = null; 
// console.log(foo);// "null"

// console.log(typeof nothing);//undefined


// something;
// console.log(typeof something); //undefined
// console.log(something); //undefined

// something = null;
// console.log(typeof something); //"object"
// console.log(something); //"null"

