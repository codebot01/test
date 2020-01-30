import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Entry {
    public static void main(String[] args) throws IOException {

        System.out.println("Input: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        String[] arrayFromStr = str.split(" ");

        String sFirstNumber = arrayFromStr[0];
        String sSecondNumber = arrayFromStr[2];

        String[] arabArray = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] romArray = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        int index = Arrays.asList(arabArray).indexOf(sFirstNumber);
        int index1 = Arrays.asList(arabArray).indexOf(sSecondNumber);
        int index2 = Arrays.asList(romArray).indexOf(sFirstNumber);
        int index3 = Arrays.asList(romArray).indexOf(sSecondNumber);

        if (index >= 0 && index1 >= 0) {
            int parameter1 = Integer.parseInt(sFirstNumber);
            int parameter2 = Integer.parseInt(sSecondNumber);
            Arab arab = new Arab(parameter1, parameter2, str);
        } else if (index2 >= 0 && index3 >= 0) {
            Rome rome = new Rome(sFirstNumber, sSecondNumber, str);
        } else {
            System.out.println("Некорректный ввод.");
        }
    }
}

//class Arab1 {
//
//    public Arab1(int parameter1, int parameter2, String str) {
//        if (str.contains("+")) {
//            System.out.println("Output: \n" + (parameter1 + parameter2));
//        } else if (str.contains("-")) {
//            System.out.println("Output: \n" + (parameter1 - parameter2));
//        } else if (str.contains("*")) {
//            System.out.println("Output: \n" + (parameter1 * parameter2));
//        } else if (str.contains("/")) {
//            System.out.println("Output: \n" + (parameter1 / parameter2));
//        } else {
//            System.out.println("Некорректный ввод.");
//            return;
//        }
//    }
//}

//class Rome {
//
//    public Rome(String sFirstNumber, String sSecondNumber, String str) {
//
//        int number1 = 0;
//        int number2 = 0;
//        int result = 0;
//
//        HashMap<Integer, String> numbers = new HashMap<>();
//        numbers.put(1, "I");
//        numbers.put(2, "II");
//        numbers.put(3, "III");
//        numbers.put(4, "IV");
//        numbers.put(5, "V");
//        numbers.put(6, "VI");
//        numbers.put(7, "VII");
//        numbers.put(8, "VIII");
//        numbers.put(9, "IX");
//        numbers.put(10, "X");
//        numbers.put(40, "XL");
//        numbers.put(50, "L");
//        numbers.put(100, "C");
//        numbers.put(400, "CD");
//        numbers.put(500, "D");
//        numbers.put(900, "CM");
//        numbers.put(1000, "M");
//
//        for(Map.Entry<Integer, String> entry : numbers.entrySet()) {
//            if(entry.getValue().equals(sFirstNumber)) {
//                number1 = entry.getKey();
//            }
//            if(entry.getValue().equals(sSecondNumber)) {
//                number2 = entry.getKey();
//            }
//        }
//
//        if (str.contains("+")) {
//            reverse(number1 + number2);
//        } else if (str.contains("-")) {
//            reverse(number1 - number2);
//        } else if (str.contains("*")) {
//            reverse(number1 * number2);
//        } else if (str.contains("/")) {
//            reverse(number1 / number2);
//        } else {
//            System.out.println("Некорректный ввод.");
//            return;
//        }
//    }
//
//    public static void reverse(int num) {
//
//        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
//        String[] romeNumbers = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
//
//        StringBuilder rome = new StringBuilder();
//
//        for(int i=0;i<values.length;i++) {
//            while(num >= values[i]) {
//                num -= values[i];
//                rome.append(romeNumbers[i]);
//            }
//        }
//        System.out.println("Output: \n" + rome.toString());
//    }
//}