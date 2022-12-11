/*
 * 각 나라의 한류를 설명하는 클래스들의 부모 클래스
 */

public class KoreaHallyu {
  public String drama;
  public String kpop;
  public String food;
  public String person;

  public void explain(){
    this.drama = "전부";
    this.kpop = "전부";
    this.food = "전부";
    this.person = "전부";
    
    System.out.println("유명한 드라마: " + this.drama);
    System.out.println("유명한 케이팝: " + this.kpop);
    System.out.println("유명한 음식: " + this.food);
    System.out.println("유명한 사람: " + this.person);
  }
}
