package task2tour.builderpattern.product;

import java.math.BigDecimal;
import java.time.LocalTime;

public interface Transfer {
  Way getWay();

  LocalTime getDuration();

  BigDecimal getPrice();

}
