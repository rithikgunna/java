class Computer
{
    public void playMusic()
    {
System.out.println("Music playing");
    }
    public String getMeApen(int cost)
    {
        if(cost >= 10)
          return "pen";
        else 
         return "Nothing";  
    }
}
public class Demo2 {
    /**
     * @param args
     */
    public static void main(String[] args)
    {
       Computer obj = new Computer();
       obj.playMusic();
       String str = obj.getMeApen(10);
       System.out.println(str);
    }

}
