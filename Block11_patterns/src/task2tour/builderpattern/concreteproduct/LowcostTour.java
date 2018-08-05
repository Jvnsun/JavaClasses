package task2tour.builderpattern.concreteproduct;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;
import java.util.Optional;

import task2tour.builderpattern.builder.TourBuilder;
import task2tour.builderpattern.product.Dwelling;
import task2tour.builderpattern.product.Insurance;
import task2tour.builderpattern.product.Tour;
import task2tour.builderpattern.product.Transfer;
import task2tour.builderpattern.product.Way;

public class LowcostTour implements Tour {
  public final LocalDate startDate, endDate;
  public final String location;
  public final Transfer flight;
  public final Dwelling dwelling;
  public final Optional<Transfer> airportTransfer;
  public final Optional<Insurance> insurance;
  public final BigDecimal price;

  @Override
  public String getLocation() {
    return this.location;
  }

  @Override
  public LocalDate getStartDate() {
    return this.startDate;
  }

  @Override
  public LocalDate getEndDate() {
    return this.endDate;
  }

  @Override
  public Transfer getFlight() {
    return this.flight;
  }

  @Override
  public Dwelling getDwelling() {
    return this.dwelling;
  }

  @Override
  public Optional<Transfer> getAirportTransfer() {
    return this.airportTransfer;
  }

  @Override
  public Optional<Insurance> getInsurance() {
    return this.insurance;
  }

  @Override
  public BigDecimal getPrice() {
    return this.price;
  }

  @Override
  public String toString() {
    StringBuilder infoBuilder = new StringBuilder();
    infoBuilder.append("LowcostTour").append("\nstartDate=").append(startDate)
        .append("\nendDate=").append(endDate).append("\nlocation=")
        .append(location).append("\nflight=").append(flight)
        .append("\ndwelling=").append(dwelling).append("\nprice=").append(price)
        .append("\n");
    return infoBuilder.toString();
  }

  private LowcostTour(Builder builder) {
    this.startDate = builder.startDate;
    this.endDate = builder.endDate;
    this.location = builder.location;
    this.flight = builder.flight;
    this.dwelling = builder.dwelling;
    this.airportTransfer = builder.airportTransfer;
    this.insurance = builder.insurance;
    this.price = builder.price;
  }

  public static class Builder implements TourBuilder {
    private LocalDate startDate, endDate;
    private String location;
    private Transfer flight;
    private Dwelling dwelling;
    private Optional<Transfer> airportTransfer;
    private Optional<Insurance> insurance;
    private BigDecimal price;

    public Builder(LocalDate from, LocalDate to) {
      Objects.requireNonNull(from);
      Objects.requireNonNull(to);
      this.startDate = from;
      this.endDate = to;
    }

    @Override
    public TourBuilder buildTourLocation(String location) {
      Objects.requireNonNull(location);
      this.location = location;
      return this;
    }

    @Override
    public TourBuilder buildFlightTransfer(Way way) {
      Objects.requireNonNull(way);

      class EconomyClassFlight implements Transfer {
        private Way way;

        private EconomyClassFlight(Way way) {
          this.way = way;
        }

        @Override
        public LocalTime getDuration() {
          return LocalTime.of(6, 20);
        }

        @Override
        public BigDecimal getPrice() {
          return BigDecimal.valueOf(99.99)
              .multiply(BigDecimal.valueOf(this.way.nWays));
        }

        @Override
        public Way getWay() {
          return this.way;
        }

        @Override
        public String toString() {
          StringBuilder builder = new StringBuilder();
          builder.append("EconomyClassFlight").append("\n\tway=").append(way)
              .append("\n\tduration=").append(getDuration())
              .append("\n\tprice=").append(getPrice()).append("\n");
          return builder.toString();
        }

      }

      this.flight = new EconomyClassFlight(way);
      return this;
    }

    @Override
    public TourBuilder buildDwellingRent() {

      class ThreeStarsHotel implements Dwelling {
        private Long nNights;

        private ThreeStarsHotel(Long nNights) {
          this.nNights = nNights;
        }

        @Override
        public BigDecimal getPrice() {
          return BigDecimal.valueOf(50)
              .multiply(BigDecimal.valueOf(this.nNights));
        }

        @Override
        public Long getNumberOfNights() {
          return this.nNights;
        }

        @Override
        public String toString() {
          StringBuilder builder = new StringBuilder();
          builder.append("ThreeStarsHotel").append("\n\tnights=")
              .append(nNights).append("\n\tprice=").append(getPrice())
              .append("\n");
          return builder.toString();
        }

      }

      this.dwelling = new ThreeStarsHotel(
          this.endDate.toEpochDay() - this.startDate.toEpochDay());
      return this;
    }

    @Override
    public TourBuilder buildAirportTransfer(Way way) {
      Objects.requireNonNull(way);
      this.airportTransfer = Optional.empty();
      return this;
    }

    @Override
    public TourBuilder buildInsurance() {
      this.insurance = Optional.empty();
      return this;
    }

    @Override
    public Tour build() {
      this.price = this.flight.getPrice().add(this.dwelling.getPrice());
      return new LowcostTour(this);
    }

  }

}
