import java.util.NoSuchElementException;

public class LinkedList{

  private int length;
  private Node start,end;

  public LinkedList(){
    length = 0;
  }

  public boolean add(Integer value){
    if (length == 0){ // Special case; if length is equal to 0, then there's no next or previous
      Node out = new Node(value, null, null);
      start = out;
      end = start;
      length++;
      return true;
    }
    else{
      Node out = new Node(value, null, end.getPrev()); // Since it's always being added to the end, the next is always null
      end.setNext(out);
      out.setPrev(end);
      end = end.getNext();
      length++;
      return true;
    }
  }

  public int size(){
    return length;
  }

  public Integer get(int n){
    if (n < 0 || n > length) throw new IndexOutOfBoundsException();
    return getNth(n).getData();
  }

  public Integer set(int index, Integer value){
    if (index < 0 || index > length) throw new IndexOutOfBoundsException();
    Node at = getNth(index);
    Integer output = at.getData();
    at.setData(value);
    return output;
  }

  public boolean contains(Integer value){
    Node upto = start;
    for (int x = 0; x < length; x++){
      if (upto.getData() == value){
        return true;
      }
      upto = upto.getNext();
    }
    return false;
  }

  public int indexOf(Integer value){
    Node upto = start;
    for (int x = 0; x < length; x++){
      if (upto.getData().equals(value)){
        return x;
      }
      upto = upto.getNext();
    }
    return -1;
  }

  private Node getNth(int n){
    if (n < 0 || n > length) throw new IndexOutOfBoundsException();
    Node temp = start;
    for (int count = 0; count != n; count++) { // Cycle until you hit the index
      temp = temp.getNext();
    }
    return temp;
  }

  public void add(int n, Integer value){
    if (n < 0 || n > length) throw new IndexOutOfBoundsException();
    if (n == 0){ // If its added to the beginning,then the previous is always null
      Node added = new Node(value, start, null);
      start.setPrev(added);
      start = start.getPrev();
      length++;
    }
    else {
      Node temp = new Node(value, getNth(n), getNth(n - 1));
      if (n == length){ // If it's equal to the end, then you can just use the old add function
        add(value);
      }
      else{
        getNth(n).setPrev(temp);
        getNth(n - 1).setNext(temp);
        length++;
      }
  }
}

  public Integer remove(int n){
    if (n < 0 || n > length) throw new IndexOutOfBoundsException();
    Node at = getNth(n);
    Integer output = at.getData();
    if (n == length - 1){   // If it's at the end, then you need to adjust the null accordingly
      at.getPrev().setNext(null);
      end = at.getPrev();
      length--;
      return output;
    }
    if (n == 0){ // Same with the beginning
      at.getNext().setPrev(null);
      start = at.getNext();
      length--;
      return output;
    }
    at.getPrev().setNext(at.getNext());
    at.setPrev(at.getPrev());
    length--;
    return output;
  }

  public boolean remove(Integer n){
    try{
      remove(indexOf(n));
      return true;
    }
    catch(IndexOutOfBoundsException e){
      return false;
    }
  }

   public void extend(MyLinkedList other){ // O(1)
      this.end.setNext(other.start);
      other.start.setPrev(end);
      this.end = other.end;
      this.length += other.length;
      other.length = 0;

        //in O(1) runtime, move the elements from other onto the end of this
        //The size of other is reduced to 0
        //The size of this is now the combined sizes of both original lists
    }

  public String toString(){
    String output = "[";
    Node upto = start;
    for (int x = 0; x < length; x++){
      output += upto.getData();
      upto = upto.getNext();
      if (x + 1 != length) output += ", ";
    }
    return output += "]";
  }
}
