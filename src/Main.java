import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is my attempt at reversing a linked list without using the internet or any other external" +
                "resources. Just good ol' trial and error. Wish me luck.");

        LinkedList<String> myList = new LinkedList<>();


        //add 10 new elements to linked list
        for(int i =0; i<10; i++) {
            myList.add(i, "E"+i);
        }
        //print for validation
        System.out.println(myList);

        System.out.println(myList.reversed());
        //heck yeah. built-in function, baby.





    }
}