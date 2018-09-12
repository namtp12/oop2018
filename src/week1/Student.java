package week1;

public class Student {
    //1: create fields + 3: set private
    // TODO: khai báo các thuộc tính cho Student
    private String name;
    private String id;
    private String group;
    private String emai;
    
    //7: Add 3 constructors
    
    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        name = "Student";
        id = "000";
        group = "INT22041";
        emai = "uet@vnu.edu.vn";
    }
    
    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
        name = n;
        id = sid;
        emai = em;
        group = "INT22041";
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
        name = s.name;
        id = s.id;
        group = s.group;
        emai = s.emai;
    }
    //4: getter,setter
    // TODO: khai báo các phương thức getter, setter cho Student

    /**
    * getName
    * @return 
    */
    
    public String getName() {
    	return name;
    }
    
    /**
     * setName
     * @param name
     */
    
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getID
     * @return
     */
    
    public String getID() {
        return id;
    }
    
    /**
     * setID
     * @param ID
     */
    
    public void setID(String ID) {
        this.id = ID;
    }
    
    /**
     * getGroup
     * @return
     */
    
    public String getGroup() {
        return group;
    }
    
    /**
     * setGroup
     * @param group
     */
    
    public void setGroup(String group) {
        this.group = group;
    }
    
    /**
     * getEmai
     * @return
     */
    
    public String getEmai() {
        return emai;
    }
    
    /**
     * setEmai
     * @param emai
     */
    
    public void setEmai(String emai) {
        this.emai = emai;
    }
    
    //5 : getInfo()
    
    /**
     * getInfo
     */
    public void getInfo() {
        //
        // TODO:
        System.out.println(this.name);
        System.out.println(this.id);
        System.out.println(this.group);
        System.out.println(this.emai);
        //return null; // xóa dòng này sau khi cài đặt
    }
}
