package task2tour.builderpattern.product;

import java.math.BigDecimal;
import java.time.LocalTime;

public interface Transfer {

  LocalTime getDuration();

  Double getDistance();

  BigDecimal getPrice();

  Way getWay();

  @Override
  String toString();

}
