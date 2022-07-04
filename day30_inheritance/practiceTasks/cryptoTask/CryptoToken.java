package day30_inheritance.practiceTasks.cryptoTask;

public class CryptoToken { // Task 4

    private double price, quantity, marketCap, volume, circulatingSupply;
    private boolean isMineable;

    public CryptoToken(double price, double quantity, double marketCap, double volume, double circulatingSupply, boolean isMineable) {
        setPrice(price);
        setQuantity(quantity);
        setMarketCap(marketCap);
        setVolume(volume);
        setCirculatingSupply(circulatingSupply);
        setMineable(isMineable);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0){
            System.err.println("price can not be set to zero or negative: " + price);
            System.exit(1);
        }

        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {

        if(quantity < 0 ){
            System.err.println("quantity can not set to negative: " + quantity);
            System.exit(1);
        }

        this.quantity = quantity;
    }

    public double getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(double marketCap) {
        if(marketCap == 0){
            System.err.println("marketCap can not be zero");
            System.exit(1);
        }

        this.marketCap = marketCap;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getCirculatingSupply() {
        return circulatingSupply;
    }

    public void setCirculatingSupply(double circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    public boolean isMineable() {
        return isMineable;
    }

    public void setMineable(boolean mineable) {
        isMineable = mineable;
    }

    public double totalPrice(){
        return price * quantity;
    }

    public String toString() {

        return   getClass().getSimpleName() +"{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", circulatingSupply=" + circulatingSupply +
                ", isMineable=" + isMineable +
                ", total price= $" + totalPrice() +
                '}';
    }


}
/*
1. create a class called CryptoToken
			variables:
				price, quantity, marketCap, volume, circulatingSupply, isMineable (boolean)

			Encapsulate all the fields
				Conditions:
					1. price can not be set to zero or negative
					2. quantity can nt set to negative
					3. marketCap can not be zero

			methods:
				toString()
				totalPrice(): returns the total price of the cyrpto totek ( price * quantity)

	2. create 5 sub classes of CryptoToken:
			Bitcoin
			Ethereum
			Cardano
			XRP
			Doge

	3. create a class named MyWallet

		create one object of each CryptoToken

		calculate the total Asset

 */