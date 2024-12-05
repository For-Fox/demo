let arr = [2, 2, 3, 3, 3, 4, 5, 5];
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

console.log("removeDooble", arr.slice(0, newArr).concat(new Array(arr.length - newArr).fill('_')));
