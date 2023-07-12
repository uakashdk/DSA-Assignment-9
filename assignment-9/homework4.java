class solution{
 public static int power(int base, int powerRaised) {
    if (powerRaised != 0) {
      return (base * power(base, powerRaised - 1));
    }
    else {
      return 1;
    }
  }
}