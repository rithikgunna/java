// Unique Main class for throw and throws - PaymentGateway
class PaymentGateway {
    // Example demonstrating 'throw'
    static void makePayment(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount for payment");
        }
        // Perform payment operation
        System.out.println("Payment of $" + amount + " successful!");
    }

    // Example demonstrating 'throws'
    public static void main(String[] args) {
        try {
            makePayment(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Payment failed: " + e.getMessage());
        }
    }
}
