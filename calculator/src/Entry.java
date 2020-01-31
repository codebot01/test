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
