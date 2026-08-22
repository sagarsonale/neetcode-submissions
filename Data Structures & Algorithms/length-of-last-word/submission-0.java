class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        String lw = words[words.length-1];
        int size = lw.length();
        return size;
    }
}