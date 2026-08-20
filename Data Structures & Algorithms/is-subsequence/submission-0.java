class Solution {
    public boolean isSubsequence(String s, String t) {
        int left = 0;
        int right = 0;
        int sn = s.length();
        int tn = t.length();
        int a=0;
        while(left < sn && right < tn){
            if(s.charAt(left) == t.charAt(right)){
                left++;
                right++;
                a++;
            } else{
                right++;
            }
        }
        if(a == s.length()){
            return true;
        }else{
            return false;
        }
    }
}