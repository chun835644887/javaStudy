package test;
import java.lang.reflect.Modifier;
import java.util.*;
import java.lang.*;
public class ReflectTest {
    public  static void main(String [] args){
        String name = "java.lang.Double";
        try {
            Class cl = Class.forName(name);
            Class superCl = cl.getSuperclass();
            String modifers = Modifier.toString(cl.getModifiers());
            if(modifers.length() > 0){
                System.out.println(modifers);
            }
            System.out.println("class:" + name);
            if (superCl!= null && superCl!=Object.class){
                System.out.println("extends:" + superCl.getName());
            }
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
