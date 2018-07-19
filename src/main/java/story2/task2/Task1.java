package story2.task2;

//поиск корней квадратных уравнений
public class Task1 {


    public static PairRoot findRootsOfSquareEquation(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException();
        }
        PairRoot pairRoot = new PairRoot();
        double discriminant = calculateValueOfDiscriminant(a, b, c);
        if (discriminant > 0) {
            double x1 = getRootX1(a, b, discriminant);
            double x2 = getRootX2(a, b, discriminant);
            pairRoot.setX1(String.valueOf(x1));
            pairRoot.setX2(String.valueOf(x2));
        } else if (discriminant == 0) {
            double x1AndX2 = getRootX1andX2(a, b);
            pairRoot.setX1(String.valueOf(x1AndX2));
            pairRoot.setX2(String.valueOf(x1AndX2));
        } else if (discriminant < 0) {
            pairRoot.setX1(String.valueOf(getComplexRootX1(a, b, discriminant)));
            pairRoot.setX2(String.valueOf(getComplexRootX2(a, b, discriminant)));
        }
        return pairRoot;
    }

    private static double getRootX1andX2(double a, double b) {
        return -b / (2 * a);
    }

    private static double getRootX2(double a, double b, double discriminant) {
        return (-b - Math.sqrt(discriminant)) / (2 * a);
    }

    private static double getRootX1(double a, double b, double discriminant) {
        return (-b + Math.sqrt(discriminant)) / (2 * a);
    }

    private static String getComplexRootX2(double a, double b, double discriminant) {
        double real = -b / (2 * a);
        double imaginary = Math.sqrt(Math.abs(discriminant)) / (2 * a);
        return real + " - i " + imaginary;
    }

    private static String getComplexRootX1(double a, double b, double discriminant) {
        double real = -b / (2 * a);
        double imaginary = Math.sqrt(Math.abs(discriminant)) / (2 * a);
        return real + " + i " + imaginary;
    }

    private static double calculateValueOfDiscriminant(double a, double b, double c) {
        return b * b - (4 * a * c);
    }
}