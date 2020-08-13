package Tuan4_1;

public class Staff extends Person {
       private String school;
       private double pay;
       
       public Staff(String name, String address ,String school, double pay) {
    	      setName(name);
    	      setAddress(address);
    	      this.school = school;
    	      this.pay  = pay;
       }
       public void setPay(double pay) {
    	     this.pay = pay;    	     
       }
       public double getPay() {
    	     return pay;
       }
       public void setSchool(String school) {
    	     this.school = school;
       }
       public String getSchool() {
    	     return school;
       }
       @Override
       public String toString() {
    	    return "Staff[" + toString() + ",school =" +school + ",pay =" +pay + "]" ;
       }
       public static void main(String[] args){
        Staff st = new Staff("Pham Dinh Thi", "Me Tri", "UET",50000);
        String s1 = st.toString();
        String s2 = st.getSchool();
        double a = st.getPay();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(a);
    }
}
