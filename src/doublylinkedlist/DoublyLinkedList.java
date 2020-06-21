package doublylinkedlist;

public class DoublyLinkedList {

    public static void main(String[] args) {

        Person<String> person[] = new Person[5];
        person[0] = new Person<>(null,"Firstname 1","Lastname 1","Address 1",null);
        person[1] = new Person<>(null,"Firstname 2","Lastname 2","Address 2",null);
        person[2] = new Person<>(null,"Firstname 3","Lastname 3","Address 3",null);
        person[3] = new Person<>(null,"Firstname 4","Lastname 4","Address 4",null);
        person[4] = new Person<>(null,"Firstname 5","Lastname 5","Address 5",null);
     
        DList<String> show = new DList<>();
    
        show.addFirst(person[1]);
        show.addFirst(person[2]);
        show.addFirst(person[3]);
        
        System.out.println("List of Items:\n");
        show.showList();
        
        System.out.println("\n------------------------------------\n");
        
        System.out.println("After AddLast:\n");
        show.addLast(person[0]);
        show.showList();
        
        System.out.println("\n------------------------------------\n");
        
        System.out.println("After AddFirst:\n");
        show.addFirst(person[4]);
        show.showList();
        
        System.out.println("\n------------------------------------\n");
        
        System.out.println("After Remove Last:\n");
        show.removeLast();
        show.showList();
        
        System.out.println("\n------------------------------------\n");
        
        System.out.println("After Remove First:\n");
        show.removeFirst();
        show.showList();
    }
}