import java.time.Clock;

public class Main {
    public static void main(String[] args){
        System.out.println(TemperatureCalculator.CelsiusToFahrenheit(25));
        System.out.println(TemperatureCalculator.CelsiusToKelvin(25));
        System.out.println(TemperatureCalculator.FahrenheitToCelsius(100));
        System.out.println(TemperatureCalculator.FahrenheitToKelvin(100));
        System.out.println(TemperatureCalculator.KelvinToCelsius(0));
        System.out.println(TemperatureCalculator.KelvinToFahrenheit(0));
        System.out.println(BasicStatistics.Sum(5,10));
        System.out.println(BasicStatistics.itemsWithinRange(5,10));
        System.out.println(BasicStatistics.Mean(5,10));
        InternetDevice[] dg1 = {
                new InternetDevice("d1"),
                new InternetDevice(("d2")),
                new InternetDevice(("d3")),
                new InternetDevice(("d4")),
                new InternetDevice(("d5")),
        };
        for (int i = 0; i < 3; i++) {
            dg1[i].connect();
        }
        for (int i = 0; i < dg1.length; i++) {
            dg1[i].displayStatus();
        }
        InternetDevice.displayConnections();
        double[] n1 ={3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5};
        double[] n2 ={2.0, 3.0, 2.0, 4.5, 4.5};
        StudentGrades s1 = new StudentGrades("Amanda", n1);
        StudentGrades s2  = new StudentGrades("James", n2);
        s1.Display();
        s2.Display();
        NewClock c1 = new NewClock((byte)12,(byte)47);
        c1.DisplayTime();
        c1.SetClock((byte) 18,(byte) 14);
        c1.DisplayTime();
        c1.SetClock((byte) 9, (byte) 3);
        c1.DisplayTime();
        c1.SetClock((byte)23,(byte)58);
        c1.DisplayTime();
        c1.AddOneMinute();
        c1.DisplayTime();
        c1.AddOneMinute();
        c1.DisplayTime();
    }

}