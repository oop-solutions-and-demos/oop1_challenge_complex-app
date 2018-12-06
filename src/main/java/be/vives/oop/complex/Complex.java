package be.vives.oop.complex;

/**
 * Complex
 */
public class Complex {

  // Default constructor takes no arguments
  public Complex() {
    // You can call another constructor inside a constructor
    // using the this keyword. Do take note that it needs to be
    // the first statement here.
    this(0, 0);
  }

  // Constructor that takes the real and imaginary
  // components as arguments and initializes the object
  // with the provided values
  public Complex(double real, double imaginary) {
    // You can use the setters
    setReal(real);
    setImaginary(imaginary);
  }

  // A copy constructor makes a copy of the provided object by
  // initializing the current object with the values of the original.
  public Complex(Complex original) {
    this(original.getReal(), original.getImaginary());
  }

  // Getters allow us to retrieve the values
  // of the private attributes
  // They take no arguments but do return a value
  public double getReal() {
    return real;
  }

  public double getImaginary() {
    return imaginary;
  }

  // Setters allow us to assign values to the internal
  // attributes. They can also provide guards so no wrong/incorrect
  // values can be set.
  // Setters return no values but take in data from the outside
  // using arguments
  public void setReal(double real) {
    this.real = real;
      // real = local argument
      // this.real = attribute of object
  }

  public void setImaginary(double imaginary) {
    this.imaginary = imaginary;
  }

  // The add method adds two complex numbers together using the following formula:
  // (a + bj) + (c + dj) = (a + c) + (b + d)j
  // The result is a new object containing the resulting real and imaginary parts.
  // So the original objects should not be altered
  // The first complex number is the object on which the add method is called.
  // The second complex number is provided as an argument to the add method.
  public Complex add(Complex second) {
    Complex result = new Complex();
    result.setReal(this.getReal() + second.getReal());
    result.setImaginary(this.getImaginary() + second.getImaginary());
    return result;
  }

  public Complex subtract(Complex second) {
    Complex result = new Complex();
    result.setReal(this.getReal() - second.getReal());
    result.setImaginary(this.getImaginary() - second.getImaginary());
    return result;
  }

  // Every object has a toString method. One is always provided
  // by Java. However, we can choose to override the standard implementation
  // to make a more sensible presentation of our objects.
  // The toString() method is always called when the object is used in
  // a string context.
  @Override
  public String toString() {
    return "(" + String.format("%1$,.2f", getReal())
      + (imaginary < 0 ? " - " : " + ")
      + String.format("%1$,.2f", Math.abs(getImaginary()))
      + "j" + ")";
  }

  // Attributes of the class (properties / data)
  // Should always be private
  // Should always be initialized through initialization here or via constructors
  // Can typically be accessed via getters and setters
  private double real = 0;
  private double imaginary = 0;
}
