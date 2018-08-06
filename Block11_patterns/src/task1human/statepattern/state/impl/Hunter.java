package task1human.statepattern.state.impl;

import task1human.statepattern.state.State;

public class Hunter implements State {

  @Override
  public String getInfo() {
    return "Охотник";
  }

}
