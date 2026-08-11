class Solution {
    public String encode(List<String> strs) {
        // Input :  ["hello","this","is","a","string"]
        // Idea: 4#hello4#this2#is1#a6#String
        StringBuilder sb = new StringBuilder();
        for(String str: strs){ //.append("delimiter)
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        //Start with the decoding
        //Idea is regarding substring logic and alldat
        List<String> returnList = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;
            while (str.charAt(j) != '#'){
                j++;
            }
            // Idea: 4#hello4#this2#is1#a6#String
            int length = Integer.parseInt(str.substring(i,j));
            i = j + 1;
            j = i + length;
            returnList.add(str.substring(i,j));
            i = j;
        }
        return returnList;

    }


}
