// //Boolean
// var isDone: boolean = true;
// String:
//     var name: boolean = "nguyen thi A";
// Number:
//     var height: number = 8;
// Array : có 2 kiểu khai báo tương đương với nhau trong TypeScript
// 1: var list: boolean[] = [true, false];
// 2: var isDone: Array<boolean> = [true, false];
//
// Enum: khi khai báo enum một cách thông thường các phần tử sẽ được đánh số từ 0 và tăng dần
// enum Color{Red, Green, Blue};
// var c: Color = Color.Green
// var colorName = Color[1] // kết quả sẽ là Green

// Khi mốn phần tử đầu tiên là 1 chứ không phải là 0 như mặc định thì cần khai báo như sau:
//     enum Color{Red = 1, Green, Blue};
// var c: Color = Color.Green
// var colorName = Color[1] // kết quả sẽ là Red
//
// any: Any là một kiểu mà bạn có thể gán bất kỳ kiểu nào cho nó.
//     var notSure: any = 4;
// notSure = "maybe a string instead";
// notSure = false; // khai báo này hoàn toàn được chấp nhận.
//                  // nếu notSure ban đầu khai báo và number thì
//                  // tại đây chắc chắn sẽ có lỗi
//
// var list:any[] = [1, true, "free"]; // nếu sử dụng var list:number[] thì
//                                     // tất cả các phần tử trong list sẽ phải là kiểu number
// list[1] = 100;
