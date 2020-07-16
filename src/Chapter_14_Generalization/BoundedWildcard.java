package Chapter_14_Generalization;

public class BoundedWildcard {
    static void showXY(Coords<?> c){
        System.out.println("X Y coordinates:");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y);

        }
    }

    static void showXYZ(Coords<? extends ThreeD> c){
        System.out.println("X Y Z coordinates:");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);

        }
    }

    static void showAll(Coords<? extends FourD> c) {
        System.out.println("X Y Z T coordinates:");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z + " " + c.coords[i].t);

        }
    }

    public static void main(String[] args) {
        TwoD td[] = {new TwoD(0,2),
                     new TwoD(8,9),
                     new TwoD(90,3),
                     new TwoD(-5,1)
        };

        Coords<TwoD> D2 = new Coords<TwoD>(td);
        System.out.println("Contents of D2");
        showXY(D2);
        //showXYZ(D2); ERROR

        FourD td4[] = {new FourD(0,2,6,7),
                new FourD(8,9,6,4),
                new FourD(90,3,5,3),
                new FourD(-5,1,4,2)
        };
        Coords<FourD> D4 = new Coords<FourD>(td4);
        showXY(D4);
        showXYZ(D4);
        showAll(D4);


    }
}
class TwoD{
    int x,y;

    public TwoD(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class ThreeD extends TwoD{
    int z;

    public ThreeD(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}
class FourD extends ThreeD{
    int t;
    public FourD(int x, int y, int z, int t) {
        super(x, y, z);
        this.t = t;
    }
}
class Coords<T extends TwoD>{
    T[] coords;

    public Coords(T[] coords) {
        this.coords = coords;
    }
}