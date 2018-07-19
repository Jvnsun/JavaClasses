package view;

import java.util.Map;

import model.api.Field;

// TODO add interface
public class ConsoleView {

  public void displayMessage(String s) {
    System.out.print(s);
  }

  public void displayNote(Map<Field, String> map, String separator) {
    for (Map.Entry<Field, String> field : map.entrySet()) {
      System.out.println(field.getKey().getName() + separator + field.getValue());
    }
  }

}
