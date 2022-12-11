/*
 * 한국 한류 클래스를 상속받아 
 * 프랑스 한류를 설명하는 자식 클래스
 */

public class FranceHallyu extends KoreaHallyu{
  @Override
  public void explain() {
    this.drama = "사랑의 불시착";
    this.kpop = "블랙핑크";
    this.food = "김치볶음밥";
    this.person = "정명훈";

    System.out.println("유명한 드라마: " + this.drama);
    System.out.println("유명한 케이팝: " + this.kpop);
    System.out.println("유명한 음식: " + this.food);
    System.out.println("유명한 사람: " + this.person);
  }
}
