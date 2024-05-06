package Services;
import Entities.Installment;
import Entities.Contract;
import java.time.LocalDate;

public class ContractService {

    private IOnlinePaymentService onlinePaymentService;

    public ContractService(IOnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months){
        double basicQuota = contract.getTotalValue()/months;
        for(int i = 1; i <= months; i++){
           LocalDate dueDate = contract.getDate().plusMonths(i);
           double interest = IOnlinePaymentService.interest(basicQuota, i);
           double fee = onlinePaymentService.paymentFee(basicQuota + interest);
           double quota = basicQuota + interest + fee;
           contract.getInstalments().add(new Installment(dueDate,quota));
       }
    }
}
