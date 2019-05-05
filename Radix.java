public class Radix{
  public static void main(String[] args) {
  Radix r = new Radix();
  int[] test = {1, 64, -17, 19, 0, -4, -7, 8, 67, 54, -48, 100, 56, 7, -99, 50, 84, -25, -67};
  Radix.radixsort(test);
  System.out.println(toString(test));
}



  public static void radixsort(int[] data) {
    int max = findBiggest(data) - 1;
    int track = 0;
    @SuppressWarnings({"unchecked"})
    MyLinkedList<Integer>[] buckets = new MyLinkedList[20];
    MyLinkedList<Integer> list = new MyLinkedList<Integer>();

    //init buckets
    for (int x = 0; x < 20; x ++){
      buckets[x] = new MyLinkedList<Integer>();
    }

    // assign vals
    for (int x = 0; x < data.length; x ++) {
      int num = data[x];
      int dig = Math.abs((int)(num/Math.pow(10, track)) % 10);
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
    }

    track++;
    while (max > 0){
      while (list.size() > 0){
        int num = list.removeFront();
        int dig = Math.abs((int)(num/Math.pow(10, track)) % 10);
        if (num < 0){
          buckets[9 - dig].add(num);
        }
        else{
          buckets[dig + 10].add(num);
        }
      }
      for (MyLinkedList<Integer> i : buckets) {
        list.extend(i);
      }
      track++;
      max--;
    }
    for (int i = 0; i < data.length; i++) {
      data[i] = list.removeFront();
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
