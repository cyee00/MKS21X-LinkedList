public class MyLinkedList{
  private int length=0;
  private Node start,end;
  public MyLinkedList(){
    start=new Node(null,null,null);
    end=new Node(null,null,start);
    start.setNext(end);
  }
  public boolean add(Integer value){
    length++;
    if (length==0){
      start=new Node(value,end,null);
      length++;
    } else if (length==1){
      end=new Node(value,null,start);
      length++;
    } else{
      Node newNode = new Node(value,null,null);
      Node prevEnd = new Node(end.getData(),newNode,end.prev());
      end=newNode;
      end.setPrev(prevEnd);
      length++;
    }
    return true;
  }
  public int size(){
    return length;
  }
  public String toString(){
    String ans="[";
    Node current=start;
    while (current!=null){
      ans+=current.getData()+", ";
      current=current.next();
    }
    if (length!=0){//checking if the list isn't empty
      return ans.substring(0,length-2)+"]";
    }
    return ans+"]";//if list is empty, do this
  }
}
