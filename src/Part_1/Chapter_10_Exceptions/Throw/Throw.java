package Part_1.Chapter_10_Exceptions.Throw;

public class Throw {
    public static void main(String[] args) {
        SquarePerimeter sideExc = new SquarePerimeter();
        try {
            sideExc.getPerimeter("sdfa");
        } catch (SideException e) {
            e.printStackTrace();
        }
    }
}
