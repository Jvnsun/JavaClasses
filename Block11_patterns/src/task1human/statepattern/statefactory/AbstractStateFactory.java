package task1human.statepattern.statefactory;

import task1human.statepattern.state.State;

public interface AbstractStateFactory {
  State createState(String s);
}
