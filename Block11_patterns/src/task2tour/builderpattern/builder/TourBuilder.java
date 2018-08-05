package task2tour.builderpattern.builder;

import task2tour.builderpattern.product.Tour;
import task2tour.builderpattern.product.Way;

public interface TourBuilder {

  TourBuilder buildTourLocation(String location);

  TourBuilder buildFlightTransfer(Way way);

  TourBuilder buildAirportTransfer(Way way);

  TourBuilder buildDwellingRent();

  TourBuilder buildInsurance();

  Tour build();
}
