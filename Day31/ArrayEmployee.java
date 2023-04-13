class Employee{
  private int eid;
  private String ename;
  private int esalary;

  void setEid(int eid){
    this.eid=eid;
  }
  void setEname(String ename){
    this.ename=ename;
  }
  void setEsalary(int esalary){
    this.esalary=esalary;
  }
  int getEid(){
    return this.eid;
  }
  String getEname(){
    return this.ename;
  }
  int getEsalary(){
    return this.esalary;
  }
}
class Main{
  public static void main(String args[]){
    Employee employees[]=new Employee[2];
    for (int i = 0; i < 5; i++) {
            employees[i] = new Employee();
            employees[i].setEid(i+1);
            employees[i].setEname("Employee " + (i+1));
            employees[i].setEsalary("Salary " + (i+1));
    }
    for (int i=0;i<5;i++){
      
    }
  }
}