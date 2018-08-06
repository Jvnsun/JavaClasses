package task1human.statepattern.statefactory.impl;

import task1human.statepattern.state.State;
import task1human.statepattern.state.impl.Fisher;
import task1human.statepattern.state.impl.Hunter;
import task1human.statepattern.state.impl.Mushroomer;
import task1human.statepattern.statefactory.AbstractStateFactory;
import task1human.statepattern.statefactory.InvalidStateQualifier;

public class StateFactory implements AbstractStateFactory {

  @Override
  public State createState(String s) {
    switch (s) {
    case "Safari":
      return new Hunter();
    case "Lake":
      return new Fisher();
    case "Forest":
      return new Mushroomer();
    default:
      throw new InvalidStateQualifier();
    }
  }

}
