var nameCustomer = document.getElementById('name');
var adressCustomer = document.getElementById('address');
var arrayCustomer = [];

function addCustomer() {

    let customer = new Customer();
    customer.setName(nameCustomer.value);
    customer.setAddress(adressCustomer.value);
    arrayCustomer.push(customer);
    nameCustomer.value = "";
    adressCustomer.value = "";
    document.getElementById('notification').innerText = "Add Successfully";
    show();

}

function show() {
    var drawTable = "<tr><th>Name</th>\n" +
        "<th>Address</th>\n" +
        "<th>Action</th>\n" +
        "</tr>";
    for (var i = 0; i < arrayCustomer.length; i++) {
        drawTable += "<tr>" +
            "<td>" + arrayCustomer[i].getName() + "</td>" +
            "<td>" + arrayCustomer[i].getAddress() + "</td>" +
            "<td><button onclick='deleteCustomer(" + i + ")'>Remove</button></td>" +
            "</tr>"
    }
    document.getElementById('tableCustomer').innerHTML = drawTable;
}
function deleteCustomer(a) {
    arrayCustomer.splice(a, 1);
show()
}

var btnShowAndHide = document.getElementById("showAndHide");
var table=document.getElementById('table');
table.style.visibility= "hidden";
function show1() {
    if (btnShowAndHide.innerText === "Show Customer") {
        table.style.visibility= "visible";
        btnShowAndHide.innerText ="Hide Customer";
    } else {
       table.style.visibility= 'hidden';
        btnShowAndHide.innerText = "Show Customer";
    }
}
