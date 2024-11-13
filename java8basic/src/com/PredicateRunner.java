package com;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateRunner {

	public static void main(String[] args) {

		Predicate<String> p1=(x)->
			 x=="hello";
		
	System.out.println(p1.test("hello"));
	System.out.println(p1.test("hi"));
	
	BiPredicate<Integer, Integer> p2=(n1,n2)-> n1%3==0 && n2%7==0;
	System.out.println(p2.test(6, 35));
	System.out.println(p2.test(6, 5));
	}

}
