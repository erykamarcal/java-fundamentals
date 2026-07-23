package javastudies.poo.exceptionHandling.bankAccountWithdrawal.model.exceptions;

public class DomainException extends RuntimeException {
    public DomainException(String message) {
        super(message);
    }
}
