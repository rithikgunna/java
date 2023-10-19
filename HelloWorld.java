public class HelloWorld {
    public static void main(String[] args) {
        int a=10;  
        int b=10;  
        System.out.println(a++ + ++a);//10+12=22  
        System.out.println(b++ + b++);//10+11=21  
    }
}


public class Student
 {    
public static void main(String[] args) {    
String address = "Delhi, India";    
    
if(address.endsWith("India")) {    
if(address.contains("Meerut")) {    
System.out.println("Your city is Meerut");    
}else if(address.contains("Noida")) {    
System.out.println("Your city is Noida");    
}else {    
System.out.println(address.split(",")[0]);    
}    
}else {    
System.out.println("You are not living in India");    
}    
}    
} 