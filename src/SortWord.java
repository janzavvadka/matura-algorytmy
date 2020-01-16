import java.util.Arrays;

public class SortWord {

    public static void main(String[] args) {
        String result = sortAlphabetical("cab");
        System.out.println(result);
    }

    public static String sortAlphabetical(String text) {
        char[] charArray = text.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (Character.toLowerCase(charArray[j]) < Character.toLowerCase(charArray[i])) {
                    swapChars(i, j, charArray);
                }
            }
        }
        return new String(charArray);
    }

    private static void swapChars(int i, int j, char[] charArray) {
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }

}
