class Course {
    id: string;
    name: string;
    price: number;
    
    constructor(id:string, name: string, price: number) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    showCourseInfo():void{
        console.log(`${this.id} - ${this.name} - ${this.price}`);
    }
}

class CourseMobile extends Course{
    author: string;

    constructor(id:string, name: string, price: number,author:string) {
        super(id,name,price);
        this.author = author;
    }

    showCourseInfo(): void {
        super.showCourseInfo();
        console.log(this.author);
    }
}

var courseObj = new Course("CO12","Programming",23);
courseObj.showCourseInfo();

var cuoseMobleObj = new CourseMobile("co13","pro",20,"john");
cuoseMobleObj.showCourseInfo();