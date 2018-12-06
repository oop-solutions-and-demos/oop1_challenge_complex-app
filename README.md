# Object Oriented Programming with Java - Complex Number Challenge

This is a challenge for the course Object Oriented Programming with Java for students of VIVES University in Bruges.

## Challenge

Create a class `Complex` to model a complex number.

A complex number is a number that can be expressed in the form `a + bi`, where a and b are real numbers, and `i` is a solution of the equation `x^2 = −1`, which is called an imaginary number because there is no real number that satisfies this equation. For the complex number `a + bi`, `a` is called the real part, and `b` is called the imaginary part.

Model your class so the following requirements are met:

* [ ] Add getters and setters for the imaginary and real parts
* [ ] Add a constructor which allows a Complex number to be created initialized with a real and imaginary number
* [ ] Add a toString method which return the complex number in the format `"a + bj"`
* [ ] Add a method that can add two complex numbers and return the result as a new object
* [ ] Add a copy constructor which allows the user to create copies of an already existing instance
* [ ] Add a method that can subtract a complex number from another and return the result as a new object
* [ ] Add a method that can multiply the complex number with a real, returning the result as a new object
* [ ] Add a method that can divide the complex number by a real factor, returning the result as a new object
* [ ] Add a method that can multiply two complex numbers and return the result as a new object. Search online if you need some info on how to multiply two complex numbers.
* [ ] Add a method that can divide two complex numbers and return the result as a new object. Search online if you need some info on how to divide two complex numbers.
* [ ] Add tests to the maven project found below to test your implementation of subtract, multiply (both with factor and other complex number) and divide (both with factor and other complex number). Create your test before you add the implementation to the Complex class.

Your class should adhere to the following UML model:

```text
#################################################
#                   Complex                     #
#################################################
# - real: double                                #  
# - imaginary: double                           #
#################################################
# + Complex()                                   #
# + Complex(real: double, imaginary: double)    #
# + Complex(original: Complex)                  #
#                                               #
# + getReal() : double                          #
# + getImaginary() : double                     #
# + setReal(real: double)                       #
# + setImaginary(imaginary: double)             #
#                                               #
# + add(second: Complex) : Complex              #
# + subtract(second: Complex) : Complex         #
# + multiply(second: Complex) : Complex         #
# + divide(second: Complex) : Complex           #
#                                               #
# + multiply(factor: double) : Complex          #
# + divide(factor: double) : Complex            #
#                                               #
# + toString() : String                         #
#################################################
```

Format the real and imaginary component in the `toString` method to a fixed number of digits using the following code snippet: `String fixed = String.format("%1$,.2f", 88.1234567);`. Use this only inside of the `toString()` method.

So `System.out.println(String.format("%1$,.2f", 88.1234567));` would result in `88.12`.

### Repo

The maven project inside this repo has a main with some demo code and a battery of unit tests to test your implementation.

Make sure to fork the project first to your own account. That way you have your own personal copy. Next you can clone it and hack at it.