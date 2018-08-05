package task2tour.builderpattern;

import java.time.LocalDate;

import task2tour.builderpattern.concreteproduct.LowcostTour;
import task2tour.builderpattern.product.Tour;
import task2tour.builderpattern.product.Way;

public class Task2Main {

  public static void main(String[] args) {
    Tour lowcostTour = new LowcostTour.Builder(LocalDate.ofYearDay(2018, 202),
        LocalDate.ofYearDay(2018, 220)).buildTourLocation("Lissabon")
            .buildFlightTransfer(Way.BOTH).buildDwellingRent().build();
    System.out.println(lowcostTour);
  }

}
