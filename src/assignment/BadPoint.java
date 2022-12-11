/*
 * Point인터페이스의 구현 객체
 * 한류의 약점을 나열
 */
public class BadPoint implements Point{
  String bp1;
  String bp2;
  public String getPoint(){
    bp1 = "위장 한류";
    bp2 = "반 한류";
    return bp1 + ", " + bp2;
  }
}
