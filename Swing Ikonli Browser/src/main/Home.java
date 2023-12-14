package main;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.util.EnumSet;
import static java.util.EnumSet.allOf;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rsyntaxtextarea.Theme;
import org.fife.ui.rtextarea.RTextScrollPane;
import org.kordamp.ikonli.Ikon;
import org.kordamp.ikonli.IkonProvider;
import org.kordamp.ikonli.fluentui.FluentUiRegularAL;
import org.kordamp.ikonli.swing.FontIcon;

/**
 *
 * @author Mustafa Mohamed
 */
public class Home extends javax.swing.JFrame {

    private final Map<String, IkonProvider> ikons = new TreeMap<>();
    private final MyTableModel tableModel = new MyTableModel();
    private final RSyntaxTextArea textAreaFx;
    private final RSyntaxTextArea textAreaSwing;
    private final RSyntaxTextArea textAreaFXML;
    private final RSyntaxTextArea textAreaCSS;
    private final Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

    public static boolean darkTheme = false;

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        jTableIcons.setModel(tableModel);
        jTableIcons.getColumnModel().getColumn(3).setCellRenderer(new FontIconColumnRenderer());
        initIcons();
        jTableIcons.getSelectionModel().addListSelectionListener(e -> {
            onTableSelectionChanged();
        });
        textAreaFx = new RSyntaxTextArea();
        initTextArea(textAreaFx, SyntaxConstants.SYNTAX_STYLE_JAVA, jPanelJavaFX);

        textAreaSwing = new RSyntaxTextArea();
        initTextArea(textAreaSwing, SyntaxConstants.SYNTAX_STYLE_JAVA, jPanelSwing);

        textAreaFXML = new RSyntaxTextArea();
        initTextArea(textAreaFXML, SyntaxConstants.SYNTAX_STYLE_XML, jPanelFXML);

        textAreaCSS = new RSyntaxTextArea();
        initTextArea(textAreaCSS, SyntaxConstants.SYNTAX_STYLE_CSS, jPanelCSS);

        jListPacks.getSelectionModel().setSelectionInterval(0, 0); // select "All Icon Packs"

        jTextFieldSearch.putClientProperty("JTextField.placeholderText", "Search");
        jTextFieldSearch.putClientProperty("JTextField.selectAllOnFocusPolicy", "always");
        jTextFieldSearch.putClientProperty("JTextField.showClearButton", true);

        FontIcon fontIcon = FontIcon.of(FluentUiRegularAL.DARK_THEME_24);
        fontIcon.setIconSize(18);
        jButtonChangeTheme.setIcon(fontIcon);
        jButtonChangeTheme.setText("");

    }

    private void initTextArea(RSyntaxTextArea textArea, String syntaxStyle, JPanel panel) {
        textArea.setSyntaxEditingStyle(syntaxStyle);
        textArea.setAutoIndentEnabled(true);
        textArea.setCodeFoldingEnabled(true);
        RTextScrollPane scrollPane = new RTextScrollPane(textArea);
        panel.add(scrollPane);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListPacks = new javax.swing.JList<>();
        jButtonChangeTheme = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldSearch = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableIcons = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jButtonCopyFX = new javax.swing.JButton();
        jPanelJavaFX = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButtonCopySwing = new javax.swing.JButton();
        jPanelSwing = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButtonCopyFXML = new javax.swing.JButton();
        jPanelFXML = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanelCSS = new javax.swing.JPanel();
        jButtonCopyCSS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Swing Ikonli Browser");

        jSplitPane2.setDividerLocation(350);
        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jSplitPane1.setDividerLocation(200);

        jLabel1.setText("Icon packs");

        jListPacks.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListPacks.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListPacksValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListPacks);

        jButtonChangeTheme.setText("jButton1");
        jButtonChangeTheme.setToolTipText("Change theme to dark theme");
        jButtonChangeTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeThemeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(jButtonChangeTheme))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButtonChangeTheme))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jTextFieldSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchActionPerformed(evt);
            }
        });

        jTableIcons.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableIcons.setRowHeight(35);
        jTableIcons.setShowGrid(true);
        jScrollPane2.setViewportView(jTableIcons);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldSearch)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane1.setRightComponent(jPanel2);

        jSplitPane2.setLeftComponent(jSplitPane1);

        jButtonCopyFX.setText("Copy JavaFX code to clipboard");
        jButtonCopyFX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCopyFXActionPerformed(evt);
            }
        });

        jPanelJavaFX.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButtonCopyFX)
                        .addGap(0, 648, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelJavaFX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelJavaFX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCopyFX)
                .addContainerGap())
        );

        jTabbedPane1.addTab("JavaFX", jPanel3);

        jButtonCopySwing.setText("Copy Swing code to clipboard");
        jButtonCopySwing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCopySwingActionPerformed(evt);
            }
        });

        jPanelSwing.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelSwing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButtonCopySwing)
                        .addGap(0, 645, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelSwing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCopySwing))
        );

        jTabbedPane1.addTab("Swing", jPanel4);

        jButtonCopyFXML.setText("Copy FXML code to clipboard");
        jButtonCopyFXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCopyFXMLActionPerformed(evt);
            }
        });

        jPanelFXML.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButtonCopyFXML)
                        .addGap(0, 647, Short.MAX_VALUE))
                    .addComponent(jPanelFXML, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFXML, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCopyFXML))
        );

        jTabbedPane1.addTab("FXML", jPanel5);

        jPanelCSS.setLayout(new java.awt.BorderLayout());

        jButtonCopyCSS.setText("Copy CSS code to clipboard");
        jButtonCopyCSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCopyCSSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jButtonCopyCSS)
                        .addGap(0, 657, Short.MAX_VALUE))
                    .addComponent(jPanelCSS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCSS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCopyCSS))
        );

        jTabbedPane1.addTab("JavaFX CSS", jPanel6);

        jSplitPane2.setRightComponent(jTabbedPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jListPacksValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListPacksValueChanged
        if (!evt.getValueIsAdjusting()) {
            onListSelectionChanged();
        }

    }//GEN-LAST:event_jListPacksValueChanged

    private void jTextFieldSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchActionPerformed
        onSearch();
    }//GEN-LAST:event_jTextFieldSearchActionPerformed

    private void jButtonCopyCSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCopyCSSActionPerformed
        StringSelection text = new StringSelection(textAreaCSS.getText());
        clipboard.setContents(text, text);

    }//GEN-LAST:event_jButtonCopyCSSActionPerformed

    private void jButtonCopyFXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCopyFXMLActionPerformed
        StringSelection text = new StringSelection(textAreaFXML.getText());
        clipboard.setContents(text, text);
    }//GEN-LAST:event_jButtonCopyFXMLActionPerformed

    private void jButtonCopySwingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCopySwingActionPerformed
        StringSelection text = new StringSelection(textAreaSwing.getText());
        clipboard.setContents(text, text);
    }//GEN-LAST:event_jButtonCopySwingActionPerformed

    private void jButtonCopyFXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCopyFXActionPerformed
        StringSelection text = new StringSelection(textAreaFx.getText());
        clipboard.setContents(text, text);
    }//GEN-LAST:event_jButtonCopyFXActionPerformed

    private void jButtonChangeThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangeThemeActionPerformed
        toggleTheme();
    }//GEN-LAST:event_jButtonChangeThemeActionPerformed

    private void onTableSelectionChanged() {
        if (jTableIcons.getSelectedRowCount() == 1) {

            IconInfo iconInfo = tableModel.getItemAt(jTableIcons.convertRowIndexToModel(jTableIcons.getSelectedRow()));
            String iconName = iconInfo.iconName;
            String enumName = iconInfo.enumName;
            String providerName = iconInfo.providerName;

            textAreaFx.setText(
                    String.format(
                            "FontIcon fontIcon = new FontIcon(\"%s\");\n"
                            + "Labeled label = new Labeled();\n"
                            + "label.setGraphic(fontIcon);", iconName));

            String swingCode = String.format(
                    "JButton button = new JButton();\n"
                    + "FontIcon fontIcon = FontIcon.of(%s.%s);\n"
                    + "button.setIcon(fontIcon);", providerName, enumName);
            textAreaSwing.setText(swingCode);

            textAreaFXML.setAutoIndentEnabled(true);
            String fxmlCode = String.format(
                    "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                    + "\n"
                    + "<?import javafx.scene.control.Button?>\n"
                    + "<?import javafx.scene.layout.GridPane?>\n"
                    + "<?import org.kordamp.ikonli.javafx.FontIcon?>\n"
                    + "\n"
                    + "<GridPane prefHeight=\"60.0\" prefWidth=\"200.0\"\n"
                    + "\txmlns:fx=\"http://javafx.com/fxml\"\n"
                    + "\tfx:controller=\"org.example.AppController\">\n"
                    + "\t\t<Button GridPane.columnIndex=\"0\" GridPane.rowIndex=\"0\"\n"
                    + "\t\t\tprefWidth=\"200.0\">\n"
                    + "\t\t<graphic>\n"
                    + "\t\t\t<FontIcon iconLiteral=\"%s\" iconSize=\"64\"/>\n"
                    + "\t\t</graphic>\n"
                    + "\t</Button>\n"
                    + "</GridPane>", iconName);
            textAreaFXML.setText(fxmlCode);

            String cssCode = String.format(
                    "#my-icon {\n"
                    + "\t-fx-icon-code: \"%s\";\n"
                    + "\t-fx-icon-color: blue;\n"
                    + "\t-fx-icon-size: 1.2em;\n"
                    + "}", iconName);
            textAreaCSS.setText(cssCode);
        }
    }

    private void onSearch() {
        String searchText = jTextFieldSearch.getText().trim();
        List<String> selectedItems = jListPacks.getSelectedValuesList();
        boolean allPacks = selectedItems.contains("All Icon Packs");

        tableModel.clear();

        for (var entrySet : ikons.entrySet()) {
            String key = entrySet.getKey();
            IkonProvider provider = entrySet.getValue();

            if (selectedItems.isEmpty() || allPacks || selectedItems.contains(key)) {
                EnumSet<? extends Ikon> icons = allOf(provider.getIkon());
                for (Ikon icon : icons) {

                    String providerName = provider.getIkon().getSimpleName();
                    String iconName = icon.getDescription();
                    String enumName = icon.toString();

                    if (searchText.isBlank() || iconName.contains(searchText) || enumName.contains(searchText)) {
                        IconInfo iconInfo = new IconInfo();
                        iconInfo.providerName = providerName;
                        iconInfo.iconName = iconName;
                        iconInfo.ikon = icon;
                        iconInfo.enumName = enumName;
                        tableModel.addIconInfo(iconInfo);
                    }
                }
            }
        }
        tableModel.fireTableDataChanged();
    }

    private void onListSelectionChanged() {
        onSearch();
    }

    private void initIcons() {
        final DefaultListModel model = new DefaultListModel();

        model.addElement("All Icon Packs");

        ServiceLoader<IkonProvider> providers = ServiceLoader.load(IkonProvider.class);
        for (IkonProvider provider : providers) {
            ikons.put(provider.getIkon().getSimpleName(), provider);
            model.addElement(provider.getIkon().getSimpleName());
        }

        jListPacks.setModel(model);
    }

    private void toggleTheme() {
        try {
            if (darkTheme) {
                UIManager.setLookAndFeel(new FlatLightLaf());
                jButtonChangeTheme.setToolTipText("Change theme to dark theme");
                try {
                    Theme theme = Theme.load(getClass().getResourceAsStream(
                            "/org/fife/ui/rsyntaxtextarea/themes/default.xml"));
                    for (RSyntaxTextArea area : new RSyntaxTextArea[]{textAreaCSS, textAreaFXML, textAreaFx, textAreaSwing}) {
                        theme.apply(area);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                UIManager.setLookAndFeel(new FlatDarkLaf());
                jButtonChangeTheme.setToolTipText("Change theme to light theme");
                try {
                    Theme theme = Theme.load(getClass().getResourceAsStream(
                            "/org/fife/ui/rsyntaxtextarea/themes/dark.xml"));
                    for (RSyntaxTextArea area : new RSyntaxTextArea[]{textAreaCSS, textAreaFXML, textAreaFx, textAreaSwing}) {
                        theme.apply(area);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            FlatLaf.updateUI();
            jTableIcons.updateUI();
            darkTheme = !darkTheme;
        } catch (UnsupportedLookAndFeelException ex) {

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonChangeTheme;
    private javax.swing.JButton jButtonCopyCSS;
    private javax.swing.JButton jButtonCopyFX;
    private javax.swing.JButton jButtonCopyFXML;
    private javax.swing.JButton jButtonCopySwing;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jListPacks;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelCSS;
    private javax.swing.JPanel jPanelFXML;
    private javax.swing.JPanel jPanelJavaFX;
    private javax.swing.JPanel jPanelSwing;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableIcons;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables
}
