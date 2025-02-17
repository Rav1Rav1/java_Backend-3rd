package in.codingAge.ecommerce.model;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter


public class EcommerceCarousel {


    private double userId;
    private String items;
    private double interval;

    public double getUserId() {
        return userId;
    }

    public void setUserId(double userId) {
        this.userId = userId;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public double getInterval() {
        return interval;
    }

    public void setInterval(double interval) {
        this.interval = interval;
    }
}
