package task4printingoffice.observerpattern.subject;

import java.util.Observable;

import task4printingoffice.observerpattern.NewspaperEdition;

public class PrintingHouse extends Observable {
  private long issue = 0;

  public void publishNewIssue(String title) {
    NewspaperEdition paper = new NewspaperEdition.Builder(++this.issue)
        .buildTitle(title).build();
    setChanged();
    notifyObservers(paper);
  }
}
