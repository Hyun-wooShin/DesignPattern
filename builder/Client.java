public class Client {
    public static void main(String[] args) {
        DefaultTourBuilder tour = new DefaultTourBuilder();
        tour.nightsAndDays(2, 3)
            .whereToStay("리조트")
            .getPlan();
    }
}
