import java.util.LinkedList;

public class LL {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        // ineslize linked list

        list.addFirst("hello");
        list.addFirst("he");
        list.addLast("me");

        // print linked list

        System.out.println(list);

        // delite

        list.remove(0);
        System.out.println(list);

        // size of linked list

        System.out.println(list.size());

        // get sefecic element

        System.out.println(list.get(1));

        // add element in sefecic index

        list.add(1, "gg");
        System.out.println(list);

        // looping on linked list

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }
}