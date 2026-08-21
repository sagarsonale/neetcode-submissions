class Solution {
    public int scoreOfString(String s) {
        int score =0;
        int left =0;
        int right = 1;
        while(left < s.length()-1){
           score +=  Math.abs(s.charAt(left) - s.charAt(right));
           left++;
           right++;
        }
        return score;
    }
}