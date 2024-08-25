interface bicycle{
    int a = 45;// you can create properties in interface but you cannot modify them as they are final
    void ApplyBreak(int decrement);
    void SpeedUp(int increment);
}

interface horn{
    void blowHorn();
}

class AvonCycle implements bicycle, horn{ //we can implement multiple interfaces
//   note : interface methods should be implemented as public
   public void ApplyBreak(int decrement){
        System.out.println("Applying break");
     }
    public void SpeedUp(int increment){
         System.out.println("speeding up");
     }
     public void blowHorn(){
         System.out.println("blowing horn");
     }
}


public class interfaces {
    public static void main(String[] args) {
        System.out.println("Interfaces");
        AvonCycle cycle1 = new AvonCycle();
        cycle1.ApplyBreak(1);
        System.out.println(cycle1.a);
    }
}
