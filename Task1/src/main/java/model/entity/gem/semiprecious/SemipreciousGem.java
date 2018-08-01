package model.entity.gem.semiprecious;

import model.entity.gem.Clarity;
import model.entity.gem.Gem;

public class SemipreciousGem extends Gem {
  private final long grams;
  private final Glossiness glossiness;
  private final SPGemType type;

  public SemipreciousGem(long id, long price, Clarity clarity, String color,
      long grams, Glossiness glossiness, SPGemType type) {
    super(id, price, clarity, color);
    this.grams = grams;
    this.glossiness = glossiness;
    this.type = type;
  }

  public long getGrams() {
    return grams;
  }

  public Glossiness getGlossiness() {
    return glossiness;
  }

  public SPGemType getType() {
    return type;
  }

  @Override
  public long getWeightCarats() {
    return this.grams * 5;
  }

  @Override
  public long getWeightGrams() {
    return this.grams;
  }

  @Override
  public String[] getDescription() {
    String[] description = {
        "Id : " + super.getId(), "Price : " + super.getPrice(),
        "Clarity : " + super.getClarity(), "Color : " + super.getColor(),
        "Weight : " + this.getGrams() + " g.",
        "Glossiness : " + this.getGlossiness(), "Type : " + this.getType()
    };
    return description;
  }

}
