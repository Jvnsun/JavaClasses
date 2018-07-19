package model.impl;

import java.util.HashSet;
import java.util.Set;

public interface LoginsDemoStorage {
  Set<String> logins = new HashSet<String>() {
    {
      add("jvnsun");
      add("admin");
      add("Evheniy");
    }
  };
}
