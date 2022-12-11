/*
 * Point인터페이스의 구현 객체
 * 한류의 강점을 나열
 */
public class GoodPoint implements Point{
  String gp1;
  String gp2;
  String gp3;
  public String getPoint(){
    gp1 = "빠른 확장세";
    gp2 = "다양성";
    gp3 = "한국어 관심 강화";
    return gp1 + ", " + gp2 + ", " + gp3;
  }
}
