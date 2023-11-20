package co.udea.ssmu.api.model.jpa.model.rate;

import co.udea.ssmu.api.model.jpa.model.serviceType.ServiceType;
import jakarta.persistence.*;

import javax.validation.constraints.NotNull;

@Entity
@Table(name = "rate")
public class Rate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @NotNull
    @Column(name = "distance_traveled")
    private Double distanceTraveled;
    @NotNull
    @Column(name = "base_rate")
    private Double baseRate;
    @NotNull
    @Column(name = "covered_km_Rate")
    private Double coveredKmRate;
    @NotNull
    @Column(name = "rate_km")
    private Double rateKm;
    @NotNull
    @Column(name = "hourly_rate")
    private Double hourlyRate;
    @NotNull
    @Column(name = "multiplier_factor")
    private Double multiplierFactor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(Double distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public Double getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(Double baseRate) {
        this.baseRate = baseRate;
    }

    public Double getCoveredKmRate() {
        return coveredKmRate;
    }

    public void setCoveredKmRate(Double coveredKmRate) {
        this.coveredKmRate = coveredKmRate;
    }

    public Double getRateKm() {
        return rateKm;
    }

    public void setRateKm(Double rateKm) {
        this.rateKm = rateKm;
    }

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public Double getMultiplierFactor() {
        return multiplierFactor;
    }

    public void setMultiplierFactor(Double multiplierFactor) {
        this.multiplierFactor = multiplierFactor;
    }
}