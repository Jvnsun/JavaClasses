package model.impl.regexp;

public interface RegExps {
  String nickname = "[a-zA-Z](\\w){2,12}";
  String phoneNumber = "\\+[0-9]{12}";
}
