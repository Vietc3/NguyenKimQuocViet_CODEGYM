enum TaskState {
    Create = 100,
    Active,
    Inactive,
    Proccess,
    Finish
}

interface TaskInterface {
    id: number;
    name: string;
    // state?:TaskState
    state?: TaskState;
}


class TaskService {
    public static username:string = "john";
    static tasks: TaskInterface[];

    constructor(tasks: TaskInterface[]) {
        TaskService.tasks = tasks;
    }

    getItems() {
        return TaskService.tasks;
    }
    static showInforItems():void{
        for (let task of TaskService.tasks){
            console.log(`"John" - ${task.name}`);
        }
    }
}



let taskServiceeObj = new TaskService([
    {id: 1,name:"Coding"},
    {id: 2,name:"Study ES6"},
    {id: 3,name:"Kiss my girl",state: TaskState.Finish}
]);

TaskService.showInforItems();
// console.log(TaskService.username )
// console.log(taskServiceeObj.getItems());