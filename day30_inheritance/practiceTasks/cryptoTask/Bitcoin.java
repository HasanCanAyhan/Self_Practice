package day30_inheritance.practiceTasks.cryptoTask;

public class Bitcoin extends CryptoToken{


    public Bitcoin(double price, double quantity, double marketCap, double volume, double circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, volume, circulatingSupply, isMineable);
    }


}
