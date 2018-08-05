package task1human.compositepattern.component;

import java.util.Objects;

public abstract class Role {

  public abstract String getInfo();

  @Override
  public boolean equals(Object otherObj) {
    if (this == otherObj) {
      return true;
    }
    if (otherObj == null) {
      return false;
    }
    if (!(otherObj instanceof Role)) {
      return false;
    }
    Role other = (Role) otherObj;
    return Objects.equals(this.getInfo(), other.getInfo());
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(this.getInfo());
  }

}
