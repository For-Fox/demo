//Написать функцию, которая принимает 
//в качестве аргументов два числа и возращает их сумму
//function sum(a, b) {
//    return a + b;
// }
// console.log(sum(3, 5)); 

//Написать функцию, принимающую массив с числами в качестве аргумента 
//и возвращающую новый новый массив с положительными числами
//const numbers = [-2, 6, -100, 0, 14, 6, -5];
//const plusNumbers = getPlusNumbers(numbers);

//function getPlusNumbers(arr) {
//   return arr.filter(number => number > 0);
//}
//console.log(plusNumbers);

//Написать функцию, которая принимает 5 числовых аргументов 
//и возращает самое большое число из них 
// function getMaxNumber(a, b, c, d, e) {
//    return Math.max(a, b, c, d, e);
// }
// console.log(getMaxNumber(11, 8, 57, 13, 16));

//Написать функцию, которая принимает массив с числами 
//и возращает самое большое число
// function getMaxMassivNumber(arr) {
//    return Math.max(...arr);
// }
// const numbers = [11, 8, 57, 13, 16];
// console.log(getMaxMassivNumber(numbers));

//Написать функцию, которая принимает два числа
//и возвращает первое число, возведенное в степень сторого числа

// function stepen(a, b) {
//    return a ** b;
// }
// console.log(stepen(5, 4));

//Написать функцию, которая принимает два массива 
//и возвращает один массив, созданный из двух переданных
// function sumArrays(arr1, arr2) {
//     return [...arr1, ...arr2];
// }
// const array1 = [1, 2, 3];
// const array2 = [4, 5, 6];

// const summuryArray = sumArrays(array1, array2);
// console.log(summuryArray);

//Напишите стрелочную функцию, которая принимает массив чисел и возвращает новый массив,
//содержащий только положительные чётные числа.

const getPlusChetNumbers = (arr) => arr.filter(num => num > 0 && num % 2 === 0);
const number = [-2, 6, -100, 0, 14, 6, -5];
const plusChetNumbers = getPlusChetNumbers(number);

console.log(plusChetNumbers);


//Напишите стрелочную функцию, которая принимает две строки 
//и возвращает самую длинную
const getLongString = (str1, str2) => str1.length >= str2.length ? str1 : str2;
console.log(getLongString("Oxana", "Furman"));