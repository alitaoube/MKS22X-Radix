public class Radix{
  public static void main(String[] args) {
    int[] data = {10, 5, 10000, 1000, 20, 5, 1000000, 100000000}; // should return 7
    System.out.print(findBiggest(data));
  }
  // public static void radixsort(int[]data){
  //   MyLinkedList[] buckets = new MyLinkedList[20];
  //
  //
  // }
  private static int findBiggest(int[] data){
    int highest = 0;
    for (int x = 0; x < data.length; x++){
      int num = data[x];
      int track = 0;
      for (int y = 0; num != 0; y++){
        track++;
        num /= 10;
      }
      if (track >= highest) highest = track;
    }
    return highest;
  }
}
