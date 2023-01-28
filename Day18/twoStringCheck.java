package Day18;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int c = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i)) != -1)
                c++;
        }
        return c;

        int count = 0;
        int[] small = new int[26];
        int[] cap = new int[26];

        // mark jewels char to 1
        for (int i = 0; i < jewels.length(); i++) {
            char c = jewels.charAt(i);
            if (c >= 'a' && c <= 'z') {
                small[c - 'a'] = 1;
            } else {
                cap[c - 'A'] = 1;
            }
        }

        for (int i = 0; i < stones.length(); i++) {
            char c = stones.charAt(i);
            if (c >= 'a' && c <= 'z') {
                if (small[c - 'a'] == 1)
                    count++;
            } else {
                if (cap[c - 'A'] == 1)
                    count++;
            }
        }
        return count;
    }
}
