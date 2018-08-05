package task3secretary.commandpattern.receiver;

import java.util.Random;

public class Accountant {
  public int payWage() {
    return 5000 + new Random().nextInt(5000);
  }
}
