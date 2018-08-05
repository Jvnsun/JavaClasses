package task4printingoffice.observerpattern.observer;

import java.util.Observable;
import java.util.Observer;

public class Subscriber implements Observer {
  private String village;

  public Subscriber(String village) {
    this.village = village;
  }

  @Override
  public void update(Observable printingHouse, Object paper) {
    System.out.println(
        "People from " + this.village + " village received a new issue:");
    System.out.println(paper);
  }

}
