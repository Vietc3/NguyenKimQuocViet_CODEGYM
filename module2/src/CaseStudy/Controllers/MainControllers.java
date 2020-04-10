package CaseStudy.Controllers;

import CaseStudy.Data.NameServiceComparator;
import CaseStudy.Models.*;

import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;
import java.util.TreeSet;

public class MainControllers extends FuncWriteFileCSV {
    public static void displayMainMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.       Add New Services\n" +
                "2.       Show Services\n" +
                "3.       Add New Customer\n" +
                "4.       Show Information Customer\n" +
                "5.       Add New Booking Resort\n" +
                "6.       Show Information employee\n" +
                "7.       Show Information cinema\n" +
                "8.       Exit\n");
        int chooseMainMenu = scanner.nextInt();
        switch (chooseMainMenu) {
            case 1:
                addNewService();
                break;
            case 2:
                showService();
                break;
            case 3:
                addNewCustomer();
                break;
            case 4:
                showInforCustomer();
                break;
            case 5:
                addNewBooking();
                break;
            case 6:
                showEmployee();
                break;
            case 7:
                cineMa();
                break;
            default:
                displayMainMenu();
                break;
        }
    }

    public static void addNewBooking() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Choose The Customer Need Booking:");
        showInforCustomer();
        int chooseCustomer = scanner.nextInt();
        Customer customer = new Customer();
        customer = arrayListCustomer.get(chooseCustomer);
        arrayListCustomerBooking.add(customer);

        System.out.println("1. Booking Villa\n" +
                "2. Booking House\n" +
                "3. Booking Room\n");
        int chooseNewBooking = scanner.nextInt();
        String file;


        switch (chooseNewBooking) {
            case 1:
                file = "E:\\Module1\\module2\\src\\CaseStudy\\Data\\Villa.csv";
                reader(file, "Villa");
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Please Choose The Villa:(Input Number Villa)");
                int bookingVilla = scanner1.nextInt();
                new Villa();
                Villa villa = arrayListVilla.get(bookingVilla);
                arrayListVillaBooking.add(villa);
                arrayListCustomer.get(chooseCustomer).setUseService(villa);
                FILE_HEADER = "Villa-Customer";
                file = "E:\\Module1\\module2\\src\\CaseStudy\\Data\\Booking.csv";
                writeCsvFile(file, "VillaBooking");
                writeCsvFile(file, "CustomerBooking");
                break;
            case 2:
                file = "E:\\Module1\\module2\\src\\CaseStudy\\Data\\House.csv";
                reader(file, "House");
                showService();
                break;
            case 3:
                file = "E:\\Module1\\module2\\src\\CaseStudy\\Data\\Room.csv";
                reader(file, "Room");
                showService();
                break;
            case 4:
                displayMainMenu();
                break;
            default:
                break;

        }
    }

    public static String fileName2;

    public static void addNewCustomer() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String checkNamePattern = "((^([A-z]{1}[a-z_àáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]*[ ])*)*$)";
        String checkBirthDay = "^(3[01]|[12][0-9]|0[1-9])-(1[0-2]|0[1-9])-[0-9]{4}$";
        String checkEmail = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        String checkIdCard = "^([0-9]{9})$";
        String checkGender = "^(male)|(female)|(unknow)$";
        System.out.println("Input Name Customer: ");
        String nameCustomer = scanner.nextLine();
        while (!Pattern.matches(checkNamePattern, nameCustomer)) {
            System.out.println("Your Name Fail, Please Input Again");
            nameCustomer = scanner.nextLine();
        }
        System.out.println("Input Birthday Customer: ");
        String birthdayCustomer = scanner.nextLine();
        while (!Pattern.matches(checkBirthDay, birthdayCustomer)) {
            System.out.println("Your BirthDay Fail, Please Input Again");
            birthdayCustomer = scanner.nextLine();
        }
        System.out.println("Input IdCard Customer: ");
        String idCardCustomer = scanner.nextLine();
        while (!Pattern.matches(checkIdCard, idCardCustomer)) {
            System.out.println("Your ID Card Fail, Please Input Again");
            idCardCustomer = scanner.nextLine();
        }
        System.out.println("Input Address Customer: ");
        String addressCustomer = scanner.nextLine();
        System.out.println("Input Email Customer: ");
        String emailCustomer = scanner.nextLine();
        while (!Pattern.matches(checkEmail, emailCustomer)) {
            System.out.println("Your Email Fail, Please Input Again");
            emailCustomer = scanner.nextLine();

        }
        System.out.println("Input Gender Customer: ");
        String genderCustomer = scanner.nextLine().toLowerCase();

        while (!Pattern.matches(checkGender, genderCustomer)) {
            System.out.println("Your Gender Fail (Male,Female,Unknown), Please Input Again");
            genderCustomer = scanner.nextLine();
        }
        String[] arr = genderCustomer.split("");
        String genderCustomer1 = "";
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                genderCustomer1 += arr[0].toUpperCase();
            } else {
                genderCustomer1 += arr[i];
            }
        }
        System.out.println("Input Phone Number Customer: ");
        String phoneCustomer = scanner.nextLine();
        System.out.println("Input Type Customer: ");
        String typeCustomer = scanner.nextLine();

        iD = UUID.randomUUID().toString().replace("-", "");
        Customer customer = new Customer(nameCustomer, iD, birthdayCustomer, genderCustomer1, typeCustomer, phoneCustomer, idCardCustomer, emailCustomer,
                addressCustomer);
        arrayListCustomer.add(customer);
        fileName2 = "E:\\Module1\\module2\\src\\CaseStudy\\Data\\Customer.csv";
        FILE_HEADER = "nameCustomer, iD, birthdayCustomer, genderCustomer, typeCustomer, phoneCustomer, idCardCustomer, emailCustomer,service,address";
        writeCsvFile(fileName2, "Customer");
        displayMainMenu();
    }

    public static void showInforCustomer() {
        Collections.sort(arrayListCustomer, new sort());
        for (Customer customer : arrayListCustomer
        ) {
            System.out.println("Id: " + customer.getIdCustomer() + "\n" +
                    "Name Customer is: " + customer.getNameCustomer() +
                    "Birthday Customer is : " + customer.getBirthdayCustomer() + "\n" +
                    "Gender Customer is: " + customer.getGender() + "\n" +
                    "ID Card Customer is: " + customer.getNumberIDCard() + "\n" +
                    "Phone Number Customer: " + customer.getPhoneNumber() + "\n" +
                    "Email Customer is: " + customer.getEmailCustomer() + "\n" +
                    "Type Customer is: " + customer.getTypeCustomer() + "\n" +
                    "Address Customer is: " + customer.getAddressCustomer() + "\n"

            );

        }
    }

    public static void showService() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Show All Villa\n" +
                "2. Show All House\n" +
                "3. Show All Room\n" +
                "4. Show All Name Villa Not Duplicate\n" +
                "5. Show All Name House Not Duplicate\n" +
                "6. Show All Name Name Not Duplicate\n" +
                "7. Back to menu\n" +
                "8. Exit\n");
        String file = "";
        int chooseShowMenu = scanner.nextInt();
        switch (chooseShowMenu) {
            case 1:
                file = "E:\\Module1\\module2\\src\\CaseStudy\\Data\\Villa.csv";
                reader(file, "Villa");
                showService();
                break;
            case 2:
                file = "E:\\Module1\\module2\\src\\CaseStudy\\Data\\House.csv";
                reader(file, "House");
                showService();
                break;
            case 3:
                file = "E:\\Module1\\module2\\src\\CaseStudy\\Data\\Room.csv";
                reader(file, "Room");
                showService();
                break;
            case 4:
                showAllVillaNoducate();
                break;
            default:
                break;
        }
    }

    private static String iD, nameService, typeOfRent;
    private static float areUse, feeService;
    private static int numberOfPeople;
    public static ArrayList<House> arrayListHouse = new ArrayList<House>();
    public static ArrayList<Villa> arrayListVilla = new ArrayList<Villa>();
    public static ArrayList<Villa> arrayListVillaBooking = new ArrayList<Villa>();
    public static ArrayList<Room> arrayListRoom = new ArrayList<Room>();
    public static ArrayList<Customer> arrayListCustomer = new ArrayList<Customer>();
    public static ArrayList<Customer> arrayListCustomerBooking = new ArrayList<Customer>();
    public static ArrayList<Employee> arrayListEmployee = new ArrayList<Employee>();

    public static void showAllVillaNoducate() {
//add treeset
        TreeSet<Villa> treeSetVilla = new TreeSet<>(new NameServiceComparator());
        treeSetVilla.addAll(arrayListVilla);
        System.out.println(treeSetVilla);
    }


    public static void addCommon() {
        String nameServicePattern = "^[A-Z][a-z_àáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]+(?:[\\s]+[A-Z][a-z_àáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]+)*$";
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        do {
            System.out.println("Please enter the service name ");
            nameService = scanner1.nextLine();
        } while (!Pattern.matches(nameServicePattern, nameService));
        do {
            System.out.println("Please enter the usable area ");
            areUse = scanner.nextFloat();
        } while (areUse > 30);
        do {
            System.out.println("Please enter the rental fee: ");
            feeService = scanner.nextFloat();
        } while (feeService < 0);
        do {
            System.out.println("Please enter number of people: ");
            numberOfPeople = scanner.nextInt();
        } while (numberOfPeople > 30 || numberOfPeople < 0);
        do {
            System.out.println("Please enter type of rent: ");
            typeOfRent = scanner1.nextLine();
        } while (!Pattern.matches(nameServicePattern, nameService));
    }

    public static void addNewService() throws IOException {
        String fileName = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Add New Villa\n" +
                "2. Add New House\n" +
                "3. Add New Room\n" +
                "4. Back to menu\n" +
                "5. Exit\n");
        float poolArea;
        int chooseAddNewService = scanner.nextInt();
        switch (chooseAddNewService) {
            case 1:
                addCommon();
                Scanner scanner4 = new Scanner(System.in);
                Scanner scanner5 = new Scanner(System.in);
                Scanner scanner6 = new Scanner(System.in);
                do {
                    System.out.println("Please enter pool area: ");
                    poolArea = scanner6.nextFloat();
                } while (poolArea < 30);
                System.out.println("Please enter kind of room: ");
                String kindOfRoomVilla = scanner4.nextLine();
                System.out.println("Please enter decription of room: ");
                String decriptionVilla = scanner4.nextLine();
                System.out.println("Please enter number of floor: ");
                int numberOfFloorVilla = scanner5.nextInt();
                iD = UUID.randomUUID().toString().replace("-", "");
                Villa villa = new Villa(iD, nameService, areUse, feeService, numberOfPeople, typeOfRent, poolArea, kindOfRoomVilla, decriptionVilla, numberOfFloorVilla);
                arrayListVilla.add(villa);
                fileName = "E:\\Module1\\module2\\src\\CaseStudy\\Data\\Villa.csv";
                writeCsvFile(fileName, "Villa");
                displayMainMenu();
                break;
            case 2:
                addCommon();
                Scanner scanner3 = new Scanner(System.in);
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Please enter kind of room: ");
                String kindOfRoom = scanner3.nextLine();
                System.out.println("Please enter decription of room: ");
                String decription = scanner3.nextLine();
                System.out.println("Please enter number of floor: ");
                int numberOfFloor = scanner1.nextInt();
                iD = UUID.randomUUID().toString().replace("-", "");
                House house = new House(iD, nameService, areUse, feeService, numberOfPeople, typeOfRent, kindOfRoom, decription, numberOfFloor);
                arrayListHouse.add(house);
                FILE_HEADER = "iD, nameService, areUse, feeService, numberOfPeople, typeOfRent, kindOfRoom, decription, numberOfFloor";
                fileName = "E:\\Module1\\module2\\src\\CaseStudy\\Data\\House.csv";
                writeCsvFile(fileName, "House");
                displayMainMenu();
                break;
            case 3:
                addCommon();
                Scanner scanner7 = new Scanner(System.in);
                Scanner scanner8 = new Scanner(System.in);
                Scanner scanner9 = new Scanner(System.in);
                System.out.println("Please enter name plus service: ");
                String namePlusService = scanner7.nextLine();
                System.out.println("Please enter amount plus service: ");
                int amountPlusService = scanner8.nextInt();
                System.out.println("Please enter price plus service: ");
                float pricePlusService = scanner9.nextFloat();
                iD = UUID.randomUUID().toString().replace("-", "");
                Room room = new Room(iD, nameService, areUse, feeService, numberOfPeople, typeOfRent, namePlusService, amountPlusService, pricePlusService);
                arrayListRoom.add(room);
                FILE_HEADER = "iD, nameService, areUse, feeService, numberOfPeople, typeOfRent, namePlusService, amountPlusService, pricePlusService";
                fileName = "E:\\Module1\\module2\\src\\CaseStudy\\Data\\Room.csv";
                writeCsvFile(fileName, "Room");
                displayMainMenu();
                break;
            case 4:
                displayMainMenu();
                break;
            default:
                break;
        }
    }

    public static void showEmployee() {
        Employee employee = new Employee("Việt", "Đà Nẵng", "001", 13);
        Employee employee1 = new Employee("Việt1", "Đà Nẵng", "002", 13);
        Employee employee2 = new Employee("Việt2", "Đà Nẵng", "003", 13);
        Employee employee3 = new Employee("Việt3", "Đà Nẵng", "004", 13);
        Employee employee4 = new Employee("Việt4", "Đà Nẵng", "005", 13);
        Employee employee5 = new Employee("Việt5", "Đà Nẵng", "005", 13);
        Employee employee6 = new Employee("Việt6", "Đà Nẵng", "005", 13);
        Employee employee7 = new Employee("Việt7", "Đà Nẵng", "005", 13);
        Employee employee8 = new Employee("Việt8", "Đà Nẵng", "005", 13);
        Employee employee9 = new Employee("Việt9", "Đà Nẵng", "005", 13);
        arrayListEmployee.add(employee);
        arrayListEmployee.add(employee1);
        arrayListEmployee.add(employee2);
        arrayListEmployee.add(employee3);
        arrayListEmployee.add(employee4);
        arrayListEmployee.add(employee5);
        arrayListEmployee.add(employee6);
        arrayListEmployee.add(employee7);
        arrayListEmployee.add(employee8);
        arrayListEmployee.add(employee9);
        Map<String, Employee> map = new HashMap<String, Employee>();
        for (Employee employee10 : arrayListEmployee) {
            map.put(employee10.getIdEmployee(), employee10);
        }
        for (String key : map.keySet()) {
            Employee value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }

    public static void cineMa() {
        Queue<String> names = new LinkedList<String>();
        names.offer("Việt");
        names.offer("Việt1");
        names.offer("M");
        while (true) {
            String name = names.poll();
            if (name == null) {
                break;
            }
            System.out.println("Name=" + name);
        }
    }


    public static void main(String[] args) throws IOException {
        displayMainMenu();
    }
}
