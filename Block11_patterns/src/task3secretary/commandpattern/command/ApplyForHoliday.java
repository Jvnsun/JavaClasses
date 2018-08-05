package task3secretary.commandpattern.command;

import java.util.Objects;

import task3secretary.commandpattern.receiver.Director;

public class ApplyForHoliday implements Redirection {
  private Director director;

  public ApplyForHoliday(Director d) {
    Objects.requireNonNull(d);
    this.director = d;
  }

  @Override
  public void handle() {
    int nDays = this.director.giveHoliday();
    System.out
        .println("Director sent the worker on vacation for " + nDays + " days");
  }

}
