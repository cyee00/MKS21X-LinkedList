public class Node{
  private Integer data;
  private Node next,prev;
  public Node(Integer d,Node n, Node p){
    data=d;
    next=n;
    prev=p;
  }
  public Node next(){
    return next;
  }
  public Node prev(){
    return prev;
  }
  public void setNext(Node other){
    next=other;
  }
  public void setPrev(Node other){
    prev=other;
  }
  public Integer getData(){
    return data;
  }
  public Integer setData(Integer i){
    data=i;
    return data;
  }
  public String toString(){
    return ""+data;//toString should not show anything except for the data
  }
}
