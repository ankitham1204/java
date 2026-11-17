package Collections;

import java.util.Stack;
public class Stack1{
public static void main(String[] args) {
	Stack s1=new Stack();
	s1.add(10);
	s1.add(20.5);
	s1.add("hello");
	s1.add('A');
	s1.add(true);
	s1.add(-10);
	s1.remove(10);
	s1.size();
//	s1.clear();
	System.out.println(s1);
	Stack s2=new Stack();
	s2.add(10);
	s2.add(20.5);
	s2.add("hello");
	s2.add('A');
	s2.add(true);
	s2.add(-10);
	s2.addAll(s2);
//	s2.removeAll(s2);
//	s1.retainAll(p2);
	System.out.println(s1.contains(10));
	System.out.println(s1.isEmpty());
	System.out.println(s1.size());
	System.out.println(s1);
}
}