package CaseStudy.Controllers;

import CaseStudy.Models.Customer;
import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Villa;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;

import static CaseStudy.Controllers.MainControllers.*;


public class FuncWriteFileCSV {

    //Delimiter used in CSV file
    public static final String COMMA_DELIMITER = ",";
    public static final String NEW_LINE_SEPARATOR = "\n";

    // CSV file header
    public static String FILE_HEADER = "iD, nameService, areUse, feeService, numberOfPeople, typeOfRent, poolArea, kindOfRoomVilla, decriptionVilla, numberOfFloorVilla";

    public static void writeCsvFile(String fileName, String nameObj) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileName);
            //Write the CSV file header
            fileWriter.append(FILE_HEADER.toString());
            //Add a new line separator after the header
            fileWriter.append(NEW_LINE_SEPARATOR);
            //Write a new student object list to the CSV file
            if (nameObj.equals("Villa")) {
                for (Villa villa : arrayListVilla) {
                    fileWriter.append(String.valueOf(villa.getId()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(villa.getNameServices()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(villa.getAreaUse()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(villa.getFeeRent()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(villa.getNumOfPeopleMax()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(villa.getTypeOfRent()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(villa.getPoolArea()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(villa.getKindOfRoom()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(villa.getDescription()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(villa.getNumberOfFloor()));
                    fileWriter.append(NEW_LINE_SEPARATOR);
                }
            } else if (nameObj.equals("VillaBooking")) {
                for (Villa villa : arrayListVillaBooking) {
                    fileWriter.append(String.valueOf(villa.getId()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(villa.getNameServices()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(villa.getAreaUse()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(villa.getFeeRent()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(villa.getNumOfPeopleMax()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(villa.getTypeOfRent()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(villa.getPoolArea()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(villa.getKindOfRoom()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(villa.getDescription()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(villa.getNumberOfFloor()));
                    fileWriter.append(NEW_LINE_SEPARATOR);
                }
            } else if (nameObj.equals("House")) {
                for (House house : arrayListHouse) {
                    fileWriter.append(String.valueOf(house.getId()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(house.getNameServices()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(house.getAreaUse()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(house.getFeeRent()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(house.getNumOfPeopleMax()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(house.getTypeOfRent()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(house.getKindOfRoom()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(house.getDescription()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(house.getNumberOfFloor()));
                    fileWriter.append(NEW_LINE_SEPARATOR);
                }
            } else if (nameObj.equals("Room")) {
                for (Room room : arrayListRoom) {
                    fileWriter.append(String.valueOf(room.getId()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(room.getNameServices()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(room.getAreaUse()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(room.getFeeRent()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(room.getNumOfPeopleMax()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(room.getNamePlusService()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(room.getAmountPlusService()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(room.getPricePlusService()));
                    fileWriter.append(NEW_LINE_SEPARATOR);
                }
            }else if (nameObj.equals("CustomerBooking")) {
                for (Customer customer : arrayListCustomerBooking) {
                    fileWriter.append(String.valueOf(customer.getNameCustomer()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(customer.getIdCustomer()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(customer.getBirthdayCustomer()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(customer.getGender()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(customer.getTypeCustomer()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(customer.getPhoneNumber()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(customer.getNumberIDCard()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(customer.getEmailCustomer()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(customer.getAddressCustomer()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(customer.getUseService()));
                    fileWriter.append(NEW_LINE_SEPARATOR);

                }
            }
            else if (nameObj.equals("Customer")) {
                for (Customer customer : arrayListCustomer) {
                    fileWriter.append(String.valueOf(customer.getNameCustomer()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(customer.getIdCustomer()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(customer.getBirthdayCustomer()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(customer.getGender()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(customer.getTypeCustomer()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(customer.getPhoneNumber()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(customer.getNumberIDCard()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(customer.getEmailCustomer()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(customer.getAddressCustomer()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(customer.getUseService()));
                    fileWriter.append(NEW_LINE_SEPARATOR);

                }
            }

            System.out.println("CSV file was created successfully !!!");
        } catch (
                Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }


    public static void reader(String filename, String type) throws IOException {
        BufferedReader reader = Files.newBufferedReader(Paths.get(filename));
        if (type.equals("Villa")) {
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader("iD", "nameService", "areUse", "feeService", "numberOfPeople",
                    "typeOfRent", "poolArea", "kindOfRoomVilla", "decriptionVilla", "numberOfFloorVilla").withIgnoreHeaderCase().withTrim());
            for (CSVRecord csvRecord : csvParser) {
                // Accessing Values by Column Index
                String id = csvRecord.get(0);
                String nameService = csvRecord.get(1);
                String areUse = csvRecord.get(2);
                String fee = csvRecord.get(3);
                String numberPeople = csvRecord.get(4);
                String typeOfRent = csvRecord.get(5);
                String poolArea = csvRecord.get(6);
                String kindOfRoomVilla = csvRecord.get(7);
                String decriptionVilla = csvRecord.get(8);
                String numberOfFloorVilla = csvRecord.get(9);
                //Accessing the values by column header name
                //Printing the record
                System.out.println("Villa - " + csvRecord.getRecordNumber() + " Id : " + id + " First name : " + nameService + " Are Uses : " + areUse + " Fee : " + fee +
                        " Number People Max : " + numberPeople + " Type Of Rent " + typeOfRent + " Pool Area " + poolArea + " Kind Of Room Villa " + kindOfRoomVilla + " Decription Villa " +
                        decriptionVilla + " Number Of floor villa: " + numberOfFloorVilla + "]");
            }
        } else if (type.equals("House")) {
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader("iD", "nameService", "areUse", "feeService", "numberOfPeople",
                    "typeOfRent", "kindOfRoomVilla", "decriptionVilla", "numberOfFloorVilla").withIgnoreHeaderCase().withTrim());
            for (CSVRecord csvRecord : csvParser) {
                // Accessing Values by Column Index
                String id = csvRecord.get(0);
                String nameService = csvRecord.get(1);
                String areUse = csvRecord.get(2);
                String fee = csvRecord.get(3);
                String numberPeople = csvRecord.get(4);
                String typeOfRent = csvRecord.get(5);
                String kindOfRoomVilla = csvRecord.get(6);
                String decriptionVilla = csvRecord.get(7);
                String numberOfFloorVilla = csvRecord.get(8);
                //Accessing the values by column header name
                //Printing the record
                System.out.println("[House - " + csvRecord.getRecordNumber() + " Id : " + id + " First name : " + nameService + " Are Uses : " + areUse + " Fee : " + fee +
                        " Number People Max : " + numberPeople + " Type Of Rent " + typeOfRent + " Kind Of Room House " + kindOfRoomVilla + " Decription House " +
                        decriptionVilla + " Number Of floor house: " + numberOfFloorVilla + "]");
            }
        } else if (type.equals("Room")) {
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader("iD", "nameService", "areUse", "feeService", "numberOfPeople",
                    "typeOfRent", "namePlusService", "amountPlusService", "pricePlusService ").withIgnoreHeaderCase().withTrim());
            for (CSVRecord csvRecord : csvParser) {
                // Accessing Values by Column Index
                String id = csvRecord.get(0);
                String nameService = csvRecord.get(1);
                String areUse = csvRecord.get(2);
                String fee = csvRecord.get(3);
                String numberPeople = csvRecord.get(4);
                String typeOfRent = csvRecord.get(5);
                String numberPlusService = csvRecord.get(6);
                String amountPlusService = csvRecord.get(7);
                String pricePlusService = csvRecord.get(8);
                //Accessing the values by column header name
                //Printing the record
                System.out.println("Room - " + csvRecord.getRecordNumber() + " Id : " + id + " First name : " + nameService + " Are Uses : " + areUse + " Fee : " + fee +
                        " Number People Max : " + numberPeople + " Type Of Rent " + typeOfRent + " Number Plus Service " + numberPlusService + " Amount Plus Service " +
                        amountPlusService + " Price Plus Service: " + pricePlusService + "]");
            }
        }
    }

    public static class Sort implements Comparator<Customer> {
        @Override
        public int compare(Customer customer, Customer t1) {
            if (customer.getNameCustomer().compareTo(t1.getNameCustomer()) == 0) {
                return customer.getYearBirthday() - t1.getYearBirthday();
            }
            return customer.getNameCustomer().compareTo(t1.getNameCustomer());
        }
    }
}


