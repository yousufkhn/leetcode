class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        s=s.trim();
        int length = s.length();

        while (length > 0 && s.charAt(--length)!=' '){
            count++;
        }
        return count;
    }
}