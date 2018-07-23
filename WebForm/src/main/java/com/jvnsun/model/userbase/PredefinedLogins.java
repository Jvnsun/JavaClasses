package com.jvnsun.model.userbase;

import java.util.HashSet;
import java.util.Set;

interface PredefinedLogins {
  Set<String> logins = new HashSet<String>() {
    {
      this.add("admin");
      this.add("Admin");
      this.add("ADMIN");
      this.add("superuser");
      this.add("jvnsun");
    }
  };
}
