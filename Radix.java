public class Radix{
  public static void radixsort(int[] data) {
    @SuppressWarnings({"unchecked"})
    MyLinkedList<Integer>[] buckets = new MyLinkedList[20];
    MyLinkedList<Integer> list = new MyLinkedList<Integer>();

    //init buckets
    for (int x = 0; x < 20; x ++){
      buckets[x] = new MyLinkedList<Integer>();
    }

    int max = findBiggest(data);

    // assign vals
    for (int x = 0; x < data.length; x ++) {
      int num = data[x];
      int dig = Math.abs(num) % 10;
      if (num < 0){
        buckets[9 - dig].add(num);
      }
      else{
        buckets[dig + 10].add(num);
      }
    }

    // connects buckets
    for (int x = 0; x < buckets.length; x++) {
      list.extend(buckets[x]);
      // clear buckets
      buckets[x] = new MyLinkedList<Integer>();
    }

    int place = 10;
    while (place <= max) {
      while (list.hasNext()) {
        int num = list.removeFront();
        int dig = (Math.abs(num) / place) % 10;

        if (num < 0){
          buckets[9 - dig].add(num);
        }
        else{
          buckets[dig + 10].add(num);
        }
      }
      list.clear();
      for (int x = 0; x < 20; x ++) {
        list.extend(buckets[x]);
      }
      place *= 10;
      list.clear();
    }
    int x = 0;

    while (list.hasNext()){
      data[x++] = list.next();
    }
  }

  public static String toString(int[] data){
    String output = "[";
    for (int x: data){
      output += x;
      output += ", ";
    }
    return output + "]";
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
