// Define a function
function saySomething(something) {
	console.log(something);
}

// Call the function
saySomething("Hello Function");

// Correct way to call a function
// return keyword to return the result
    // function add(number1, number2) {
    //     return (number1 + number2);
    // }

    // let sum = add(1,2);
    // console.log(sum); // 3

// Wrong way to call a function
// This one has no return statement
// Result will be undefined because the result isn't being returned to sum
    // function add(number1, number2) {
    //     number1 + number2;
    // }

    // let sum = add(1,2);
    // console.log(sum) // undefined

// parameters are optional
    // function add(a,b) {
    // 	console.log(a,b)
    // }

    // add(1); // '1,undefined'
    // add(1,2,3,4,5) // '1,2'

// Can predefine arguments
    // function add(a=1,b=2) {
    //     console.log(a+b)
    // }

    // add(); // still prints 3
    // add(2, 4); // overwrites the predefined arguments and prints 6

// arguments array
    // function add() {
    //     let sum = 0;
    //     for(let i = 0; i < arguments.length; i++) {
    //         sum += arguments[i];
    //     }
    //     return sum;
    // }
        
    // console.log(add(1,2,3,4,5,6,7,8));

// more common to use "rest parameters" by utilizing the spread operator like so
// This lets you name the parameters array something more descriptive instead of using the arguments keyword. 
// You can combine this with other parameters as long as the rest parameters are the last argument in the signature.
    // function add(...rest) {
    //     let sum = 0;
    //     for(let i = 0; i < rest.length; i++) {
    //         sum += rest[i];
    //     }
    //     return sum;
    // }
        
    // add(1,2,3,4,5,6,7,8);

// Challenge 1: Calculate Gratuity
// Create a variable billAmount and store a random number (ie: 100)

// Create a function gratuity()

//     gratutity should multiply the value of billAmount by 20% (hint: use 0.2) and return the value

// Create a function totalWithGrat()

//     totalWithGrat should take in the amount as an argument, call the gratutity function, add the returned value to the original bill amount, and return the total bill + gratuity

// Append the return value of totalWithGrat to the following phrase: "Your total including gratuity is:" and log it to the console

// Only invoke the totalWithGrat function when logging the result

// Bonus: Find a way to fix the decimal point to only 2 places (ie: 120.00)

    let billAmount = 100;
    let custom_gratuity = 0.15;
    
    function gratuity(custom_gratuity){
        return (billAmount * custom_gratuity); 
    }                 

    function totalWithGrat(amount, custom_gratuity){
        return (amount + gratuity(custom_gratuity));
    }

    console.log("Your total including gratuity is: " + totalWithGrat(billAmount, custom_gratuity));



