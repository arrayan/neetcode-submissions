class Solution {
    public boolean isPalindrome(String s) {
        // "Was it a car or a cat I saw?"
        // One Pointer at the very begining; One at the end of the string.
        int leftPointer = 0;
        int rightPointer = s.length() - 1;

        while (leftPointer < rightPointer) { 
            
            // CRASH RISK: If string is ".,,", this loop runs until IndexOutOfBounds
            while ((leftPointer < rightPointer && !Character.isLetterOrDigit(s.charAt(leftPointer))) && (leftPointer < s.length() - 1)) {
                leftPointer++;
            }
            
            // CRASH RISK: Same here
            while ((leftPointer < rightPointer && !Character.isLetterOrDigit(s.charAt(rightPointer))) && (rightPointer > 0)) {
                rightPointer--;
            }

            // SYNTAX ERROR: s.charAt() returns primitive char. Can't call .toLowerCase() on it.
            // LOGIC: Check bounds again before comparing
            if (leftPointer < rightPointer) {
                 if (Character.toLowerCase(s.charAt(leftPointer)) != Character.toLowerCase(s.charAt(rightPointer))) {
                    return false;
                }
            }
            
            leftPointer++;
            rightPointer--;
        }
        
        return true;
    }
}