package Entities;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {

    private int number;
    private Double totalValue;
    private LocalDate date;
    private List<Installment> instalments = new ArrayList<>();

    public Contract(int number, Double totalValue, LocalDate date) {
        this.number = number;
        this.totalValue = totalValue;
        this.date = date;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<Installment> getInstalments() {
        return instalments;
    }
}
