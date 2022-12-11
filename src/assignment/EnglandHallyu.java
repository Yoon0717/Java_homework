/*
 * 한국 한류 클래스를 상속받아 
 * 잉글랜드 한류를 설명하는 자식 클래스
 */

public class EnglandHallyu extends KoreaHallyu {
  @Override
  public void explain() {
    this.drama = "오징어게임";
    this.kpop = "빅뱅";
    this.food = "분식";
    this.person = "손흥민";

    System.out.println("유명한 드라마: " + this.drama);
    System.out.println("유명한 케이팝: " + this.kpop);
    System.out.println("유명한 음식: " + this.food);
    System.out.println("유명한 사람: " + this.person);
  }
}
