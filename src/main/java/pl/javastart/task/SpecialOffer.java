package pl.javastart.task;

public class SpecialOffer {
    Product product;
    String description;
    String duration;
    double discount;

    public SpecialOffer(Product product, String description, String duration, double discount) {
        this.product = product;
        this.description = description;
        this.duration = duration;
        this.discount = discount;
    }

    void setDiscount() {
        product.price -= product.price * discount;
    }

    String getDescription() {
        return "product: " + product.name + ", " +
                description + ", " +
                duration + ", " +
                "discount: " + discount;
    }
}
