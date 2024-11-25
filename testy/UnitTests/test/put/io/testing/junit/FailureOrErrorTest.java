package put.io.testing.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FailureOrErrorTest {

    @Test
    void test1() { //Fail
        assertEquals(4,2+1);
    }

    @Test
    void test2() { //Error
        assertEquals(4,2/0);
    }

    @Test
    void test3() { //AssertionFailedError
        try{
            assertEquals(4,2);
        }catch(Throwable e){
            e.printStackTrace();
        }

    }

}