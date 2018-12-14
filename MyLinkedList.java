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
    Node newNode;
    if (length==0){
      start=new Node(value,end,null);
    } else if (length==1){
      end=new Node(value,null,start);
    } else{
      newNode = new Node(value,null,end);
      end.setNext(newNode);
      end=newNode;
    }
    return true;
  }
  public int size(){
    return length;
  }
  public String toString(){
    String ans="[";
    Node current=start;
    for (int i=0;i<length;i++){
      ans+=current.getData()+", ";
      current=current.next();
    }
    return ans+current.getData()+"]";
  }
  /*
  public boolean add(int value){
    length++;
    //Node end=new Node(value,null,end);
    return true;
  }
  public String toString(){
    String ans="";
    //for (
    return ans;
  }*/
}
