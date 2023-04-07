
public class MainProgram {

    public static void main(String[] args) {
        Counter count = new Counter();
        System.out.println(count);
        
        
        count.increase(10);
        System.out.println(count);
        
        count.increase(-1);
        System.out.println(count);

        count.decrease(10);
        System.out.println(count);
        
        
        count.decrease(-1);
        System.out.println(count);      
        System.out.println(count);
       

    }
}
