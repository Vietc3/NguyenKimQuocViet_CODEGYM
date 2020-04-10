"use strict";
function greeter(person) {
    if (person === void 0) { person = "abc"; }
    return "Hello," + person;
}
var user = "abc123";
document.body.innerHTML = greeter(user);
// function main() {
//  var x = 5;
//  console.log(x);
//  var x = 10;
//  console.log(x);
//
//  let y = 55;
//  console.log(y);
//
//  console.log(y);
// }
// main()
