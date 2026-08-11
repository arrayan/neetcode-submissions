class MyHashMap:

    def __init__(self):
        #I think we need to make a list of Lists in this case for the groupings.
        self.nestedList = [-1] * 1000001

    def put(self, key: int, value: int) -> None:
        self.nestedList[key] = value

    def get(self, key: int) -> int:
        return self.nestedList[key]
        
    def remove(self, key: int) -> None:
        self.nestedList[key] = -1


# Your MyHashMap object will be instantiated and called as such:
# obj = MyHashMap()
# obj.put(key,value)
# param_2 = obj.get(key)
# obj.remove(key)