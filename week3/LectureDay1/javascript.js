//declaration
let z;
//assigning value to z
z = 5;
z = 8; //reassignment


console.log(z)

let my_number;
my_number = "number 5";

console.log(my_number);

//This is a number variable 
//let x = 5;

//This is a string variable
let y = "number 5";


//constant example
const my_fave_number = 7; // this variable cannot be changed

console.log(my_fave_number); // prints 7

let x = 10 + my_fave_number; // we can use the const
console.log(x); // prints 17

x = 9; // error, this cannot be changed

//strings
let a = "Hello, World!"; // <-- Had to get that one out of the way!
let b ='This is JavaScript!'; // Can use single or double quotes
let c = "7"; //includes numbers, but not read as numbers 
let d = "It's Seven"; //To include quotation marks in a string, you must use a different quotation inside and outside
let e = 'It\'s Seven'; //alternatively, you can use backslashes to ignore special characters in strings

//numbers
let a_num = 7; //integer
let b_num = 7.8; //float or double
let c_num = 0.45; // float or double

//boolean
let a_bool = true;
let b_bool = false;

//javascript loose typing example
let g = 'abc';
console.log(g);
console.log(typeof(g));
g = 1; 
console.log(g);
console.log(typeof(g));