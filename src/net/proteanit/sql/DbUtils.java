
package net.proteanit.sql;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class DbUtils {
    
    public static DefaultTableModel resultSetToTableModel(ResultSet rs) {
        try {
            ResultSetMetaData metaData = rs.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            
            // Create column names
            String[] columnNames = new String[numberOfColumns];
            for (int column = 0; column < numberOfColumns; column++) {
                columnNames[column] = metaData.getColumnLabel(column + 1);
            }
            
            // Create data rows
            java.util.List<Object[]> rows = new java.util.ArrayList<>();
            while (rs.next()) {
                Object[] row = new Object[numberOfColumns];
                for (int i = 0; i < numberOfColumns; i++) {
                    row[i] = rs.getObject(i + 1);
                }
                rows.add(row);
            }
            
            Object[][] data = rows.toArray(new Object[0][]);
            return new DefaultTableModel(data, columnNames);
            
        } catch (SQLException e) {
            e.printStackTrace();
            return new DefaultTableModel();
        }
    }
}
