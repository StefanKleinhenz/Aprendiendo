package MapFlapMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlapMapvsMap {

	public static void main(String[] args) {
		Customer c1 = new Customer(101, "john", "john@gmail.com", Arrays.asList("397937955", "21654725"));
		Customer c2 = new Customer(102, "smith", "smith@gmail.com", Arrays.asList("89563865", "2487238947"));
		Customer c3 = new Customer(103, "peter", "peter@gmail.com", Arrays.asList("38946328654", "3286487236"));
		Customer c4 = new Customer(104, "kely", "kely@gmail.com", Arrays.asList("389246829364", "948609467"));

		List<Customer> customers = List.of(c1, c2, c3, c4);

		// List<Customer> convert List<String> -> Data Transformation
		// mapping:customer -> customer.getEmail()
		// customer -> customer.getEmail() one to one mapping

		List<String> emails = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
		emails.forEach(System.out::println);
		System.out.println();

		// //customer -> customer.getPhoneNumbers () ->> one to many mapping

		List<List<String>> phoneNumbers = customers.stream().map(customer -> customer.getPhoneNumbers())
				.collect(Collectors.toList());
		phoneNumbers.forEach(System.out::println);

		System.out.println();

		List<String> phones = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream())
				.collect(Collectors.toList());
		phones.forEach(System.out::println);
	}

}