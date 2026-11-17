package Collections;
public class Sample {

    static Object arr[] = new Object[10];
    static int index = 0;

    static void add(Object ob) {
        add(ob, index);
    }

    static void add(Object ob, int index) {
        System.arraycopy(arr, index, arr, index + 1, Sample.index - index);
        arr[index] = ob;
        Sample.index++;
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
            add(arr2[i], insertAt + i);
        }

        System.out.println("****at****");
        printing();
    }
}