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

/////////////////////////////////////////////////////////////////////
let arr1 = [1, 3, 5];
let arr2 = [2, 4, 6];
let sumArray = sumSortedArrays(arr1, arr2);

function sumSortedArrays(arr1, arr2) {
    let sumArray = [];
    let i = 0, j = 0;

    while (i < arr1.length && j < arr2.length) {
        if (arr1[i] < arr2[j]) {
            sumArray.push(arr1[i]);
            i++;
        } else {
            sumArray.push(arr2[j]);
            j++;
        }
    }

    while (i < arr1.length) {
        sumArray.push(arr1[i]);
        i++;
    }

    while (j < arr2.length) {
        sumArray.push(arr2[j]);
        j++;
    }

    return sumArray;
}

console.log("sumArray", sumArray);