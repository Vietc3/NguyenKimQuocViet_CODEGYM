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
        TaskService.tasks = tasks;
    }
    getItems() {
        return TaskService.tasks;
    }
    static showInforItems() {
        for (let task of TaskService.tasks) {
            console.log(`"John" - ${task.name}`);
        }
    }
}
TaskService.username = "john";
let taskServiceeObj = new TaskService([
    { id: 1, name: "Coding" },
    { id: 2, name: "Study ES6" },
    { id: 3, name: "Kiss my girl", state: TaskState.Finish }
]);
TaskService.showInforItems();
