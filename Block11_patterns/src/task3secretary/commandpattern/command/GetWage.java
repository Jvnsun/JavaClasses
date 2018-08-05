package task3secretary.commandpattern.command;

import java.util.Objects;

import task3secretary.commandpattern.receiver.Accountant;

public class GetWage implements Redirection {
  private Accountant accountant;

  public GetWage(Accountant accountant) {
    Objects.requireNonNull(accountant);
    this.accountant = accountant;
  }

  @Override
  public void handle() {
    int wage = this.accountant.payWage();
    System.out.println("Worker was paid the wage in the amount of " + wage);
  }

}
