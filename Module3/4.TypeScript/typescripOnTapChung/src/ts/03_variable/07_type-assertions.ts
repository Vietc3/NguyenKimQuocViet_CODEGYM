let mVariable: any = "Typescrip training";
//let total = mVariable.length;

// let total = (<string>mVariable).length;
let total =(mVariable as string).length;
console.log(total);