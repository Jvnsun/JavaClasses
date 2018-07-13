package model.impl.regexp;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import model.impl.regexp.LatinRegExps;

class LatinRegExpsTest {

  @ParameterizedTest()
  @ValueSource(strings = { "Joe", "Bill", "Anna", "John Arthur", "Anna Grace", "Mary Margaret" })
  void validLatinNameTest(String name) {
    assertTrue(name.matches(LatinRegExps.name), name);
  }

  @ParameterizedTest()
  @ValueSource(strings = { "", " ", "A", "BoB", "123", "J0e", "Вася", "Mary-Margaret" })
  void invalidLatinNameTest(String name) {
    assertFalse(name.matches(LatinRegExps.name), name);
  }

  @ParameterizedTest()
  @ValueSource(strings = { "Carter", "Martin", "Baron Cohen", "Huntington-Whiteley", "O’Dowd" })
  void validLatinSurnameTest(String surname) {
    assertTrue(surname.matches(LatinRegExps.surname), surname);
  }

  @ParameterizedTest()
  @ValueSource(strings = { "carter", "Mart1n", "ObamA", "Baron Cohen Stone", "Huntington-Whiteley-Smith", "O`Dowd",
      "O'Dowd" })
  void invalidLatinSurnameTest(String surname) {
    assertFalse(surname.matches(LatinRegExps.surname), surname);
  }
}
