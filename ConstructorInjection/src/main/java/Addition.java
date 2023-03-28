public class Addition {
    private int a;
    private int b;

    public Addition(int a, int b) {
        System.out.println("Using int constructor");
        this.a = a;
        this.b = b;

    }

    public Addition(double a, double b) {
        this.a = (int)a;
        this.b = (int)b;
        System.out.println("Using double constructor");
    }

    @Override
    public String toString() {
        return "Addition{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public void sum()
    {
        System.out.println(this.a);
        System.out.println(this.b);
        System.out.println("Sum"+(this.a+this.b));
    }
}
