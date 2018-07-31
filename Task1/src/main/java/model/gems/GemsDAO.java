package model.gems;

import java.util.Collection;

import model.gem.Gem;

public interface GemsDAO {
  Collection<Gem> getAll();

  Gem getById(long id);

}
