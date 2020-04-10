var STATUS;
(function (STATUS) {
    STATUS[STATUS["CREATE"] = 100] = "CREATE";
    STATUS[STATUS["PROCCESS"] = 900] = "PROCCESS";
    STATUS[STATUS["FINISH"] = 500] = "FINISH";
})(STATUS || (STATUS = {}));
let todoStatus = STATUS.CREATE;
console.log(todoStatus);
