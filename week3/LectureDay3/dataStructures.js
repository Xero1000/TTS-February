// let teachers = ['Shane', 'Zack', 'Ethan', 'Mike'];
//                //  0       1        2       3
// console.log(teachers[0]); //'Shane'

// // Get array length
// console.log(teachers.length);

// Push and Pop
// Push adds an item to the end
// pop takes away from the end and returns the value that can be stored
    // let teachers = ['Assaf', 'Shane'];
    // teachers.push('Zack'); //['Assaf', 'Shane', 'Zack']
    // let teacher1 = teachers.pop(); //teacher1 == 'Zack', teachers == ['Assaf', 'Shane']
    // console.log(teachers);

// Shift and Unshift (From the front)
    // let teachers = ['Assaf', 'Shane'];
    // teachers.unshift('Zack'); // ['Zack', Assaf', 'Shane']
    // let teacher = teachers.shift(); //teacher == 'Zack', teachers = ['Assaf', Shane']
    // console.log(teachers);

// Adding to array at predefined index
    // teachers[4] = 'James Taylor'; // ['Assaf', 'Shane', 'Zack', undefined, 'James Taylor'];
    // teachers[4] = 'Billy Joel'; // ['Assaf', 'Shane', 'Zack', undefined, 'Billy Joel'];
    // console.log(teachers);

// Finding an item
    // let a = [10,11,20];
    // console.log(a.indexOf(11)); //1
    // console.log(a.indexOf(50)); //-1 because 50 isn't in the array

// slice and splice
    // let a = [1,2,3,4];

// Slice - doesn't mutate array, slice(start,end)
// Slice creates a new array. Doesn't remove from the array
    // a.slice(0,2); //[1,2]
    // 'abcd'.slice(1,3) // 'bc'
    
// Splice - splice(start,numToRemove,...items to add) - this does mutate
// params: Where to start, how many elements to remove after start,
// and items to add in those removed elements' places
// This ones does manipulate the current array unlike Slice which makes a new array
    // a.splice(1,2,'a','b'); //a is [1,'a','b',4]

// Iterating over an array
//Iterating over Arrays using for loop and forEach
    // let teachers = ['Assaf', 'Shane', 'Zack']
    // for(let i = 0; i < teachers.length; i++) {
    //     console.log(teachers[i]);
    //}

    //Uses a function
    // teachers.forEach(function(item, index) {
    //     console.log(item, index);
    // });

// converting array to strings
// Stringifying
    // teachers = ['Assaf', 'Shane'];
    // teachers.toString(); //'Assaf,Shane';
    // teachers.join('&'); //'Assaf&Shane';
    // console.log(teachers.join(' '));

// ordering and sorting arrays
    // a = [2, 1, 3]
    // a.sort(); //[1,2,3]
    // a.reverse(); //[3,2,1]
    // console.log(a);

// Exercise 1

// ​Create an array to represent your shopping list with the following items: 'pop tarts', 'ramen noodles', 'chips', 'salsa', and 'coffee'.

// Add 'fruit loops' to the list.

// Update 'coffee' to 'fair trade coffee'

// Replace 'chips' and 'salsa' with 'rice' and 'beans'

// Create an empty array to represent your shopping cart.
// Remove the last item from your shopping list and add it to your cart

// Remove the first item from your shopping list and add it to the cart

// Write a 'while' loop that takes items from your shopping list and moves them to your cart until there are no items left on the list.

// Sort the items in your cart alphabetically... backwards

// Print the list of items in your shopping cart to the console as comma separated string.

// // 1
// shopping_list = ['pop tarts', 'ramen noodles', 'chips', 'salsa', 'coffee'];
// // 2
// shopping_list.push('fruit loops');
// // 3
// shopping_list[4] = 'fair trade coffee';
// // 4
// shopping_list.splice(2, 2, 'rice', 'beans');

// // 5
// shopping_cart = [];
// // 6
// shopping_cart.push(shopping_list.pop());
// // 7
// shopping_cart.push(shopping_list.shift());

// // 8
// while (shopping_list.length > 0){
//     shopping_cart.push(shopping_list.pop());
// }

// // 9
// shopping_cart.sort().reverse();

// // 10
// console.log(shopping_cart.join(', '));

// Objects (basically Javascript's version of a dictionary)
// keys start with lowercase letters, just like variables
// Each key/value pair is seperated with a ,
// Can hold primitive data types, arrays, even other objects and other things
    // let course = {
    //     name: 'JavaScript Applications',
    //     awesome: true,
    //     students: ['Jim', 'Katy'],
    //     instructor: {
    //         name: 'Shane',
    //         favLanguage: 'JavaScript'
    //     }
    // }

// dot notation
    // console.log(course.name);
// bracket notation
    // console.log(course['name']);
// Accessing students array in course
    // console.log(course.students[0]); // Jim
// Accessing instructor object's name in course object
    // console.log(course.instructor.name);

// More advanced example 
    // let course = {
    //     name: 'JavaScript Applications',
    //     awesome: true,
    //     teachers: ['Assaf', 'Shane'],
    //     students: [
    //         {
    //             name: 'Steve',
    //             computer: {
    //                 OS: 'Linux',
    //                 type: 'laptop'
    //             }
    //         }
    //     ]
    // };

    // console.log(course.students[0].computer.OS);
    // console.log(course.students[0].name);

// Updating an object
    // course.name = "super duper class";
// Mutating
    // course.fun = true; //add a property
    // delete course.name; //remove one

// Objects Exercise
let course = {
	name: 'JavaScript Applications',
	awesome: true,
	teachers: ['Assaf', 'Shane'],
	students: [
		{
			name: 'Steve',
			computer: {
				OS: 'Linux',
				type: 'laptop'
			}
		},
		{
			name: 'Katy',
			computer: {
				OS: 'OSX',
				type: 'macbook'
			}
		},
		{
			name: 'Chuck',
			computer: {
				OS: 'OSX',
				type: 'macbook'
			}
		}

	],
	preReqs : {
		skills : ['html', 'css', 'git'],
		equipment: {
			laptop: true,
			OSOptions: ['linux', 'osx']
		}
	}
};

// Name of the course ('JavaScript Applications')
    console.log(course.name);
// Name of the second teacher ('Shane')
    console.log(course.teachers[1]);
// Name of the first student ('Steve')
    console.log(course.students[0].name);
// Katy's computer type ('macbook')
    console.log(course.students[1].computer.type);
// The preReq equipment object
    console.log(course.preReqs.equipment);
// The second OSOption from equipment prereqs ('osx')
    console.log(course.preReqs.equipment.OSOptions[1]);
// String listing the OSOptions separated by 'or' ('linux or osx')
    console.log(course.preReqs.equipment.OSOptions.join(' or '));
// An array of all the students that are using osx
    let osxStudents = [];

    for (let i = 0; i < course.students.length; i++){
        if (course.students[i].computer.OS == 'OSX'){
            osxStudents.push(course.students[i].name);
        }
    }

    console.log(osxStudents);
    // Could store course.students into a variable and just call that variable so you
    // can just call that variable instead of repeatedly typing course.students.whatever.whatever 
    // and type variable.whatever.whatever

//Value types
    // let x = 1;
    // let y = 1;
    // x === y; //true

    // let y = x; 	// x == 1, y == 1
    // x === y; 	// true

    // x = 2; 		// x == 2, y == 1
    // x === y; 	// false

//Reference types
    // let x = {name: 'Evan'}
    // let y = {name: 'Evan'}
    // x === y; //false;

    // let y = x; 		//x and y are {name: 'Evan'}
    // x === y;		//true

    // x.name = 'Noah'
    // y.name; // 'Noah'

    let matt = {name: 'matt'};
    let julian = {name: 'julian'};
    let students = [matt,julian];
    
    students.indexOf(julian); //1
    students.indexOf({name:'julian'}); //-1 (meaning nothing was found)