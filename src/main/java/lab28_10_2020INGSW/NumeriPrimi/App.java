package lab28_10_2020INGSW.NumeriPrimi;

import java.util.LinkedList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Math m = new Math();
        List<Integer> l = m.generaNumeriPrimi(20);
        for(Integer num: l) {
        	System.out.println(num + " ");
        }
    }
}
