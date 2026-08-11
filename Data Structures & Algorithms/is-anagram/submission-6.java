class Solution {
    public boolean isAnagram(String s, String t) {
        //Core idea is to create two HashMaps with frequency count.
        //Map is supposed to be like: Key-> Count.
        Map<Character,Integer> sMap = new HashMap<>();
        Map<Character,Integer> tMap = new HashMap<>();
        //Anagram is just stuff with same frequency of each letter.
        //Populate the 2 Hash-Maps.
        for(int c = 0; c < s.length(); c++ ){ //j,a,r
            sMap.put(s.charAt(c) , sMap.getOrDefault(s.charAt(c),0) + 1);
        }

        for(int d = 0; d < t.length(); d++ ){
            tMap.put(t.charAt(d) , tMap.getOrDefault(t.charAt(d),0) + 1);
        }
        return sMap.equals(tMap);
    }
}
