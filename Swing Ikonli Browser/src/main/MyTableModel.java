package main;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import org.kordamp.ikonli.swing.FontIcon;

/**
 *
 * @author Mustafa Mohamed
 */
public class MyTableModel extends AbstractTableModel {

    private final List<IconInfo> iconInfoList = new ArrayList<>();

    private final String[] columnNames = {
        "Provider", "Enum", "Name", "Icon"
    };

    @Override
    public int getRowCount() {
        return iconInfoList.size();
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        IconInfo iconInfo = iconInfoList.get(rowIndex);
        Object value = null;
        switch (columnIndex) {
            case 0:
                value = iconInfo.providerName;
                break;
            case 1:
                value = iconInfo.enumName;
                break;
            case 2:
                value = iconInfo.iconName;
                break;
            case 3:
                value = FontIcon.of(iconInfo.ikon, 20);
                break;
        }
        return value;
    }

    public IconInfo getItemAt(int rowIndex) {
        return iconInfoList.get(rowIndex);
    }

    public void addIconInfo(IconInfo iconInfo) {
        iconInfoList.add(iconInfo);
    }

    public void clear() {
        iconInfoList.clear();
    }

}
