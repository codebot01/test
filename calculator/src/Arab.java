public class Arab {
    public Arab(int parameter1, int parameter2, String str) {
        if (str.contains("+")) {
            System.out.println("Output: \n" + (parameter1 + parameter2));
        } else if (str.contains("-")) {
            System.out.println("Output: \n" + (parameter1 - parameter2));
        } else if (str.contains("*")) {
            System.out.println("Output: \n" + (parameter1 * parameter2));
        } else if (str.contains("/")) {
            System.out.println("Output: \n" + (parameter1 / parameter2));
        } else {
            System.out.println("Некорректный ввод.");
            return;
        }
    }
}
