package task2tour.builderpattern.product;

import java.math.BigInteger;
import java.time.LocalDate;

public interface Tour {

  String getLocation();

  LocalDate getStartDate();

  LocalDate getEndDate();

  BigInteger getPrice();

  Transfer getAirportTransfer();

  Transfer getFlight();

  Dwelling getDwelling();

  Insurance getInsurance();

}
