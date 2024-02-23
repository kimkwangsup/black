package day09;


public class Ex01_stud {
/*
	Student 클래스를 이용해서
	5명의 학생의 점수를 관리할 예정이다.
	배열로 만들어서 결과를 출력하세요.
 */
	public static void main(String[] args) {
		String[] names = {"제니" , "리사" , "로제", "지수" , "광섭"};
		Student[] stud = new Student[5];
		for(int i = 0 ; i < stud.length ; i++) {
			int kor = (int)(Math.random() * (100-60+1) + 60);
			int eng = (int)(Math.random() * (100-60+1) + 60);
			int math = (int)(Math.random() * (100-60+1) + 60);
			Student stu = new Student(names[i],kor, eng, math);
			stu.setTotal();
			stu.setAvg();
			stud[i] = stu;
		}
		for(int i = 0 ; i < stud.length ; i++) {
			System.out.printf("%s - 국어 : %3d, 영어 : %3d, 수학 : %3d, 총합 : %3d, 평균 : %4.2f\n",
					names[i], stud[i].kor, stud[i].eng, stud[i].math, stud[i].total, stud[i].avg);
		}
		
		
	}
}
