class Person {
   constructor(name) {
       console.log(name+" là đại ca lớp")
   }
   getId(){
       return 10;
   }
}
class baby extends Person{
    constructor(name) {
        super(name);
        console.log(name+" là con của Person")
    }
    getId(): number {
        return super.getId();
    }

}
var baby1=new baby("viet");
console.log(baby1.getId())
