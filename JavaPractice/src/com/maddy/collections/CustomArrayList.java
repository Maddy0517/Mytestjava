package com.maddy.collections;

public class CustomArrayList {

	
		Object[] a = null;
		
		CustomArrayList(int size){
			
			a=new Object[size];
			
		}
		CustomArrayList() {
			
			a=new Object[10];
		}
		
		public void add(Object obj) {
			a[0] = obj;
			
		}
		
		



}
