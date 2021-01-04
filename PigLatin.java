import java.util.*;

public class PigLatin {
  public static void main(String[] args) {

  }

  public static String pigLatinSimple(String s) {
    char[] vows = {'a', 'e', 'i', 'o', 'u'};
    ArrayList<Character> vowels = convertArrToList(vows);
    if (vowels.contains(s.charAt(0))) return s + "hay";
    return s.substring(1, s.length()) + s.charAt(0) + "ay";
  }

  public static ArrayList<Character> convertArrToList(char[] data) {
    ArrayList<Character> toreturn = new ArrayList<Character>();
    for (int i = 0; i < data.length; i++) {
      toreturn.add(data[i]);
    }
    return toreturn;
  }
}
