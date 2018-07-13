package model.impl.regexp;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import model.impl.regexp.RegExps;

class RegExpsTest {

  @ParameterizedTest()
  @ValueSource(strings = { "Joe", "bill", "Anna123", "John21Arthur", "Anna_Grace", "MaryMargaret" })
  void validNicknameTest(String nick) {
    assertTrue(nick.matches(RegExps.nickname), nick);
  }

  @ParameterizedTest()
  @ValueSource(strings = { "Вася", "100500", "Ann`a", "O’Dowd", "RobertBobMikeNickJohn" })
  void invalidNicknameTest(String nick) {
    assertFalse(nick.matches(RegExps.nickname), nick);
  }

  @ParameterizedTest()
  @ValueSource(strings = { "+380960801472", "+100200300400", "+123456789876" })
  void validPhoneNumberTest(String number) {
    assertTrue(number.matches(RegExps.phoneNumber), number);
  }

  @ParameterizedTest()
  @ValueSource(strings = { "380960801472", "-100200300400", "+23456789876", "number", "+38O96O8O1472" })
  void invalidPhoneNumberTest(String number) {
    assertFalse(number.matches(RegExps.phoneNumber), number);
  }

}
