package model.gem;

import java.util.Comparator;

public enum Sort implements Comparator<Gem> {
  PRICE_INCREASING((Gem g1, Gem g2) -> (int) (g1.getPrice() - g2.getPrice())),
  PRICE_DECREASING((Gem g1, Gem g2) -> (int) (g2.getPrice() - g1.getPrice())),
  CLARITY_INCREASING((Gem g1, Gem g2) -> g1.getClarity().ordinal()
      - g2.getClarity().ordinal());

  private Comparator<Gem> sort;

  private Sort(Comparator<Gem> sort) {
    this.sort = sort;
  }

  @Override
  public int compare(Gem arg0, Gem arg1) {
    return this.sort.compare(arg0, arg1);
  }

}
