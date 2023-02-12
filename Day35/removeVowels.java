package Day35;

public class removeVowels {

    public static void main(String[] args) {

        String s = "prepinsta abc love";
        String s1 = "";
        s1 = s.replaceAll("[aeiou]", "");
        System.out.println("String after removing vowel : " + s1);
    }

}
