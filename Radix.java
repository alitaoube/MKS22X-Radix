public class Radix{
  public static void radixsort(int[] data) {
    int max = findBiggest(data) - 1;
    int track = 0;
    @SuppressWarnings({"unchecked"})
    MyLinkedList<Integer>[] buckets = new MyLinkedList[20];
    MyLinkedList<Integer> list = new MyLinkedList<Integer>();

    //init buckets
    for (int i = 0; i < buckets.length; i++) buckets[i] = new MyLinkedList<Integer>();

    // assign vals

    for (int x: data){
      int dig = Math.abs((int)(x/Math.pow(10, track)) % 10);
      if (x < 0){
        buckets[9 - dig].add(x);
      }
      else{
        buckets[dig + 10].add(x);
      }
    }

    // connects buckets
    for (MyLinkedList<Integer> i : buckets) {
      list.extend(i);
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
