# Collection
import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> courses = new ArrayList<>();
        courses.add("C");
        courses.add("JavaSE");
        courses.add("JavaWeb");
        courses.add("JavaEE");
        courses.add("C");
        System.out.println(courses);

        System.out.println(courses.get(1));
        //System.out.println(courses.get(10));
        courses.set(0, "计算机基础");
        System.out.println(courses);

        List<String> sub = courses.subList(1, 3);
        System.out.println(sub);

        List<String> list = new ArrayList<>(10);
        list.get(9);    // size 还是 0
    }
}
