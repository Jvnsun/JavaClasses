package model.gems;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import model.gem.Clarity;
import model.gem.Gem;
import model.gem.precious.PGemType;
import model.gem.precious.PreciousGem;
import model.gem.precious.Shape;
import model.gem.semiprecious.Glossiness;
import model.gem.semiprecious.SPGemType;
import model.gem.semiprecious.SemipreciousGem;

public final class Gems implements GemsDAO {
  public static final Gems INSTANCE = new Gems();
  private final Map<Long, Gem> gems;

  private Gems() {
    this.gems = new TreeMap<Long, Gem>();
    this.gems.put(1L, new PreciousGem(1L, 1000, Clarity.O, "Black", 20,
        Shape.OVAL, PGemType.DIAMOND));
    this.gems.put(2L, new PreciousGem(2L, 2000, Clarity.IF, "Black Space", 30,
        Shape.OVAL, PGemType.DIAMOND));
    this.gems.put(3L, new SemipreciousGem(3L, 500, Clarity.Tp, "Red", 3,
        Glossiness.GLOSSY, SPGemType.PEARL));
    this.gems.put(4L, new SemipreciousGem(4L, 300, Clarity.O, "Red Sun", 5,
        Glossiness.GLOSSY, SPGemType.PEARL));
  }

  @Override
  public Collection<Gem> getAll() {
    return this.gems.values();
  }

  @Override
  public Gem getById(long id) {
    return this.gems.get(id);
  }

}
