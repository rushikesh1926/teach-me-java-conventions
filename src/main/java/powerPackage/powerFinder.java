package powerPackage;

public class powerFinder {

    public static int  findPower(int baseNumber, int power) {
        int powerValue = 1;
        for (int i = 0; i < power; i++) {
            powerValue *= baseNumber;
        }
        System.out.println(powerValue);
        return powerValue;
    }
}
