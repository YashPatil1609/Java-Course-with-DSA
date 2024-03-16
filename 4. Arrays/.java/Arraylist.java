import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        // We use wrapper classes to make Arraylist.. hence it has its own methods..

        for (int i = 0; i < 5 ; i++) {
            list.add(in.nextInt());     // .add() method to add to the Arraylist
        }

        System.out.println(list);

        // .set(index,element)  add a element at a particular index
        // .remove(index)   removes a element at the given index
    }
}
