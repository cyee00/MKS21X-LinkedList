public class MyLinkedList{
  private int length;
  private Node start,end;
  public MyLinkedList(){
    start=new Node(null,null,null);
    end=new Node(null,null,null);
  }
  public int size(){
    return length;
  }
  public boolean add(int value){
    length++;
    //Node end=new Node(value,null,end);
    return true;
  }
  public String toString(){
    String ans="";
    //for (
    return ans;
  }
}
