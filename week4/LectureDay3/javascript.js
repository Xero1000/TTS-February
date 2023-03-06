// // these are outdated    
//     //Get a single node
//     let el = document.getElementById('header-top');
//     //Get all inputs
//     let inputs = document.getElementsByTagName('input');
//     //let inError = document.getElementsByClassName('error');

//     console.log(inputs.length); //2
//     //console.log(inError.length); //1

// // These are the ones used in practice today
//     //Get all inputs
//     let firstButton = document.querySelector('button');
//     let inError = document.querySelectorAll('input.error');

//     console.log(firstButton); //single button node
//     console.log(inError); //Node list of inputs with class 'error'


// let links = document.querySelectorAll('a');

// //Works!
// let linkCount = links.length;
// let firstLink = links[0];

// //Doesn't work!
// // links.forEach(function(link){
// //     //do something with link
// // });

// let arrayOfLinks = Array.from(links);

// arrayOfLinks.forEach(function(link){
//     console.log("hi");
// });

// //traversing the DOM
    // let listItems = document.querySelector('ul').children;
    // console.log(listItems.length); //2

    // let selectedItem = document.querySelector('li.selected');
    // let first = selectedItem.previousElementSibling;
    // let last = selectedItem.nextElementSibling;
    // let list = selectedItem.parentElement;
    // let header = selectedItem.parentElement.parentElement;
    // let section = selectedItem.parentElement.parentElement.nextElementSibling;


    