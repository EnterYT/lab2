public class MyLinkedList<T> implements MyList{
    private T[] arr;
    private int size;
    private int nextID;

    MyLinkedList(){
        this.arr = (T[]) new Object[5];
        this.size = 0;
        arr[size] = null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object o) {
        boolean res = false;
        for (int i = 0; i < size; i++){
            if (arr[i] == o){
                res = true;
                break;
            }
        }
        return res;
    }

    public void add(Object element){
        if(size == arr.length - 2){
            increaseBuffer();
        }
        arr[size++] = (T) element;
    }

    @Override
    public void add(Object item, int index) {
        if (size == arr.length - 2){
            increaseBuffer();
        }
        for (int i = size; i > index; i--){
            arr[size] = arr[size - 1];
        }
        arr[index] = (T) item;
    }

    @Override
    public boolean remove(Object item) {
        return false;
    }

    @Override
    public T remove(int index) {
        if (size <= arr.length/2 && size > 9)
            decreaseBuffer();
        T res = arr[index];
        checkIndex(index);
        for (int i= index + 1; i<size; i++){
            arr[i-1] = arr[i];
        }
        size--;
        return res;
    }

    public void increaseBuffer(){
        T[] newArr = (T[]) new Object[arr.length*2];
        for(int i=0; i< arr.length; i++){
            newArr[i]=arr[i];
        }
        arr = newArr;
    }

    public void decreaseBuffer(){
        T[] newArr = (T[]) new Object[arr.length/2];
        for(int i=0; i< arr.length; i++){
            newArr[i]=arr[i];
        }
        arr = newArr;
    }

    public T getElement(int index) {
        checkIndex(index);
        return arr[index];
    }

    public void clear(){
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }

    @Override
    public Object get(int index) {
        return arr[index];
    }

    @Override
    public int indexOf(Object o) {
        int id = -1;
        for (int i =0; i < size; i++) {
            if (arr[i] == o) {
                id = i;
                break;
            }
        }
        return id;
    }

    @Override
    public int lastIndexOf(Object o) {
        int id = -1;
        for (int i = size; i == 0; i--) {
            if (arr[i] == o) {
                id = i;
                break;
            }
        }
        return id;
    }

    @Override
    public void sort() {

    }

    public void checkIndex(int index){
        if(index < 0 || index>=size){
            throw new IndexOutOfBoundsException();
        }
    }
}
