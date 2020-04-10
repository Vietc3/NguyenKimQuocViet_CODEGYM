export let fname="Quốc Việt";
export let lname="Học TyperScript";
let lname3="Default";
export  default lname3;
// cach 2
 let fname1="Quốc Việt";
 let lname1="Học TyperScript";
let obj={
    name:"Đại Ca"
};
export {fname1,lname1,obj};

///export function and class
export function hello(message) {
console.log(message);
}
export class helloClass {
    constructor() {
        console.log('Hello');
    }
    greeting(message){
        console.log(message);
    }
}
