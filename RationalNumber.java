public class RationalNumber extends RealNumber{
  private int nume, denom;

  public RationalNumber(int n, int d) {
    super(5);
    nume = n;
    denom = d;
  }

  public double getVal() {
    return -1.0;
  }

  public boolean compare(RationalNumber b) {
    return false;
  }

  public String toString() {
    return "nada para ahora";
  }

}
