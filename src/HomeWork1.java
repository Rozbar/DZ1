


public class HomeWork1 {
    public static void main(String[] args) {

        double celsius = 27;
        double far = 100;
        double CelsiusToFar = (celsius * 9 / 5) - 32;
        double FahrenheitToCelsius = (far - 32) * 5/9;
        double CelsiusToKalvin = celsius + 273.15;
        System.out.println( "Celsius to Fahrenheit: " + CelsiusToFar);
        System.out.println("Fahrenheit to Celsius: " + FahrenheitToCelsius);
        System.out.println("Celsius to Kalvin: " + CelsiusToKalvin);


        double m = 43;
        double MeterToInches = m * 41;
        double InchesToMeter = MeterToInches/m;
        System.out.println("Meter in inches: " + MeterToInches);
        System.out.println("Inches to meter: " + InchesToMeter);

        double miles = 28;
        double MilesToKilometers = miles * 1.609;
        double KilometerToMiles = MilesToKilometers/1.609;
        System.out.println("Miles to kilometer " + MilesToKilometers);
        System.out.println("Kilometer to miles " + KilometerToMiles);

        double kilograms = 25;
        double KilogramsToPunds = kilograms*2.2046;
        double PoundsToKilograms = KilogramsToPunds/2.2046;
        System.out.println("Kilograms to punds " + KilogramsToPunds);
        System.out.println("pounds to kilograms " + PoundsToKilograms);

        double KmPerHour = 100;
        double KmToMi = KmPerHour/0.6214;
        double MiToKm = KmToMi * 0.6214;
        System.out.println("Km To Mi " + KmToMi);
        System.out.println("Miles to kilometer " + MiToKm);

        double Seconds = 244253;
        double SecondsToDays = Seconds/86400;
        System.out.println("Seconds to days " + SecondsToDays);
        double SecondsToHours = Seconds/3600;
        System.out.println("Seconds to Hours " + SecondsToHours);
        double SecondsToMin = Seconds*60;
        System.out.println("Seconds to minutes " + SecondsToMin);

        double years = 22;
        double weeks = years * 52.143;
        double days = weeks * 7;
        double hours = days * 24;
        double minutes = hours * 60;
        double seconds = minutes * 60;
        System.out.printf("Вы живете %f лет, %f недель, %f дней, %f часов, %f минут, %f секунд",years,weeks,days,hours,minutes,seconds);










    }
}
