package task2tour.builderpattern.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;

public interface Tour {

  LocalDate getStartDate();

  LocalDate getEndDate();

  String getLocation();

  Transfer getFlight();

  Dwelling getDwelling();

  Optional<Transfer> getAirportTransfer();

  Optional<Insurance> getInsurance();

  BigDecimal getPrice();

}
