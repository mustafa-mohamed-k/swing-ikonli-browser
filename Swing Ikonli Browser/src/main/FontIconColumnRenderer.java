package main;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import org.kordamp.ikonli.swing.FontIcon;

/**
 *
 * @author Mustafa Mohamed
 */
public class FontIconColumnRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (column == 3){
            FontIcon icon = (FontIcon)value;
            if (!Home.darkTheme){
                icon.setIconColor(Color.black);
            }
            else{
                icon.setIconColor(Color.white);
            }
            setIcon((FontIcon)value);
            setText(null);
            setHorizontalAlignment(CENTER);
        }
        return c;
    }

}
