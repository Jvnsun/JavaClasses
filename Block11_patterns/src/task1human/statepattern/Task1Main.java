package task1human.statepattern;

import task1human.statepattern.context.Human;
import task1human.statepattern.statefactory.impl.StateFactory;

public class Task1Main {

  public static void main(String[] args) {
    Human human = new Human(new StateFactory());
    human.setEnvironment("Forest");
    System.out.println(human.getCurrentStateInfo());
    human.setEnvironment("Lake");
    System.out.println(human.getCurrentStateInfo());
    human.setEnvironment("Safari");
    System.out.println(human.getCurrentStateInfo());
  }

}
