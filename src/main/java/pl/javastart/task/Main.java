package pl.javastart.task;

public class Main {
    public static void main(String[] args) {
        Category foodCategory = new Category("Food", "Basic food");
        Category electronicCategory = new Category("Electronic", "Consumer electronics");

        Product product1 = new Product("roll", 1.20, "wheat roll", foodCategory);
        Product product2 = new Product("butter", 6.99, "polish cream butter", foodCategory);
        Product product3 = new Product("motherboard", 500, "computer motherboard", electronicCategory);
        Product product4 = new Product("towel", 60, "soft bathroom towel");

        System.out.println(product1.getDescription() + product1.category.getDescription());
        System.out.println(product2.getDescription() + product2.category.getDescription());
        System.out.println(product3.getDescription() + product3.category.getDescription());
        System.out.println(product4.getDescription());

        SpecialOffer specialOffer = new SpecialOffer(product3, "Special offer. Discount 20%", "Offer valid from 28.01 until sold out", 0.2);
        System.out.println("Special offer: " + specialOffer.getDescription());
        specialOffer.setDiscount();

        System.out.println("Product with discount: " + product3.getDescription());
    }
}
