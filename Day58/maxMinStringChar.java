package Day58;

public class maxMinStringChar {
    public static void main(String[] args) {
        String str = "nilanjana";
        char[] chararray = new char[str.length()];
        chararray = str.toCharArray();
        int[] frequency = new int[str.length()];
        int min, max;
        char minChar = chararray[0];
        char maxChar = chararray[0];
        for (int i = 0; i < str.length(); i++) {
            frequency[i] = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (chararray[i] == chararray[j] && chararray[i] != ' ' && chararray[i] != 0) {
                    frequency[i]++;
                    chararray[j]++;
                }
            }
        }
        min = max = frequency[0];
        for (int i = 0; i < frequency.length; i++) {
            if (min > frequency[i] && frequency[i] != '0') {
                min = frequency[i];
                minChar = chararray[i];
            }
            if (max < frequency[i]) {
                max = frequency[i];
                maxChar = chararray[i];
            }
        }
        System.out.println(minChar + " " + min);
        System.out.println(maxChar + " " + max);
    }
}
