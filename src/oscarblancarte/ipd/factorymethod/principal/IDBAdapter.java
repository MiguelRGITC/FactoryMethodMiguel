package oscarblancarte.ipd.factorymethod.principal;

import java.sql.Connection;

public interface IDBAdapter {

    public Connection getConnection();
}
