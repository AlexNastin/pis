package story2.task2;

public class PairRoot {

    private String x1;
    private String x2;

    public PairRoot() {
    }

    public PairRoot(String x1, String x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public String getX1() {
        return x1;
    }

    public String getX2() {
        return x2;
    }

    public void setX1(String x1) {
        this.x1 = x1;
    }

    public void setX2(String x2) {
        this.x2 = x2;
    }

    @Override
    public String toString() {
        return "PairRoot {" +
                "x1= " + x1 +
                ", x2= " + x2 +
                '}';
    }
}
