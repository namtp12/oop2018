package week1;

public class StudentManagement {
    //11
    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    static int MAX = 100;
    Student[] students = new Student[MAX];
        private int numOfStudents = 0;

    //9
    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return (s1.getGroup().equals(s2.getGroup()));
        //return false; // xóa dòng này sau khi cài đặt
    }
    
    public void addStudent(Student student) {
        if (numOfStudents >= 100)
            throw new IllegalStateException("Array is full");
        
        students[numOfStudents++] = student;
    }
    
    //12
    /**
     * studentsByGroup : print list of students
     */
    
    void studentsByGroup() {
        //12
        // TODO: List all the group by add them to a new array groups
        
        //Initialize "students"
        
        for(int i = 0; i < MAX; i ++) {
            students[i] = new Student();
            students[i].setName("Student" + Integer.toString(i));
            numOfStudents++;
            if (i % 2 == 0) {
                students[i].setGroup("INT22042");
                students[i].setID(Integer.toString(i));
            }
        }
        String[] groups = new String[MAX];
        int groupSize = 1;
        groups[0] = students[0].getGroup();
        
        int groupCount;
        for(int i = 0; i < numOfStudents; i++) {
            groupCount = 0; //Start a new count of new each student
            for(int j = 0; j < groupSize; j++) {
                if (students[i].getGroup().equals( groups[j])) {
                    groupCount++; //groups has already had the group of student[i]
                    break;
                }                
            }
            //end of inner loop
            if (groupCount == 0) {
                //System.out.println(i);
                groupSize++;
                groups[groupSize - 1] = students[i].getGroup(); //add the group of student[i] to the array groups
            }
        }
        
        //System.out.println("Nam" + groupSize);
        //Print list
        
        for(int i = 0; i < groupSize; i++) {
            System.out.println("List of group " + groups[i]);
            for(int j = 0; j < numOfStudents; j++) {
                if (students[j].getGroup().equals( groups[i])) {
                    System.out.println(students[j].getName());
                }
            }
        }
    }
    void removeStudent(String id) {
        //13
        // TODO: delete students whose id is equal to id param from list
        for (int i = 0; i < numOfStudents; i++) {
            if (students[i].getID().equals(id)) {
                for (int j = i; j < MAX; j++) {
                    students[j] = students[j - 1];
                }
                numOfStudents--;
                break;
            }
        }
    }

    public static void main() {
        //2: main method
        // TODO:
        //6: create my student object, call getInfo method
        Student nam = new Student();
        nam.setName("Tran Phuong Nam");
        nam.setID("120");
        nam.setGroup("INT22044");
        nam.setEmai("ntp28459hteam");
        //Print name of the student
        System.out.println(nam.getName());
        //Print all info of the student
        nam.getInfo();
        
        //8:Check 3 construcstors
        Student s1 = new Student();
        Student s2 = new Student("S2Name", "S2ID", "S2Emai");
        Student s3 = new Student(s1);
        
        //10: verify mathod sameGroup(Student s1, Student s2)
        Student s4 = new Student();
        Student s5 = new Student();
        //default group is "INT22041"
        Student s6 = new Student();
        s6.setGroup("INT22042");
        StudentManagement sList = new StudentManagement();
        System.out.println(sList.sameGroup(s4, s5));
        System.out.println(sList.sameGroup(s4, s6));
        
        //Verify studentsByGroup() method
        
        sList.studentsByGroup();
        sList.removeStudent("50");
        //sList.studentsByGroup();
        System.out.println(sList.numOfStudents);
    }
}

    
