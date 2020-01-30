import java.util.HashMap;
import java.util.Map;

public class Rome {

        public Rome(String sFirstNumber, String sSecondNumber, String str) {

            int number1 = 0;
            int number2 = 0;

            HashMap<Integer, String> numbers = new HashMap<>();
            numbers.put(1, "I");
            numbers.put(2, "II");
            numbers.put(3, "III");
            numbers.put(4, "IV");
            numbers.put(5, "V");
            numbers.put(6, "VI");
            numbers.put(7, "VII");
            numbers.put(8, "VIII");
            numbers.put(9, "IX");
            numbers.put(10, "X");

            for(Map.Entry<Integer, String> entry : numbers.entrySet()) {
                if(entry.getValue().equals(sFirstNumber)) {
                    number1 = entry.getKey();
                }
                if(entry.getValue().equals(sSecondNumber)) {
                    number2 = entry.getKey();
                }
            }

            if (str.contains("+")) {
                reverse(number1 + number2);
            } else if (str.contains("-")) {
                reverse(number1 - number2);
            } else if (str.contains("*")) {
                reverse(number1 * number2);
            } else if (str.contains("/")) {
                reverse(number1 / number2);
            } else {
                System.out.println("Некорректный ввод.");
                return;
            }
        }

        public static void reverse(int num) {

            int[] arab = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
            String[] romeNumbers = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

            StringBuilder rome = new StringBuilder();

            for(int i=0; i < arab.length; i++) {
                while(num >= arab[i]) {
                    num = num - arab[i];
                    rome.append(romeNumbers[i]);
                }
            }

            System.out.println("Output: \n" + rome.toString());
        }
}
