let someValue: any = "this is a string";
;
let strLength1: number = (<string>someValue).length;
let strLength2: number = (someValue as string).length;
