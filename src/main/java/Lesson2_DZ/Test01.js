let d = 0;
let b = 0;
console.log("1/0 = " + 1 / d); // 1/0 = Infinity
console.log("Infinity - Infinity : " + (1 / b - 1 / d)); // Infinity - Infinity : NaN
console.log("Infinity / Infinity : " + (1 / b) / (1 / d)); // Infinity / Infinity : NaN
console.log("Infinity * Infinity : " + (1 / b) * (1 / d)); // Infinity * Infinity : NaN
let c = 1.9;
let infinity = c / 0;
let infinity2 = 1 / d;
console.log(infinity == infinity2); // true