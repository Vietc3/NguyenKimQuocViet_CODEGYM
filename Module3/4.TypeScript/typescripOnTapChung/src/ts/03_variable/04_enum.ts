//100 create, 101 proccess, 102 finish
enum STATUS {
    CREATE= 100,PROCCESS= 900,FINISH = 500
}
let todoStatus : STATUS = STATUS.CREATE;

console.log(todoStatus);