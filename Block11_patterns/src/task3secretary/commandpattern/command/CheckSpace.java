package task3secretary.commandpattern.command;

import java.util.Objects;

import task3secretary.commandpattern.receiver.Stock;

public class CheckSpace implements Redirection {
  private Stock stock;

  public CheckSpace(Stock stock) {
    Objects.requireNonNull(stock);
    this.stock = stock;
  }

  @Override
  public void handle() {
    int percents = this.stock.getFreeSpacePercentage();
    System.out.println("The stock has " + percents + " % available space");

  }

}
