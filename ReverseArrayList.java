
import java.util.ArrayList;

public class ReverseArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        //reverse of an arraylist
        int n = list.size();
        // System.out.println(n);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(n - i - 1) + " ");
        }
    }
}
