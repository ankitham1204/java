package Collections;

public class MovingMiddle {
	    static Object arr[] = new Object[10];
	    static int index = 0;

	    static void add(Object ob) {
	        arr[index] = ob;
	        index++;
	    }

	    static void printing() {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] != null)
	                System.out.println(arr[i]);
	        }
	    }

	    public static void main(String[] args) {
	        add(10);
	        add(20);
	        add(30);
	        add(40);
	        add(50);

	        printing();

	        Object arr2[] = {'a', 'b', 'c'};
	        int insertAt = 2;

	       	        for (int i = 0; i < arr2.length; i++) {
	            add(null);
	        }

	        
	        System.arraycopy(arr, insertAt, arr, insertAt + arr2.length, index - insertAt - arr2.length);

	       
	        System.arraycopy(arr2, 0, arr, insertAt, arr2.length);

	        System.out.println("****at****");
	        printing();
	    }
	}