package Lab8;

import Lab7.MySet;
import Lab6.Porschee;

public class Main {
    public static void main(String[] args) throws WrondReduceOfFuelValueException {
        try {
            new MySet().add(new Porschee(-3, 5, 5000));
        }
        catch (WrongCostValueException  | WrongCapacityValueException | WrondReduceOfFuelValueException e)
        {
            System.out.println(e.getMessage());

        }
    }
}