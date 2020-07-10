package Chapter_10_Exceptions.Throw;

public class Square {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) throws SideException{
        if(side <= 0) throw new SideException("Side is wrong/incorrect!");
        this.side = side;
    }
}
