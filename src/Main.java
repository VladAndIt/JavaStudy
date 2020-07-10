import Chapter_10_Exceptions.BasisStage.ExcClass;
//import Chapter_9_Interfaces.*;
//import Chapter_10_Exceptions.*;

public class Main {
    public static void main(String[] args) {
        //_________________________________________________Chapter 9

        //-----------------------------------------Constant in interfaces
        /*
        Ask ask1 = new Ask();
        Question qu = new Question();
        ask1.answer(qu.ask());
        ask1.answer(qu.ask());
        ask1.answer(qu.ask());
        */

        //-----------------------------------------Extend interfaces
        /* The class needs to realize all the methods each interfaces

        ClassImplementsB ClassImplementsB_Extended_A = new ClassImplementsB();
        ClassImplementsB_Extended_A.approach1();
        ClassImplementsB_Extended_A.approach2();
        ClassImplementsB_Extended_A.approach3();
        */

        //-----------------------------------------Interface default methods
        /* name_of_ interface.super.name_of_method();  -- in case the same names of the methods in two interfaces


        ClassImp classImpWithDefMethod = new ClassImp();
        System.out.println(classImpWithDefMethod.getNumber());
        System.out.println(classImpWithDefMethod.getString());

        ClassImpOverwriteDefault obj = new ClassImpOverwriteDefault();
        System.out.println(obj.getNumber());
        System.out.println(obj.getString());
        */

        //-----------------------------------------Static interface methods
        //System.out.println(MyInterface.getDefaultNumber());

        //_________________________________________________Chapter 10

        //-----------------------------------------Exceptions
        ExcClass exeprionDivisionByZero = new ExcClass(6,3);
    }
}
