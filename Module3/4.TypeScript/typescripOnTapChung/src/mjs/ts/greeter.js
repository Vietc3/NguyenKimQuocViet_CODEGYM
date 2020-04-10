function greeter(person = "abc") {
    return "Hello," + person;
}
var user = "abc123";
document.body.innerHTML = greeter(user);
