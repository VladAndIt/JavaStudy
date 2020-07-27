package Part_1.Chapter_12_Enum_AutoPack.Annotation.Example2;

import java.lang.annotation.*;
import java.lang.reflect.*;

class Meta {
    @MyAnno(str = "Two parameters",val = 19)
    public static void  myMeth(String str,int i){
        Meta ob = new Meta();
        try {
            Class<?> c  = ob.getClass();
            Method m = c.getMethod("myMeth", String.class, int.class);

            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        }catch (NoSuchMethodException e){
            System.out.println("The method is't found!");
        }
    }

    public static void main(String[] args) {
        Meta gb =new Meta();
                gb.myMeth("Test",10);

        Meta2 gb1 =new Meta2();
        gb1.myMethod();
    }
}
@What(description = "Test class annotation")
@MyAnno(str = "Meta2",val = 6)
class Meta2{
    @What(description = "Test class annotation")
    @MyAnno(str = "Meta2",val = 6)
    public static  void myMethod(){
        Meta2 ob = new Meta2();

        try {
            Annotation annos[] = ob.getClass().getAnnotations();
            System.out.println("All annotation of the class Meta2");
            for (Annotation anno : annos) System.out.println(anno);

            Method m = ob.getClass().getMethod("myMethod");
            annos = m.getAnnotations();

            System.out.println("All methods of the class Meta2");
            for (Annotation anno : annos) System.out.println(anno);
        }catch (NoSuchMethodException r){
            System.out.println("Method is not found!");
        }
    }

}