class Solution {
    //TwoPointerApproach
    public boolean isPalindrome(String s){
        //We need two pointers, a left pointer and a right pointer
        int l = 0, r = s.length()-1;
        while(l<r){
            while(l<r && !isAlphaNumeric(s.charAt(l))){
                l++;
            }
            while(l<r && !isAlphaNumeric(s.charAt(r))){
                r--;
            }
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    
    private boolean isAlphaNumeric(char c){
        return (c >= 'A' && c<='Z')||
                (c >= 'a' && c<='z')||
                (c >= '0' && c<='9');
    }
}
