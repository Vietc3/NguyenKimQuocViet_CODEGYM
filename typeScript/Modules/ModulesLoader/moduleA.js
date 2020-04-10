import {fname,lname} from "./moduleB.js";
import {fname1,lname1,obj} from "./moduleB.js";
import {default as okla} from "./moduleB.js";
import {hello,helloClass} from "./moduleB.js";
hello("Hello Import Success");
helloClass.prototype.greeting('Okela');
obj.name="Changed";

console.log(okla);
console.log(`${fname} ${lname} ${obj.name}`);
console.log(`${fname1} ${lname1}`);
