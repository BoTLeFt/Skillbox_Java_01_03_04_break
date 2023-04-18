public class Main {
    public static void main(String[] args) {
        int firstYear = 1922;
        int lastYear = 2022;
        int targetYear = 1985;
        boolean yearFound = false;

        for (int year = firstYear; year <= lastYear; year = year + 1) {
            if (year == targetYear) {
                yearFound = true;
                break;
            }
        }

        String found = "Year found";
        String notFound = "Year not found";

        System.out.println(yearFound ? found : notFound);
    }
}