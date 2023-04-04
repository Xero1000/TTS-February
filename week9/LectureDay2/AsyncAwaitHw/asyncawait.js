
// Gets a random integer between 1 and 10
function getRandomNumber() {
    let promise = new Promise((resolve) => {
        setTimeout(resolve(Math.ceil(Math.random() * 10)), 500)
    })
    return promise;
}

async function printRandomNumber() {
    let randomNumber = await getRandomNumber();
    console.log(randomNumber);
}

printRandomNumber();


// Gets base experience, height, and abilities of pokemon from pokeapi
async function getPokeData(pokemonName){
    try {
        let response = await fetch(`https://pokeapi.co/api/v2/pokemon/${pokemonName.toLowerCase()}`)
        if (response.status != 200){
            throw new Error("Unable to retrieve pokemon data")
        }
        
        let pokeData = await response.json();

        let abilities = pokeData.abilities.map((key) => {
            return key.ability.name;
        })
        
        console.log(`${pokemonName} stats
        \nBase Experience: ${pokeData.base_experience}\nHeight: ${pokeData.height}\nAbilities: ${abilities.join(", ")}`);

    }
    catch(err){
        console.log(err)
    }
}

getPokeData("Pikachu");
getPokeData("Charizard");
getPokeData("Dialga");