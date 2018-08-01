package model.entity.necklace;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.data.GemsDAO;
import model.entity.gem.Clarity;
import model.entity.gem.Gem;

public final class Necklace {
  public final Collection<Gem> gems;
  public final long price;
  public final long carats;
  public final long grams;

  public Collection<Gem> getGems() {
    return gems;
  }

  public long getPrice() {
    return price;
  }

  public long getCarats() {
    return carats;
  }

  public long getGrams() {
    return grams;
  }

  private Necklace(Collection<Gem> gems, long price, long weightInCarats,
      long weightInGrams) {
    this.gems = Collections.unmodifiableCollection(gems);
    this.price = price;
    this.carats = weightInCarats;
    this.grams = weightInGrams;
  }

  public static class Builder {
    private GemsDAO gems;
    private List<Gem> necklace;
    private long price;
    private long weightInCarats;
    private long weightInGrams;

    public Builder(GemsDAO gems, long[] IDs) {
      this.gems = gems;
      this.necklace = new ArrayList<>();
      for (long id : IDs) {
        Gem gem = this.gems.getById(id);
        this.necklace.add(gem);
        this.price += gem.getPrice();
        this.weightInCarats += gem.getWeightCarats();
        this.weightInGrams += gem.getWeightGrams();
      }
    }

    public Builder sort(Comparator<Gem> comp) {
      this.necklace.sort(comp);
      return this;
    }

    public Builder retainInClarityRange(Clarity from, Clarity to) {
      ArrayList<Gem> retained = new ArrayList<>();
      this.price = 0;
      this.weightInCarats = 0;
      this.weightInGrams = 0;
      this.necklace.forEach((gem) -> {
        int gemClarityOrdinal = gem.getClarity().ordinal();
        if (from.ordinal() <= gemClarityOrdinal
            && gemClarityOrdinal <= to.ordinal()) {
          retained.add(gem);
          this.price += gem.getPrice();
          this.weightInCarats += gem.getWeightCarats();
          this.weightInGrams += gem.getWeightGrams();
        }
      });
      this.necklace = retained;
      return this;
    }

    public Necklace build() {
      return new Necklace(necklace, this.price, this.weightInCarats,
          this.weightInGrams);
    }
  }

}
