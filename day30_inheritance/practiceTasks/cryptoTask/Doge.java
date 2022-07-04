package day30_inheritance.practiceTasks.cryptoTask;

public class Doge extends CryptoToken{

    public Doge(double price, double quantity, double marketCap, double volume, double circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, volume, circulatingSupply, isMineable);
    }
}
