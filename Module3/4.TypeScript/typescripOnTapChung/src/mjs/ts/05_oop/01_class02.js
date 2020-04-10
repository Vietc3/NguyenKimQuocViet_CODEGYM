var TaskState;
(function (TaskState) {
    TaskState[TaskState["Create"] = 100] = "Create";
    TaskState[TaskState["Active"] = 101] = "Active";
    TaskState[TaskState["Inactive"] = 102] = "Inactive";
    TaskState[TaskState["Proccess"] = 103] = "Proccess";
    TaskState[TaskState["Finish"] = 104] = "Finish";
})(TaskState || (TaskState = {}));
class TaskService {
    constructor(tasks) {
        this.tasks = tasks;
    }
    getItems() {
        return this.tasks;
    }
}
let task1 = { id: 1, name: "Coding" };
let task2 = { id: 2, name: "Study ES6" };
let tasks = [
    task1,
    task2,
    { id: 3, name: "kiss my girl", state: TaskState.Finish }
];
let taskServiceeObj = new TaskService(tasks);
console.log(taskServiceeObj.getItems());
