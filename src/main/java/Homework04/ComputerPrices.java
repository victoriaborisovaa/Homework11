package Homework04;

import Homework04.Computer;

public class ComputerPrices {
    public static void main(String[] args) {
        Computer Windows = new Computer (2019, 3000.0,"Windows");
        Computer Mac = new Computer(2023, 5000.8, "MacOs");

        int priceComparison = Windows.comparePrice(Mac);
        if (priceComparison == -1){
            System.out.println("The price of Windows is higher than Mac.");
        } else if (priceComparison == 1) {
            System.out.println("The price of Mac is higher than Windows.");
        } else {
            System.out.println("The prices of Windows and Mac are the same.");
        }
}
}
