package Services;

public interface IOnlinePaymentService {

    double paymentFee(double amount);
    double interest(double amount, int months);
}
