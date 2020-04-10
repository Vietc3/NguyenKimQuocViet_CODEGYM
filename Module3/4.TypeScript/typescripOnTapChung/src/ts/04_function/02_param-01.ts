// //day du tham so
// function userTinfor1(name: string, age: number): string {
//     return `My name is ${name},${age} years old`;
// }
//
//
// console.log(userTinfor1("john", 20));
//
// //Gia tri mac dinh cho cac tham so
// function userTinfor2(name: string = "john", age: number = 69): string {
//     return `My name is ${name},${age} years old`;
// }
//
// //tham so khuyet
// function userTinfor3(name: string = "john", age?: number): string {
//     if (age == null) {
//         return `My name is ${name}`;
//     } else {
//         return `My name is ${name},${age} years old`;
//     }
// }
//
// console.log(userTinfor3("peter",20));