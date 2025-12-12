package ex01;

public class Student extends Human {
    
    private String studentId; // 학번
    private String major;     // 전공

    public Student() {}  // 기본 생성자

    public Student(String name, int age, int height, int weight, String studentId, String major) {
        // 부모(Human)의 생성자 호출
        super(name, age, height, weight);
        this.studentId = studentId;
        this.major = major;
    }

    // getter/setter
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // 정보 출력 오버라이드
    @Override
    public void showInfo() {
        super.showInfo(); // Human의 showInfo() 실행
        System.out.println( getName + studentId);
        System.out.println("전공: " + major);
    }
}
