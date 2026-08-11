class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        zipped_items = [(p,s) for p,s in zip(position,speed)]
        zipped_items.sort(reverse=True)
        stack = []
        for item_ in zipped_items:
            pos_ , spe_  = item_ 
            stack.append( (target - pos_) / spe_)
            if (len(stack) > 1 and stack[-1] <= stack[-2]): #When will we do a pop? When the item can overtake
                stack.pop()
        return len(stack)