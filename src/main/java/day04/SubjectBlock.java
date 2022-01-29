package day04;

public class SubjectBlock {
    private String name;
    private String subject;
    private String gradeAndClass;
    private int lessonNumber;


    public SubjectBlock(String name, String subject, String gradeAndClass, int lessonNumber) {
        this.name = name;
        this.subject = subject;
        this.gradeAndClass = gradeAndClass;
        this.lessonNumber = lessonNumber;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public String getGradeAndClass() {
        return gradeAndClass;
    }

    public int getLessonNumber() {
        return lessonNumber;
    }

    @Override
    public String toString() {
        return "SubjectBlock{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", gradeAndClass='" + gradeAndClass + '\'' +
                ", lessonNumber=" + lessonNumber +
                '}';
    }
}
