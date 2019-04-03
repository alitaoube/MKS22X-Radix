public class Radix{

  
  public static void radixsort(int[]data){
    int highest = findBiggest(data);
    MyLinkedList[] buckets = new MyLinkedList[20];

    for (int x = 0; x < highest; x++){
      buckets[data[x] % (int)Math.pow(10, x) / 10 + 9].add(data[x]); // add whole number not just digit

      for (int i = 0; i < buckets.length - 1; i++) {
        buckets[i].extend(buckets[i + 1]);
      }
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
