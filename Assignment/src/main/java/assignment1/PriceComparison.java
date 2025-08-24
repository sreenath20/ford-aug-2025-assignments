package assignment1;

public class PriceComparison {
    public static void main(String[] args) {

        Double amazonPrice = 200.5;
        Double flipkartPrice = 300.87;
        Double meeshoPrice = 150.75;
        Double lowestprice;
        Double highestprice;
        Double priceDifferencePercentage;

        lowestprice = (amazonPrice < flipkartPrice ? amazonPrice : flipkartPrice);
        lowestprice = (lowestprice < meeshoPrice ? lowestprice : meeshoPrice);

        System.out.println("The lowest price is " + lowestprice);

        highestprice = (amazonPrice > flipkartPrice ? amazonPrice : flipkartPrice);
        highestprice = (highestprice > meeshoPrice ? highestprice : meeshoPrice);

        System.out.println("The highest price is " + highestprice);

        priceDifferencePercentage = ((highestprice - lowestprice) / ((highestprice + lowestprice) / 2)) * 100;

        System.out.println("The price difference percentage is " + priceDifferencePercentage);

    }
}
