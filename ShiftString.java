public class ShiftString {
    public static void main(String[] args) {
        String input = "Jevanantham";
        int n = 10;
        String shiftedString = shiftCharacters(input, n);
        System.out.println(shiftedString);
    }

    public static String shiftCharacters(String input, int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char originalChar = input.charAt(i);
            char shiftedChar = (char) (originalChar + n);

            if (originalChar >= 'a' && originalChar <= 'z') {
                if (shiftedChar > 'z') {
                    shiftedChar = (char) (shiftedChar - 26);
                }
            } else if (originalChar >= 'A' && originalChar <= 'Z') {
                if (shiftedChar > 'Z') {
                    shiftedChar = (char) (shiftedChar - 26);
                }
            }

            result.append(shiftedChar);
        }

        return result.toString();
    }
}
