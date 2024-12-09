package put.io.testing.mocks;

import put.io.students.fancylibrary.database.IFancyDatabase;

import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.mockito.Mockito.*;
public class MyDatabase implements IFancyDatabase {

    @Override
    public void connect() {

    }

    @Override
    public <T> void persist(T t) {

    }

    @Override
    public <T> List<T> queryAll() {
//        IFancyDatabase mockdatabase = mock(IFancyDatabase.class);
        return Collections.emptyList();

    }

    @Override
    public void close() {

    }
}
