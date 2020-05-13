package week06.aufgabe02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestAufgabe02 {

    @Test
    public void whenTransactionExceptionThrown_LowerLimitViolationFromAccount_thenAssertionSucceeds() {
        BankAccount from = new BankAccount(1000, 10, 100);
        BankAccount to = new BankAccount(2000, 20, 200);
        Exception exception = assertThrows(TransactionException.class, () -> {
            from.transfer(from, to, 5);
            Assertions.assertEquals(from.getBalance(), 1000);
            Assertions.assertEquals(from.getBalance(), 2000);
        });
    }


    @Test
    public void whenTransactionExceptionThrown_LowerLimitViolationToAccount_thenAssertionSucceeds() {
        BankAccount from = new BankAccount(1000, 10, 100);
        BankAccount to = new BankAccount(2000, 20, 200);
        Exception exception = assertThrows(TransactionException.class, () -> {
            from.transfer(from, to, 15);
            Assertions.assertEquals(from.getBalance(), 1000);
            Assertions.assertEquals(from.getBalance(), 2000);
        });
    }

    @Test
    public void whenTransactionExceptionThrown_UpperLimitViolationFromAccount_thenAssertionSucceeds() {
        BankAccount from = new BankAccount(1000, 10, 100);
        BankAccount to = new BankAccount(2000, 20, 200);
        Exception exception = assertThrows(TransactionException.class, () -> {
            from.transfer(from, to, 105);
            Assertions.assertEquals(from.getBalance(), 1000);
            Assertions.assertEquals(from.getBalance(), 2000);
        });
    }

    @Test
    public void whenTransactionExceptionThrown_UpperLimitViolationToAccount_thenAssertionSucceeds() {
        BankAccount from = new BankAccount(1000, 10, 100);
        BankAccount to = new BankAccount(2000, 20, 200);
        Exception exception = assertThrows(TransactionException.class, () -> {
            from.transfer(from, to, 205);
            Assertions.assertEquals(from.getBalance(), 1000);
            Assertions.assertEquals(from.getBalance(), 2000);
        });
    }

    @Test
    public void whenTransactionSucceeded_thenAssertionSucceeds() {
        BankAccount from = new BankAccount(1000, 10, 100);
        BankAccount to = new BankAccount(2000, 20, 200);
        Exception exception = assertThrows(TransactionException.class, () -> {
            from.transfer(from, to, 150);
            Assertions.assertEquals(from.getBalance(), 850);
            Assertions.assertEquals(from.getBalance(), 2150);
        });
    }
}
