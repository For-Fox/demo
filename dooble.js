let arr = [1, 1, 3, 5, 19, 4, 19, 9];
let newArr = removeDooble(arr);

function removeDooble(arr) {
   let uniqueIndex = 0;
   for (let i = 1; i < arr.length; i++) {
       if (arr[i] !== arr[uniqueIndex]) {
           uniqueIndex++;
           arr[uniqueIndex] = arr[i]; 
       }
   }
   return uniqueIndex + 1;
}

console.log("removeDooble", arr.slice(0, newArr).concat(new Array(arr.length - newArr)));
