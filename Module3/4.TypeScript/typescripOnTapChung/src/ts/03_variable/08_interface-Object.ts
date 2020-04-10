let objOne:any = {};
console.log(objOne);

interface CourseInterface {
    name: string;
    time: number;
    free?: boolean
}

let objTwo: CourseInterface;
objTwo = {
    name: "abc",
    time: 5
};

let objThree: CourseInterface;
objThree = {
    name: "cde",
    time: 5,
    free: false
};


console.log(objTwo)
console.log(objThree)