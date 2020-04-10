var Person = /** @class */ (function () {
    function Person() {
    }
    Person.prototype.run = function () {
        console.log('Person is running ....');
    };
    return Person;
}());
var p1 = new Person();
console.log(p1.run === Person.prototype.run);
console.log(p1.run());
