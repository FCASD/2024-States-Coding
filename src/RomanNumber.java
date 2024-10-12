public class RomanNumber {

    /**
     * MAIN FUNCTION TO BE RUN
     * Roman Numeral encoder takes an integer (from 1 to 3999 inclusive) and coverts to roman numerals
     * @param num integer from 1 to 3999 inclusive
     * @return String roman numeral
     */
    public static String romanNumeralEncoder(int num) {
        String output = "";
        int digitValue = 1;
        while (num > 0) {
            int digit = num % 10;
            if (digit == 0) {

            }
            else if (digitValue == 1) {
                if (digit <= 3) {
                    for (int i = 0; i < digit; i++) {
                        output += "I";
                    }
                }
                else if (digit == 4) {
                    output += "IV";
                }
                else if (digit <= 8) {
                    output += "V";
                    for (int i = 0; i < digit-5; i++) {
                        output += "I";
                    }
                }
                else if (digit == 9) {
                    output += "IX";
                }
            }
            else if (digitValue == 10) {
                if (digit <= 3) {
                    for (int i = 0; i < digit; i++) {
                        output = "X" + output;
                    }
                }
                else if (digit == 4) {
                    output = "XL" + output;
                }
                else if (digit <= 8) {
                    output = "L" + output;
                    for (int i = 0; i < digit-5; i++) {
                        output = "X" + output;
                    }
                }
                else if (digit == 9) {
                    output = "XC" + output;
                }
            }
            else if (digitValue == 100) {
                if (digit <= 3) {
                    for (int i = 0; i < digit; i++) {
                        output = "C" + output;
                    }
                }
                else if (digit == 4) {
                    output = "CD" + output;
                }
                else if (digit <= 8) {
                    output = "D" + output;
                    for (int i = 0; i < digit-5; i++) {
                        output = "C" + output;
                    }
                }
                else if (digit == 9) {
                    output = "CM" + output;
                }
            }
            else if (digitValue == 1000) {
                for (int i = 0; i < digit; i++) {
                    output = "M" + output;
                }
            }
            num /= 10;
            digitValue *= 10;
        }
        return output;
    }
}
