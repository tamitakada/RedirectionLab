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

  public static String pigLatin(String s) {
    char[] vows = {'a', 'e', 'i', 'o', 'u'};
    ArrayList<Character> vowels = convertArrToList(vows);

    String[] digs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh",
    "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm",
    "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    ArrayList<String> digraphs = convertArrToList(digs);

    if (vowels.contains(s.charAt(0))) return s + "hay";
    else if (s.length() > 1 && digraphs.contains(s.substring(0, 2))) {
      return s.substring(2, s.length()) + s.substring(0, 2) + "ay";
    }
    return s.substring(1, s.length()) + s.charAt(0) + "ay";
  }

  public static ArrayList<Character> convertArrToList(char[] data) {
    ArrayList<Character> toreturn = new ArrayList<Character>();
    for (int i = 0; i < data.length; i++) {
      toreturn.add(data[i]);
    }
    return toreturn;
  }

  public static ArrayList<String> convertArrToList(String[] data) {
    ArrayList<String> toreturn = new ArrayList<String>();
    for (int i = 0; i < data.length; i++) {
      toreturn.add(data[i]);
    }
    return toreturn;
  }
}
