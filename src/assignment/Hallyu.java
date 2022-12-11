/*
  객체지향 프로그래밍 평가과제 (배점 25점)
  학과 : 컴퓨터전자시스템공학과
  학번 : 201903742
  이름 : 한승윤
  과제 주제 : 한류 관련 처리 프로그램 구현
*/
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Hallyu{
  public static void main(String[] args) throws Exception {
    System.out.println("한류에 대해서 설명 시작");
    Scanner sc = new Scanner(System.in);
    List<String> searchList = new ArrayList<String>();
    while(true){
      System.out.print("숫자를 입력하세요(종료하려면 6을 입력): ");
      int n = sc.nextInt();
      if(n==1){
        /*
         * 각 국가의 인기 한류 설명
         * 클래스 상속 사용
         * 다형성(상속) 사용
         */
        System.out.println("한국은 전부 유명하다");
        CountryHallyu ch = new CountryHallyu();
        ch.start();
        System.out.print("원하는 국가의 유명한 한류가 무엇일까? ");
        String c = sc.next();
        switch(c){
          case "america":
            System.out.println("미국의 한류에 대해");
            ch.globalHallyu = new AmericaHallyu();
            ch.start();
            searchList.add("미국의 한류");
            break;
          case "england":
            System.out.println("잉글랜드의 한류에 대해");
            ch.globalHallyu = new EnglandHallyu();
            ch.start();
            searchList.add("잉글랜드의 한류");
            break;
          case "france":
            System.out.println("프랑스의 한류에 대해");
            ch.globalHallyu = new FranceHallyu();
            ch.start();
            searchList.add("프랑스의 한류");
            break;
          case "japan":
            System.out.println("일본의 한류에 대해");
            ch.globalHallyu = new JapanHallyu();
            ch.start();
            searchList.add("일본의 한류");
            break;
          default:
            System.out.println(c + "는 해당하는 국가가 아닙니다!");
            break;
        }
      }
      else if(n==2){
        /*
         * 한류 음식의 유명해진 대표적인 사건 설명
         * 참조타입(열거타입) 사용
         */
        System.out.print("원하는 한류 음식이 어떻게 유명해졌을까? ");
        String food = sc.next();
        Food kfood = null;
        switch (food){
          case "chicken":
            kfood = Food.CHICKEN;
            System.out.print(food);
            System.out.println(": 치킨은 <별에서 온 그대>에서 치맥장면에서 유명해졌다.");
            searchList.add("치킨의 한류");
            break;
          case "bulgogi":
            kfood = Food.BULGOGI;
            System.out.print(food);
            System.out.println(": 불고기는 바비큐보다 먹기 편하고 <윤식당>에서 메뉴로 고르면서 유명해졌다.");
            searchList.add("불고기의 한류");
            break;
          case "samgyeobsal":
            kfood = Food.SAMGYEOBSAL;
            System.out.print(food);
            System.out.println(": 삼겹살은 로버트 다우니 주니어가 <어벤저스>홍보차 한국에 방문했을 때 삼소를 즐기면서 유명해졌다.");
            searchList.add("삼겹살의 한류");
            break;
          case "kimchi":
            kfood = Food.KIMCHI;
            System.out.print(food);
            System.out.println(": 김치는 한국의 대표음식이라 당연히 유명해졌다.");
            searchList.add("김치의 한류");
            break;
          case "bibimbab":
            kfood = Food.BIBIMBAB;
            System.out.print(food);
            System.out.println(": 비빔밥은 <대한항공>에서 기내식으로 쓰면서 유명해졌다.");
            searchList.add("비빔밥의 한류");
            break;
          default:
            System.out.println(food + "는 해당하는 음식이 아닙니다!");
            break;
        }
      }
      else if(n==3){
        /*
         * 대표적인 한류의 양상을 설명
         * 인터페이스 사용
         * 예외처리 사용
         * 파일 입/출력 사용
         */
        System.out.print("원하는 한류의 양상은 어떻게 될까? ");
        String aspect = sc.next();
        Text t;
        switch (aspect){
          case "music":
            try {
              t = new MusicText();
            } catch (ClassCastException e) {
              System.out.println("타입변환이 안됩니다.");
              break;
            }
            String file1 = t.getText();
            BufferedReader reader1 = new BufferedReader(new FileReader(file1));
            String str1;
            while ((str1 = reader1.readLine()) != null) {
              System.out.println(str1);
            }
            reader1.close();
            searchList.add("음악의 한류");
            break;
          case "food":
            try {
              t = new FoodText();
            } catch (ClassCastException e) {
              System.out.println("타입변환이 안됩니다.");
              break;
            }
            String file2 = t.getText();
            BufferedReader reader2 = new BufferedReader(new FileReader(file2));
            String str2;
            while ((str2 = reader2.readLine()) != null) {
              System.out.println(str2);
            }
            reader2.close();
            searchList.add("음식의 한류");
            break;
          case "drama":
            try {
              t = new DramaText();
            } catch (ClassCastException e) {
              System.out.println("타입변환이 안됩니다.");
              break;
            }
            String file3 = t.getText();
            BufferedReader reader3 = new BufferedReader(new FileReader(file3));
            String str3;
            while ((str3 = reader3.readLine()) != null) {
              System.out.println(str3);
            }
            reader3.close();
            searchList.add("드라마의 한류");
            break;
          case "animation":
            try {
              t = new AnimationText();
            } catch (ClassCastException e) {
              System.out.println("타입변환이 안됩니다.");
              break;
            }
            String file4 = t.getText();
            BufferedReader reader4 = new BufferedReader(new FileReader(file4));
            String str4;
            while ((str4 = reader4.readLine()) != null) {
              System.out.println(str4);
            }
            reader4.close();
            searchList.add("만화의 한류");
            break;
          default:
            System.out.println(aspect + "는 해당하는 개요가 아닙니다!");
            break;
        }
      }
      else if(n==4){
        /*
         * 한국의 강점과 약점 나열
         * 인터페이스 다형성 사용
         * 참조타입(배열) 사용
         */
        System.out.print("원하는 한류의 포인트는 무엇인가? ");
        String p = sc.next();
        Point pointList[] = new Point[2];
        switch(p){
          case "goodpoint":
            System.out.println("한류의 강점에 대해");
            pointList[0] = new GoodPoint();
            System.out.println("한류의 강점은 " + pointList[0].getPoint() + "입니다.");
            searchList.add("한류의 강점");
            break;
          case "badpoint":
            System.out.println("한류의 약점에 대해");
            pointList[1] = new BadPoint();
            System.out.println("한류의 약점은 " + pointList[1].getPoint() + "입니다.");
            searchList.add("한류의 약점");
            break;
          default:
            System.out.println(p + "는 해당하는 포인트가 아닙니다!");
            break;
        }
      }else if(n==5){
        /*
         * 이때동안 얻은 정보들 나열
         * 마지막에 정보들을 유지할지 지울지 결정
         * 컬렉션 프레임워크 사용
         */
        System.out.println("이때동안 얻은 정보를 나열합니다.");
        for(int i=0; i<searchList.size(); i++){
          String str = searchList.get(i);
          System.out.println(str);
        }
        System.out.println();
        System.out.print("찾은 정보들을 삭제할까요? ");
        String choose = sc.next();
        switch (choose){
          case "yes":
            searchList.clear();
            System.out.println("정보를 삭제합니다.");
            break;
          default:
            System.out.println("정보를 유지합니다.");
        }
      }
      else if(n==6){
        System.out.println("프로그램을 종료합니다.");
        break;
      }
      else{
        System.out.println("잘못된 번호입니다. 1, 2, 3, 4, 5, 6 중에서 입력하세요");
      }
    }
    sc.close();
  }
}