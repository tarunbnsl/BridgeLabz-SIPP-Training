package Day1_ProgrammingElements;

public class discount {

 public static void main(String[] args) {
    // Assign the course fee
    double fee = 125000;

    // Assign the discount percentage
    double discountPercent = 10;

    // Calculate the discount amount
    double discount = (fee * discountPercent) / 100;

    // Calculate the discounted price
    double discountedPrice = fee - discount;

    // Print the results
    System.out.println("Discount Amount: INR " + discount);
    System.out.println("Discounted Price to Pay: INR " + discountedPrice);
}
}
