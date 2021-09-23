package controller;

import java.util.Scanner;

import model.AddressBookModel;
import service.AddressBookService;
import service.IAddressBook;

public class AddressBookController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		IAddressBook addressBook = new AddressBookService();
		
		final int EXIT_VALUE = 4;
		int choice = 0;
		while (choice != EXIT_VALUE) {
			System.out.println("1.Add Person\n2.Edit Person\n3.Delete Person\n" + EXIT_VALUE + ".Exit");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				addressBook.addPerson();
				break;
			case 2:
				addressBook.editPersonDetails();
				break;
			case 3:
				addressBook.deletePerson();
				break;
			default:
				break;
			}
		}

	}
}
