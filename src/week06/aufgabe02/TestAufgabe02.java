package week06.aufgabe02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import week06.aufgabe01.Stack;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestAufgabe02 {

    private int fromBalance = 100;
    private int fromLowerLimit = 10;
    private int fromUpperLimit = 110;

    private int toBalance = 200;
    private int toLowerLimit = 20;
    private int toUpperLimit = 220;

    @Test
    public void whenTransactionExceptionThrown_LowerLimitViolationFromAccount_thenAssertionSucceeds() {
        BankAccount from = new BankAccount(fromBalance, fromLowerLimit, fromUpperLimit);
        BankAccount to = new BankAccount(toBalance, toLowerLimit, toUpperLimit);
        from.transfer(from, to, 95);
        Assertions.assertEquals(from.getBalance(), fromBalance);
        Assertions.assertEquals(to.getBalance(), toBalance);
    }


    @Test
    public void whenTransactionExceptionThrown_UpperLimitViolationToAccount_thenAssertionSucceeds() {
        BankAccount from = new BankAccount(fromBalance, fromLowerLimit, fromUpperLimit);
        BankAccount to = new BankAccount(toBalance, toLowerLimit, toUpperLimit);
        from.transfer(from, to, 30);
        Assertions.assertEquals(from.getBalance(), fromBalance);
        Assertions.assertEquals(to.getBalance(), toBalance);
    }

    @Test
    public void whenTransactionSucceeded_thenAssertionSucceeds() {
        BankAccount from = new BankAccount(fromBalance, fromLowerLimit, fromUpperLimit);
        BankAccount to = new BankAccount(toBalance, toLowerLimit, toUpperLimit);
        int amount = 10;
        from.transfer(from, to, amount);
        Assertions.assertEquals(from.getBalance(), fromBalance - amount);
        Assertions.assertEquals(to.getBalance(), toBalance + amount);
    }

    @Test
    public void whenNegativeDepositAmountEntered_thenAssertionSucceeds() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            BankAccount b = new BankAccount(fromBalance, fromLowerLimit, fromUpperLimit);
            b.deposit(-10);
        });
    }

    @Test
    public void whenNegativeWithdrawAmountEntered_thenAssertionSucceeds() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            BankAccount b = new BankAccount(fromBalance, fromLowerLimit, fromUpperLimit);
            b.withdraw(-10);
        });
    }
}
