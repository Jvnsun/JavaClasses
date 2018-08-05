package task1human.compositepattern.composite;

import java.util.HashSet;
import java.util.Set;

import task1human.compositepattern.Setting;
import task1human.compositepattern.component.Role;

public class Human extends Role {

  private Set<Role> state;

  public Human() {
    this.state = new HashSet<>();
  }

  @Override
  public String getInfo() {
    StringBuilder info = new StringBuilder("Человек");
    this.state.forEach(
        (role) -> info.append(", сейчас также ").append(role.getInfo()));
    return info.toString();
  }

  public void addSetting(Setting... settings) {
    for (Setting s : settings) {
      this.state.add(s.matchingRole);
    }
  }

  public void removeSetting(Setting... settings) {
    for (Setting s : settings) {
      this.state.remove(s.matchingRole);
    }
  }
}
