package Z2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Zadanie2 {
    public static void main(String[] args){
        ArrayList lista = new ArrayList();
        lista.add(123);
        lista.add(234);
        lista.add(345);
        lista.add(456);

        HashSet<String> lista2 = new HashSet<>();
        lista2.add("Ala");
        lista2.add("Maja");
        lista2.add("Ola");
        lista2.add("Mical");

        wypiszCoDrugi(lista);
        wypiszCoDrugi(lista2);
    }
    public static <E extends Iterable> void wypiszCoDrugi(E t){
        Iterator<?> iterator = t.iterator();
        System.out.print(iterator.next() + ", ");
        while(iterator.hasNext()){
            iterator.next();
            if(iterator.hasNext()) System.out.print(iterator.next() + ", ");
        }
        System.out.println("");
    }
}
