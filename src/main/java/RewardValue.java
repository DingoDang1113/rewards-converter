public class RewardValue {
    private double cashValue;
    private double milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035;
    }

    public RewardValue(Miles miles) {
        this.milesValue = miles.getValue();
        this.cashValue = milesValue * 0.0035;
    }

    public static class Miles {
        private final double value;

        public Miles(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}
