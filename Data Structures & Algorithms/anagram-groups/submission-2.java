class Solution {
    public List<List<String>> groupAnagrams(String strs[]){
        Map<String, List<String>> myMap = new HashMap<>();
        for(String s:strs){
            char[] tempCharArray = s.toCharArray();
            Arrays.sort(tempCharArray);
            String tempString = new String(tempCharArray);
            //We now have a String to use as a key
            myMap.putIfAbsent(tempString, new ArrayList<String>());
            myMap.get(tempString).add(s);
        }
        return new ArrayList<>(myMap.values());
    }
}
