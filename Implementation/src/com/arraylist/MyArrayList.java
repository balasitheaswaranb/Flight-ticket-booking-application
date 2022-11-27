package com.arraylist;

public class MyArrayList<E> implements MyList<E> {
	
	    private int capacity; 
	    private int size;
	    private Object[] list;

	    public MyArrayList() {
	        this.capacity = 10; 
	        this.size = 0;
	        this.list = new Object[capacity];
	    }

	    @Override
	    public void add(Object e) {
	        if (size >= capacity) 
	        	grow();
	        list[size++] = e;
	    }

	    @Override
	    public void add(int index, Object e) {
	        isValidIndex(index);
	        if (size + 1 > capacity)
	        	grow(); 
	        
	        int count = size - index;
	        Object[] tempList = new Object[count];
	        for (int i = index; i < count + index; i++) {
	            tempList[i - index] = list[i];
	        }
	        
	        list[index] = e;
	       
	        for (int i = index; i < count + index; i++) {
	            list[i + 1] = tempList[i - index];
	        }
	        ++size; 
	    }

	    private void grow() {
	        capacity <<= 1; 
	        Object[] o = list.clone();
	        list = new Object[capacity];
	        size = 0;
	        for (Object i : o) {
	            list[size++] = i;
	        }
	    }

	    @Override
	    public void clear(Object e) {
	        if (isEmpty())
	        	return; 
	        for (int i = 0; i < size; i++) {
	            list[i] = null;
	        }
	        capacity = 10; 
	        size = 0;
	    }

	    @Override
	    public Object get(int index) {
	        isValidIndex(index);
	        return list[index];
	    }

	    @Override
	    public int hashCode(Object e) {
	        return e.hashCode();
	    }

	    @Override
	    public int indexOf(Object o) {
	        if (isEmpty()) return -1;
	        for (int i = 0; i < size; i++) {
	            if (list[i].equals(o)) return i;
	        }
	        return -1;
	    }

	    @Override
	    public boolean isEmpty() {
	        return size == 0;
	    }

	    private void isValidIndex(int index) {
	        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Invalid index");
	    }

	    @Override
	    public Object remove(int index) {
	        isValidIndex(index);

	        Object item = list[index];
	        for (int i = index; i < size - 1; i++) {
	            list[i] = list[i + 1];
	        }
	        list[size - 1] = null; 
	        --size; 
	        return item;
	    }

	    @Override
	    public boolean remove(Object o) {
	        if (isEmpty()) 
	        	return false;
	        for (int i = 0; i < list.length; i++) {
	            if (list[i].equals(o)) {
	                remove(i);
	                return true; 
	            }
	        }
	        return false; 
	    }

	    @Override
	    public Object set(int index, Object e) {
	        isValidIndex(index);
	        Object temp = list[index];
	        list[index] = e;
	        return temp;
	    }

	    @Override
	    public int size() {
	        return size;
	    }

	    @Override
	    public int capacity() {
	        return capacity;
	    }

	    @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        sb.append("[");
	        for (int i = 0; i < size; i++) {
	            sb.append(list[i]);
	            if (i < size - 1) sb.append(", ");
	        }
	        sb.append("]");

	        return sb.toString();
	    }
	   
	}
