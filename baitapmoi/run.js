var nameCustomer=document.getElementById('name');
var adressCustomer=document.getElementById('address' );
var arrayCustomer=[];
function addCustomer() {

for(let i=0;i<=arrayCustomer.length;i++)
{
    let customer=new Customer();
    customer.setName(nameCustomer.value);
    customer.setAddress(adressCustomer.value);
    arrayCustomer.push(customer);
    nameCustomer.value="";
    adressCustomer.value="";
 document.getElementById('notification').innerText="Add Successfully";

}}
