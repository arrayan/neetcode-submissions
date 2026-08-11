class DynamicArray {
        private int capacity;
        private int size;
        private int[] arr;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.size = 0;
    }

    public int get(int i) {
        //assumed that index i is valid, otherwise IAE
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }
    

    public void pushback(int n) {
        if (size == capacity) {
            resize();
        }
        arr[size++] = n;
    }

    public int popback() {
        return arr[--size]; 
    }

    private void resize() {
        capacity *= 2;
        int[] newArray = new int[capacity];
        for(int i = 0; i < arr.length; i++){
            newArray[i] = arr[i];
        }
        arr = newArray;
    }

    public int getSize() {
        return size;

    }

    public int getCapacity() {
        return capacity;
    }
}
