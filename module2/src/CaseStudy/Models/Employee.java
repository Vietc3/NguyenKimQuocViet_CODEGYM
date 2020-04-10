package CaseStudy.Models;

public class Employee
{
    private String nameEmployee,addressEmployee,idEmployee;
    private Number ageEmployee;

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public Employee(String nameEmployee, String addressEmployee, String idEmployee, Number ageEmployee) {
        this.nameEmployee = nameEmployee;
        this.addressEmployee = addressEmployee;
        this.idEmployee = idEmployee;
        this.ageEmployee = ageEmployee;
    }

    public Employee(String nameEmployee, String addressEmployee, Number ageEmployee) {
        this.nameEmployee = nameEmployee;
        this.addressEmployee = addressEmployee;
        this.ageEmployee = ageEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getAddressEmployee() {
        return addressEmployee;
    }

    public void setAddressEmployee(String addressEmployee) {
        this.addressEmployee = addressEmployee;
    }

    public Number getAgeEmployee() {
        return ageEmployee;
    }

    public void setAgeEmployee(Number ageEmployee) {
        this.ageEmployee = ageEmployee;
    }
}
