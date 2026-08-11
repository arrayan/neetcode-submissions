class Solution {
    public boolean isAnagram(String s, String t){
        //"racecar","carrace is an anagram for e.g." length should be the same
        // racecarcarrace
        if(s.length()!=t.length()){
            return false;
        }
        //Use a stringBuilder and do String.reverse?
        //TwoHashTables and check for frequency?
        Map<Character,Integer> MapStringS = new HashMap<>();
        Map<Character,Integer> MapStringT = new HashMap<>();
        //.getOrDefault()
        for(char c: s.toCharArray()){ //default value will be 0 since the HashMaps were empty before!
            MapStringS.put(c, MapStringS.getOrDefault(c,0)+1);

        }
        //Map<Character,Integer> MapStringT = new HashMap<>();
        for(char c : t.toCharArray()){
            MapStringT.put(c, MapStringT.getOrDefault(c , 0)+1);
        }
        //What we have now are TwoHash maps, now we need to check if the TwoHashMaps are equal, as in same keys, as well as same value for the keys?
        //we can also do boolean areEqual = map1.size() == map2.size() && map1.entrySet().equals(map2.entrySet());
        //entryset checks for k-v pairs!
        if (MapStringS.equals(MapStringT)){
            return true;
        }
        return false;
    }
}
