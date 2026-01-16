class Solution {
    public List<Integer> findAnagrams(String s, String p) {
         List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) return result;

        int[] freqP = new int[26];
        int[] freqWindow = new int[26];

        // Build frequency of p
        for (char c : p.toCharArray()) {
            freqP[c - 'a']++;
        }

        int k = p.length();

        // Build first window
        for (int i = 0; i < k; i++) {
            freqWindow[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(freqP, freqWindow)) {
            result.add(0);
        }

        // Slide the window
        for (int i = k; i < s.length(); i++) {
            // add new character
            freqWindow[s.charAt(i) - 'a']++;

            // remove old character
            freqWindow[s.charAt(i - k) - 'a']--;

            if (Arrays.equals(freqP, freqWindow)) {
                result.add(i - k + 1);
            }
        }

        return result;
    }
}