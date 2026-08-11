class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        stack = [] # index, temperature
        result = [0] * len(temperatures)

        for index, temperature in enumerate(temperatures):
            while stack and stack[-1][1] < temperature:
                stack_index , stack_temperature = stack.pop() 
                result[stack_index] =  (index - stack_index)
            stack.append((index, temperature))
        return result