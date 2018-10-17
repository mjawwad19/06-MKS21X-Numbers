public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0);//this value is ignored!
    if (deno == 0) {
      numerator = 0;
      denominator = 1;
    }
    else {
      numerator = nume;
      denominator = deno;
    }
  }

  public double getValue(){
    return numerator / denominator;
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    return new RationalNumber(denominator, numerator);
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    return this.getNumerator() == other.getNumerator() && this.getDenominator() == other.getDenominator();
  }


  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    return getNumerator() + "/" + getDenominator();
  }



  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
    /*use euclids method or a better one*/
    int firstI, secondI, rem;
    firstI = 0;
    secondI = 0;
    rem = 0;
    if (b = 0) return a;
    if (a > b) {
      firstI = b;
      secondI = a;
      rem = b % a
    }
    else {
      firstI = a;
      secondI = b;
      rem = a % b;
    }
    for (rem; rem > 0; rem = firstI % secondI) {
      firstI = secondI;
      secondI = rem;
    }
    return secondI;
    }

    }
  }



  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    int gcdThis = gcd(getNumerator(), getDenominator());
    this.numerator = numerator / a;
    this.denominator = denominator / a;

  }



  /******************Operations!!!!****************/


  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    RationalNumber product = new RationalNumber(getNumerator() * other.getNumerator(), getDenominator() * other.getDenominator()).reduce();
    return product;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    RationalNumber otherRecip = other.reciprocal();
    return multiply(otherRecip);
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    RationalNumber sum = new RationalNumber(getNumerator() * other.getDenominator() + other.getNumerator() * getDenominator(),
                                            getDenominator() * other.getDenominator()).reduce();
    return sum;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    RationalNumber sub = new RationalNumber(getNumerator() * other.getDenominator() - other.getNumerator() * getDenominator(),
                                            getDenominator() * other.getDenominator()).reduce();
    return sub;
  }
}
