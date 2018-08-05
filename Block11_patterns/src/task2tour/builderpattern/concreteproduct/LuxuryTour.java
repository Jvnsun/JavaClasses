package task2tour.builderpattern.concreteproduct;

import java.math.BigInteger;
import java.time.LocalDate;

import task2tour.builderpattern.builder.TourBuilder;
import task2tour.builderpattern.product.Dwelling;
import task2tour.builderpattern.product.Insurance;
import task2tour.builderpattern.product.Tour;
import task2tour.builderpattern.product.Transfer;
import task2tour.builderpattern.product.Way;

public class LuxuryTour implements Tour {

  @Override
  public String getLocation() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public LocalDate getStartDate() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public LocalDate getEndDate() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public BigInteger getPrice() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Transfer getAirportTransfer() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Transfer getFlight() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Dwelling getDwelling() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Insurance getInsurance() {
    // TODO Auto-generated method stub
    return null;
  }

  public static class Builder implements TourBuilder {

    @Override
    public void buildTour(LocalDate from, LocalDate to, Integer nPeople) {
      // TODO Auto-generated method stub

    }

    @Override
    public void buildTourLocation(String location) {
      // TODO Auto-generated method stub

    }

    @Override
    public void buildAirportTransfer(Way way) {
      // TODO Auto-generated method stub

    }

    @Override
    public void buildFlightTransfer(Way way) {
      // TODO Auto-generated method stub

    }

    @Override
    public void buildDwellingRent() {
      // TODO Auto-generated method stub

    }

    @Override
    public void buildInsurance() {
      // TODO Auto-generated method stub

    }

  }
}
