# MyArrayList
## Atributes:
> This class has 2 atributes:
>- ## T[] arr
>> The array containing elements of different data types.
>- ## int size
>> The number of elements in ArrayList

## size()
Description:
> Returns the number of elements in ArrayList
<em>Code:</em>
"Java
public int size() {
        return size;
    }
"

## contains(Object o)
Description:
>Returns true if ArrayList contains the searched element
<em>Code:</em>
"Java
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
"

## add(Object o)
Description:
>Adds an element to the end of the ArrayList
<em>Code:</em>
"Java
public void add(Object element){
        if(size == arr.length){
            increaseBuffer();
        }
        arr[size++] = (T) element;
    }
"

## add(Object o, int index)
Description:
>Insert an element into the position of entered index
<em>Code:</em>
"Java
public void add(Object item, int index) {
        if (size == arr.length){
            increaseBuffer();
        }
        for (int i = size; i > index; i--){
            arr[size] = arr[size - 1];
        }
        arr[index] = (T) item;
    }
"

## increaseBuffer();
Description:
>Increases the capacity of the ArrayList when it is about to get full
<em>Code:</em>
"Java
public void increaseBuffer(){
        T[] newArr = (T[]) new Object[arr.length*2];
        for(int i=0; i< arr.length; i++){
            newArr[i]=arr[i];
        }
        arr = newArr;
    }
"
## remove(int index)
Description:
>Retursn an element of index of the entered number then removes it 
<em>Code:</em>
"Java
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
"
## checkIndex(int index)
Description:
>Checks for validity of entered number
<em>Code:</em>
"Java
    public void checkIndex(int index){
        if(index < 0 || index>=size){
            throw new IndexOutOfBoundsException();
        }
    }
"

## decreaseBuffer()
Description:
>Decreases the capacity of the ArrayList when it gets half empty
<em>Code:</em>
"Java
    public void decreaseBuffer(){
        T[] newArr = (T[]) new Object[arr.length/2];
        for(int i=0; i< arr.length; i++){
            newArr[i]=arr[i];
        }
        arr = newArr;
    }
"
## getElement(int index)
Description:
>Returns the element of index of entered number
<em>Code:</em>
"Java
    public T getElement(int index) {
        checkIndex(index);
        return arr[index];
    }
"

## clear()
Description:
>Clears all elements of the Arraylist
<em>Code:</em>
"Java
    public void clear(){
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }
"
## get(int index)
Description:
>Returns the element with index of entered number
<em>Code:</em>
"Java
    public Object get(int index) {
        return arr[index];
    }
"

## indexOf(Object o)
Descriotion:
>Returns the index of the first searched element, returns -1 if there is no such element in ArrayList
<em>Code:</em>
"Java
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
"

## lastIndexOf(Object o)
Description:
>Returns the last index of searched element, returns -1 if there is no such element in ArrayList
<em>Code:</em>
"Java
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
"

# MyLinkedList
## Atribites
>This class has 3 atributes:
>## T[] arr
>The array containing elements of different data types.
>## int size
>The number of elements in ArrayList
>## int next
>The address of the next element in LinkedList

## size()
Description:
>Returns the number of elements in LinkedList
<em>Code:</em>
"Java
public int size() {
        return size;
    }
"

## contains(Object o)
Description:
>Returns true if ArrayList contains the searched element
<em>Code:</em>
"Java
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
"

## add(Object o)
Description:
>Adds an element to the end of the LinkedList
<em>Code:</em>
"Java
public void add(Object element){
        if(size == arr.length){
            increaseBuffer();
        }
        arr[size++] = (T) element;
    }
"

## add(Object o, int index)
Description:
>Insert an element into the position of entered index
<em>Code:</em>
"Java
public void add(Object item, int index) {
        if (size == arr.length){
            increaseBuffer();
        }
        for (int i = size; i > index; i--){
            arr[size] = arr[size - 1];
        }
        arr[index] = (T) item;
    }
"

## increaseBuffer();
Description:
>Increases the capacity of the ArrayList when it is about to get full
<em>Code:</em>
"Java
public void increaseBuffer(){
        T[] newArr = (T[]) new Object[arr.length*2];
        for(int i=0; i< arr.length; i++){
            newArr[i]=arr[i];
        }
        arr = newArr;
    }
"
## remove(int index)
Description:
>Retursn an element of index of the entered number then removes it 
<em>Code:</em>
"Java
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
"
## checkIndex(int index)
Description:
>Checks for validity of entered number
<em>Code:</em>
"Java
    public void checkIndex(int index){
        if(index < 0 || index>=size){
            throw new IndexOutOfBoundsException();
        }
    }
"

## decreaseBuffer()
Description:
>Decreases the capacity of the ArrayList when it gets half empty
<em>Code:</em>
"Java
    public void decreaseBuffer(){
        T[] newArr = (T[]) new Object[arr.length/2];
        for(int i=0; i< arr.length; i++){
            newArr[i]=arr[i];
        }
        arr = newArr;
    }
"
## getElement(int index)
Description:
>Returns the element of index of entered number
<em>Code:</em>
"Java
    public T getElement(int index) {
        checkIndex(index);
        return arr[index];
    }
"

## clear()
Description:
>Clears all elements of the Linkedlist
<em>Code:</em>
"Java
    public void clear(){
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }
"
## get(int index)
Description:
>Returns the element with index of entered number
<em>Code:</em>
"Java
    public Object get(int index) {
        return arr[index];
    }
"

## indexOf(Object o)
Descriotion:
>Returns the index of the first searched element, returns -1 if there is no such element in LinkedList
<em>Code:</em>
"Java
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
"

## lastIndexOf(Object o)
Description:
>Returns the last index of searched element, returns -1 if there is no such element in LinkedList
<em>Code:</em>
"Java
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
"
