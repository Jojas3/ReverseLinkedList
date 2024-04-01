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
        System.out.println("Initial linked list:");
        System.out.println(myList);


        //heck yeah. built-in function, baby.
        System.out.println("Using the built-in function:");
        System.out.println(myList.reversed());


        //kidding...


        System.out.println("Using the for loop:");
        //create list to copy to
        LinkedList<String> copyList =new LinkedList<>();

        //use basic for loop.
        for(int  i = myList.size()-1; i!=-1; i--){
            copyList.add(myList.get(i));
        }
        System.out.println(copyList);
        System.out.println(copyList.get(2));
        //all in all I think that went pretty well, especially for not allowing myself to use any outside resource.
        //Of course, I could've googled the answer, but where's the fun in that? I want to learn.
        //lol



    }
}