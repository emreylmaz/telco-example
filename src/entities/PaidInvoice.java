package entities;

import java.time.LocalDate;

public class PaidInvoice extends  Invoice{
    private LocalDate paidDate;
    private PaymentMethod paymentMethod;


    public PaidInvoice(Invoice invoice,LocalDate paidDate, PaymentMethod paymentMethod) {
        super(invoice.getId() , invoice.getSubscription(), invoice.getDateCreated(), invoice.getDueDate(), invoice.isPaid());
        this.paidDate = paidDate;
        this.paymentMethod = paymentMethod;
    }

    public LocalDate getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(LocalDate paidDate) {
        this.paidDate = paidDate;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


}
