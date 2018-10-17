public class Driver{
  public static void main(String[] args) {
    RealNumber rN1 = new RealNumber(1.0);
    RealNumber rN2 = new RealNumber(18.0);

    RationalNumber raN1 = new RationalNumber(3,4);
    RationalNumber raN2 = new RationalNumber(3,1);
    RationalNumber raN3 = new RationalNumber(3,0);

    System.out.println("rN1 is: " + rN1); //rN1 is: 1.0
    System.out.println("rN1 is: " + rN1.getValue()); //rN1 is: 1.0
    System.out.println("rN2 is: " + rN2); //rN2 is: 18.0
    System.out.println("rN2 is: " + rN2.getValue()); //rN2 is: 18.0
    //The getValue lines should be identical to toString.

    System.out.println("raN1 is: " + raN1); //raN1 is: 3/4
    System.out.println("raN1 is: " + raN1.getValue()); //raN1 is: .75
    System.out.println("raN2 is: " + raN2); //raN2 is: 3/1
    System.out.println("raN2 is: " + raN2.getValue()); //raN2 is: 3.0
    System.out.println("raN3 is: " + raN3); //raN3 is: 0/1
    System.out.println("raN3 is: " + raN3.getValue()); //raN3 is: 0.0

    System.out.println("the sum of rN1 and rN2 is: " + rN1.add(rN2)); //the sum of rN1 and rN2 is: 19.0
    System.out.println("the difference of rN1 and rN2 is: " + rN1.subtract(rN2)); //the difference of rN1 and rN2 is: -17.0
    System.out.println("the product of rN1 and rN2 is: " + rN1.multiply(rN2)); //the product of rN1 and rN2 is: 18.0
    System.out.println("the quotient of rN1 and rN2 is: " + rN1.divide(rN2)); //the quotient of rN1 and rN2 is: .055555...

    System.out.println("the sum of raN1 and raN2 is: " + raN1.add(raN2)); //the sum of raN1 and raN2 is: 15/4
    System.out.println("the difference of raN1 and raN2 is: " + raN1.subtract(raN2)); //the difference of raN1 and raN2 is: -9/4
    System.out.println("the product of raN1 and raN2 is: " + raN1.multiply(raN2)); //the product of raN1 and raN2 is: 9/4
    System.out.println("the quotient of raN1 and raN2 is: " + raN1.divide(raN2)); //the quotient of raN1 and raN2 is: 1/4
//    System.out.println("the quotient of raN1 and raN3 is: " + raN1.divide(raN3)); //should return an error because I would be dividing by 0.

    //------------------------Only rationalNumber methods---------------------------
    System.out.println("reciprocal of raN1: " + raN1.reciprocal());//reciprocal of raN1: 4/3
    System.out.println("reciprocal of raN2: " + raN2.reciprocal());//reciprocal of raN1: 1/3
    System.out.println("reciprocal of raN3: " + raN3.reciprocal());//reciprocal of raN1: 0/1

    System.out.println("does raN1 = raN2? " + raN1.equals(raN2));//does raN1 = raN2? false
    System.out.println("does raN1 = raN3? " + raN1.equals(raN3));//does raN1 = raN3? false
    System.out.println("does raN2 = raN3? " + raN2.equals(raN3));//does raN2 = raN3? false

    System.out.println("numerator of raN1: " + raN1.getNumerator());//numerator of raN1: 3
    System.out.println("numerator of raN2: " + raN2.getNumerator());//numerator of raN2: 3
    System.out.println("numerator of raN3: " + raN3.getNumerator());//numerator of raN3: 0
    System.out.println("denominator of raN1: " + raN1.getDenominator());//denominator of raN1: 4
    System.out.println("denominator of raN1: " + raN2.getDenominator());//denominator of raN2: 1
    System.out.println("denominator of raN1: " + raN3.getDenominator());//denominator of raN3: 1




  }
}
