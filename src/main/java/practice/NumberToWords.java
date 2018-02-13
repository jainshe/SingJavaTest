package practice;

/**
 * @author shefali.jain
 */
public class NumberToWords {
    public static void main(String[] args) {
        System.out.println(numberToWords(43883339));
    }

    public static String numberToWords(long number) {
        if (number == 0) {
            return "zero";
        }
        if (number < 0) {
            return "minus " + numberToWords(Math.abs(number));
        }
        String words = "";
        if ((number / 10000000) > 0) {
            words += numberToWords(number / 10000000) + " Crore ";
            number %= 10000000;
        }
        if ((number / 100000) > 0) {
            words += numberToWords(number / 100000) + " Lakh ";
            number %= 100000;
        }
        if ((number / 1000) > 0) {
            words += numberToWords(number / 1000) + " Thousand ";
            number %= 1000;
        }
        if ((number / 100) > 0) {
            words += numberToWords(number / 100) + " Hundred ";
            number %= 100;
        }
        if (number > 0) {
            if (!words.equals("")) {
                words += "and ";
            }
            if (number < 20) {
                words += number;
            } else {
                words += (number);
                if ((number % 10) > 0) {
                    words += "-" + (number % 10);
                }
            }
        }
        return words;
    }
}
