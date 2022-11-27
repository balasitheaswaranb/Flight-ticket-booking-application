package com.arraylist;

public class Driver {
	
	    public static void main(String[] args) {
	        MyArrayList<Integer> list = new MyArrayList<>();
	        list.add(11);
	        list.add(22);
	        list.add(33);
	        list.add(44);
	        list.add(55);
	        list.add(66);
	        list.add(77);
	        list.add(88);
	        list.add(99);

	        System.out.println(list);
	        System.out.println(list.size());

	        list.add(2, 10001);

	        System.out.println(list);

	        System.out.println(list.size());
	        System.out.println(list.set(1, 1551));

	        System.out.println(list);

	        System.out.println(list.remove(1));

	        System.out.println(list);
	       
	    }
	
}
