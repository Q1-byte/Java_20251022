package ex01;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("홍길동", 20, 171, 81, "201101", "영문");
        Student s2 = new Student("고길동", 21, 183, 72, "201102", "건축");
        Student s3 = new Student("박길동", 22, 175, 65, "201103", "컴공");
        
        s1.showInfo();
        s2.showInfo();
        s3.showInfo();
    }
}
