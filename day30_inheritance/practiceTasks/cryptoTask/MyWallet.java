package day30_inheritance.practiceTasks.cryptoTask;

public class MyWallet {

    public static void main(String[] args) {

        Bitcoin btc = new Bitcoin(20076.20, 2, 573.18, 827, 18925, true);
        Ethereum eth = new Ethereum(1107.49, 3, 134000000, 14989949495.88, 121344386, true);
        Cardano card = new Cardano(0.46, 5000, 15623097439.40, 790261222.15, 337390285, false);
        XRP xrp = new XRP(0.366591, 7000, 176878835.5, 246003729, 48300000.1, false);
        Doge doge = new Doge(0.070, 4000, 8881566.5, 497410752, 13267.9, true);


        CryptoToken[] tokens = {btc,eth,card,xrp,doge};

        double totalAsset = 0;

        for (CryptoToken eachToken : tokens) {

            totalAsset += eachToken.totalPrice();

        }



        System.out.println("totalAsset = " + totalAsset);


    }


}
/*
3. create a class named MyWallet

		create one object of each CryptoToken

		calculate the total Asset
 */