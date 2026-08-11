class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //We have an array of strings.
        //What defines an anagram
        //Same count of characters and frequencies.
        //has to be same length too
        Map<String, List<String>> myHashMap = new HashMap<>();
        List<List<String>> returnList = new ArrayList<>();
        //What list operations are relevant here? List.append would be one of those.
        //How about we make frequency maps for each and every word and group them together.
        for(String s: strs){
            //temp conversion to a char array
            char[] tempCharArray = s.toCharArray();
            Arrays.sort(tempCharArray);
            String stringifiedWord = new String(tempCharArray);
            myHashMap.putIfAbsent(stringifiedWord , new ArrayList<String>());
            myHashMap.get(stringifiedWord).add(s);
        }
        return new ArrayList<>(myHashMap.values());
        
    }
}
