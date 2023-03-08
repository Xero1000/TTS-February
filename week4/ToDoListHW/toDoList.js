let button = document.querySelector('button');
let textBox = document.querySelector('input');
let ul = document.querySelector('ul');

let list = {
    items: [],
    add: function(item) {
        this.items.push(item);
        let newLI = document.createElement('li');
        newLI.textContent = item;

        ul.appendChild(newLI);
        textBox.value = '';
    },
    delete: function(item) {
        let itemIndex = this.items.indexOf(item);
        ul.children[itemIndex].style.textDecoration = "line-through";
        setTimeout(() => {
            ul.children[itemIndex].remove();
            this.items.splice(itemIndex, 1);
        }, 1000);
    }
}

button.addEventListener('click', function(event){
    list.add(textBox.value);
})

ul.addEventListener('click', function(event){
    list.delete(event.target.textContent);
})