class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //Conditions: index1 < index2, index1 != index2
        //Ascending order. Two Pointers, one at the begining and one at the end
        int StartingPointer = 0;
        int EndPointer = numbers.length - 1;
        while((StartingPointer < EndPointer)&&(EndPointer > 0 && (StartingPointer < numbers.length - 1))){
            if((numbers[StartingPointer] + numbers[EndPointer] == target) && (StartingPointer != EndPointer)){
                return new int[]{StartingPointer+1, EndPointer+1};
            }
            //Way to move our pointers back and forth.
            else if(numbers[EndPointer] + numbers[StartingPointer] > target ){
                EndPointer--;
            }
            else{
                StartingPointer++;
            }
        }
        return new int[]{-1, -1};

    }
}
