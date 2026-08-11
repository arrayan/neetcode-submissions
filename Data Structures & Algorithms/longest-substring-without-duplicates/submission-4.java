class Solution {
    public int lengthOfLongestSubstring(String s) {
        //s = "zxyzxyz": 
        //we will be having a variable window
        // And also use a HashSet
        // lp=0; rp=0;
        // if element exsists in this particular window, window is invalid. So we need to update our pointer
        // (r - l + 1)
        // [zxy zxy z] -> [x,y,z] //Remove x which is at the leftPointer. 
        //  Keep checking if element at the rightPointer exists at LP. If so:
        // If it exists; remove the element at the LP
        // If not; Remove the element at the RightPointer
        Set<Character> hset = new HashSet<>();
        int l = 0;
        int MaxVal = 0;
        for(int r = 0; r < s.length(); r++){
            while(hset.contains(s.charAt(r))){
                hset.remove(s.charAt(l));
                //we also need to do pointer reset.
                //
                l++;
            }
            hset.add(s.charAt(r));
            MaxVal = Math.max(MaxVal , r - l + 1);
        }
        return MaxVal;
    }
}
