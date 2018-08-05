package task1human.compositepattern;

import task1human.compositepattern.component.Role;
import task1human.compositepattern.leaf.Fisher;
import task1human.compositepattern.leaf.Hunter;
import task1human.compositepattern.leaf.Mushroomer;

/**
 * The Setting Enum provides formalization of the environment states listed in
 * the task
 */
public enum Setting {

  /** On the river bank. */
  RIVER_BANK(new Fisher()),
  /** On the mushroom glade. */
  MUSHROOM_GLADE(new Mushroomer()),
  /** Seeing beast. */
  SEEING_BEAST(new Hunter());

  /**
   * The corresponding role that the actor achieves when got into the setting
   * environment
   */
  public final Role matchingRole;

  /**
   * Instantiates a new setting.
   *
   * @param r - the corresponding role
   */
  private Setting(Role r) {
    this.matchingRole = r;
  }
}
