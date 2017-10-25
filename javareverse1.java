import java.util.List;
import java.util.LinkedList;

class javareverse1
{
    //List<E> l;

    /*
    public javareverse1(List<E> l)
    {
        this.l = l;
    }
    */

    public static <E> List<E> reverse(List<E> l)
    {
        if(l.size() > 1)
        {
            E e = l.get(0);
            List<E> ll = reverse(l.subList(1, l.size()));
            //ll.add(0, e);
            ll.add(e);
            return ll;  
        }
        return l;
    }

    public static void main(String[] args)
    {
        List<Integer> li = CreateIntList.createIntList(10);

        for(Integer i : li)
            System.out.println(i);
        System.out.println("");
    
        List<Integer> li2 = reverse(li);

        for(Integer i : li2)
            System.out.println(i);
    }
}

class CreateIntList
{
    public static LinkedList<Integer> createIntList(int count)
    {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        for(int i=0;i<count;i++)
            ll.add(i);    
        return ll;
    }
}
