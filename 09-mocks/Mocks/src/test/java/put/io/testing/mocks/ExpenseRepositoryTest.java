package put.io.testing.mocks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import put.io.students.fancylibrary.database.FancyDatabase;
import put.io.students.fancylibrary.database.IFancyDatabase;

import java.util.Collections;

import static org.mockito.Mockito.*;

public class ExpenseRepositoryTest {
    ExpenseRepository repo;
    IFancyDatabase fancyDatabase;


    @BeforeEach
    void setUp() {
        fancyDatabase = new FancyDatabase();
        repo = new ExpenseRepository(fancyDatabase);
    }

    @Test
    void loadExpenses() {
        IFancyDatabase mockdatabase = mock(IFancyDatabase.class);
        repo = new ExpenseRepository(mockdatabase);
        when(mockdatabase.queryAll()).thenReturn(Collections.emptyList());



        repo.loadExpenses();
        assertArrayEquals(repo.getExpenses().toArray(),new Expense[]{});

        verify(mockdatabase).connect();
        verify(mockdatabase).queryAll();
        verify(mockdatabase).close();
    }



}

