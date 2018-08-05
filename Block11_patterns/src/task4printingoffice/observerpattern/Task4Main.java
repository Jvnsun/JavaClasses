package task4printingoffice.observerpattern;

import task4printingoffice.observerpattern.observer.Subscriber;
import task4printingoffice.observerpattern.subject.PrintingHouse;

public class Task4Main {

  public static void main(String[] args) {
    PrintingHouse ph = new PrintingHouse();
    Subscriber s1 = new Subscriber("Sunny");
    Subscriber s2 = new Subscriber("Long River");
    ph.addObserver(s1);
    ph.addObserver(s2);
    ph.publishNewIssue("Winter is coming");
    ph.publishNewIssue("Peace came to Donbass");
  }

}
