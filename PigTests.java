import java.util.*;

public class PigTests {

  public static void main(String[] args) {
    testPigSimple();
  }

  public static void testPigSimple() {
    ArrayList<Boolean> results = new ArrayList<Boolean>();

    String one = "catscatscats";
    results.add(PigLatin.pigLatinSimple(one).equals("atscatscatscay"));

    one = "aaron";
    results.add(PigLatin.pigLatinSimple(one).equals("aaronhay"));

    one = "pie";
    results.add(PigLatin.pigLatinSimple(one).equals("iepay"));

    one = "elephants hm ";
    results.add(PigLatin.pigLatinSimple(one).equals("elephants hm hay"));

    one = "david";
    results.add(PigLatin.pigLatinSimple(one).equals("avidday"));

    one = "mock";
    results.add(PigLatin.pigLatinSimple(one).equals("ockmay"));

    showResults(results, "Test simple pig latin");
  }

  private static void showRandomResults(ArrayList<String> info) {
    for (int i = 0; i < info.size(); i++) {
      System.out.println("Randomized tests #" + (i + 1) + ": FAIL: Array-" + info.get(i));
    }
    if (info.size() == 0) System.out.println("Randomized tests: PASS");
  }

  private static void showResults(ArrayList<Boolean> results, String testName) {
    for (int i = 0; i < results.size(); i++) {
      if (results.get(i)) System.out.println(testName + " #" + (i + 1) + ": PASS");
      else System.out.println(testName + " #" + (i + 1) + ": FAIL");
    }
  }

}
