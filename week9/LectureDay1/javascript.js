// function myDisplayer(some) {
//     document.getElementById("demo").innerHTML = some;
//   }
  
//   function myCalculator(num1, num2) {
//     let sum = num1 + num2;
//     return sum;
//   }
  
//   let result = myCalculator(5, 5);
//   myDisplayer(result);
//   console.log("Message1");

// function myDisplayer(some) {
//     document.getElementById("demo").innerHTML = some;
//   }
  
//   function myCalculator(num1, num2, myCallback) {
//     let sum = num1 + num2;
//     myCallback(sum);
//   }
  
//   myCalculator(5, 5, myDisplayer);

// let numbers = [1, 2, 4, 7, 3, 5, 6];
// numbers.sort((a, b) => a - b);
// console.log(numbers); // [ 1, 2, 3, 4, 5, 6, 7 ]'

// console.log('1')

// setTimeout(function afterTwoSeconds() {
//   console.log('2')
// }, 2000)

// console.log('3')

// setInterval(myFunction, 1000);

// function myFunction() {
//   let d = new Date();
//   document.getElementById("demo").innerHTML=
//   d.getHours() + ":" +
//   d.getMinutes() + ":" +
//   d.getSeconds();
// }

// function myDisplayer(some) {
//     document.getElementById("demo").innerHTML = some;
//   }
  
//   function getFile(myCallback) {
//     let req = new XMLHttpRequest();
//     req.open('GET', "mycar.html");
//     req.onload = function() {
//       if (req.status == 200) {
//         myCallback(this.responseText);
//       } else {
//         myCallback("Error: " + req.status);
//       }
//     }
//     req.send();
//   }
  
//   getFile(myDisplayer); 

// function ajaxCall() {
//     let ajaxRequest = new XMLHttpRequest();
  
//     ajaxRequest.onreadystatechange = function() {
//         if (ajaxRequest.readyState == XMLHttpRequest.DONE ) {
//            if (ajaxRequest.status == 200) {
//                let myDiv = document.getElementById('main');
//                let newDiv = document.createElement('div');
//                newDiv.innerHTML = ajaxRequest.responseText;
//                myDiv.appendChild(newDiv);
//            }
//            else if (ajaxRequest.status == 400) {
//               console.log('There was an error 400');  
//            }  
//            else {  
//               console.log('something else other than 200 was returned');  
//            } 
//         } 
//     };
  
//     ajaxRequest.open("GET", 'http://jsonplaceholder.typicode.com/todos', true);
//     ajaxRequest.send();
// }
  
// function clearMain(){
//   document.getElementById('main').innerHTML = ""; 
// }
// ajaxCall();


// var form = document.querySelector('form')
// form.onsubmit = function formSubmit (submitEvent) {
//   var name = document.querySelector('input').value
//   request({
//     uri: "http://example.com/upload",
//     body: name,
//     method: "POST"
//   }, function postResponse (err, response, body) {
//     var statusMessage = document.querySelector('.status')
//     if (err) return statusMessage.value = err
//     statusMessage.value = body
//   })
// }

// var formUploader = require('formuploader.js')
// document.querySelector('form').onsubmit = formUploader.submit

var fs = require('fs')

fs.readFile('/Does/not/exist', handleFile)

function handleFile (error, file) {
  if (error) return console.error('Uhoh, there was an error', error)
  // otherwise, continue on and use `file` in your code
}