package be.vives.oop.complex;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for class Complex
 */
public class ComplexTest {
  // Delta to compare floating point values
  private final double delta = 0.001;

  @Test
  public void testDefaultConstructor() {
    Complex number = new Complex();

    assertEquals(0, number.getReal(), delta);
    assertEquals(0, number.getImaginary(), delta);
  }

  @Test
  public void testRealSetter() {
    double value = 15.33;
    
    Complex number = new Complex();
    number.setReal(value);

    assertEquals(value, number.getReal(), delta);
  }

  @Test
  public void testImaginarySetter() {
    double value = 15.33;
    
    Complex number = new Complex();
    number.setImaginary(value);

    assertEquals(value, number.getImaginary(), delta);
  }

  @Test
  public void testInitializationConstructor() {
    double real = -19.43;
    double imaginary = 231.32;
    Complex number = new Complex(real, imaginary);

    assertEquals(real, number.getReal(), delta);
    assertEquals(imaginary, number.getImaginary(), delta);
  }

  @Test
  public void testToString() {
    Complex number = new Complex(0.32, 55.13);

    assertEquals("(0.32 + 55.13j)", number.toString());
  }

  @Test
  public void testToStringForNegativeRealPart() {
    Complex number = new Complex(-0.32, 55.13);

    assertEquals("(-0.32 + 55.13j)", number.toString());
  }

  @Test
  public void testToStringForNegativeImaginaryPart() {
    Complex number = new Complex(0.32, -55.13);

    assertEquals("(0.32 - 55.13j)", number.toString());
  }

  @Test
  public void testAddAnotherComplex() {
    Complex first = new Complex(0.32, 55.13);
    Complex second = new Complex(-134.33, 12.01);

    Complex result = first.add(second);

    assertEquals(first.getReal()+second.getReal(), result.getReal(), delta);
    assertEquals(first.getImaginary()+second.getImaginary(), result.getImaginary(), delta);
  }

  @Test
  public void testAddShouldNotChangeOriginalObjects() {
    Complex first = new Complex(0.32, 55.13);
    String firstString = first.toString();

    Complex second = new Complex(-134.33, 12.01);
    String secondString = second.toString();

    Complex result = first.add(second);

    assertEquals(firstString, first.toString());
    assertEquals(secondString, second.toString());
  }

  @Test
  public void testCopyConstructor() {
    double real = -19.43;
    double imaginary = 231.32;
    Complex number = new Complex(real, imaginary);
    Complex copy = new Complex(number);

    assertFalse(number == copy);
  }

  @Test
  public void testCopyShouldNotBeinfluencedByChangesInOriginal() {
    double real = -19.43;
    double imaginary = 231.32;
    Complex number = new Complex(real, imaginary);
    Complex copy = new Complex(number);

    number.setReal(-real);
    number.setImaginary(-imaginary);

    assertEquals(real, copy.getReal(), delta);
    assertEquals(imaginary, copy.getImaginary(), delta);
  }
}
