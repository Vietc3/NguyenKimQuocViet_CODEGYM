package CaseStudy.Models;

import java.util.Date;

public class Customer {
    private String nameCustomer;
    private String idCustomer;
    private String birthdayCustomer;
    private String gender;
    private String typeCustomer;
    private String phoneNumber;
    private String numberIDCard;
    private String emailCustomer;
    private String addressCustomer;
    private Services useService;

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    public Services getUseService() {
        return useService;
    }

    public void setUseService(Services useService) {
        this.useService = useService;
    }

    public Customer(String nameCustomer, String idCustomer, String birthdayCustomer, String gender, String typeCustomer,
                    String phoneNumber, String numberIDCard, String emailCustomer, Services useService, String addressCustomer) {
        this.nameCustomer = nameCustomer;
        this.idCustomer = idCustomer;
        this.birthdayCustomer = birthdayCustomer;
        this.gender = gender;
        this.typeCustomer = typeCustomer;
        this.phoneNumber = phoneNumber;
        this.numberIDCard = numberIDCard;
        this.emailCustomer = emailCustomer;
        this.useService = useService;
        this.addressCustomer = addressCustomer;
    }

    public Customer(String nameCustomer, String idCustomer, String birthdayCustomer, String gender, String typeCustomer,
                    String phoneNumber, String numberIDCard, String emailCustomer, String addressCustomer) {
        this.nameCustomer = nameCustomer;
        this.idCustomer = idCustomer;
        this.birthdayCustomer = birthdayCustomer;
        this.gender = gender;
        this.typeCustomer = typeCustomer;
        this.phoneNumber = phoneNumber;
        this.numberIDCard = numberIDCard;
        this.emailCustomer = emailCustomer;
        this.addressCustomer = addressCustomer;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getNameCustomer() {
        return this.nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthdayCustomer() {
        return this.birthdayCustomer;
    }

    public Customer() {
    }

    public void setBirthdayCustomer(String birthdayCustomer) {
        this.birthdayCustomer = birthdayCustomer;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNumberIDCard() {
        return this.numberIDCard;
    }

    public void setNumberIDCard(String numberIDCard) {
        this.numberIDCard = numberIDCard;
    }

    public String getEmailCustomer() {
        return this.emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getYearBirthday() {
        String temp = "";
        for (int i = getBirthdayCustomer().length() - 4; i < getBirthdayCustomer().length(); i++) {
            temp += getBirthdayCustomer().charAt(i);
        }
        return Integer.valueOf(temp);
    }

    public void showInforCustomer() {
        System.out.println("Id: " + idCustomer + "\n" +
                "Name Customer is: " + nameCustomer +
                "Birthday Customer is : " + birthdayCustomer + "\n" +
                "Gender Customer is: " + gender + "\n" +
                "ID Card Customer is: " + numberIDCard + "\n" +
                "Phone Number Customer: " + phoneNumber + "\n" +
                "Email Customer is: " + emailCustomer + "\n" +
                "Type Customer is: " + typeCustomer + "\n" +
                "Address Customer is: " + addressCustomer + "\n" +
                "Service is: " + useService + "\n"
        );
    }
}
