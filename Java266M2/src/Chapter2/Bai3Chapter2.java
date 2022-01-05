package Chapter2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.*;

public class Bai3Chapter2 {
	public static void main(String[] args) {
		List<Student>list = new ArrayList<Student>();
		//Creating student
		Student s1 = new Student("Phuong", "Khuat", 17, 8.0, 7.0);
		Student s2 = new Student("Hanh", "Nguyen", 19, 8.5, 7.5);
		Student s3 = new Student("Hoa", "Huynh", 18, 7.5, 6.5);
		Student s4 = new Student("Duyen", "Phan", 20, 7.5, 7.5);
		//Add student to list
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		System.out.println("List of Students:");
		list.stream().forEach(e->System.out.println(e));
//		for(Student s : list) {
//			System.out.println(s.toString());
//		}
		System.out.print("Number of students have old >=18 : ");
		System.out.print(list.stream().filter(e->e.getAge()>=18).count());
		System.out.print("\nNumber of Student have FirstName start 'H': ");
		System.out.print(list.stream().filter(e->e.getFirstName().startsWith("H")).count());
		System.out.print("\nFirst Student has FirstName start at 'H':\n");
		System.out.print(list.stream().filter(e->e.getFirstName().startsWith("H")).findFirst().get());
		System.out.print("\nHighest Avg Mark in List : ");
		// creating a stream
		List<Double> list1 = new ArrayList<Double>();
		for(Student s : list) {
			list1.add(s.Trungbinh(s.getMark1(), s.getMark2()));
		}
		System.out.print(Collections.max(list1,null));
		System.out.print("\nLowest Avg Mark in List :");
		System.out.print(Collections.min(list1,null));
		System.out.print("\nSum of all Avg Mark : ");
		double sum = list1.stream().reduce((double) 0,Double::sum);
		System.out.print(sum);
		System.out.print("\nAverage of all Avg Marks : ");
		double avg = list1.stream().reduce((double) 0,Double::sum)/list1.size();
		System.out.print(avg);
		System.out.print("\nList of Very Good Students:\n ");
		list.parallelStream().filter(e->e.Trungbinh(e.getMark1(), e.getMark2())>=8).forEach(System.out::println);
	}
	
	
	
}
