package model.entity.gem.precious;

import model.entity.gem.Clarity;
import model.entity.gem.Gem;

public final class PreciousGem extends Gem {
  private final long carats;
  private final Shape cut;
  private final PGemType type;

  public PreciousGem(long id, long price, Clarity clarity, String color,
      long carats, Shape cut, PGemType type) {
    super(id, price, clarity, color);
    this.carats = carats;
    this.cut = cut;
    this.type = type;
  }

  public long getCarats() {
    return carats;
  }

  public Shape getCut() {
    return cut;
  }

  public PGemType getType() {
    return type;
  }

  @Override
  public long getWeightCarats() {
    return this.carats;
  }

  @Override
  public long getWeightGrams() {
    return this.carats / 5;
  }

  @Override
  public String[] getDescription() {
    String[] description = {
        "Id : " + super.getId(), "Price : " + super.getPrice(),
        "Clarity : " + super.getClarity(), "Color : " + super.getColor(),
        "Weight : " + this.getCarats() + " ct.", "Cut : " + this.getCut(),
        "Type : " + this.getType()
    };
    return description;
  }

}
