class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        //Both will have the same hashMap
        //Set up 2 HashMaps, Compare the HashMaps, HMs are equal, then they are Anagrams!
        Map<Character,Integer> HS = new HashMap<>();
        Map<Character,Integer> HT = new HashMap<>();
        char[] HSA = s.toCharArray();
        char[] HTA = t.toCharArray();

        for(int i = 0; i < s.length(); i++){
            HS.put(HSA[i] , HS.getOrDefault(HSA[i],0) + 1);
            HT.put(HTA[i] , HT.getOrDefault(HTA[i],0) + 1);
        }
        return HS.equals(HT);

    }
}
