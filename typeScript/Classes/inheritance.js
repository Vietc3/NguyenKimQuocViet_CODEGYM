var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Person = /** @class */ (function () {
    function Person(name) {
        console.log(name + " là đại ca lớp");
    }
    Person.prototype.getId = function () {
        return 10;
    };
    return Person;
}());
var baby = /** @class */ (function (_super) {
    __extends(baby, _super);
    function baby(name) {
        var _this = _super.call(this, name) || this;
        console.log(name + " là con của Person");
        return _this;
    }
    baby.prototype.getId = function () {
        return _super.prototype.getId.call(this);
    };
    return baby;
}(Person));
var baby1 = new baby("viet");
console.log(baby1.getId());
