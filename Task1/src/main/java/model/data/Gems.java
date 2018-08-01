package model.data;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import model.entity.gem.Clarity;
import model.entity.gem.Gem;
import model.entity.gem.precious.PGemType;
import model.entity.gem.precious.PreciousGem;
import model.entity.gem.precious.Shape;
import model.entity.gem.semiprecious.Glossiness;
import model.entity.gem.semiprecious.SPGemType;
import model.entity.gem.semiprecious.SemipreciousGem;

public final class Gems implements GemsDAO {
  public static final Gems INSTANCE = new Gems();
  private final Map<Long, Gem> gems;

  private Gems() {

    this.gems = new TreeMap<Long, Gem>();
    this.gems.put(1L, new PreciousGem(1L, 1000, Clarity.O, "Black", 15,
        Shape.OVAL, PGemType.DIAMOND));
    this.gems.put(2L, new PreciousGem(2L, 2000, Clarity.IF, "Black Space", 35,
        Shape.OVAL, PGemType.DIAMOND));
    this.gems.put(3L, new SemipreciousGem(3L, 500, Clarity.Tp, "Red", 4,
        Glossiness.GLOSSY, SPGemType.PEARL));
    this.gems.put(4L, new SemipreciousGem(4L, 300, Clarity.O, "Red Sun", 10,
        Glossiness.GLOSSY, SPGemType.PEARL));
    this.gems.put(5L, new PreciousGem(5L, 1200, Clarity.I1, "Black", 10,
        Shape.OVAL, PGemType.DIAMOND));
    this.gems.put(6L, new PreciousGem(6L, 2050, Clarity.VS, "Red", 30,
        Shape.OVAL, PGemType.DIAMOND));
    this.gems.put(7L, new SemipreciousGem(7L, 1500, Clarity.Tp, "White", 3,
        Glossiness.GLOSSY, SPGemType.PEARL));
    this.gems.put(8L, new SemipreciousGem(8L, 375, Clarity.O, "Milk", 8,
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
