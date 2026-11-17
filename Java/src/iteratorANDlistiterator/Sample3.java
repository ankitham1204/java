package iteratorANDlistiterator;

import java.util.ArrayList;
import java.util.ListIterator;

class Sample3
{
    public static void main(String[] args)
    {
        ArrayList l1 = new ArrayList();

        l1.add(10);
        l1.add(20.20);
        l1.add('A');
        l1.add(true);

        ListIterator itr = l1.listIterator();

        while(itr.hasNext())
        {
            Object o1 = itr.next();
            System.out.println(o1);
        }

        while(itr.hasPrevious())
        {
            Object o1 = itr.previous();
            System.out.println(o1);
        }
    }
}