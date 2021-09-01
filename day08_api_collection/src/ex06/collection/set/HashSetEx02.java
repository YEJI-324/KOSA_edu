package ex06.collection.set;

import java.util.HashSet;
import java.util.Set;

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Person) {
			Person temp = (Person)obj;
			
			return name.equals(temp.name) && age == temp.age;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	
}

public class HashSetEx02 {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		Person p = new Person("aa", 10);
		
		set.add(p);
		set.add(new Person("David", 20));
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		set.add(new Person("David", 20));
		set.add("yeri");
		set.add("yeri");
		set.add(123);
		
		System.out.println(set);
	}
}
