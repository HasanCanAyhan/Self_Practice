package day30_inheritance.practiceTasks.cryptoTask;

public class Ethereum extends CryptoToken{

    public Ethereum(double price, double quantity, double marketCap, double volume, double circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, volume, circulatingSupply, isMineable);
    }
}
