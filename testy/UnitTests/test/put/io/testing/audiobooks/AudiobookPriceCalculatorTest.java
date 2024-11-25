package put.io.testing.audiobooks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import put.io.testing.junit.Calculator;

import static org.junit.jupiter.api.Assertions.*;
import static put.io.testing.audiobooks.Customer.LoyaltyLevel.GOLD;
import static put.io.testing.audiobooks.Customer.LoyaltyLevel.SILVER;

class AudiobookPriceCalculatorTest {

    Customer customer;
    Audiobook audiobook;

    @Test
    void testSubscription() {
        customer = new Customer("John",SILVER,true);
        audiobook = new Audiobook("A",1);
        assertEquals(0,AudiobookPriceCalculator.calculate(customer,audiobook));
    }

    @Test
    void testSilverSubscription() {
        customer = new Customer("Ada",GOLD,true);
        audiobook = new Audiobook("A",1);
        assertEquals(0,AudiobookPriceCalculator.calculate(customer,audiobook));
    }

    @Test
    void testSubscription2() {
        customer = new Customer("John",SILVER,false);
        audiobook = new Audiobook("A",1);
        assertEquals(0.9,AudiobookPriceCalculator.calculate(customer,audiobook));
    }

    @Test
    void testSilverSubscription2() {
        customer = new Customer("Ada",GOLD,false);
        audiobook = new Audiobook("A",1);
        assertEquals(0.8,AudiobookPriceCalculator.calculate(customer,audiobook));
    }



}