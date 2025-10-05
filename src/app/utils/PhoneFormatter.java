package app.utils;

public class PhoneFormatter {

    public static String formatPhone(String input) {

        String digits = cleanPhone(input);

        if (validatePhone(digits)) {
            throw new IllegalArgumentException(
                    String.format("Невірний номер: має бути рівно 10 цифр, а зараз %d: %s", digits.length(), digits)
            );
        }

        return formatPhoneNumber(digits);
    }

    private static String cleanPhone(String phone) {
        return phone.replaceAll("\\D", "");
    }

    private static boolean validatePhone(String phone) {
        return phone.length() != 10;
    }

    private static String formatPhoneNumber(String input) {
        return String.format("%s %s-%s",
                input.substring(0, 3),
                input.substring(3, 6),
                input.substring(6));
    }
}
