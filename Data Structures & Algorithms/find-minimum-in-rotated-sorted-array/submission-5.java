class Solution {
    public int findMin(int[] nums) {
        // If it is rotated n times; We get the original array back!
        // [1,2,3,4,5,6] -> [6,1,2,3,4,5] -> [5,6,1,2,3,4] -> [4,5,6,1,2,3] -> [3,4,5,6,1,2]
        //L; R-> R > L ; Between R and L there is positive sorting.
        // We have en element; Element on the left of it is bigger; element on right is alos bigger; that would be the smallest element.
        // Run Binary Search on this!
        // [4,5,0,1,2,3] //[6,1,2,3,4,5] //4,5,6,1,2,3]  ( L<mid<R -> Look right of MP);  ( LP<mid<RP) if both LeftElements as Well asRE arte smaller; Look Right

        int leftPointer = 0;
        int rightPointer = nums.length - 1;
        while(leftPointer < rightPointer){
            int mid = leftPointer + (rightPointer - leftPointer) / 2;
            /*if ((nums[mid] < nums[mid - 1]) && (nums[mid] < nums[mid + 1]) ){ //Add condition to ensure we dont go out of bounds!
                return nums[mid];
            }*/
            //Now we need to know how to change pointers//
            //
            if(nums[mid] > nums[rightPointer]){ //[4,5,6,1,2,3]; Mid = 6; rp = 3; What does this even mean? 
            //This would be because our original array was sorted from L->R; so if our: RP is smaller than mid; that means the part on right is sorted as the left part now is the rotated part?
                leftPointer = mid + 1;
            }
            if(nums[mid] < nums[rightPointer]){ // Properly Sorted. Only look for the first half because we have ascending order 
                rightPointer =  mid;
            }
        }
        return nums[rightPointer];
    }
}
