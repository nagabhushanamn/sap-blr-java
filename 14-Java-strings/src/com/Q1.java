package com;

public class Q1 {

	public static void main(String[] args) {

		String input = "233-33-1231";

		// String pattern = "\\d{3}-\\d{2}-\\d{4}";
		// boolean isValid = input.matches(pattern);

		// or

		boolean isValid = true;
		int len = input.length();
		if (len == 11) {
			for (int i = 0; i < len; i++) {
				char c = input.charAt(i);
				if (i == 3 || i == 6) {
					if (c != '-') {
						isValid = false;
						break;
					}
				} else {
					if (!Character.isDigit(c)) {
						isValid = false;
						break;
					}
				}
			}
		} else {
			isValid = false;
		}
		if (isValid) {
			System.out.println("valid");
		} else {
			System.out.println("invalid");
		}

	}

}
