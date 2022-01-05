package Chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.*;

public class Bai1Chapter2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("##########Cau 1##########");
		
		List<String>list1 = new ArrayList<>();
		list1.add("");
		list1.add("kpca");
		list1.add("tsne");
		list1.add("autoencoder");
		list1.add("happy");
		list1.add("neuralnetwork");
		list1.add("adamboost");
		list1.add("unhappy");
		System.out.println("##########Cau 2##########");
		list1.stream().forEach(e->System.out.println(e));
		System.out.println("##########Cau 3##########");
		long count = list1.parallelStream().filter(e->e.equals("")).count();
		System.out.println(count);
		long count2 = list1.parallelStream().filter(e->e.length()>=5).count();
		System.out.println(count2);
		long count3 = list1.parallelStream().filter(s->s.startsWith("a")).count();
		System.out.println(count3);
		long count4 = list1.parallelStream().filter(s->s.contains("happy")).count();
		System.out.println(count4);
		System.out.println("##########Cau 4##########");
		List<String> list2 = new ArrayList<String>();
		for(String list: list1) {
			list2.add(list);
		}
		list2.stream().filter(e->e.length()>0).forEach(System.out::println);
		System.out.println("##########Cau 5##########");
		List<String> list3 = new ArrayList<String>();
		for(String list: list1) {
			list3.add(list);
		}
		list3.stream().filter(e->e.length()>= 3 && e.length() <=6).forEach(e->System.out.print(e+" ,"));
		System.out.println("\n##########Cau 6##########");
		List<String> list4 = new ArrayList<String>();
		for(String list: list1) {
			list4.add(list);
		}
		list4.stream().forEach(e->System.out.println(e+"happy"));
	}

}
