package Tuan4_1;

public class Person {
    private String name;
    private String address;
    
    public Person() {
    	
    }
    public Person(String name, String address) {
    	  this.name = name;
    	  this.address = address;
    }
    public void setName(String name) {
    	  this.name = name ;
    }
    
    public String getName() {
    	return name;
    }
    public void setAddress(String address) {
    	   this.address =  address; 
    }
    public String getAddres() {
    	  return address;
    }
    public String toString() {
    	return "Person[name ="+ name + ", address = " + address + "]";
    }
	
    public static void main(String[] args){
    Person p = new Person("Pham Dinh Thi", "Me Tri");
    String s = p.toString();
    System.out.println(s);
    }

}
