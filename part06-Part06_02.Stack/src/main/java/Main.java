
public class Main {

    public static void main(String[] args) {
        Stack p = new Stack();
        
     
        System.out.println(p.isEmpty());
        System.out.println(p.values()); 
       
        p.add("value");
        System.out.println(p.isEmpty());  
        System.out.println(p.values());
        
        String taken = p.take();
        System.out.println(p.isEmpty());
        System.out.println(p.values());
        System.out.println(taken);
    }
}
