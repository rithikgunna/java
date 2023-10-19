class calculator{
    int a;
public int  add(int n1, int n2)
{
     return n1 + n2;
}
}
public class Demo {
    public static void main(String[] args) {
        int num1= 4;
        int num2 = 6;

        calculator calc = new calculator();
        int result = calc.add(num1,num2);
        System.out.println(result);
    }   
}
