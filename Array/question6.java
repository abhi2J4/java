// Q6. Check Whether Two Strings Are Anagrams Using Character Frequencies
// Question: Two strings are anagrams if they contain the same characters with the same frequencies, but the characters can be in a different order.

// Example:
// - String 1: "listen"
// - String 2: "silent"
// - Output: The strings are anagrams.



class question6 {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        int[] freq = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }

        boolean isAnagram = true;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}

