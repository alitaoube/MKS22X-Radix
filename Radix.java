public class Radix{
  public static void main(String[] args) {
    int[] data = {10, 5, 10000, 1000, 20, 5, 1000000, 100000000}; // should return 7
    System.out.print(findBiggest(data));
  }
  public static void radixsort(int[]data){
    int highest = findBiggest(data);
    MyLinkedList[] buckets = new MyLinkedList[20];

    for (int x = 0; x < highest; x++){

    }

  }
  private static int findBiggest(int[] data){
    int highest = 0;

    for (int x = 0; x < data.length; x++){
      if (data[x] > highest) highest = data[x];
    }

    if (highest < 0) return (highest + "").length() - 1;
    return (highest + "").length();
  }
}
