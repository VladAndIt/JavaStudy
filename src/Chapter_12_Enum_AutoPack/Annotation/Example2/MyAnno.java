package Chapter_12_Enum_AutoPack.Annotation.Example2;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}
@Retention(RetentionPolicy.RUNTIME)
@interface What{
    String description();
}

