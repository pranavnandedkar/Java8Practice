package com.practice.study.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaWithList {

	public static void main(String[] args) {
		List<Person> people =  new ArrayList<Person>();
		people.add(new Person("pranav", "nandedkar"));
		people.add(new Person("A", "nandedkar"));
		people.add(new Person("B", "nandedkar"));
		people.add(new Person("C", "nandedkar"));
		people.add(new Person("D", "nandedkar"));
		
		
		
		
		people.forEach(x->System.out.println(x.getName()));
		people.forEach(System.out::println);
		people.forEach(LambdaWithList::write);
	}
	public static void write(Person p){
		System.out.println(p.name +" "+p.surname);
	}
		
}
