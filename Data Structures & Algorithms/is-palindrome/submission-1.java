class Solution {
    public boolean isPalindrome(String s) {
        String g = s.toLowerCase();
        int left = 0;
        int right = s.length()-1;
        while(left < right){
              if (!Character.isLetterOrDigit(g.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(g.charAt(right))) {
                right--;
            } else {
                if (g.charAt(left) != g.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}
