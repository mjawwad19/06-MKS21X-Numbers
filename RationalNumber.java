public class RationalNumber extends RealNumber{
  private int nume, denom;

  public RationalNumber(int n, int d) {
    super(5.0);
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

  //override parent method so it can compare rational to real as well
  public boolean compareTo(RealNumber other) {
    return false;
  }

}
