// functions are also objects so they can be passed as arguments
// Declare an add function
// this is a callback function
    function add(number1, number2) {
        return number1 + number2;
    }

// Declare a function that takes a function as an argument
// This is a higher order function
    function doMath(operation, number1, number2) {
        return operation(number1,number2);
    }

// Pass a function into another.
    let sum = doMath(add, 1, 2);

// Filter function
    // let students = [
    //     {name: 'John Lennon', average: 90},
    //     {name: 'Ringo Starr', average: 58},
    //     {name: 'Paul McCartney', average: 82}
    // ];

    // let passingStudents = students.filter(function(student){
    //     return student.average > 60;
    // });

    // // this would be the result
    // passingStudents === [
    //     {name: 'John Lennon', average: 90},
    //     {name: 'Paul McCartney', average: 82}
    // ];

// Find function
    // let students = [
    //     {name: 'John Lennon', average: 90},
    //     {name: 'Ringo Starr', average: 58},
    //     {name: 'Paul McCartney', average: 82}
    // ];

    // let passingStudents = students.find(function(student){
    //     return student.average > 50;
    // });

    // passingStudents === [
    //     {name: 'John Lennon', average: 90}
    // ];

// Map function
    // let students = [
    //     {firstName: 'Cam', lastName: 'Newton'},
    //     {firstName: 'Ted', lastName: 'Ginn'},
    //     {firstName: 'Greg', lastName: 'Olsen'}
    // ]

    // let fullNames = students.map(function(student){
    //     return `${student.firstName} ${student.lastName}`;
    // })

    // fullNames === ["Cam Newton", "Ted Ginn", "Greg Olsen"]

    // Result
    // [                                             [
    //     {firstName: 'Cam', lastName: 'Newton'},       "Cam Newton"
    //     {firstName: 'Ted', lastName: 'Ginn'},   ==>   "Ted Ginn"
    //     {firstName: 'Greg', lastName: 'Olsen'}        "Greg Olsen"
    // ]                                             ]

// Reduce Function
    // let students = [
    //     {name: 'Cam Newton', assignmentsCompleted: 6},
    //     {name: 'Ted Ginn', assignmentsCompleted: 10},
    //     {name: 'Greg Olsen', assignmentsCompleted: 8}
    // ]

    // let totalAssignments = students.reduce(function(sum,current){
    //     return sum + current.assignmentsCompleted;
    // }, 0); // this 0 specifies that sum starts as 0

    // totalAssignments === 24;

// Challenge 1
// Create an Array named superHeroes shown above
// Create a secretIdentity variable
// Assign superHeroes.map() to the secretIdentity variable
// Assign an anonymous function to superheroes.map() as an argument
// Your anonymous function should have one parameter named revealArray
// Inside the block of your anonymous function:
//     You'll be working with revealArray as an argument
//     Using revealArray, return a string that will join the two array items.
//     join them together with the string "is" (ie: "Batman is Bruce Wayne")
// Log the results to the screen and join them with a line break.

    // let superHeroes = [
    //     ["Batman", "Bruce Wayne"],
    //     ["Spiderman", "Peter Parker"],
    //     ["The Flash", "Barry Allen"]
    // ];

    // let secretidentity = superHeroes.map(function(revealArray){
    //     return revealArray.join(" is ");
    // });

    // console.log(secretidentity.join("\n"));

// Challenge 2
// Find a player with the name 'Mike'
// Get an array of all players with position 'RB'
// Get an array of all the players lastNames
// Get an array of the full names of all the running backs with more than 5 touchdowns
// Get the number of touchdowns scored by Running backs

    // let players = [
    //     {firstName: 'Cam', lastName: 'Newton', position: 'QB', touchdowns: 32},
    //     {firstName: 'Derek', lastName: 'Anderson', position: 'QB', touchdowns: 0},
    //     {firstName: 'Jonathan', lastName: 'Stewart', position: 'RB', touchdowns: 12},
    //     {firstName: 'Mike', lastName: 'Tolbert', position: 'RB', touchdowns: 8},
    //     {firstName: 'Fozzy', lastName: 'Whittaker', position: 'RB', touchdowns: 3},
    //     {firstName: 'Ted', lastName: 'Ginn', position: 'WR', touchdowns: 9},
    //     {firstName: 'Devin', lastName: 'Funchess', position: 'WR', touchdowns: 2}
    // ];

    // let mike = players.find(function(player){
    //     return player.firstName == 'Mike';
    // });

    // console.log(mike);

    // let rb = players.filter(function(player){
    //     return player.position == 'RB';
    // });

    // console.log(rb);

    // let lastNames = players.map(function(player){
    //     return player.lastName;
    // })

    // console.log(lastNames);

    // let rbs = rb.filter(function(player){
    //     return player.touchdowns > 5;
    // });

    // fullNames = rbs.map(function(player){
    //     return player.firstName + " " + player.lastName;
    // })

    // console.log(fullNames);

    // rbTouchdowns = rb.reduce(function(sum, player){
    //     return sum + player.touchdowns;
    // }, 0);

    // console.log(rbTouchdowns);

// Asynchronous programming example
    // setTimeout(function(){
    //     console.log('later')
    // },2000);
    
    // console.log('now');

// This keyword example
// This refers to the executor of the function, in this case teacher
    // let teacher = {
    //     name: 'Assaf',
    //     sayName: function() {
    //         console.log(this.name);
    //     }
    // }
    // teacher.sayName(); //'Assaf'

// Another this keyword example
    // function sayName() {
    //     console.log(this.name);
    // }
    
    // let teacher1 = {
    //     name: 'Assaf',
    //     speak: sayName
    // }
    
    // let teacher2 = {
    //     name: 'Shane',
    //     speak: sayName
    // }
    
    // teacher1.speak(); // 'Assaf'
    // teacher2.speak(); // 'Shane'

    // sayName(); // This would return an empty space since no object is executing it

// this keyword with Asynchronous functions 
// the reason why the setTimeout function doesn't print the name is because
// setTimeout's executor is the window object, not the teacher, and the window object
// doesn't have a name
// Note: Window object is the browser window
    // let teacher = {
    //     name: 'Shane',
    //     speak: function() {
            
    //         //Maybe you're fetching data from an API, or getting user input
    //         setTimeout(function(){
    //             console.log('later my name is ' + this.name);
    //         },1000)
            
    //         //Runs immediately
    //         console.log('Now my name is ' + this.name);
    //     }
    // }

    // teacher.speak();

// Closure hack
// Assigning this to self and then calling self.name will allow the teacher name to
// be printed
    // let teacher = {
    //     name: 'Shane',
    //     speak: function() {
            
    //         //Save this to a variable
    //         let self = this;
            
    //         //self is visible inside function because of closure
    //         setTimeout(function(){
    //             console.log('later my name is ' + self.name);
    //         },1000);
    //     }
    // }
    
    // teacher.speak();

// Slideshow Challenge
// Create a single object named "slideshow" that represents the data and functionality of a picture slideshow. There should be NO VARIABLES OUTSIDE THE OBJECT. The object should have properties for:

//     An array called photoList that contains the names of the photos as strings

//     An integer currentPhotoIndex that represents which photo in the photoList is currently displayed

//     A nextPhoto() function that moves currentPhotoIndex to the next index ifthere is one, and:

//         logs the current photo name.

//         Otherwise, log "End of slideshow";

//     A prevPhoto() function that does the same thing, but backwards.

//     A function getCurrentPhoto() that returns the current photo from the list.

    // let slideshow = {
    //     photoList: ["picture1_name", "picture2_name"],
    //     currentPhotoIndex: 0,
    //     nextPhoto: function(){
    //         if (this.currentPhotoIndex < this.photoList.length - 1){
    //             this.currentPhotoIndex++;
    //             console.log(this.photoList[this.currentPhotoIndex]);
    //         }
    //         else {
    //             console.log("End of slideshow");
    //         }
            
    //     },
    //     prevPhoto: function(){
    //         if (this.currentPhotoIndex > 0){
    //             this.currentPhotoIndex--;
    //             console.log(this.photoList[this.currentPhotoIndex]);
    //         }
    //         else {
    //             console.log("Beginning of slideshow");
    //         }
    //     },
    //     getCurrentPhoto: function(){
    //         return this.photoList[this.currentPhotoIndex];
    //     }
    // };

    // slideshow.nextPhoto();
    // slideshow.nextPhoto();
    // slideshow.prevPhoto();
    // slideshow.prevPhoto();
    // console.log(slideshow.getCurrentPhoto());

// Call and Apply
    



