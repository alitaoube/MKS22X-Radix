import java.util.Scanner;

public class Driver {

  public static void main(String[] args) {

    System.out.println("MAIN MENU:");
    System.out.println("[1] STANDARD");
    System.out.println("[2] DEBUGGER");
    System.out.println("[3] QUIT\n");

    Scanner sc = new Scanner(System.in);
    System.out.print("input: ");
    int menu_input = sc.nextInt();

    switch(menu_input) {
      case 1:
        // construct new, empty LinkedList
        System.out.println("\nMyLinkedList test_case = new MyLinkedList();");
        MyLinkedList test_case = new MyLinkedList();

        // continue
        System.out.println("press [ENTER] to run diagnostics");
        System.out.println("----");
        sc.nextLine();

        // LinkedList constructor diagnostics
        // check initial size()
        System.out.print("// ");
        if(test_case.size() == 0) {
          System.out.println("PASS");
          System.out.println("   test_case.size() == 0");
        } else {
          System.out.println("FAIL");
          System.out.println("   test_case.size() != 0");
        }

        // check toString() against expected
        System.out.print("// ");
        if(test_case.toString().equals("[]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println("   expected: []");
        System.out.println("   actual:   " + test_case);

        // --------------------------------------------------

        // continue
        System.out.println("\npress [ENTER] to test add(Integer value)");
        System.out.print("----");
        sc.nextLine();

        // add(Integer value) values to test_case
        System.out.println("test_case.add(1)");
        System.out.println("test_case.add(2)");
        test_case.add(1);
        test_case.add(2);

        // continue
        System.out.println("\npress [ENTER] to run diagnostics");
        System.out.print("----");
        sc.nextLine();

        // LinkedList add(Integer value) diagnostics
        // check size()
        System.out.print("// ");
        if(test_case.size() == 2) {
          System.out.println("PASS");
          System.out.println("  test_case.size() == 2");
        } else {
          System.out.println("FAIL");
          System.out.println("  test_case.size() != 2");
        }

        // check toString() against expected
        System.out.print("// ");

        if(test_case.toString().equals("[1, 2]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println("  expected: [1, 2]");
        System.out.println("  actual:   " + test_case);

        // continue
        System.out.println("\npress [ENTER] to test add(Integer value)");
        System.out.print("----");
        sc.nextLine();

        // add(Integer value) values to test_case
        System.out.println("test_case.add(-4)");
        System.out.println("test_case.add(-7)");
        test_case.add(-4);
        test_case.add(-7);

        // continue
        System.out.println("\npress [ENTER] to run diagnostics");
        System.out.print("----");
        sc.nextLine();

        // LinkedList add(Integer value) diagnostics
        // check size()
        System.out.print("// ");
        if(test_case.size() == 4) {
          System.out.println("PASS");
          System.out.println("  test_case.size() == 4");
        } else {
          System.out.println("FAIL");
          System.out.println("  test_case.size() != 4");
        }

        // check toString() against expected
        System.out.print("// ");

        if(test_case.toString().equals("[1, 2, -4, -7]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println("  expected: [1, 2, -4, -7]");
        System.out.println("  actual:   " + test_case);

        // continue
        System.out.println("\npress [ENTER] to test add(int index, Integer value)");
        System.out.print("----");
        sc.nextLine();

        // add(int index, Integer value) values to test_case
        System.out.println("test_case.add(3, -9)");
        test_case.add(3, -9);

        // continue
        System.out.println("\npress [ENTER] to run diagnostics");
        System.out.print("----");
        sc.nextLine();

        // LinkedList add(int index, Integer value) diagnostics
        // check size()
        System.out.print("// ");
        if(test_case.size() == 5) {
          System.out.println("PASS");
          System.out.println("  test_case.size() == 5");
        } else {
          System.out.println("FAIL");
          System.out.println("  test_case.size() != 5");
        }

        // check toString() against expected
        System.out.print("// ");

        if(test_case.toString().equals("[1, 2, -4, -9, -7]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println("  expected: [1, 2, -4, -9, -7]");
        System.out.println("  actual:   " + test_case);

        // continue
        System.out.println("\npress [ENTER] to test add(int index, Integer value)");
        System.out.print("----");
        sc.nextLine();

        // add(int index, Integer value) values to test_case
        System.out.println("test_case.add(0, -5)");
        test_case.add(0, -5);

        // continue
        System.out.println("\npress [ENTER] to run diagnostics");
        System.out.print("----");
        sc.nextLine();

        // LinkedList add(int index, Integer value) diagnostics
        // check size()
        System.out.print("// ");
        if(test_case.size() == 6) {
          System.out.println("PASS");
          System.out.println("  test_case.size() == 6");
        } else {
          System.out.println("FAIL");
          System.out.println("  test_case.size() != 6");
        }

        // check toString() against expected
        System.out.print("// ");

        if(test_case.toString().equals("[-5, 1, 2, -4, -9, -7]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println("  expected: [-5, 1, 2, -4, -9, -7]");
        System.out.println("  actual:   " + test_case);

        // continue
        System.out.println("\npress [ENTER] to test negative EXCEPTIONS add(int index, Integer value)");
        System.out.print("----");
        sc.nextLine();

        // add(int index, Integer value) EXCEPTIONS values to test_case
        System.out.println("test_case.add(-1, 10)");

        try {
          test_case.add(-1, 10);
        } catch(IndexOutOfBoundsException e) {
          System.out.println("// INDEX_EXCEPTION : given index exceeds bounds, negative EXCEPTION");
        }

        // continue
        System.out.println("\npress [ENTER] to run diagnostics");
        System.out.print("----");
        sc.nextLine();

        // LinkedList add(int index, Integer value) diagnostics
        // check size()
        System.out.print("// ");
        if(test_case.size() == 6) {
          System.out.println("PASS");
          System.out.println("  test_case.size() == 6");
        } else {
          System.out.println("FAIL");
          System.out.println("  test_case.size() != 6");
        }

        // check toString() against expected
        System.out.print("// ");

        if(test_case.toString().equals("[-5, 1, 2, -4, -9, -7]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println("  expected: [-5, 1, 2, -4, -9, -7]");
        System.out.println("  actual:   " + test_case);

        // continue
        System.out.println("\npress [ENTER] to test overflow EXCEPTIONS add(int index, Integer value)");
        System.out.print("----");
        sc.nextLine();

        // add(int index, Integer value) EXCEPTIONS values to test_case
        System.out.println("test_case.add(7, 10)");

        try {
          test_case.add(7, 10);
        } catch(IndexOutOfBoundsException e) {
          System.out.println("// INDEX_EXCEPTION : given index exceeds bounds, overflow EXCEPTION");
        }

        // continue
        System.out.println("\npress [ENTER] to run diagnostics");
        System.out.print("----");
        sc.nextLine();

        // LinkedList add(int index, Integer value) diagnostics
        // check size()
        System.out.print("// ");
        if(test_case.size() == 6) {
          System.out.println("PASS");
          System.out.println("  test_case.size() == 6");
        } else {
          System.out.println("FAIL");
          System.out.println("  test_case.size() != 6");
        }

        // check toString() against expected
        System.out.print("// ");

        if(test_case.toString().equals("[-5, 1, 2, -4, -9, -7]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println("  expected: [-5, 1, 2, -4, -9, -7]");
        System.out.println("  actual:   " + test_case);

        // --------------------------------------------------

        // continue
        System.out.println("\npress [ENTER] to test get(Index)");
        System.out.print("----");
        sc.nextLine();

        // get(int index) values from test_case
        System.out.println("test_case.get(0)");

        System.out.print("// ");
        if(test_case.get(0) == -5) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }

        System.out.println("  expected: -5");
        System.out.println("  actual:   " + test_case.get(0));

        System.out.println();
        System.out.println("test_case.get(0)");

        System.out.print("// ");
        if(test_case.get(5) == -7) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }

        System.out.println("  expected: -7");
        System.out.println("  actual:   " + test_case.get(5));

        System.out.println();
        System.out.println("test_case.get(0)");

        System.out.print("// ");
        if(test_case.get(4) == -9) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }

        System.out.println("  expected: -9");
        System.out.println("  actual:   " + test_case.get(4));

        // continue
        System.out.println("\npress [ENTER] to test negative EXCEPTIONS get(int index)");
        System.out.print("----");
        sc.nextLine();

        try {
          test_case.get(-1);
        } catch ( IndexOutOfBoundsException e) {
          System.out.println("// INDEX_EXCEPTION : given index exceeds bounds, negative EXCEPTION");
        }

        // continue
        System.out.println("\npress [ENTER] to test overflow EXCEPTIONS get(int index)");
        System.out.print("----");
        sc.nextLine();

        try {
          test_case.get(7);
        } catch (IndexOutOfBoundsException e) {
          System.out.println("// INDEX_EXCEPTION: given index exceeds bounds, overflow EXCEPTION");
        }

        // --------------------------------------------------

        // continue
        System.out.println("\npress [ENTER] to test set(int index, Integer value)");
        System.out.print("----");
        sc.nextLine();

        // set(int index, Integer value) values in test_case
        System.out.println("test_case.set(0, -4)");

        Integer t = test_case.set(0, -4);

        System.out.print("// ");
        if(t.equals(-5)) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }

        System.out.println("  expected: -5");
        System.out.println("  actual:   " + t);

        System.out.println();
        System.out.println("test_case.set(1, 0)");

        t = test_case.set(1, 0);

        System.out.print("// ");
        if(t.equals(1)) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }

        System.out.println("  expected: 1");
        System.out.println("  actual:   " + t);

        System.out.println();
        System.out.println("test_case.set(5, -9)");

        t = test_case.set(5, -9);

        System.out.print("// ");
        if(t.equals(-7)) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }

        System.out.println("  expected: -7");
        System.out.println("  actual:   " + t);

        // continue
        System.out.println("\npress [ENTER] to test negative EXCEPTIONS set(int index, Integer value)");
        System.out.print("----");
        sc.nextLine();

        try {
          test_case.set(-1, 0);
        } catch ( IndexOutOfBoundsException e) {
          System.out.println("// INDEX_EXCEPTION : given index exceeds bounds, negative EXCEPTION");
        }

        // continue
        System.out.println("\npress [ENTER] to test overflow EXCEPTIONS get(int index)");
        System.out.print("----");
        sc.nextLine();

        try {
          test_case.set(7, 0);
        } catch (IndexOutOfBoundsException e) {
          System.out.println("// INDEX_EXCEPTION: given index exceeds bounds, overflow EXCEPTION");
        }

        // continue
        System.out.println("\npress [ENTER] to run diagnostics");
        System.out.print("----");
        sc.nextLine();

        // LinkedList set(int index, Integer value) diagnostics
        // check size()
        System.out.print("// ");
        if(test_case.size() == 6) {
          System.out.println("PASS");
          System.out.println("  test_case.size() == 6");
        } else {
          System.out.println("FAIL");
          System.out.println("  test_case.size() != 6");
        }

        // check toString() against expected
        System.out.print("// ");

        if(test_case.toString().equals("[-4, 0, 2, -4, -9, -9]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println("  expected: [-4, 0, 2, -4, -9, -9]");
        System.out.println("  actual:   " + test_case);

        // --------------------------------------------------

        // continue
        System.out.println("\npress [ENTER] to test contains(Integer value)");
        System.out.print("----");
        sc.nextLine();

        // set(int index, Integer value) values in test_case
        System.out.println("test_case.contains(-4)");

        boolean inclusive = test_case.contains(-4);

        System.out.print("// ");
        if(inclusive) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }

        System.out.println("  expected: true");
        System.out.println("  actual:   " + inclusive);

        System.out.println();
        System.out.println("test_case.contains(-9)");

        inclusive = test_case.contains(-9);

        System.out.print("// ");
        if(inclusive) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }

        System.out.println("  expected: true");
        System.out.println("  actual:   " + inclusive);

        System.out.println();
        System.out.println("test_case.contains(2)");

        inclusive = test_case.contains(2);

        System.out.print("// ");
        if(inclusive) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }

        System.out.println("  expected: true");
        System.out.println("  actual:   " + inclusive);

        System.out.println();
        System.out.println("test_case.contains(14)");

        inclusive = test_case.contains(14);

        System.out.print("// ");
        if(!(inclusive)) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }

        System.out.println("  expected: false");
        System.out.println("  actual:   " + inclusive);

        // --------------------------------------------------

        // continue
        System.out.println("\npress [ENTER] to test indexOf(Integer value)");
        System.out.print("----");
        sc.nextLine();

        // indexOf(Integer value) values in test_case
        System.out.println("test_case.indexOf(-4)");

        int x = test_case.indexOf(-4);

        System.out.print("// ");
        if(x == 0) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }

        System.out.println("  expected: 0");
        System.out.println("  actual:   " + x);

        System.out.println();
        System.out.println("test_case.indexOf(-9)");

        x = test_case.indexOf(-9);

        System.out.print("// ");
        if(x == 4) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }

        System.out.println("  expected: 4");
        System.out.println("  actual:   " + x);

        System.out.println();
        System.out.println("test_case.contains(2)");

        x = test_case.indexOf(2);

        System.out.print("// ");
        if(x == 2) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }

        System.out.println("  expected: 2");
        System.out.println("  actual:   " + x);

        System.out.println();
        System.out.println("test_case.indexOf(14)");

        x = test_case.indexOf(14);

        System.out.print("// ");
        if(x == -1) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }

        System.out.println("  expected: -1");
        System.out.println("  actual:   " + x);

        // --------------------------------------------------

        // continue
        System.out.println("\npress [ENTER] to test remove(int index)");
        System.out.print("----");
        sc.nextLine();

        // remove(int index) values from test_case
        System.out.println("test_case.remove(2)");

        Integer pop = test_case.remove(2);

        System.out.print("// ");
        if(pop.equals(2)) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }

        System.out.println("  expected: 2");
        System.out.println("  actual:   " + pop);

        System.out.println();
        System.out.println("test_case.remove(2)");

        pop = test_case.remove(2);

        System.out.print("// ");
        if(pop.equals(-4)) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }

        System.out.println("  expected: -4");
        System.out.println("  actual:   " + pop);

        System.out.println();
        System.out.println("test_case.remove(0)");

        pop = test_case.remove(0);

        System.out.print("// ");
        if(pop.equals(-4)) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }

        System.out.println("  expected: -4");
        System.out.println("  actual:   " + pop);

        // continue
        System.out.println("\npress [ENTER] to run diagnostics");
        System.out.print("----");
        sc.nextLine();

        // LinkedList remove(int index) diagnostics
        // check size()
        System.out.print("// ");
        if(test_case.size() == 3) {
          System.out.println("PASS");
          System.out.println("  test_case.size() == 3");
        } else {
          System.out.println("FAIL");
          System.out.println("  test_case.size() != 3");
        }

        // check toString() against expected
        System.out.print("// ");

        if(test_case.toString().equals("[0, -9, -9]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println("  expected: [0, -9, -9]");
        System.out.println("  actual:   " + test_case);

        // continue
        System.out.println("\npress [ENTER] to test negative EXCEPTIONS remove(int index)");
        System.out.print("----");
        sc.nextLine();

        try {
          test_case.remove(-1);
        } catch ( IndexOutOfBoundsException e) {
          System.out.println("// INDEX_EXCEPTION : given index exceeds bounds, negative EXCEPTION");
          System.out.print("----");
        }

        // continue
        System.out.println("\npress [ENTER] to test overflow EXCEPTIONS remove(int index)");
        System.out.print("----");
        sc.nextLine();

        try {
          test_case.remove(7);
        } catch (IndexOutOfBoundsException e) {
          System.out.println("// INDEX_EXCEPTION: given index exceeds bounds, overflow EXCEPTION");
        }

        // continue
        System.out.println("\npress [ENTER] to run diagnostics");
        System.out.print("----");
        sc.nextLine();

        // LinkedList remove(int index) diagnostics
        // check size()
        System.out.print("// ");
        if(test_case.size() == 3) {
          System.out.println("PASS");
          System.out.println("  test_case.size() == 3");
        } else {
          System.out.println("FAIL");
          System.out.println("  test_case.size() != 3");
        }

        // check toString() against expected
        System.out.print("// ");

        if(test_case.toString().equals("[0, -9, -9]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println("  expected: [0, -9, -9]");
        System.out.println("  actual:   " + test_case);

        // --------------------------------------------------

        // continue
        System.out.println("\npress [ENTER] to test add(Integer value)");
        System.out.print("----");
        sc.nextLine();

        // add(Integer value) values to test_case
        System.out.println("test_case.add(5)");
        System.out.println("test_case.add(6)");
        System.out.println("test_case.add(7)");
        System.out.println("test_case.add(8)");
        test_case.add(5);
        test_case.add(6);
        test_case.add(7);
        test_case.add(8);

        // continue
        System.out.println("\npress [ENTER] to run diagnostics");
        System.out.print("----");
        sc.nextLine();

        // LinkedList add(Integer value) diagnostics
        // check size()
        System.out.print("// ");
        if(test_case.size() == 7) {
          System.out.println("PASS");
          System.out.println("  test_case.size() == 7");
        } else {
          System.out.println("FAIL");
          System.out.println("  test_case.size() != 7");
        }

        // check toString() against expected
        System.out.print("// ");

        if(test_case.toString().equals("[0, -9, -9, 5, 6, 7, 8]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println("  expected: [0, -9, -9, 5, 6, 7, 8]");
        System.out.println("  actual:   " + test_case);

        // continue
        System.out.println("\npress [ENTER] to test remove(Integer value)");
        System.out.print("----");
        sc.nextLine();

        // remove(int index) values from test_case
        System.out.println("test_case.remove(new Integer(6))");
        System.out.println("test_case.remove(new Integer(-9))");
        test_case.remove(new Integer(6));
        test_case.remove(new Integer(-9));

        // continue
        System.out.println("\npress [ENTER] to run diagnostics");
        System.out.print("----");
        sc.nextLine();

        // LinkedList add(Integer value) diagnostics
        // check size()
        System.out.print("// ");
        if(test_case.size() == 5) {
          System.out.println("PASS");
          System.out.println("  test_case.size() == 5");
        } else {
          System.out.println("FAIL");
          System.out.println("  test_case.size() != 5");
        }

        // check toString() against expected
        System.out.print("// ");

        if(test_case.toString().equals("[0, -9, 5, 7, 8]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println("  expected: [0, -9, 5, 7, 8]");
        System.out.println("  actual:   " + test_case);

        // construct new, empty LinkedList
        System.out.println("\nMyLinkedList paid_dlc = new MyLinkedList();");
        MyLinkedList paid_dlc = new MyLinkedList();

        // continue
        System.out.println("\npress [ENTER] to test add(Integer value)");
        System.out.print("----");
        sc.nextLine();

        // add(Integer value) values to paid_dlc
        System.out.println("paid_dlc.add(0)");
        System.out.println("paid_dlc.add(1)");
        System.out.println("paid_dlc.add(2)");
        System.out.println("paid_dlc.add(3)");
        paid_dlc.add(0);
        paid_dlc.add(1);
        paid_dlc.add(2);
        paid_dlc.add(3);

        // continue
        System.out.println("\npress [ENTER] to run diagnostics");
        System.out.print("----");
        sc.nextLine();

        // LinkedList add(Integer value) diagnostics
        // check size()
        System.out.print("// ");
        if(paid_dlc.size() == 4) {
          System.out.println("PASS");
          System.out.println("  paid_dlc.size() == 4");
        } else {
          System.out.println("FAIL");
          System.out.println("  paid_dlc.size() != 4");
        }

        // check toString() against expected
        System.out.print("// ");

        if(paid_dlc.toString().equals("[0, 1, 2, 3]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println("  expected: [0, 1, 2, 3]");
        System.out.println("  actual:   " + paid_dlc);

        // continue
        System.out.println("\npress [ENTER] to test extend(MyLinkedList other)");
        System.out.print("----");
        sc.nextLine();

        // extend(MyLinkedList other) MyLinkedList to test_case
        System.out.println("test_case.extend(paid_dlc)");
        test_case.extend(paid_dlc);

        // continue
        System.out.println("\npress [ENTER] to run diagnostics");
        System.out.print("----");
        sc.nextLine();

        // LinkedList add(Integer value) diagnostics
        // check size()
        System.out.print("// ");
        if(test_case.size() == 9) {
          System.out.println("PASS");
          System.out.println("  test_case.size() == 9");
        } else {
          System.out.println("FAIL");
          System.out.println("  test_case.size() != 9");
        }

        // check toString() against expected
        System.out.print("// ");

        if(test_case.toString().equals("[0, -9, 5, 7, 8, 0, 1, 2, 3]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println("  expected: [0, -9, 5, 7, 8, 0, 1, 2, 3]");
        System.out.println("  actual:   " + test_case);

        break;
      case 2:
        // construct new, empty LinkedList
        System.out.println("\nMyLinkedList test_debug = new MyLinkedList();");
        MyLinkedList test_debug = new MyLinkedList();

        // submenu input, DEBUGGER
        System.out.println("\nDEBUGGER MENU:");
        System.out.println("[1]  add(Integer value)");
        System.out.println("[2]  add(int index, Integer value)");
        System.out.println("[3]  size()");
        System.out.println("[4]  set(int index, Integer value)");
        System.out.println("[5]  get(int index)");
        System.out.println("[6]  contains(Integer value)");
        System.out.println("[7]  indexOf(Integer value)");
        System.out.println("[8]  remove(int index)");
        System.out.println("[9]  remove(Integer value)");
        System.out.println("[10] extend(MyLinkedList other)");
        System.out.println("[11] QUIT\n");

        System.out.print("input: ");
        int submenu_input = sc.nextInt();

        switch(submenu_input) {
          case 1:
            // test add(Integer value)
            System.out.println("\nNOTE: assumes toString() works");
            System.out.println("TESTING: test_debug.add(Integer value)");
            System.out.println("> test_debug.add(0)");
            System.out.println("> test_debug.add(1)");
            System.out.println("> test_debug.add(10)");
            System.out.println("> test_debug.add(6)");
            test_debug.add(0);
            test_debug.add(1);
            test_debug.add(10);
            test_debug.add(6);

            // check toString() against expected
            System.out.print("// ");

            if(test_debug.toString().equals("[0, 1, 10, 6]")) {
              System.out.println("PASS");
            } else {
              System.out.println("FAIL");
            }
            System.out.println("  expected: [0, 1, 10, 6]");
            System.out.println("  actual:   " + test_debug);

            System.out.println();

            break;
          case 2:
            // test add(int index, Integer value)
            System.out.println("\nNOTE: assumes add(Integer value) works");
            System.out.println("NOTE: assumes toString() works");
            System.out.println("TESTING: test_debug.add(int index, Integer value)");
            System.out.println("> test_debug.add(0)");
            System.out.println("> test_debug.add(0, -1)");
            System.out.println("> test_debug.add(1, -10)");
            System.out.println("> test_debug.add(1, 2)");
            System.out.println("> test_debug.add(2, 9)");
            test_debug.add(0);
            test_debug.add(0, -1);
            test_debug.add(1, -10);
            test_debug.add(1, 2);
            test_debug.add(2, 9);

            // check toString() against expected
            System.out.print("// ");

            if(test_debug.toString().equals("[-1, 2, 9, -10, 0]")) {
              System.out.println("PASS");
            } else {
              System.out.println("FAIL");
            }
            System.out.println("  expected: [-1, 2, 9, -10, 0]");
            System.out.println("  actual:   " + test_debug);

            System.out.println();

            break;
          case 3:
            // test size()
            System.out.println("\nNOTE: assumes add(Integer value) works");
            System.out.println("TESTING: test_debug.size()");
            System.out.println("> test_debug.add(0)");
            System.out.println("> test_debug.add(1)");
            System.out.println("> test_debug.add(2)");
            test_debug.add(0);
            test_debug.add(1);
            test_debug.add(2);

            System.out.print("// ");

            if(test_debug.size() == 3) {
              System.out.println("PASS");
            } else {
              System.out.println("FAIL");
            }
            System.out.println("  expected: 3");
            System.out.println("  actual:   " + test_debug.size());

            System.out.println();

            break;
          case 4:
            // test set(int index, Integer value)
            System.out.println("\nNOTE: assumes add(Integer value) works");
            System.out.println("NOTE: assumes toString() works");
            System.out.println("TESTING: test_debug.set(int index, Integer value)");
            System.out.println("> test_debug.add(0)");
            System.out.println("> test_debug.add(1)");
            System.out.println("> test_debug.add(2)");
            System.out.println("> test_debug.add(2)");
            System.out.println("> test_debug.set(0, -10)");
            System.out.println("> test_debug.set(2, -6)");
            System.out.println("> test_debug.set(3, -6)");

            test_debug.add(0);
            test_debug.add(1);
            test_debug.add(2);
            test_debug.add(2);

            Integer set_temp = test_debug.set(0, -10);

            System.out.print("// ");

            if(set_temp.equals(0)) {
              System.out.println("PASS");
            } else {
              System.out.println("FAIL");
            }
            System.out.println("  expected: 0");
            System.out.println("  actual:   " + set_temp);

            set_temp = test_debug.set(2, -6);

            System.out.print("// ");

            if(set_temp.equals(2)) {
              System.out.println("PASS");
            } else {
              System.out.println("FAIL");
            }
            System.out.println("  expected: 2");
            System.out.println("  actual:   " + set_temp);

            set_temp = test_debug.set(3, -6);

            System.out.print("// ");

            if(set_temp.equals(2)) {
              System.out.println("PASS");
            } else {
              System.out.println("FAIL");
            }
            System.out.println("  expected: 2");
            System.out.println("  actual:   " + set_temp);

            // check toString() against expected
            System.out.print("// ");

            if(test_debug.toString().equals("[-10, 1, -6, -6]")) {
              System.out.println("PASS");
            } else {
              System.out.println("FAIL");
            }
            System.out.println("  expected: [-10, 1, -6, -6]");
            System.out.println("  actual:   " + test_debug.toString());

            System.out.println();

            break;
          case 5:
            // ?
            break;
          case 6:
            // ?
            break;
          case 7:
            // ?
            break;
          case 8:
            // ?
            break;
          case 9:
            // ?
            break;
          case 10:
            // ?
            break;
          case 11:
            System.out.println("how could you leave me like this ;-;");
            System.out.println("force quit prgm...");
            System.exit(0);

            break;
          default:
            System.out.println("not a given option");
            System.exit(0);

            break;
        }

        break;
      case 3:
        System.out.println("how could you leave me like this ;-;");
        System.out.println("force quit prgm...");
        System.exit(0);

        break;
      default:
        System.out.println("not a given option");
        System.exit(0);

        break;
    }
  }
}
