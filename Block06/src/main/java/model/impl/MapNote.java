package model.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import model.api.Field;
import model.api.Note;

public class MapNote implements Note {
  private Map<Field, String> map;

  MapNote() {
    this.map = new HashMap<>();
  }

  void addField(Field f) {
    this.map.put(f, null);

  }

  @Override
  public void setField(Field f, String v) {
    if (map.containsKey(f) == false) {
      throw new MissingFieldException();
    } else {
      this.map.put(f, v);
    }

  }

  @Override
  public Map<Field, String> getView() {
    return Collections.unmodifiableMap(this.map);
  }

}
