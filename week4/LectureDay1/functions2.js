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