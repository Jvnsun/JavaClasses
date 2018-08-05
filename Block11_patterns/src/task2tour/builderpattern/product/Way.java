package task2tour.builderpattern.product;

public enum Way {
  NONE(0), FORWARD(1), BACKWARD(1), BOTH(2);

  public final int nWays;

  public int ways() {
    return this.nWays;
  }

  private Way(int nWays) {
    this.nWays = nWays;
  }
}
