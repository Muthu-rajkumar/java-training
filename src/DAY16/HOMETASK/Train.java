package DAY16.HOMETASK;

import java.util.LinkedList;

public class Train {
    public static void main(String[] args) {

        LinkedList<String> train = new LinkedList<>();

        train.addFirst("Engine");
        train.addLast("Coach1");
        train.addLast("Coach2");
        train.addLast("Guard");

        train.removeLast();

        System.out.println(train);
    }
}
