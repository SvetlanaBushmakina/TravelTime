public class TravelTime {
    public static void main(String[] args) {

        final int distanceFromHomeToOffice = 10;
        System.out.println("Расстояние от дома до офиса " + distanceFromHomeToOffice + " км");

        final double averageSpeedTaxi = 38.2;
        System.out.println("Средняя скорость такси " + averageSpeedTaxi + " км/ч");

        final double timeFromHomeToOffice = distanceFromHomeToOffice / averageSpeedTaxi;
        System.out.println("Тестировщик добирается от дома до офиса за " + timeFromHomeToOffice * 60 + " минут");

        final double coefficientSLowdownTraffic = 1.5;
        System.out.println("Коэффициент замедления трафика: " + coefficientSLowdownTraffic);

        final double timeFromOfficeToHome = timeFromHomeToOffice * 60 * coefficientSLowdownTraffic;
        System.out.println("Тестировщик добирается от офиса до дома за " + timeFromOfficeToHome + " минуты");

    }
}
