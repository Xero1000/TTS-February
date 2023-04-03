// fetch('https://javascript.info/article/promise-chaining/user.json')
//   // .then below runs when the remote server responds
//   .then(function(response) {
//     // response.text() returns a new promise that resolves with the full response text
//     // when it loads
//     return response.text();
//   })
//   .then(function(text) {
//     // ...and here's the content of the remote file
//     alert(text); // {"name": "iliakan", "isAdmin": true}
// });

// // same as before, but response.json() parses the remote content as JSON
// fetch('https://javascript.info/article/promise-chaining/user.json')
//   .then(response => response.json())
//   .then(user => alert(user.name)); // iliakan, got user name

// Make a request for user.json
// fetch('https://javascript.info/article/promise-chaining/user.json')
//   // Load it as json
//   .then(response => response.json())
//   // Make a request to GitHub
//   .then(user => fetch(`https://api.github.com/users/${user.name}`))
//   // Load the response as json
//   .then(response => response.json())
//   // Show the avatar image (githubUser.avatar_url) for 3 seconds (maybe animate it)
//   .then(githubUser => {
//     console.log(githubUser)
//     let img = document.createElement('img');
//     img.src = githubUser.avatar_url;
//     img.className = "promise-avatar-example";
//     document.body.append(img);
// });


// async function showAvatar() {

//     // read our JSON
//     let response = await fetch('https://javascript.info/article/promise-chaining/user.json');
//     let user = await response.json();
  
//     // read github user
//     let githubResponse = await fetch(`https://api.github.com/users/${user.name}`);
//     let githubUser = await githubResponse.json();
  
//     // show the avatar
//     let img = document.createElement('img');
//     img.src = githubUser.avatar_url;
//     img.className = "promise-avatar-example";
//     document.body.append(img);
//   }
  
//   showAvatar()

// Exercise 1
// function loadJson(url) {
	
//     return fetch(url)    
//       .then(response => {   
//         if (response.status == 200) {    
//           return response.json();    
//         } else {  
//           throw new Error(response.status);   
//         }  
//       });  
//   }    

//   loadJson('http://httpstat.us/500') 
//     .catch(alert); // Error: 500

// Exercise 1 - Solution
// async function loadJson(url) { // (1)
//     let response = await fetch(url); // (2)
    
//     if (response.status == 200) {
//         let json = await response.json(); // (3)
//         return json;
//     }
    
//     throw new Error(response.status);
//     }
    
//     loadJson('http://httpstat.us/500')
//     .catch(alert); // Error: 500 (4)


// Exercise 2
// Call the async function in the regular function f(). How could we do this since we can't use await in f()?

async function wait() {
    await new Promise(resolve => setTimeout(resolve, 1000));
  
    return 10;
  }
  
  function f() {
    // ...what should you write here?
    // we need to call async wait() and wait to get 10
    // remember, we can't use "await"
  }