
function Customer() {
    this.setName = function (Name) {
        this.name = Name;
    };
    this.getName = function () {
        return this.name;
    };
    this.setAddress = function (Address) {
        this.address = Address;
    };
    this.getAddress = function () {
        return this.address;
    };
}
