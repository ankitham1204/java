package DSA;
//non primitive
public class Single_Dimensional_Array_String {
   String[] a1;
   Single_Dimensional_Array_String(int size){
	   a1=new String[size];
	   System.out.println("array created");
   }
	
//insertion int i=index value
public void insert(int i,String v) {
	try {
		if(a1[i]==null) {
			a1[i]=v;
			System.out.println("the values "+v+" is inserted");
			
		}else {
			System.out.println("Elements exists");
		}
	}catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("inavlid index");
	}
}

//Traversal
public void traversal() {
	for(int i=0;i<a1.length;i++) {
	//	if(a1[i]!=null)
			System.out.println(a1[i]);
	}
}

//search by value
public void searchbv(String v) {
	for(int i=0;i<a1.length;i++) {
		if(a1[i].equals(v)) {
			System.out.println("the value "+ v +" found at index"+i);
			return;
		}
		
	}
	System.out.println("value not found");
}

//serach by index
public void searchbi(int index) {
	try {
		if(a1[index]!=null) {
			System.out.println(a1[index]);
		}
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("invalid index");
	}
}
	
//delete by value
public void deletebv(String v) {
	for(int i=0;i<a1.length;i++) {
		if(a1[i]!=null && a1[i].equals(v)) {
			System.out.println("value deleted");
			return;	
		}
	}
	System.out.println("value not found");	
	}
	

//delete by index
public void deletebi(int index) {
	try {
		
		if(a1[index]!=null) {
			a1[index]=null;
			System.out.println("value deleted");
		}
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("invalid index");
	}
	
}

//deletion of array
public void delete() {
	a1=null;
	System.out.println("array is deleted");
	
}

public static void main(String[] args) {
	Single_Dimensional_Array_String s=new Single_Dimensional_Array_String(5);
	s.insert(0,"abc");
	s.insert(1,"efg");
	s.insert(2,"hig");
	s.insert(3,"klm");
	s.insert(4,"nop");
	s.insert(5,"qrs");
	s.traversal();
	s.searchbi(3);
	s.searchbv("klm");
	s.deletebi(4);
	s.deletebv("efg");
	s.delete();
}
	
}

