package mz.org.fgh.idartlite.dao;

import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.DatabaseTableConfig;
import mz.org.fgh.idartlite.model.DispensedDrug;
import mz.org.fgh.idartlite.model.Stock;


import java.sql.SQLException;

public class DispensedDrugDaoImpl extends GenericDaoImpl<DispensedDrug, Integer> implements DispensedDrugDao {

    public DispensedDrugDaoImpl(Class dataClass) throws SQLException {
        super(dataClass);
    }

    public DispensedDrugDaoImpl(ConnectionSource connectionSource, Class dataClass) throws SQLException {
        super(connectionSource, dataClass);
    }

    public DispensedDrugDaoImpl(ConnectionSource connectionSource, DatabaseTableConfig tableConfig) throws SQLException {
        super(connectionSource, tableConfig);
    }

    public boolean checkStockIsDispensedDrug(Stock stock) throws SQLException {
        return queryBuilder().where().eq(DispensedDrug.COLUMN_STOCK, stock.getId()).query().isEmpty();
    }
}
