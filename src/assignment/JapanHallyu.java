/*
 * 한국 한류 클래스를 상속받아 
 * 일본 한류를 설명하는 자식 클래스
 */

public class JapanHallyu extends KoreaHallyu{
  @Override
  public void explain() {
    this.drama = "겨울연가";
    this.kpop = "동방신기";
    this.food = "삼겹살";
    this.person = "이승엽";

    System.out.println("유명한 드라마: " + this.drama);
    System.out.println("유명한 케이팝: " + this.kpop);
    System.out.println("유명한 음식: " + this.food);
    System.out.println("유명한 사람: " + this.person);
  }
}
