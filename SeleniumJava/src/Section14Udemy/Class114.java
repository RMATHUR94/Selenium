package Section14Udemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

import graphql.Assert;

public class Class114 {

	public static void regular()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijit");
		names.add("Rohan");
		names.add("Artike");
		names.add("Aatul");
		names.add("Bonfs");
		int count = 0;
		for(int i=0;i<names.size();i++)
		{
			String actual = names.get(i);
			if(actual.startsWith("A"))
			{
				count++;
			}
		}
		System.out.println(count);
	}
	public static void streamfilter()
	{
		//short-method for calculate the actual count
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijit");
		names.add("Rohan");
		names.add("Artike");
		names.add("Aatul");
		names.add("Abhishek");
		//there is no life for intermediate operation if there is no terminal operation
		//terminal operation will execute only if intermediate operation(filter) returns true
		//we can create stream
		//how to use filter in Stream API
		Long c = names.stream().filter(x->x.startsWith("A")).count();
		System.out.println(c);
		
		long d = Stream.of("Abhi","Kaile","Kat","Ketton","pink").filter(s->
		{
			s.startsWith("K");
			return true;
		}).count();
		System.out.println(d);
		//print all the names of arrayList
		//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	}
	
	public static void streamMap()
	{
		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("Poni");
		names1.add("prokash");
		names1.add("Artike");
		
		//print the name of length greater than 4 with Uppercase
		Stream.of("Abhi","Kaile","Kat","Kettot","pink").filter(x->x.endsWith("t")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//print the name of first name start with "A" and sorted 
		
		List<String> names = Arrays.asList("Afc","Adam","Alikya","don");
		names.stream().filter(s->s.startsWith("A")).sorted().map(x->x.toUpperCase()).forEach(u->System.out.println(u));
		
		Stream<String> newstream = Stream.concat(names1.stream(),names.stream());
		//newstream.sorted().forEach(s->System.out.println(s));
		
		boolean flag = newstream.anyMatch(s->s.equalsIgnoreCase("Adam"));
		Assert.assertTrue(flag);
		
	}
	
	public static void streamCollect()
	{
	List<String> testdata = Stream.of("Abhi","Kaile","Kat","Kettot","pink").filter(x->x.endsWith("t")).map(s->s.toUpperCase()).collect(Collectors.toList());
	System.out.println(testdata.get(0));
	
	//Assignment
	List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);
	//print unique number from this array
	//sort the array
	//values.stream().distinct().forEach(s->System.out.println(s));
	List<Integer> sortvalue = values.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println(sortvalue.get(2));
	
	}
		
	public static void main(String[] args) 
	{
		regular();
		streamfilter();
		streamMap();
		streamCollect();
	}

}
