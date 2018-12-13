public class Node{
  private int data;
  private Node next,prev;
  public Node(int d,Node n, Node p){
    data=d;
    next=n;
    if (p!=null){
      prev=p;
    }
  }
  public Node next(){
    return next;
  }
  public Node prev(){
    return prev;
  }
}
