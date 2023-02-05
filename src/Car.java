public class Car {
    public String model = "GTI";
    public double price = 150.999;

    public boolean start = true;
    public boolean stop = false;
    public boolean move = true;

    @Override
    public String toString () {
        return "Car {" + " Model: " + model + ",  Price: " + price + ",  Starting = " + start + ",  Stopping = " + stop + ",  Moving = " + move + " }";
    }

}
