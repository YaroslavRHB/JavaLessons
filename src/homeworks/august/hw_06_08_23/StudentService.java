package homeworks.august.hw_06_08_23;

public class StudentService {
    public static boolean groupCompare(Student student1, Student student2) {
        Group group1 = student1.getGroup();
        Group group2 = student2.getGroup();
        String groupName1 = group1.getName();
        String groupName2 = group2.getName();
        return groupName1.equals(groupName2);
    }

    public static boolean universityCompare(Student student1, Student student2) {
        University university1 = student1.getUniversity();
        University university2 = student2.getUniversity();
        String universityName1 = university1.getName();
        String universityName2 = university2.getName();
        return universityName1.equals(universityName2);
    }

    public static boolean lastNameCompare(Student student1, Student student2) {
        String lastName1 = student1.getLastName();
        String lastName2 = student2.getLastName();
        return lastName1.equals(lastName2);
    }

}
