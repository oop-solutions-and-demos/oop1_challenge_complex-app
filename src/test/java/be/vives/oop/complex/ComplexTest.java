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

  @Test
  public void testSubtractAnotherComplex() {
    Complex first = new Complex(0.32, 55.13);
    Complex second = new Complex(-134.33, 12.01);

    Complex result = first.subtract(second);

    assertEquals(first.getReal()-second.getReal(), result.getReal(), delta);
    assertEquals(first.getImaginary()-second.getImaginary(), result.getImaginary(), delta);
  }
  
  @Test
  public void testMultiplyAnotherComplex() {
    Complex first = new Complex(3, 2);
    Complex second = new Complex(1, 7);

    Complex result = first.multiply(second);

    assertEquals(-11, result.getReal(), delta);
    assertEquals(23, result.getImaginary(), delta);
  }
  
  @Test
  public void testDivideByFactor() {
    Complex first = new Complex(25, -3);
    double factor = 2;

    Complex result = first.divide(factor);

    assertEquals(12.5, result.getReal(), delta);
    assertEquals(-1.5, result.getImaginary(), delta);
  }
  
  @Test
  public void testMultiplyByFactor() {
    Complex first = new Complex(25, -3);
    double factor = 4.;

    Complex result = first.multiply(factor);

    assertEquals(100, result.getReal(), delta);
    assertEquals(-12, result.getImaginary(), delta);
  }
  
  @Test
  public void testConjugate() {
    Complex first = new Complex(2, 3);
    Complex result = first.conjugate();

    assertEquals(first.getReal(), result.getReal(), delta);
    assertEquals(-first.getImaginary(), result.getImaginary(), delta);
  }
  
  @Test
  public void testDivideAnotherComplex() {
    Complex first = new Complex(2, 3);
    Complex second = new Complex(4, -5);

    Complex result = first.divide(second);

    assertEquals(-7.0/41, result.getReal(), delta);
    assertEquals(22.0/41, result.getImaginary(), delta);
  }
}
