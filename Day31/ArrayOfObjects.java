 class Student {
    private int id;
    private String name;
    private String branch;

   
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }
}

 class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        for (int i = 0; i < 5; i++) {
            students[i] = new Student();

            
            students[i].setId(i+1);
            students[i].setName("Student " + (i+1));
            students[i].setBranch("Branch " + (i+1));
        }

       
        for (int i = 0; i < 5; i++) {
            System.out.println("Student " + (i+1) + " details:");
            System.out.println("ID: " + students[i].getId());
            System.out.println("Name: " + students[i].getName());
            System.out.println("Branch: " + students[i].getBranch());
            System.out.println();
        }
    }
}
