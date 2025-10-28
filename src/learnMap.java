import java.util.HashMap;
import java.util.Map;

public class learnMap {
    public static void main(String[] args) {


        Map<String,Integer> students=new HashMap<>();
        students.put("niko",19);
        students.put("jaz",18);
        students.put("nigg",29);
        students.put("errw",20);
        students.put("akay",21);


        System.out.println(students);
        System.out.println(students.keySet());
        System.out.println(students.entrySet());

        for(String name:students.keySet()){
            System.out.printf("%s: %d\n",name,students.get(name));
        }

    }
}
