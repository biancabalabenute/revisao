package services;

public class UsaInterestService implements InterestService{
    private double interestRate;

    public UsaInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
