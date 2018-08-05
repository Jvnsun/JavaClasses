package task3secretary.commandpattern.receiver;

import java.util.Random;

public class Director {

  /**
   * Give holiday to worker.
   *
   * @return the number of days in the holiday
   */
  public int giveHoliday() {
    return 14 + new Random().nextInt(14);
  }
}
