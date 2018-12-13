class Node{
  private int data;
  private Node next,prev;
  public Node(int d,Node n, Node p){
    data=d;
    next=n;
    if (p!=null){
      prev=p;
    }
  }
}

public class MyLinkedList{
  private int size;
  private Node start,end;
  public MyLinkedList(){}
  public int size(){
    return size;
  }
  public boolean add(int value){
    size++;
    Node end=new Node(value,null,end);
    return true;
  }
  public String toString(){
    String ans="";
    //for (
    return ans;
  }
}
