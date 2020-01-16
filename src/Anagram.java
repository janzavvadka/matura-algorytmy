public class Anagram {

    public static void main(String[] args) {
        boolean result = isAnagram("1abd", "2bda");
        System.out.println(result);
    }

    private static boolean isAnagram(String word1, String word2) {
        if(word1.length() != word2.length()) {
            return false;
        }
        if(!SortWord.sortAlphabetical(word1).equals(SortWord.sortAlphabetical(word2))) {
            return false;
        }
        return true;
    }

}
