import java.util.ArrayList;

public class DemoList {

    public static void main(String[] args) {

        ArrayList list1 = new ArrayList();
        list1.add(2);
        list1.add(4);
        list1.add(5);
        list1.add(1);

        System.out.println(list1);

        int i = (int) list1.get(0);
        System.out.println(i);


    }
}
