package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bubble_sort_using_list_primitive_ {
	public static void main(String[] args) {
		List<Integer> a=new ArrayList<Integer>(Arrays.asList(8,5,3,6,7,1,3,2,4));
		for(int i=0;i<a.size();i++) {
			for(int j=0;j<a.size()-1-i;j++) {
				if(a.get(j).compareTo(a.get(j+1))>0) {
					int temp=a.get(j);
					a.set(j,a.get(j+1));
					a.set(j+1, temp);
				}
			}
		}
		System.out.println(a);
	}

}



