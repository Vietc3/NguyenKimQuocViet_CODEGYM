class Person {
run(){
    console.log('Person is running ....' )
}
}
var p1 =new Person();
console.log(p1.run === Person.prototype.run)
console.log(p1.run());
