class Solution {
    public String encode(List<String> strs) {
      //First let's begin with the encoding
      //Input: ["we","say",":","yes"]
      //2#we3#say1#:3#yes
      StringBuilder sb = new StringBuilder();
      for(String str_ : strs){
        sb.append(str_.length()).append("#").append(str_);
      }
      return sb.toString();
    }
  public List<String> decode(String str) {
      List<String> returnString = new ArrayList<>();
      int i = 0;
      //Lets get the index
      while(i < str.length()){
        int poundIndex = str.indexOf("#",i); //indexOf grabs the index from that particular index!!
        int relevantNumber = Integer.parseInt(str.substring(i , poundIndex));
        //Add the word to the returnString
        String wordToAdd = str.substring(poundIndex + 1 , poundIndex + relevantNumber + 1);
        returnString.add(wordToAdd);
        i = relevantNumber + 1 + poundIndex; 
      }
      return returnString;
  }
}
