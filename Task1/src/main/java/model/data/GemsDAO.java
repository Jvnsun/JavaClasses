package model.data;

import java.util.Collection;

import model.entity.gem.Gem;

public interface GemsDAO {
  Collection<Gem> getAll();

  Gem getById(long id);

}
