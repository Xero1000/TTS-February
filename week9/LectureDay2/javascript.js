// let a = 10;
// let b = 5;

// function sum (a, b) {
//     return a + b;
// }

// let c = sum(a, b);
// console.log(c);

// const myPromise = 
//   (new Promise(myExecutorFunc))
//   .then(handleFulfilledA,handleRejectedA)
//   .then(handleFulfilledB,handleRejectedB)
//   .then(handleFulfilledC,handleRejectedC);

// // or, perhaps better ...

// const myPromise1 =
//   (new Promise(myExecutorFunc))
//   .then(handleFulfilledA)
//   .then(handleFulfilledB)
//   .then(handleFulfilledC)
//   .catch(handleRejectedAny);

// async function f() {
//     return 1;
//   }
  
//   f().then(alert); // 1

async function f() {

    let promise = new Promise((resolve, reject) => {
      setTimeout(() => resolve("done!"), 1000)
    });
  
    let result = await promise; // wait until the promise resolves (*)
  
    alert(result); // "done!"
}

f();
  