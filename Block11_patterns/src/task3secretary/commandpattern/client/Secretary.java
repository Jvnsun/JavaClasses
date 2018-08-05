package task3secretary.commandpattern.client;

import java.util.Random;

import task3secretary.commandpattern.command.ApplyForHoliday;
import task3secretary.commandpattern.command.CheckSpace;
import task3secretary.commandpattern.command.GetWage;
import task3secretary.commandpattern.command.Redirection;
import task3secretary.commandpattern.invoker.Worker;
import task3secretary.commandpattern.receiver.Accountant;
import task3secretary.commandpattern.receiver.Director;
import task3secretary.commandpattern.receiver.Stock;

public class Secretary {
  private Director director;
  private Accountant accountant;
  private Stock stock;

  public Secretary(Director director, Accountant accountant, Stock stock) {
    this.director = director;
    this.accountant = accountant;
    this.stock = stock;
  }

  public void redirectWorker(Worker w) {
    int taskNumber = new Random().nextInt(3);
    Redirection r;
    switch (taskNumber) {
    case 0:
      r = new ApplyForHoliday(this.director);
      break;
    case 1:
      r = new GetWage(this.accountant);
      break;
    default:
      r = new CheckSpace(this.stock);
      break;
    }
    w.redirect(r);
  }
}
