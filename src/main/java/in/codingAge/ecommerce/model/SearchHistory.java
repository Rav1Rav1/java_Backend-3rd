package in.codingAge.ecommerce.model;

public class SearchHistory {

    private double userId;
    private String[] productList;
    private String journey;

    public double getUserId() {
        return userId;
    }

    public void setUserId(double userId) {
        this.userId = userId;
    }

    public String[] getProductList() {
        return productList;
    }

    public void setProductList(String[] productList) {
        this.productList = productList;
    }

    public String getJourney() {
        return journey;
    }

    public void setJourney(String journey) {
        this.journey = journey;
    }
}
