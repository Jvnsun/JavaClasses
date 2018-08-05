package task3secretary.commandpattern.receiver;

import java.util.Random;

public class Stock {
  public int getFreeSpacePercentage() {
    return new Random().nextInt(101);
  }
}
