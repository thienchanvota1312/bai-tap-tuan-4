package Tuan4_1;

public class Student extends Person {  
	private String program;
	private int year;
	private double fee;
	public Student(String name, String address, String program, int year , double fee) {
	    setName(name);
	    setAddress(address);
	    this.program = program;
	    this.year = year;
	    this.fee = fee ;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public String getProgram() {
		return program;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return year;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public double getFee() {
		return fee;
	}
  
  @Override
  public String toString () {
        return ("Student[name="+ this.name + ", address="+ this.address +"]"+  ", program ="+ this.program +  ", fee=" + this.fee + "]");
  }
	public static void main(String[] args){
        Student st = new Student("Pham Dinh Thi", "Me Tri", "oop", 2020, 278000);
        int a = st.getYear();
        double b = st.getFee();
        String s1 = st.getProgram();
        String s2 = st.toString();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(a);
        System.out.println(b);
    }

}
