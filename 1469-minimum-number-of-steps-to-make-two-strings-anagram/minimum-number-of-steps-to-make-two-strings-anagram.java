class Solution {
    public int minSteps(String s, String t) {
        int[] charCount = new int[26];

        for(char c : s.toCharArray()){
            charCount[c-'a']++;
        }
        for(char c : t.toCharArray()){
            charCount[c-'a']--;
        }
        int steps = 0;
        for(int count : charCount){
            steps += Math.abs(count);
        }
        return steps/2;
    }
}