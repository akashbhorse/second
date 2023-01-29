package practice3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DublicateChar {



	public static void main(String[] args) {
		//dublicate();
		charDublicate();
		
	}

	public  static void dublicate() {
		String str[] = {"a","d","a","s","h","g","h"};
		System.out.println("Duplicate Characters are:");

		Set<String> a=new HashSet<String>();

		for(String s: str) {
			if(a.add(s)==false) {
				System.out.println(s);
			}
		}


	}

	
	public static  void charDublicate() {
		
		String name="akassh";
		
		char data[]=name.toCharArray();
		for (int i = 0; i < data.length; i++) {
			for (int j = i+1; j < data.length; j++) {
				if(data[i]==data[j]) {
				System.out.print(data[i]);
				}
				}
		}
		
		
	}
}
