package LinkedList;

public class Main {
    public static void main(String[] args) {
    LL one=new LL();
    one.addFirst(1);
    one.addLast(5);
    one.addLast(11);
    one.addLast(12);
    one.addLast(13);
    one.addLast(14);
    one.traverse();
    System.out.println(one.middle());
  //  one.createcycle(4);
   // one.traverse();
//        System.out.println(one.detectCycle());
//        System.out.println(one.cycleLength());
//    one.insertRec(2,44);
//    one.traverse();
//    one.deleteDuplicates(one.head);
//    one.traverse();
//        one.insertAt(3,111);
//        System.out.println("after adding ele");
//        one.traverse();
//        one.deleteAt(3);
//        System.out.println("after deleting ele");
//        one.traverse();
//    one.deletelast();
//    System.out.println("after delete last");
//    one.traverse();
//    one.deletefirst();
//    System.out.println("first delete");
//    one.insertAt(2,3);
//    one.traverse();
    }
}
