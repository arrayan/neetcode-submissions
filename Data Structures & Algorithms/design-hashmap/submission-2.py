class MyHashMap:
    def __init__(self):
        self.nestedList = [-1] * 1000001
    def put(self, key: int, value) -> None:
        self.nestedList[key] = value
    def get(self, key: int) -> int:
        return self.nestedList[key]
    def remove(self, key: int):
        self.nestedList[key] = -1