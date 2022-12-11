/*
 * 클래스 상속과 다형성을 구현하기 위한 클래스
 */

public class CountryHallyu {
  KoreaHallyu globalHallyu = new KoreaHallyu();

  int start(){
    globalHallyu.explain();
    return 0;
  }
}
