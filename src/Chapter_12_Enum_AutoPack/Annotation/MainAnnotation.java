package Chapter_12_Enum_AutoPack.Annotation;

//@MyAnno(str = "Example of annotation", val = 100)
//public class MainAnnotation {
//
//}
public @interface MainAnnotation {
    String name();
    String type() default  "string";
}
