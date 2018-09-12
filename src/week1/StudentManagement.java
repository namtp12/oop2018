package week1;

public class StudentManagement {
    //11
    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    static int MAX = 100;
    Student[] students = new Student[MAX];

    public static boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return (s1.getGroup().equals(s2.getGroup()));
        //return false; // xóa dòng này sau khi cài đặt
    }
    
    void studentsByGroup() {
        //12
        // TODO: List all the group
        String[] groups = new String[MAX];
        int current = 1;
        groups[0] = students[0].getGroup();
        for(int i = 0; i < MAX; i++) {
            
                
            }
        }
    }

    void removeStudent(String id) {
        //13
        // TODO: delete students whose id is equal to id param from list
        for (int i = 0; i < MAX; i++) {
            if (students[i].getID().equals(id)) {
                for (int j = i; j < MAX; j++) {
                    students[j] = students[j - 1];
                    MAX--;
                }
                break;
            }
        }
    }

    public static void main(String[] args) {
        // TODO:
        Student nam = new Student();
        nam.setName("Tran Phuong Nam");
        nam.setID("120");
        nam.setGroup("INT22044");
        nam.setEmai("ntp28459hteam");
        //Print name of the student
        System.out.println(nam.getName());
        //Print all info of the student
        nam.getInfo();
        //Check 3 construcstors
        Student s1 = new Student();
        Student s2 = new Student("S2Name", "S2ID", "S2Emai");
        Student s3 = new Student(s1);
        
        //10: verify mathod sameGroup(Student s1, Student s2)
        Student s4 = new Student();
        Student s5 = new Student();
        //default group is "INT22041"
        Student s6 = new Student();
        s6.setGroup("INT22042");
        System.out.println(sameGroup(s1, s2));
        System.out.println(sameGroup(s1, s3));
    }
}
