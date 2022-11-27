package com.arraylist;

public interface MyList<E> {
	    void add(E e);

	    void add(int index, E e);

	    void clear(E e);

	    boolean equals(Object o);

	    Object get(int index);

	    int hashCode(E e);

	    int indexOf(Object o);

	    boolean isEmpty();

	    Object remove(int index);

	    boolean remove(Object o);

	    Object set(int index, E e);

	    int size();

	    int capacity();
	}

