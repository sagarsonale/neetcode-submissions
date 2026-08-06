class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder cl = new StringBuilder();
        for(char c  : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                cl.append(Character.toLowerCase(c));

            }

        }

        String fl = cl.toString();
        String r = new StringBuilder(fl).reverse().toString();
        return fl.equals(r);
    }
}
