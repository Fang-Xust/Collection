import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println("------------------------");
        list.add("我");
        list.add("爱");
        list.add("Java");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        for(String s : list){
            System.out.println(s);
        }
        list.remove("我");
        for (String s : list) {
            System.out.println(s);
        }
        list.clear();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }
}
