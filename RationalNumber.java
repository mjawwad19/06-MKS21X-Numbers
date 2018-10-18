public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
    if the denominator is 0, make the fraction 0/1 instead
  @param nume the numerator
  @param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0.0);//this value is ignored!
    numerator = nume;
    denominator = deno;
    if (denominator == 0) {
      numerator = 0;
      denominator = 1;
    }
    this.reduce();
    if (denominator < 0) {
      denominator *= -1;
      numerator *= -1;
    }
  }



 public double getValue(){
    return (double)numerator / denominator;
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
    RationalNumber recip = new RationalNumber (denominator, numerator);
    return recip;
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    return ((this.getNumerator() == other.getNumerator()) && (this.getDenominator() == other.getDenominator()));
  }


  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    if (denominator == 1 || numerator == 0) return "" + numerator + "";
    else return numerator + "/" + denominator;
}


  private static int gcd(int a, int b){
    while (b != 0) {
       int newa = b;
       b = a % b;
       a = newa;
     }
   return a;
   }


  private void reduce(){
    int gcdThis = gcd (numerator, denominator);
    numerator = numerator / gcdThis;
    denominator = denominator / gcdThis;
  }

  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
     RationalNumber product = new RationalNumber (this.numerator*other.numerator, this.denominator*other.denominator);
     return product;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    RationalNumber quotient = new RationalNumber (this.numerator*other.denominator, this.denominator*other.numerator);
    return quotient;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    RationalNumber sum = new RationalNumber (this.getNumerator() * other.getDenominator() + this.getDenominator() * other.getNumerator(),
                                             this.getDenominator() * other.getDenominator());
    return sum;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    RationalNumber diff = new RationalNumber (this.getNumerator() * other.getDenominator() - this.getDenominator() * other.getNumerator(),
                                              this.getDenominator() * other.getDenominator());
    return diff;
  }
}
