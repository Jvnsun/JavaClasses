package task3secretary.commandpattern;

import task3secretary.commandpattern.client.Secretary;
import task3secretary.commandpattern.invoker.Worker;
import task3secretary.commandpattern.receiver.Accountant;
import task3secretary.commandpattern.receiver.Director;
import task3secretary.commandpattern.receiver.Stock;

public class Task3Main {

  public static void main(String[] args) {
    Director director = new Director();
    Accountant accountant = new Accountant();
    Stock stock = new Stock();
    Secretary secretary = new Secretary(director, accountant, stock);
    Worker worker = new Worker();
    for (int i = 0; i < 5; i++) {
      secretary.redirectWorker(worker);
    }
  }

}
