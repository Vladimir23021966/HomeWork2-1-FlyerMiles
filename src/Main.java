public class Main {
    public static void main(String[] args) {
        int tiketPrice = 2010;
        // стоимость билета

        int milePrice = 20;
        //  стоимость одной мили

        int flyerMiles = tiketPrice / milePrice;
        // количество начисленных милей

        System.out.println("Flyer miles - " + flyerMiles + " miles");
        
    }
}
