package com.practice.study.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaWithStreams {

	public static void main(String[] args) {
		List<Person> people =  new ArrayList<Person>();
		
		for (int i= 0 ; i <10000; i++){
			people.add(new Person("pranav", "nandedkar"));
			people.add(new Person("A", "nandedkar"));
			people.add(new Person("B", "nandedkar"));
			people.add(new Person("C", "nandedkar"));
			people.add(new Person("D", "nandedkar"));
		}
		
		/*
		 * parellel streams....
		 */
		
		long start = System.currentTimeMillis();
		people.parallelStream()
		.filter(p->p.name.startsWith("p"))
		.forEach(p->{
			try {
				Thread.sleep(1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		long end = System.currentTimeMillis();	
		System.out.println(end - start);

		
		
		
		/*
		 * normal streams....
		 */
		long start1 = System.currentTimeMillis();

		people.stream()
		.filter(p->p.name.startsWith("p"))
		.forEach(p->{
			try {
				Thread.sleep(1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		long end1 = System.currentTimeMillis();	
		System.out.println(end1 - start1);

		
		
		
		//		
//		people.forEach(x->System.out.println(x.getName()));
//		people.forEach(System.out::println);
//		people.forEach(LambdaWithList::write);
	}
	public static void write(Person p){
		System.out.println(p.name +" "+p.surname);
	}
		
}
