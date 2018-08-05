package task1human;

import task1human.compositepattern.Setting;
import task1human.compositepattern.composite.Human;

public class Task1Main {

  public static void main(String[] args) {
    Human dummy = new Human();
    dummy.addSetting(Setting.MUSHROOM_GLADE);
    System.out.println(dummy.getInfo());
    dummy.addSetting(Setting.RIVER_BANK, Setting.SEEING_BEAST);
    System.out.println(dummy.getInfo());
    dummy.removeSetting(Setting.RIVER_BANK);
    System.out.println(dummy.getInfo());
    dummy.removeSetting(Setting.MUSHROOM_GLADE, Setting.SEEING_BEAST);
    System.out.println(dummy.getInfo());
  }

}
