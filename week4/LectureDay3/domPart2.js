// Get all inputs
    // let div = document.querySelector('div');
    // let a = document.querySelector('a');

    // console.log(a.innerHTML); //"click me"
    // console.log(div.innerHTML); //'<a href="#">Click me</a>'

    // a.innerHTML = "Updated link text";

// Get and set attributes like object properties
    // var a = document.querySelector('a');

    // Get an attribute
        // console.log(a.href); // "http://google.com"

    // Set an attribute
        // a.name = 'new link name';

    // Add a new attribute
        // a.target = "_blank";

//Remove the first list item
    // document.querySelector('.first').remove();

// Create a node using document.createElement('tagname') and 
// node.appendChild('variablename')
    // let newLI = document.createElement('li');
    // newLI.innerHTML = "Item 2";
    
    // let list = document.querySelector('ul');
    // list.appendChild(newLI); //Insert after item 1

// Exercise 2
// Update the 'Coffee' item to say 'Fair Trade Coffee'

// 2. Remove 'Twinkies' from the list

// 3. Add an item 'Cheese Whiz'

// 4. Clear the list and programmatically add items from the array ['protein powder', 'muscle milk', 'power bars']

// 5. Add the class 'important' to the muscle milk item.

    // let list = document.querySelector('#list');

    // let coffee_item = list.children[1];
    // coffee_item.textContent = 'Fair Trade Coffee';

    // list.children[3].remove();

    // let newLI = document.createElement('li');
    // newLI.textContent = "Cheese Whiz";

    // list.appendChild(newLI);

    // let new_items = ['protein powder', 'muscle milk', 'power bars'];

    // list_length = list.children.length;

    // for (let i = 0; i < list_length; i++){
    //     list.children[0].remove();
    // }

    // for (i = 0; i < new_items.length; i++){
    //     let newLI = document.createElement('li');
    //     newLI.textContent = new_items[i];
    //     list.appendChild(newLI);
    // }

    // list.children[1].class = '!important';

// NOTE: textContent is more secure than innerHTML for editing text because a hacker could
// use innerHTML in your code to directly manipulate or add their own HTML elements and this
// can open you up to attacks

// Exercise 2 TTS Solution 
    // let list = document.querySelector('#list');

    // //1
    // list.children[1].innerHTML = "Fair Trade Coffee";

    // //2
    // list.children[3].remove();

    // //3
    // let cheese = document.createElement('li');
    // cheese.innerHTML = 'Cheese Whiz';
    // list.appendChild(cheese);

    // //4
    // list.innerHTML = '';
    // ['protein powder', 'muscle milk', 'power bars'].forEach(function(itemText){
    //     var li = document.createElement('li');
    //     li.innerHTML = itemText;
    //     list.appendChild(li);
    // })

    // //5
    // list.children[1].className = "important"

// event listener
    // let el = document.querySelector('#myEl');
    // el.addEventListener('click', function(event){
    //     console.log(event.target);
    //     console.log(event.clientX);
    //     console.log(event.clientY);
    //     alert('clicked!');
    // })

    // //Combine with DOM editing
    // el.addEventListener('mouseover', function(event){
    //     el.innerHTML = 'over';
    // })

// Event Bubbling
    document.querySelector('.outer').addEventListener('click', function(e){
        // e represents the event (element that has been clicked)
	console.log(e.target, e.currentTarget);
	//inner, outer
})
