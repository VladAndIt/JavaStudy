package Chapter_12_Enum_AutoPack.Basic;

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap1,ap2,ap3;

        ap1 = Apple.RedDel;
        ap2 = Apple.GoldenDel;
        ap3 = Apple.RedDel;

        System.out.println(ap1 + "Value ap is " + Apple.Winesap.getPrice());


        if (ap1 == Apple.GoldenDel)System.out.println("The variable ap contains GoldenDel. \n");

        switch (ap1){
            case Jonathan:
                System.out.println("Kind Jonathan red");
                break;
            case GoldenDel:
                System.out.println("Kind GoldenDel yellow");
                break;
            case RedDel:
                System.out.println("Kind RedDel red");
                break;
            case Winesap:
                System.out.println("Kind Winesap green");
                break;
            case Cortland:
                System.out.println("Kind Cartland red");
                break;
        }

        //Apple allapples[] = Apple.values();
        for (Apple allapple : Apple.values()) System.out.println(allapple.ordinal() + ":" + allapple + " : " + allapple.getPrice());
        System.out.println();
        ap1 = Apple.valueOf("Winesap");
        System.out.println("Values ap contains " + ap1);

        if(ap1.compareTo(ap2)<0){
            System.out.println(ap1 + " before " + ap2);
        }
        if(ap2.compareTo(ap3)>0){
            System.out.println(ap1 + " before " + ap2);
        }
        if(ap1.compareTo(ap2)==0){
            System.out.println(ap1 + "equals " + ap2);
        }
        System.out.println();
        if(ap1.equals(ap2)){
            System.out.println("Error!");
        }
        if (ap1.equals(ap1)){
            System.out.println(ap1 + " equals "  + ap3);
        }
        if (ap1==ap3){
            System.out.println(ap1 + " =="  + ap3);
        }
    }
}
