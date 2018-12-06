package be.vives.oop.complex;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
      Complex origin = new Complex();
      System.out.println("Complex origin: " + origin);

      Complex number = new Complex(15, 22);
      System.out.println("Complex number: " + number);

      Complex base = new Complex(5, 8);
      System.out.println("Complex base: " + base);

      Complex sum = base.add(number);
      System.out.println(base + " + " + number + " = " + sum);

      Complex difference = base.subtract(number);
      System.out.println(base + " - " + number + " = " + difference);

      Complex product = base.multiply(number);
      System.out.println(base + " . " + number + " = " + product);

      double factor = 10;
      Complex dividedByFactor = base.divide(factor);
      System.out.println(base + " / " + factor + " = " + dividedByFactor);
    }
}
