// Get the header element

// Get all the section elements

// Get the section element with class="current"

// Get the section that comes after the current section

// Get the h2 node from the section before the 'current' section

// Get the div that contains the section that has an h2 with a class of 'highlight'

// Get all the sections that contain an H2 (using a single statement);

    // let header = document.querySelector('header');
    // let sections = document.querySelectorAll('section');
    // let currentSection = document.querySelector('section.current');
    // let currentSectionNext = currentSection.nextElementSibling;
    // let currentSectionPrevH2 = currentSection.previousElementSibling.querySelector('h2');
    // let divWithHighlight = document.querySelector('h2.highlight').parentElement.parentElement;
    // let h2Sections = Array.from(document.querySelectorAll('section h2')).map(function(headline){
    //     return headline.parentElement;
    // });

// The last exercise divided into two statements
    // let all_h2 = Array.from(document.querySelectorAll('section h2'));
    // let array_h2 = all_h2.map(function(headline){
    //     return headline.parentElement;

// Solution 
// Laziness is your friend...
    // let q = document.querySelector.bind(document)
    // let qa = document.querySelectorAll.bind(document);


    // q('header');
    // qa('section');
    // q('section.current');
    // q('section.current').nextElementSibling;
    // q('section.current').previousElementSibling.children[0];
    // q('h2.highlight').parentElement.parentElement;

    // let foo = Array.from(qa('section h2'))
    //     .map(function(headline){
    //         return headline.parentElement;
    //     });

