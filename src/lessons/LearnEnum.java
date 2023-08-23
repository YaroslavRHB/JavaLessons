package lessons;

public class LearnEnum {
    public static void main(String[] args) {

        Country uk = Country.UK;

        int ordinal = uk.ordinal();

        String tempCountry = "Usa";

        Country country = Country.valueOf(tempCountry.toUpperCase());

        Country[] values = Country.values();

        for (Country value : values) {
            System.out.println(value);
        }

//        print(Country.USA);
    }

    public static void print(String country) {//"UK", "Canada", "USA"
        if (country.equals("UK")) {
        }
    }

    public static void print(Country country) {
    }
}

enum Country {
    USA,
    UK,
    INDIA;

    private Country() {
    }
}
