# MyArrayList
## size()
Description:
>Returns the number of elements in ArrayList
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
>Increases the size of the ArrayList when it is about to get full
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
