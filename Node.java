public class Node{
  private Integer data;
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
  private void setNext(Node other){
    next=other;
  }
  private void setPrev(Node other){
    prev=other;
  }
  public String toString(){
    return ""+data;//toString should not show anything except for the data
  }
}
