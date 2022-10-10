package com.bridgelabz;

import com.google.gson.Gson;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class OpenCSVWriter {
    private static final String ADDRESS_BOOK_CSV_FILE = "Z:\\LFP_Java fellowship - 187\\Address-book-system\\address-book-CSV.csv";
    private static final String ADDRESS_BOOK_GSON_FILE ="address_book.json";
    public static void main(String[] args) throws CsvException, IOException {
        writeCsvFile();
        readCsvFile();
        writeTheGsonFile();
    }

    private static void readCsvFile() throws IOException, CsvException {
        Reader reader = Files.newBufferedReader(Paths.get(ADDRESS_BOOK_CSV_FILE));
        CSVReader csvReader = new CSVReader(reader);
        List<String[]> csvUser = csvReader.readAll();
        for (String[] contact : csvUser) {
            System.out.println("First Name : " + contact[0]);
            System.out.println("Last Name : " + contact[1]);
            System.out.println("Address : " + contact[2]);
            System.out.println("City : " + contact[3]);
            System.out.println("State : " + contact[4]);
            System.out.println("Zip : " + contact[5]);
            System.out.println("Phone Number : " + contact[6]);
            System.out.println("Email id " + contact[7]);
            System.out.println("******************************");
            System.out.println("******************************");
        }
    }

    public static void writeCsvFile() throws FileNotFoundException {
        List<Contacts> contactList = new ArrayList<>();
        contactList.add(new Contacts("Swapnil", "patil", "new panvel", "panvel", "MH", "swapnil@gmail.com", "215252", "9989898978"));
        contactList.add(new Contacts("shubham", "patil", "panvel", "panvel", "MH", "shubham@gmail.com", "121521", "9989898989"));

        File csvFile = new File(ADDRESS_BOOK_CSV_FILE);
        PrintWriter writer2 = new PrintWriter(csvFile);
        for (Contacts contact:contactList) {
            writer2.println(contact);
        }
        writer2.close();
    }
    public static void writeTheGsonFile() throws IOException, CsvException {
        Reader reader = Files.newBufferedReader(Paths.get(ADDRESS_BOOK_CSV_FILE));
        CSVReader csvReader = new CSVReader(reader);
        List<String[]> csvUser = csvReader.readAll();
        Gson gson = new Gson();
        String json = gson.toJson(csvUser);
        FileWriter writer = new FileWriter(ADDRESS_BOOK_GSON_FILE);
        writer.write(json);
        writer.close();
    }
}