// Promises in Javascript

// When getting data from external sources like remote servers, things can go wrong
// the server could get hit by a meteor or something 

// Javascript has a type of object called Promises that can ask servers for information, and be able to
// handle the cases where information cannot be properly retrieved. 
// A promise is something you get back when calling a server that can either properly give you data
// and let you work with it in .then() or it'll give an error which you work with in .catch()


let x = "Hi";

let url = "https://jsonplaceholder.typicode.com/posts/5";

// We can get data with the fetch() function
// .then() runs some code when everything goes well and we get the info we want successfully
// res = the response from the server
// We then parse it into json() and we can get the data
// Whatever is returned in one .then() becomes the argument passed into the next .then()
// Therefore, in the second .then(), data is the returned res.json()

// If things go poorly, we can use .catch()
// For .catch to work we need to explicitely throw an error
// In this example, of res.status (the status of the response) is anything other than 200, it'll throw an error

// .finally() will run no matter what at the end
function getData() {
    fetch(url)
    .then((res) => {
        //console.log(res);
        if (res.status !== 200) throw new Error("Bad request");
        return res.json()
    }).then((data) => {
        console.log(data);
        document.querySelector("h1").innerText = `ID: ${data.id}\n 
        Title: ${data.title}\n 
        Body: ${data.body}`;
    })
    .catch((error) => {
        console.log(error);
    }).finally(data => {
        console.log("Runs no matter what")
    })
}

// getData();


// Async functions return a promise we can use to manipulate data we ask for from a server
// .fetch() returns a promise which is why we could use .then() and .catch()
// A promise can have several states: Pending, Fulfilled, Rejected
// await keyword will wait until the promise state is either Fuilfilled or Rejected before running the next code
// .json() is also an asynchronous function that returns a function so we need the await keyword. Without it we would just get a pending promise because
// the promise hasn't finished
// Generally this format using async and await is easier to read than a bunch of .then() statements
async function myAsynchFunction() {
    try {
        const response = await fetch(url) // this time we store the response in a variable
    
        // Error check before doing anything else
        if (response.status !== 200){
            throw new Error("Something went wrong")
        }
    
        let data = await response.json();
        
        let h1 = document.querySelector("h1").innerText = `ID: ${data.id}\n 
        Title: ${data.title}\n 
        Body: ${data.body}`;
    } catch (error){
        console.log(error);
    } finally {
        console.log("Runs no matter what");
    }
}

myAsynchFunction()
