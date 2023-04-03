

let numbers = [1, 4, -5, 3, -21, 90, -422, -92, 2]

function isPositive(number) {
    return number > 0;
}

function isNegative(number) {
    return number < 0;
}

function filter(numbers, callback){
    let newNumbers = [];

    for (let number of numbers){
        if (callback(number)){
            newNumbers.push(number);
        }
    }

    return newNumbers;
}

console.log(filter(numbers, isPositive));
console.log(filter(numbers, isNegative))