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

	@Override
	public void editPersonDetails() {
		int choice = 1;
		final int exit = 7;
		boolean flag = false;
		System.out.println("enter person first name you want to edit");
		String firstName = scanner.next();
		while (choice != exit) {
			for (AddressBookModel addressBookModel : addressBookModels) {
				if (addressBookModel.getFirstName().equals(firstName)) {
					flag = true;
					System.out.println("Hi  " + addressBookModel.getFirstName());
					System.out.println("which field you want to edit\n1. Address\n2. City\n3. State\n4. Zipcode\n"
							+ "5. Phone Number\n6. Email\n7. Exit");
					choice = scanner.nextInt();
					switch (choice) {
					case 1:
						System.out.println("Please edit your address");
						String address = scanner.nextLine();
						scanner.next();
						addressBookModel.setAddress(address);
						break;
					case 2:
						System.out.println("Please edit your city");
						String city = scanner.next();
						addressBookModel.setCity(city);
						break;
					case 3:
						System.out.println("Please edit your state");
						String state = scanner.next();
						addressBookModel.setState(state);
						break;
					case 4:
						System.out.println("Please edit your zip");
						int zip = scanner.nextInt();
						addressBookModel.setZip(zip);
						break;
					case 5:
						System.out.println("Please edit your phone number");
						int phone = scanner.nextInt();
						addressBookModel.setPhoneNo(phone);
						break;
					case 6:
						System.out.println("Please edit your email address");
						String email = scanner.next();
						addressBookModel.setEmail(email);
						break;
					}
				}
			}
			if (flag == false) {
				System.out.println("person didn't found");
				break;
			} else {
				System.out.println("your contact details have been successfully updated");
			}
		}

	}
}
