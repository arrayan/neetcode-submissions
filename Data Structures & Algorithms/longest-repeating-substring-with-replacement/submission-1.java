class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int MaxFrequency = 0;
        int MaxVal = 0;
        Map<Character,Integer> map_ = new HashMap<>();
        for(int r = 0; r < s.length() ; r++){
            //Check if window is invalid
            char rightChar = s.charAt(r);
            char leftChar = s.charAt(l);
            map_.put(rightChar, map_.getOrDefault(rightChar,0) + 1);
            MaxFrequency = Math.max(MaxFrequency , map_.get(rightChar));
            if ((r - l) + 1 - MaxFrequency > k){ //should it be if or while//
                map_.put(leftChar, map_.get(leftChar) - 1);
                l++;
            }
            if (map_.get(leftChar) == 0){
                map_.remove(leftChar);
            }
            //l++; means you are growing at 1 constantly. Not what is needed!
            MaxVal = Math.max(r-l+1 , MaxVal);
        }
        return MaxVal;
    }
}
