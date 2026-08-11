class Solution {
    public boolean isAnagram(String s, String t) {
        //Build a frequency map
        // character, Count -> 
        if (s.length() != t.length()){
            return false;
        }

        Map<Character,Integer> SFrequencyMap = new HashMap<>();
        Map<Character,Integer> TFrequencyMap = new HashMap<>();

        //Populate them with.
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();

        for(char c : sCharArray){
                SFrequencyMap.put( c , SFrequencyMap.getOrDefault( c , 0) + 1 );
            }
        for(char c : tCharArray){
                TFrequencyMap.put( c , TFrequencyMap.getOrDefault( c , 0) + 1 );
            }
        
        return SFrequencyMap.equals(TFrequencyMap);

    }
}
