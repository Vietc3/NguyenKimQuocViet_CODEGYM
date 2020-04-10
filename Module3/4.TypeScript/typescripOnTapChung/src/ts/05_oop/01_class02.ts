// enum TaskState {
//     Create = 100,
//     Active,
//     Inactive,
//     Proccess,
//     Finish
// }
//
// interface TaskInterface {
//     id: number;
//     name: string;
//     // state?:TaskState
//     state?: TaskState;
// }
//
//
// class TaskService {
//     tasks: TaskInterface[];
//
//     constructor(tasks: TaskInterface[]) {
//         this.tasks = tasks;
//     }
//
//     getItems() {
//         return this.tasks;
//     }
// }
//
// let task1: TaskInterface = {id: 1, name: "Coding"};
// let task2: TaskInterface = {id: 2, name: "Study ES6"};
// let tasks: TaskInterface[] = [
//     task1,
//     task2,
//     // {id:3,name:"kiss my girl",state:TaskState}
//     {id: 3, name: "kiss my girl", state: TaskState.Finish}
// ];
// // let tasks : TaskInterface[] = [
// //     {id: 1,name:"Coding"},
// //     {id: 2,name:"Study ES6"}
// // ];
// let taskServiceeObj = new TaskService(tasks);
// console.log(taskServiceeObj.getItems());