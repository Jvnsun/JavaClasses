package task2tour.builderpattern.builder;

import java.time.LocalDate;

import task2tour.builderpattern.product.Way;

public interface TourBuilder {
  void buildTour(LocalDate from, LocalDate to, Integer nPeople);

  void buildTourLocation(String location);

  void buildAirportTransfer(Way way);

  void buildFlightTransfer(Way way);

  void buildDwellingRent();

  void buildInsurance();
}
