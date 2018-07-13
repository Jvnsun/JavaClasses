package model.impl.regexp;

public interface LatinRegExps {
  String name = "[A-Z][a-z]+(\\s[A-Z][a-z]+)?";
  String surname = "[A-Z][a-z]*([\\s’\\-][A-Z][a-z]*)?";
}
