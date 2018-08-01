package model.entity.gem;

public abstract class Gem {
  private final long id;
  private final long price;
  private final Clarity clarity;
  private final String color;

  public abstract long getWeightCarats();

  public abstract long getWeightGrams();

  public abstract String[] getDescription();

  public Gem(long id, long price, Clarity clarity, String color) {
    this.id = id;
    this.price = price;
    this.clarity = clarity;
    this.color = color;
  }

  public long getId() {
    return id;
  }

  public long getPrice() {
    return price;
  }

  public Clarity getClarity() {
    return clarity;
  }

  public String getColor() {
    return color;
  }

}
