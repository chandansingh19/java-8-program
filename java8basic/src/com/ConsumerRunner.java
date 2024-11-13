package com;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Consumer<String > c1=(n)->{
	System.out.println("hello :"+n);  
  };
  c1.accept("rahul");
  Consumer<Integer > c2=(n)->{
		System.out.println("hello :"+n);  
	  };
  c2.accept(100);
	

	BiConsumer<String, Integer> bc1=(n,b)->{
		System.out.println("hello :"+n+" Number :"+b);  
	  };
	  bc1.accept("rahul", 100);
	  BiConsumer<Integer, Integer> bc2=(n,b)->{
			System.out.println(n+b);  
		  };
		  bc2.accept(10, 30);
}
}