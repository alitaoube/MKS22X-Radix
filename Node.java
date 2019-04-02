public class Node{
 private Integer data;
 private Node next,prev;

 public Node(Integer data1, Node next1, Node prev1){
   data = data1;
   next = next1;
   prev = prev1;
 }

// Getter methods
 public Integer getData(){
   return data;
 }

 public Node getNext(){
   return next;
 }

 public Node getPrev(){
   return prev;
 }
//
 // Setter methods
 public void setData(Integer data2){
   data = data2;
 }

 public void setNext(Node next2){
   next = next2;
 }

 public void setPrev(Node prev2){
   prev = prev2;
 }
//
 public String toString(){
   return "" + data;
 }
}
