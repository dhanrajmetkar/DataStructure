package LinkedList;

public class LL {
    Node head;
    Node tail;
    int size;

    public LL() {
        this.size = 0;
    }

    public void addFirst(int val) {
        Node newnode= new Node(val);
        newnode.next=head;
        head=newnode;
      if(tail==null)
      {
          tail=head;
      }

    }
    public void addLast(int val)
    {
//     if(head==null)
//     {
//         addFirst(val);
//     }
//     else {
//         Node newnode = new Node(val);
//      Node temp=head;
//      while(temp.next!=null)
//      {
//      temp=temp.next;
//      }
//      temp.next=newnode;
//
//     }
        if(tail==null)
        {
            addFirst(val);
        }
        else {
            Node node=new Node(val);
            tail.next=node;
            tail=tail.next;
        }


    }

void deletelast()
{
    Node node=head;
    while(node.next!=tail)
    {
        node=node.next;
    }
    node.next=null;
    node=tail;
}
void deletefirst()
{
    Node temp=head;
    head=temp.next;
}

    public void traverse()
    {
        if(head==null)
        {
            System.out.println("empty head");
        }
     else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
            System.out.print("null");
            System.out.println();
        }
    }

    public void insertAt(int pos, int val) {
        Node node=head;
        Node temp=node.next;
        for (int i = 1; i <pos ; i++) {
            node=node.next;
            temp=temp.next;
        }
        Node newnode=new Node(val);
        node.next=newnode;
        newnode.next=temp;
    }
   public void deleteAt(int pos)
   {
    Node node=head;
    for (int i = 1; i < pos; i++) {
        node=node.next;
    }
    node.next=node.next.next;
}
    public void insertRec(int index,int val)
    {
        head=insertRec1(index,val,head);
    }
    public Node insertRec1(int index, int val,Node node) {
        if(index==0)
        {
        Node temp=new Node(val,node);
        return temp;
        }
        node.next=insertRec1(index-1,val,node.next);
        return node;

    }
    public Node deleteDuplicates(Node head) {
        Node temp=head;
        while(temp.next!=null)
        {
            if(temp.data==temp.next.data)
            {
                temp.next=temp.next.next;
            }
            else {
                temp=temp.next;
            }
        }
        return head;

    }

    public void createcycle(int pos) {
        Node temp2=head;
        for (int i = 1; i < pos; i++) {
            temp2=temp2.next;
        }
        tail.next=temp2;
        System.out.print(temp2.data+" temp2 ");
        System.out.print(head.data+" head ,");
        System.out.println(tail.data+" tail");
    }

    public boolean detectCycle() {
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            if(slow.next==fast.next.next)
            {
                return true;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return false;

    }

    public int cycleLength() {
        Node slow=head;
        Node fast=head;
        int len=0;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
            Node temp=slow;
            do {
//                System.out.print(temp.data+"-> "); temp=temp.next;
                len++;
            }while (temp!=slow);
            //    return len;
            }
            slow=head;
            fast=head;
            while(len>1)
            {
                slow=slow.next;
                len--;
            }
            while(slow!=fast)
            {
             slow=slow.next;
             fast=fast.next;
            }
            return slow.data;

        }
        return 0;
    }

    public int middle() {
        Node fast=head;
        Node slow=head;
        while (fast!=null&& fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
      return slow.data;
    }


    class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
        public Node() {}
    }
}
