package basic100._1;
// 진쓰코딩의 [알고리즘 기초 100제] 1번 학생이름 저장 및 검색
/*
 - 학생 정보들을 저장하고 학생 이름으로 검색했을 때 학번을 출력하는 프로그램 작성

- Student 클래스 생성
- String name(이름), no(학번)를 가짐

- 학생들을 ArrayList에 저장한 이후
    - 계속 검색을 하겠느냐 Y→ 반복
    - 종료하고 싶으면 N → 프로그램 종료

- 학생 이름이 있는 경우, 그 학생의 학번을 출력
- 학생 이름이 없으면, 없는 학생 이름이라고 출력
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	//Student 인스턴스를 생성해야 함
	public static void main(String[] args) {
		Student st1 = new Student("정겨운", "201011172");
		Student st2 = new Student("정다와", "200306022");
		Student st3 = new Student("이미자", "195709166");
			
		// 학생들을 ArrayList에 담기
		ArrayList<Student>list = new ArrayList<Student>();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		// 잘 입력되었는지 확인하기 (처음부터 끝까지 반복해야 하는 작업은 foreach가 편하다)
		for(Student stu :list) {
			System.out.println(stu.getName());
			System.out.println(stu.getNo());
		}
		
		// 사용자로부터 키 입력을 받는 Scanner
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("계속 검색을 하고싶으시면 y, 종료하고 싶으시면 n");
			String input = sc.next(); //next()는 문자열을 받을 때 사용한다.
			
			if(input.equals("y")) {
				System.out.println("검색을 시작합니다");
				String name = sc.next(); // 학생의 이름을 문자열로 받는다
				boolean flag = false; //flag 변수들은 보통 boolean형으로 false로 초기화를 둔다.
				
				// 학생 이름이 있는 경우 (arrayList 순회)-> 학번을 출력 
				for(Student stu : list) {
					// 학생이 있는지 없는지 확인하는 것은 이 if문에 들어간 적이 있는지로 구분된다
					// 한 번이라도 이 루틴을 탔는지 안탔는지 확인할 때 보통 flag 변수를 둔다
					if(stu.getName().equals(name)) { // Student의 해당하는 인스턴스 getName과 내가 입력한 name 일치하면 여기로 온다
						System.out.println("해당하는 학생의 학번은 : "+stu.getNo());
						flag = true; // 한번이라도 학생 이름이 있었더라면!
					}
				}
				
				if(!flag) { // 한번도 if로 간 적이 없어서 flag가 false라면 여기로 온다
					System.out.println("해당하는 학생 이름이 없습니다");
				}
				
			}else if(input.equals("n")) { // 프로그램 종료하고 싶다
				break; //가장 가까운 while문을 탈출한다 (무한루프 종료)
			}
		}
		
		System.out.println("프로그램이 종료되었습니다.");
		sc.close();
	}

}
