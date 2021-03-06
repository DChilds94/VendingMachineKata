package coins;

public class Coin {
    private CoinType coinType;

    public Coin(CoinType coinType) {
        this.coinType = coinType;
    }

    public double getWeightFromEnum() {
        return coinType.getWeight();
    }

    public double getCoinDiameter() {
        return coinType.getDiameter();
    }

    public CoinType getCoinType() {
        return coinType;
    }
}
