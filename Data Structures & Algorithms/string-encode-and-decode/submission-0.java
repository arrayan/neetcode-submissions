public class Solution {
    public String encode(List<String> strs){
        //Delimiter Issue needs to be resolved
        StringBuilder sb = new StringBuilder();
        for(String currString: strs){
            //Keeping a track of the sizes
            //we will add it to some Data Strucuture
            sb.append(currString.length()).append(',');
        }
        //NeedSomething to Specify the following needs: 1. Seperate numbers from the string, 2.Can be converted to a String Relatively Easily
        //Now we have to add a delimiter and then attach our String to the end.
        sb.append('#');

        //Now lets just add the String to the SB
        for(String curString:strs){
            sb.append(curString);
        }
        return sb.toString();
    }

    public List<String> decode(String str){
        //For. e.g. for ["neet","code","loves","you"] -> we now have 4,4,4,4,#neetcodelovesyou
        //Go over the string
        //Ultimately we reach the index where afterwards we have the string, we then form substrings.
        List<String> aList = new ArrayList<>();
        List<Integer> sizeTrack = new ArrayList<>();
        //We need a good tracking of Index so a while loop will be better
        int TrackingIndex =  0;
        while(str.charAt(TrackingIndex) != '#'){
            StringBuilder cur = new StringBuilder();
            while(str.charAt(TrackingIndex) != ','){
                cur.append(str.charAt(TrackingIndex));
                TrackingIndex++;
            }
            sizeTrack.add(Integer.parseInt(cur.toString()));
            TrackingIndex++;
        }
        TrackingIndex++;
        for(int size: sizeTrack){
            aList.add(str.substring(TrackingIndex,TrackingIndex+size));
            TrackingIndex+=size;
        }
        return aList;


    }
}