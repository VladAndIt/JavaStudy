package Part_1.Chapter_10_Exceptions.Throw;

public class SquarePerimeter {
    public void getPerimeter(String str) throws SideException{
        try {
            double side = Double.parseDouble(str);
            Square square1 = new Square();
            square1.setSide(0);
        }catch (NumberFormatException e){
            throw new SideException("String is incorrect!",e);
        } catch (SideException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
