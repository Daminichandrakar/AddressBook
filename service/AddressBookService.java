package service;

import java.util.ArrayList;
import java.util.Scanner;

import model.AddressBookModel;

public class AddressBookService implements IAddressBook {

	ArrayList<AddressBookModel> addressBookModels = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);

	@Override
	public void addPerson() {
		System.out.println("Enter Your First Name");
		String firstName = scanner.next();
		System.out.println("Enter Your Last Name");
		String lastName = scanner.next();
		System.out.println("Enter Your address");
		String address = scanner.next();
		System.out.println("Enter Your city Name");
		String city = scanner.next();
		System.out.println("Enter Your state Name");
		String state = scanner.next();
		System.out.println("Enter Your phone Number");
		int phNo = scanner.nextInt();
		System.out.println("Enter Your zip");
		int zip = scanner.nextInt();
		System.out.println("Enter Your email");
		String email = scanner.next();

		AddressBookModel addressBookModel = new AddressBookModel(firstName, lastName, phNo, email, address, state, city,
				zip);
		addressBookModels.add(addressBookModel);
		System.out.println("Person Added Successfully" + addressBookModels);

	}
}
