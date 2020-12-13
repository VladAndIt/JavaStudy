package Complete_reference_java_11.Part_1.Chapter_12_Enum_AutoPack.Annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;

//@MyAnno(str = "Example of annotation", val = 100)
//public class MainAnnotation {
//
//}
//@Target(ElementType.METHOD)
@MainAnnotation("rex")
@interface MainAnnotation {
    boolean run() default true;
    String value();
    //int gg();
    String type() default  "string";
}
@Documented
@Inherited
@Annotation1(name = "rex1",gg = 65)
@interface Annotation1 {
    boolean run() default true;
    String name();
    int gg();
    String type() default  "string";
}