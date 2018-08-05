package task3secretary.commandpattern.invoker;

import task3secretary.commandpattern.command.Redirection;

public class Worker {
  public void redirect(Redirection r) {
    r.handle();
  }
}
