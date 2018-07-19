package model.api;

import java.util.Map;

public interface Note {

  void setField(Field f, String v);

  Map<Field, String> getView();

  @Override
  String toString();
}
