package CaseStudy.Controllers;

import CaseStudy.Models.Customer;

import java.util.Comparator;

public class sort implements Comparator<Customer> {
    @Override
    public int compare(Customer cur1, Customer cur2) {
        if (cur1.getNameCustomer().compareTo(cur2.getNameCustomer()) == 0) {
            return cur1.getYearBirthday() - cur2.getYearBirthday();
        }
        return cur1.getNameCustomer().compareTo(cur2.getNameCustomer());
    }
}