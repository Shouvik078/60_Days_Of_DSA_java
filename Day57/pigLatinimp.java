package Day57;

public class pigLatinimp {
    static boolean isVowel(char ch) {
        return (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o'
                || ch == 'U' || ch == 'u');
    }

    // method that converts a word or string into Pig Latin
    static String pigLatinWord(String string) {
        // the index of the first vowel is stored
        int stringlength = string.length();
        int index = -1;
        for (int i = 0; i < stringlength; i++) {
            if (isVowel(string.charAt(i))) {
                index = i;
                break;
            }
        }
        // Pig Latin is possible only if vowels is present
        if (index == -1)
            return "-1";
        // Take all characters after index (including index). Append all characters
        // which are before index. Finally append "ay"
        return string.substring(index) + string.substring(0, index) + "ay";
    }

    // Driver code
    public static void main(String args[]) {
        String plstring1 = pigLatinWord("butter"); // begin with consonant
        String plstring2 = pigLatinWord("apple"); // begin with vowel
        String plstring3 = pigLatinWord("me"); // begin with consonant
        String plstring4 = pigLatinWord("child"); // consonant cluster word
        String plstring5 = pigLatinWord("egg"); // begin with vowel
        String plstring6 = pigLatinWord("store"); // consonant cluster word
        String plstring7 = pigLatinWord("eunoia"); // contains all vowels
        String plstring8 = pigLatinWord("nymphly"); // contains no vowel
        if (plstring1 == "-1")
            System.out.println("Pig Latin is not possible, the string must have at least a vowel.");
        else
            System.out.println(plstring1);
        System.out.println(plstring2);
        System.out.println(plstring3);
        System.out.println(plstring4);
        System.out.println(plstring5);
        System.out.println(plstring6);
        System.out.println(plstring7);
        System.out.println(plstring8);
    }
}
