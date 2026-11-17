package Collections;

import java.util.PriorityQueue;
public class Priority{
public static void main(String[] args) {
	PriorityQueue p1=new PriorityQueue();
	p1.add(10);
	p1.add(20);
	p1.add(30);
	p1.add(40);
	p1.add(50);
	p1.add(-10);
	p1.remove(50);
	p1.size();
//	p1.clear();
	System.out.println(p1);
	PriorityQueue p2=new PriorityQueue();
	p1.add(10);
	p1.add(20);
	p1.add(30);
	p1.add(40);
	p1.add(50);
	p1.add(-10);
	p1.addAll(p2);
	p1.removeAll(p2);
//	p1.retainAll(p2);
	System.out.println(p1.contains(10));
	System.out.println(p1.isEmpty());
	System.out.println(p1.size());
	System.out.println(p1);
}
}