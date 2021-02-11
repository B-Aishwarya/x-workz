package com.xworkz.freedomFighters;
import java.util.Optional;

public class OptionalTester {
	public static void main(String[] args) {
		String email = "aishwarya77.xworkz@gmail.com";
		System.out.println("Before toUpperCase() " + email);
		if (email != null) {
			System.out.println("After toUpperCase() " + email.toUpperCase());
		}
		Optional<String> optional = Optional.of("");
		System.out.println(optional.isPresent());
		if (optional.isPresent()) {
			System.out.println(optional.get());

		}
		Optional<Integer> yearsOptional = Optional.empty();
		System.out.println(yearsOptional.isPresent());
		yearsOptional.ifPresent((v) -> System.out.println(v));

		Optional<String> nullable = Optional.ofNullable("vishalaxi");// it will not give null pointer excp.
		nullable.ifPresent(e -> {
			String value = nullable.map(String::toUpperCase).get();
			System.out.println(value);
		});

		String deftValue = nullable.orElse("vena");
		System.out.println(deftValue);

	}

}
