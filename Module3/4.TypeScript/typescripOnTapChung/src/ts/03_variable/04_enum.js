"use strict";
//100 create, 101 proccess, 102 finish
var STATUS;
(function (STATUS) {
    STATUS[STATUS["CREATE"] = 100] = "CREATE";
    STATUS[STATUS["PROCCESS"] = 900] = "PROCCESS";
    STATUS[STATUS["FINISH"] = 500] = "FINISH";
})(STATUS || (STATUS = {}));
var todoStatus = STATUS.CREATE;
console.log(todoStatus);
