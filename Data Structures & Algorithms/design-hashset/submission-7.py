class MyHashSet:

    def __init__(self):
        self.usedList = [False] * 100001

    def add(self, key: int) -> None:
        self.usedList[key] = True

    def remove(self, key: int) -> None:
        self.usedList[key] = False

    def contains(self, key: int) -> bool:
        return self.usedList[key]


# Your MyHashSet object will be instantiated and called as such:
# obj = MyHashSet()
# obj.add(key)
# obj.remove(key)
# param_3 = obj.contains(key)