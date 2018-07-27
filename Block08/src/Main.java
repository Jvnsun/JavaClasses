import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    task1();
  }

  public static void task1() {
    List<Integer> list = Arrays.asList(4, 5, -6, 4, 5, 3, 4, 2, 4, 5, 7);
    Map<Integer, Integer> map = occurenciesMap(list);
    printMap(map);
  }

  private static Map<Integer, Integer> occurenciesMap(List<Integer> list) {
    Map<Integer, Integer> map = new HashMap<>();
    for (Integer key : list) {
      Integer currentValue = map.putIfAbsent(key, 1);
      if (currentValue != null) {
        map.put(key, currentValue + 1);
      }
    }
    return map;
  }

  private static void printMap(Map<Integer, Integer> map) {
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " - " + entry.getValue());
    }
  }

}
