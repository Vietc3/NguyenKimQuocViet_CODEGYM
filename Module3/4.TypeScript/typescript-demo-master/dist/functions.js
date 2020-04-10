"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
require("./scss/styles.scss");
function square(num) {
    return num * num;
}
console.log(square(5));
const squareFE = function (num) {
    return num * num;
};
function add(a) {
    return function (b) {
        return a + b;
    };
}
const addWith5 = add(5);
console.log(addWith5(3));
console.log(addWith5(15));
//# sourceMappingURL=functions.js.map