package task1human.statepattern.context;

import task1human.statepattern.state.State;
import task1human.statepattern.statefactory.AbstractStateFactory;

public class Human {
  private State state;
  private AbstractStateFactory factory;

  public Human(AbstractStateFactory factory) {
    this.factory = factory;
  }

  public void setEnvironment(String s) {
    this.state = this.factory.createState(s);
  }

  public String getCurrentStateInfo() {
    return this.state.getInfo();
  }
}
