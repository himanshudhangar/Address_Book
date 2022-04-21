package practice;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MainAddress {
	  static Scanner scan = new Scanner(System.in);

	    public static void main(String[] args) {
	        System.out.println("Welcome to Address Book System");
	        Map<String, MainAddress> map = new HashMap<>();
	        System.out.println("Enter Number of address book you want to add");
	        Integer count = scan.nextInt();
	        Integer i = 0;
	        while (i < count) {
	            System.out.println("Enter  book name");
	            String bookName = scan.next();
	            MainAddress addressBook = new MainAddress();
	            addressBook.toString();
	            map.put(bookName, addressBook);
	            i++;
	        }
	        System.out.println(map);


	    }

	}