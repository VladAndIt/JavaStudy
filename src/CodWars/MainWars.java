package CodWars;//import Complete_reference_java_11.Part_1.Chapter_9_Interfaces.*;
//import Complete_reference_java_11.Part_1.Chapter_10_Exceptions.*;

public class MainWars {
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
        //ExcClass exeprionDivisionByZero = new ExcClass(6,3);
        var array2 = new int[]{1,100,50,-51,1,1};
        var array = new int[]{1, 2, 3, 4, 3, 2, 1};
        var array3 = new int[]{2824, 1774, -1490, -9084, -9696, 23094};

        System.out.println(whatPartMore(0,new int[] {1,2,3,4,3,2,1}));
        System.out.println(whatPartMore(0,new int[] {1,100,50,-51,1,1}));
        System.out.println(whatPartMore(0,new int[] {1,2,3,4,5,6}));
        System.out.println(whatPartMore(0,new int[] {20,10,30,10,10,15,35}));
        System.out.println(whatPartMore(0,new int[] {-8505, -5130, 1926, -9026}));
        System.out.println(whatPartMore(0,new int[] {2824, 1774, -1490, -9084, -9696, 23094}));
        System.out.println(whatPartMore(0,new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));
        System.out.println(whatPartMore(0,new int[] {8,0}));
        System.out.println(whatPartMore(0,new int[] {-7511,4732,1359,-758,-9288,2109,-9773,-5384,8909,-8053,5862,5924,1299,-9615,-7810,-4937,9267,-6914,-9650,-3510,1091,3763,3935,-8980,4585,-7331,-8785,3726,3480,1359,7868,1263,4593,138,-5978,-9356,-7877,-7144,-7194,-3752,7880,10000,4069,-5230,-8221,-4443,-3400,-1136,5695,-4278,4912,-635,5485,-1823,2532,3279,1044,9629,-7250,144,-7777,-3851,9906,-7115,9707,6053,-450,965,4210,8207,4187,3382,-5168,-9961,2813,-2958,7952,9009,-2891,1983,-8260,-1168,4865,9168,-1795,-2433,-7870,-1212,4581,8433,9569,-2523,-1010,6250,-4380,-8679,1473,2492,9345,8267,-9221,122,-818,8255,-202,5790,386,-7623,8033,1386,3493,3334,-1756,9585,8971,-1333,-3818,-1297,-949,-4479,-2722,1083,-3249,-8922,2241,6134,4236,-3628,-5328,-5692,-2087,2824,-1841,1492,6039,-9345,7720,4624,6101,6204,1061,-1140,-6100,1247,-1210,-5822,-6010,1566,-469,-4966,2002,-5711,5867,549,-6587,-6064,55,-5330,429,5662,4690,5831,8902,-9186,-7218,3892,588,-5254,-5832,8452,2572,-320,744,7129,5268,-3467,1685,4975,-6785,8691,1659,6945,-1269,8059,9944,-5850,-2508,-885,-3524,-8367,-2755,-9795,-8008,484,6131,3010,3796,328,5414,-9124,6073,-404,-6994,4639,4301,418,8724,554,6925,-7378,2,9179,4350,-2993,-2306,-3733,-4802,1931,5532,7201,-7136,-795,4004,-5023,-8399,5422,9630,8466,-9348,-7000,-5995,2402,7440,-8330,-6516,3527,-3683,-4508,-9995,8285,8172,3187,-3687,-3324,-2125,-9765,-5292,4140,-8369,44,-2530,-1264,4241,8481,-792,4471,7560,1155,-3326,-6786,-4288,6051,-76,-2504,-9929,5460,-9757,-5655,-2412,-9351,-5137,-3619,-279,282,6245,528,6081,-662,-5383,7006,-3216,9127,6421,-8333,637,-9034,8461,-6729,-7587,-3818,7818,3958,1834,3320,-9041,5974,9300,9800,1970,596,-1033,9736,-526,6249,8484,-7803,-5434,1965,-3510,-5026,-2053,-384,3953,7681,-6540,3784,-6560,-4908,7366,1619,-8325,6617,-2071,-3244,-5020,-8903,8292,1099,4696,7452,7078,6215,213,-8863,5852,-7895,-9053,4027,-9744,-4702,-4597,1006,-7430,-9543,-4582,-9549,7411,158,6744,41793}));
    }
    static int whatPartMore(int startIndex, int[] array){
        long sumL = 0,sumR = 0;
        int i = 0, j = startIndex;
        while(i <= startIndex){
            if(i <= startIndex){
                sumL += array[i];
                i++;
            }
        }
        while(j < array.length){
            if(j < array.length){
                sumR += array[j];
                j++;
            }
        }
        sumL -= array[startIndex];
        sumR -= array[startIndex];
        if(sumL != sumR && startIndex + 1 < array.length)  return whatPartMore(startIndex+1,array);
        else if(sumL == sumR)return startIndex;
        else return -1;
    }
}
