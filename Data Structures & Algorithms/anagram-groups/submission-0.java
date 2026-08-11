class Solution{
    public List<List<String>> groupAnagrams(String[] strs){
        //First let's sort the strings, naive approach and create a HashMap with sorted chars as the key and then add elements with some jumbled letters
        Map<String,List<String>> MyMap = new HashMap<>();
        for(String s:strs){
            char[] currChar = s.toCharArray();
            Arrays.sort(currChar);
            String sortedStringTemp = new String(currChar);
            MyMap.putIfAbsent(sortedStringTemp, new ArrayList<>());
            MyMap.get(sortedStringTemp).add(s);
        }
        return new ArrayList<>(MyMap.values());
    }
}
