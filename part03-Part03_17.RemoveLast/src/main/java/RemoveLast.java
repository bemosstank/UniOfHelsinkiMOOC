
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
       ArrayList<String>strings = new ArrayList<>();
       strings.add("first");
       strings.add("secoond");
       strings.add("Third");
       System.out.println(strings);
       removeLast(strings);
       System.out.println(strings);
    }
    public static void removeLast(ArrayList<String> list){
        if(list.size()== 0){
            return;
        }
        list.remove(2);
    }

}
