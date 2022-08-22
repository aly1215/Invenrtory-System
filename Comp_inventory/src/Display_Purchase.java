
import java.io.*;
import javax.swing.*;
public class Display_Purchase extends javax.swing.JFrame {

    public Display_Purchase() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Display = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        Item_Add_TF = new javax.swing.JTextField();
        Qty_Add_Tf = new javax.swing.JTextField();
        Price_Add_tf = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        ClearAddDel = new javax.swing.JButton();
        Item_Del_TF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Item_Upd_TF = new javax.swing.JTextField();
        ChangItem_TF = new javax.swing.JTextField();
        qty_Upd_TF = new javax.swing.JTextField();
        Price_Upd_Tf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        SaveUpdate = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table_Purchase = new javax.swing.JTable();
        PayBtn = new javax.swing.JButton();
        PNum_Purch_TF = new javax.swing.JTextField();
        Qty_Prch_TF = new javax.swing.JTextField();
        PurchaseBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        No_Items_Tf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Cash_Rcpt_TF = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        TPrice_Rcpt_TF = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Change_Rcpt_TF = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        ClearReceipt = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        PrintRecBtn = new javax.swing.JButton();
        DisplayBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Add_pan_Btn = new javax.swing.JButton();
        Update_Pan_Btn = new javax.swing.JButton();
        Purchase_Pan_Btn = new javax.swing.JButton();
        Search_Pan_Btn = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jLabel4.setText("jLabel4");

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Olano Inventory");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Table_Display.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product No.", "Item", "Qty.", "Unit Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table_Display.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Table_Display);
        Table_Display.getColumnModel().getColumn(0).setPreferredWidth(10);
        Table_Display.getColumnModel().getColumn(1).setPreferredWidth(150);
        Table_Display.getColumnModel().getColumn(2).setResizable(false);
        Table_Display.getColumnModel().getColumn(2).setPreferredWidth(10);
        Table_Display.getColumnModel().getColumn(3).setPreferredWidth(10);

        jTabbedPane1.setBackground(new java.awt.Color(51, 153, 255));
        jTabbedPane1.setForeground(new java.awt.Color(255, 51, 102));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        Item_Add_TF.setBorder(null);
        Item_Add_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_Add_TFActionPerformed(evt);
            }
        });

        Qty_Add_Tf.setBorder(null);
        Qty_Add_Tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Qty_Add_TfActionPerformed(evt);
            }
        });

        Price_Add_tf.setBorder(null);
        Price_Add_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Price_Add_tfActionPerformed(evt);
            }
        });

        AddBtn.setBackground(new java.awt.Color(255, 255, 255));
        AddBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 0, 0));
        AddBtn.setText("ADD");
        AddBtn.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(204, 0, 0));
        DeleteBtn.setText("DELETE");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        ClearAddDel.setBackground(new java.awt.Color(255, 255, 255));
        ClearAddDel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ClearAddDel.setForeground(new java.awt.Color(204, 0, 0));
        ClearAddDel.setText("CLEAR");
        ClearAddDel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        ClearAddDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearAddDelActionPerformed(evt);
            }
        });

        Item_Del_TF.setBorder(null);
        Item_Del_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_Del_TFActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("ITEM:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("QUANTITY:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("PRICE:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ITEMS TO DELETE:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel1)
                    .addComponent(jLabel13))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Qty_Add_Tf)
                    .addComponent(Item_Add_TF, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(Price_Add_tf)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(ClearAddDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Item_Del_TF))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Item_Add_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Qty_Add_Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(Price_Add_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn)
                    .addComponent(ClearAddDel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Item_Del_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        jTabbedPane1.addTab("Add/Delete", jPanel2);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        Item_Upd_TF.setBorder(null);
        Item_Upd_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_Upd_TFActionPerformed(evt);
            }
        });

        ChangItem_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangItem_TFActionPerformed(evt);
            }
        });

        qty_Upd_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qty_Upd_TFActionPerformed(evt);
            }
        });

        Price_Upd_Tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Price_Upd_TfActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Item:");

        SaveUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SaveUpdate.setForeground(new java.awt.Color(204, 0, 0));
        SaveUpdate.setText("SAVE UPDATE");
        SaveUpdate.setPreferredSize(new java.awt.Dimension(80, 25));
        SaveUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveUpdateActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Change Item Name:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Price:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Quantity:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(qty_Upd_TF, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Price_Upd_Tf, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ChangItem_TF, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(Item_Upd_TF, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                        .addGap(95, 95, 95))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(SaveUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Item_Upd_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(59, 59, 59)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChangItem_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(43, 43, 43)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(qty_Upd_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Price_Upd_Tf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(SaveUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        jTabbedPane1.addTab("Update", jPanel5);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        Table_Purchase.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index No.", "Item", "Qty.", "Unit Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table_Purchase.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(Table_Purchase);
        Table_Purchase.getColumnModel().getColumn(0).setPreferredWidth(10);
        Table_Purchase.getColumnModel().getColumn(1).setPreferredWidth(150);
        Table_Purchase.getColumnModel().getColumn(2).setPreferredWidth(10);
        Table_Purchase.getColumnModel().getColumn(3).setPreferredWidth(10);

        PayBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PayBtn.setForeground(new java.awt.Color(204, 0, 0));
        PayBtn.setText("PAY");
        PayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayBtnActionPerformed(evt);
            }
        });

        PNum_Purch_TF.setBorder(null);

        Qty_Prch_TF.setBorder(null);
        Qty_Prch_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Qty_Prch_TFActionPerformed(evt);
            }
        });

        PurchaseBtn.setBackground(new java.awt.Color(255, 255, 255));
        PurchaseBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PurchaseBtn.setForeground(new java.awt.Color(204, 0, 0));
        PurchaseBtn.setText("PURCHASE");
        PurchaseBtn.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        PurchaseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PurchaseBtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Item(s) Purchased");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Product Number:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Quantity:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PurchaseBtn)
                            .addComponent(PNum_Purch_TF, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                            .addComponent(Qty_Prch_TF)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(PayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PNum_Purch_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(Qty_Prch_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PurchaseBtn))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)))
                .addGap(32, 32, 32)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PayBtn)
                .addGap(64, 64, 64))
        );

        jTabbedPane1.addTab(" Purchase", jPanel4);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Cash:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Number of items:");

        TPrice_Rcpt_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TPrice_Rcpt_TFActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Total Price:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Change:");

        ClearReceipt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ClearReceipt.setForeground(new java.awt.Color(204, 0, 0));
        ClearReceipt.setText("CLEAR");
        ClearReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearReceiptActionPerformed(evt);
            }
        });

        area.setColumns(20);
        area.setRows(5);
        jScrollPane3.setViewportView(area);

        PrintRecBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PrintRecBtn.setForeground(new java.awt.Color(204, 0, 0));
        PrintRecBtn.setText("PRINT RECEIPT");
        PrintRecBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintRecBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Change_Rcpt_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(No_Items_Tf, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Cash_Rcpt_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TPrice_Rcpt_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(ClearReceipt))))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(PrintRecBtn)))
                .addGap(0, 32, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(No_Items_Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Cash_Rcpt_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearReceipt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TPrice_Rcpt_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(Change_Rcpt_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PrintRecBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        jTabbedPane1.addTab("RECEIPT", jPanel6);

        DisplayBtn.setBackground(new java.awt.Color(255, 255, 255));
        DisplayBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DisplayBtn.setForeground(new java.awt.Color(204, 0, 0));
        DisplayBtn.setText("DISPLAY");
        DisplayBtn.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        DisplayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayBtnActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(51, 51, 255));

        Add_pan_Btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Add_pan_Btn.setText("ADD AND DELETE");
        Add_pan_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_pan_BtnActionPerformed(evt);
            }
        });

        Update_Pan_Btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Update_Pan_Btn.setText("UPDATE");
        Update_Pan_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_Pan_BtnActionPerformed(evt);
            }
        });

        Purchase_Pan_Btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Purchase_Pan_Btn.setText("PURCHASE");
        Purchase_Pan_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Purchase_Pan_BtnActionPerformed(evt);
            }
        });

        Search_Pan_Btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Search_Pan_Btn.setText("SEARCH");
        Search_Pan_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_Pan_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Add_pan_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(Update_Pan_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Purchase_Pan_Btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Search_Pan_Btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(Add_pan_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(Update_Pan_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(Purchase_Pan_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(Search_Pan_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(DisplayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DisplayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DisplayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayBtnActionPerformed
    // Display Button
        
        try {
                for (int r = 0; r < 100; r++) { //initializing row
                    for (int c = 0; c < 4; c++) { //initializing column
                        Table_Display.setValueAt(null, r, c);
                    }
                }

                BufferedReader rdfile = new BufferedReader(new FileReader("items.txt"));

                String[] item = new String[100];
                String[] temp;

                int x = 0;  //read item
                while ((item[x] = rdfile.readLine()) != null) {
                    temp = item[x].split("\t");
                    Table_Display.setValueAt((1000 + x + 1), x, 0);
                    for (int j = 1; j < 4; j++) {
                        Table_Display.setValueAt(temp[j - 1], x, j);
                    }

                    x++;
                }
                rdfile.close();

            } catch (IOException e) {
            }
        
    }//GEN-LAST:event_DisplayBtnActionPerformed

    private void Add_pan_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_pan_BtnActionPerformed

        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_Add_pan_BtnActionPerformed

    private void Update_Pan_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_Pan_BtnActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_Update_Pan_BtnActionPerformed

    private void Purchase_Pan_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Purchase_Pan_BtnActionPerformed
        jTabbedPane1.setSelectedIndex(2); 
   }//GEN-LAST:event_Purchase_Pan_BtnActionPerformed

    private void ClearReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearReceiptActionPerformed
        // TODO add your handling code here:
        //Clear Button(Purchase)

        for (int r = 0; r < 100; r++) //initializing row
        {
            for (int c = 0; c < 4; c++) //initializing column
            {
                Table_Purchase.setValueAt(null, r, c);
            }
        }
        PayBtn.setEnabled(true);
        No_Items_Tf.setText("");
        Cash_Rcpt_TF.setText("");
        TPrice_Rcpt_TF.setText("");
        Change_Rcpt_TF.setText("");
        Row.setRow(0);
        PurchaseBtn.setEnabled(true);
    }//GEN-LAST:event_ClearReceiptActionPerformed

    private void TPrice_Rcpt_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TPrice_Rcpt_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TPrice_Rcpt_TFActionPerformed

    private void PurchaseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PurchaseBtnActionPerformed
        //Purchase Button

        try {
            BufferedReader rdfile = new BufferedReader(new FileReader("items.txt"));
            String[] itemline = new String[100];
            String str;
            double price, total;
            int qty = 0, qty_prv = 0, qty_new = 0;
            boolean found = false, edited = false;
            int idx = (Integer.parseInt(PNum_Purch_TF.getText())) - 1001;

            for (int x = 0; (str = rdfile.readLine()) != null; x++) {
                itemline[x] = str;
            }
            rdfile.close();


            int r = Row.getRow();
            for (int i = 0; itemline[i] != null; i++) {
                if (idx == i) {
                    found = true;
                    String[] temp = itemline[i].split("\t");
                    qty = Integer.parseInt(Qty_Prch_TF.getText());
                    qty_prv = Integer.parseInt(temp[1]);
                    if ((qty > qty_prv) && (qty_prv != 0)) {
                        JOptionPane.showMessageDialog(null, "Item Shortage!", "Oops!", JOptionPane.WARNING_MESSAGE);
                    }
                    if (qty_prv == 0) {
                        JOptionPane.showMessageDialog(null, "Out of Stock!", "Oops!", JOptionPane.WARNING_MESSAGE);
                    }
                    if ((qty <= qty_prv) && (qty_prv != 0)) {
                        qty_new = qty_prv - qty;
                        itemline[i] = temp[0] + "\t" + qty_new + "\t" + temp[2];
                        Table_Purchase.setValueAt(qty, r, 0);
                        Table_Purchase.setValueAt(temp[0], r, 1);
                        Table_Purchase.setValueAt(Double.parseDouble(temp[2]), r, 2);
                        price = Double.parseDouble(temp[2]);
                        total = qty * price;
                        Table_Purchase.setValueAt(total, r, 3);
                        r++;
                        edited = true;
                    }
                }

            }

            if (!found) {
                JOptionPane.showMessageDialog(null, PNum_Purch_TF.getText() + ": Item Not Available!", "Oops!", JOptionPane.ERROR_MESSAGE);
            }
            if (edited) {
                PrintWriter wrfile = new PrintWriter(new FileWriter("items.txt"));
                for (int i = 0; itemline[i] != null; i++) {
                    wrfile.println(itemline[i]);
                }
                PayBtn.setEnabled(true);
                wrfile.close();
                Row.setRow();
            }
            PNum_Purch_TF.setText("");
            Qty_Prch_TF.setText("");

        } catch (IOException e) {
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Some input may be invalid!", "Oops!", JOptionPane.ERROR_MESSAGE);

            PNum_Purch_TF.setText("");
            Qty_Prch_TF.setText("");
        }
    }//GEN-LAST:event_PurchaseBtnActionPerformed

    private void Qty_Prch_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Qty_Prch_TFActionPerformed
    
    }//GEN-LAST:event_Qty_Prch_TFActionPerformed

    private void PayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayBtnActionPerformed
        //Pay Button(Purchase)
        jTabbedPane1.setSelectedIndex(3);
        try {
            int itms = 0, tmp;
            for (int r = 0; Table_Purchase.getValueAt(r, 0) != null; r++) {
                tmp = Integer.parseInt("" + Table_Purchase.getValueAt(r, 0));
                itms += tmp;
            }
            No_Items_Tf.setText("" + itms);
            double total = 0, tmp2;
            for (int r = 0; Table_Purchase.getValueAt(r, 3) != null; r++) {
                tmp2 = Double.parseDouble("" + Table_Purchase.getValueAt(r, 3));
                total += tmp2;
            }
            TPrice_Rcpt_TF.setText("" + total);


            double cash, change;
            do {
                cash = Double.parseDouble(JOptionPane.showInputDialog("Cash Payment:"));
                if (cash < total) {
                    JOptionPane.showMessageDialog(null, "Insufficient Cash!", null, JOptionPane.WARNING_MESSAGE);
                }

            } while (cash < total);
            Cash_Rcpt_TF.setText("" + cash);
            Change_Rcpt_TF.setText("" + (cash - total));
            PurchaseBtn.setEnabled(false);


            //lhugujnj
            area.setText("*******************************************************************************\n");
            area.setText(area.getText() + "\t\t Aly Enterprises\n");
            area.setText(area.getText() + "\tAlegre Street, Legazpi City\n");
            area.setText(area.getText() + "\t\t Sales Invoice\n");
            area.setText(area.getText() + "********************************************************************\n");
            area.setText(area.getText() + "Items:");
            for (int r = 0; Table_Purchase.getValueAt(r, 1) != null; r++) {
                area.setText(area.getText() + "\n\t\t" + Table_Purchase.getValueAt(r, 1));
            }
            area.setText(area.getText() + "\nNumber of Items:\t" + No_Items_Tf.getText() + "\n");
            area.setText(area.getText() + "Cash:\t\t" + Cash_Rcpt_TF.getText() + "\n");
            area.setText(area.getText() + "Total Price:\t\t" + TPrice_Rcpt_TF.getText() + "\n");
            area.setText(area.getText() + "Change:\t\t" + Change_Rcpt_TF.getText() + "\n");
            area.setText(area.getText() + "\n\n\n\t\t\t\t Cashier: \n\t\t\t\t Alyssa Mae Olano");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid!", "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_PayBtnActionPerformed

    private void SaveUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveUpdateActionPerformed
        // Save Changes(Update)

        try {
            if (Item_Upd_TF.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter item!", "Ooops Wait...!", JOptionPane.ERROR_MESSAGE);
            } else {
                BufferedReader rdfile = new BufferedReader(new FileReader("items.txt"));

                String[] itemline = new String[100];
                String temp[];
                String search = "", prod = "", Qty = "", Price = "";
                search = Item_Upd_TF.getText();
                int qty = 0, x = 0;
                double price = 0.0;
                boolean found = false;

                prod = ChangItem_TF.getText();
                Qty = qty_Upd_TF.getText();
                Price = Price_Upd_Tf.getText();
                if ((!(prod.equals(""))) || (!(Qty.equals(""))) || (!(Price.equals("")))) {
                    while ((itemline[x] = rdfile.readLine()) != null) {
                        temp = itemline[x].split("\t");

                        if (search.equals(temp[0])) {
                            if (prod.equals("")) {
                                prod = temp[0];
                            }
                            if (Qty.equals("")) {
                                qty = Integer.parseInt(temp[1]);
                            } else {
                                qty = Integer.parseInt(Qty) + Integer.parseInt(temp[1]);
                            }

                            if (Price.equals("")) {
                                price = Double.parseDouble(temp[2]);
                            } else {
                                price = Double.parseDouble(Price);
                            }

                            itemline[x] = prod + "\t" + qty + "\t" + price;
                            found = true;
                        }
                        x++;


                    }
                    rdfile.close();

                    if (found) {
                        PrintWriter wrfile = new PrintWriter(new FileWriter("items.txt"));

                        for (int j = 0; itemline[j] != null; j++) {
                            wrfile.println(itemline[j]);
                        }

                        wrfile.close();

                        JOptionPane.showMessageDialog(null, "Changes Saved!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Item Not Found!");
                    }

                    Item_Upd_TF.setText("");
                    ChangItem_TF.setText("");
                    qty_Upd_TF.setText("");
                    Price_Upd_Tf.setText("");

                } else {
                    JOptionPane.showMessageDialog(null, "No Changes Yet!");
                }
            }

        } catch (IOException e) {
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Some input may be invalid!");

            Item_Upd_TF.setText("");
            ChangItem_TF.setText("");
            qty_Upd_TF.setText("");
            Price_Upd_Tf.setText("");
        }
    
}//GEN-LAST:event_SaveUpdateActionPerformed

    private void Price_Upd_TfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Price_Upd_TfActionPerformed
       
    }//GEN-LAST:event_Price_Upd_TfActionPerformed

    private void qty_Upd_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qty_Upd_TFActionPerformed
        
    }//GEN-LAST:event_qty_Upd_TFActionPerformed

    private void ChangItem_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangItem_TFActionPerformed
        
    }//GEN-LAST:event_ChangItem_TFActionPerformed

    private void Item_Upd_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_Upd_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Item_Upd_TFActionPerformed

    private void Item_Del_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_Del_TFActionPerformed

    }//GEN-LAST:event_Item_Del_TFActionPerformed

    private void ClearAddDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearAddDelActionPerformed
        //Clear Button(Add/Delete)

        Item_Add_TF.setText("");
        Qty_Add_Tf.setText("");
        Price_Add_tf.setText("");
    }//GEN-LAST:event_ClearAddDelActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        //Delete Button

        try {
            if (Item_Del_TF.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter item!", "Oops Wait...!", JOptionPane.ERROR_MESSAGE);
            } else {
                BufferedReader rdfile = new BufferedReader(new FileReader("items.txt"));

                String[] itemline = new String[100];
                String[] temp;
                String delete = Item_Del_TF.getText();
                boolean found = false;

                int x = 0;
                while ((itemline[x] = rdfile.readLine()) != null) {
                    temp = itemline[x].split("\t");

                    if (delete.equals(temp[0])) {
                        x = x + 0;
                        found = true;
                    } else {
                        x++;
                    }

                }

                rdfile.close();

                PrintWriter wrfile = new PrintWriter(new FileWriter("items.txt"));
                for (int j = 0; itemline[j] != null; j++) {
                    wrfile.println(itemline[j]);
                }


                wrfile.close();

                if (!found) {
                    JOptionPane.showMessageDialog(null, "Item is already not in the list!", "Ooops!", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Succesfully Deleted!", "Ok!  :-)", JOptionPane.INFORMATION_MESSAGE);
                }


                Item_Del_TF.setText("");

            }
        } catch (IOException e) {
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // Add Button

        try {
            if (Item_Add_TF.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter item!", "Oops Wait...!", JOptionPane.ERROR_MESSAGE);
            } else {
                BufferedReader rdfile = new BufferedReader(new FileReader("items.txt"));

                String[] itemline = new String[100];
                String prod = "";
                int qty = 0;
                double price = 0.0;
                boolean found = false;

                int x = 0;
                while ((itemline[x] = rdfile.readLine()) != null) {
                    x++;
                }
                rdfile.close();



                if (!(x >= 100)) {
                    prod = Item_Add_TF.getText();

                    for (int j = 0; itemline[j] != null; j++) {      //check whether item is in the list already
                        String[] temp = itemline[j].split("\t");

                        if (prod.equals(temp[0])) {
                            found = true;
                        }
                    }

                    if (found) {
                        JOptionPane.showMessageDialog(null, "Item already exist!\nSuggestion: Update Item", "", JOptionPane.WARNING_MESSAGE);
                    } else {
                        qty = Integer.parseInt(Qty_Add_Tf.getText());
                        price = Double.parseDouble(Price_Add_tf.getText());

                        itemline[x] = prod + "\t" + qty + "\t" + price;

                        PrintWriter wrfile = new PrintWriter(new FileWriter("items.txt"));

                        for (int j = 0; itemline[j] != null; j++) {
                            wrfile.println(itemline[j]);
                        }

                        wrfile.close();

                        JOptionPane.showMessageDialog(null, "Succesfully Added!", " Ok!  :-)", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Inventory Full!", "Warning!", JOptionPane.WARNING_MESSAGE);
                }
            }

            Item_Add_TF.setText("");
            Qty_Add_Tf.setText("");
            Price_Add_tf.setText("");

        } catch (IOException e) {
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Some input may be invalid!", "Warning!", JOptionPane.WARNING_MESSAGE);

            Item_Add_TF.setText("");
            Qty_Add_Tf.setText("");
            Price_Add_tf.setText("");
        }
    }//GEN-LAST:event_AddBtnActionPerformed

    private void Price_Add_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Price_Add_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Price_Add_tfActionPerformed

    private void Qty_Add_TfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Qty_Add_TfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Qty_Add_TfActionPerformed

    private void Item_Add_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_Add_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Item_Add_TFActionPerformed

    private void Search_Pan_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_Pan_BtnActionPerformed
        // TODO add your handling code here:
         Search a= new Search();
        a.setVisible(true);
        a.setDefaultCloseOperation(Search.DISPOSE_ON_CLOSE); 
    }//GEN-LAST:event_Search_Pan_BtnActionPerformed

    private void PrintRecBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintRecBtnActionPerformed
        // TODO add your handling code here:
         try{
           area.print();
        }
        catch(Exception e){
        }  
    }//GEN-LAST:event_PrintRecBtnActionPerformed
                                    
    public static void main(String args[]) {  
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Display_Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Display_Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Display_Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Display_Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Display_Purchase().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton Add_pan_Btn;
    private javax.swing.JTextField Cash_Rcpt_TF;
    private javax.swing.JTextField ChangItem_TF;
    private javax.swing.JTextField Change_Rcpt_TF;
    private javax.swing.JButton ClearAddDel;
    private javax.swing.JButton ClearReceipt;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton DisplayBtn;
    private javax.swing.JTextField Item_Add_TF;
    private javax.swing.JTextField Item_Del_TF;
    private javax.swing.JTextField Item_Upd_TF;
    private javax.swing.JTextField No_Items_Tf;
    private javax.swing.JTextField PNum_Purch_TF;
    private javax.swing.JButton PayBtn;
    private javax.swing.JTextField Price_Add_tf;
    private javax.swing.JTextField Price_Upd_Tf;
    private javax.swing.JButton PrintRecBtn;
    private javax.swing.JButton PurchaseBtn;
    private javax.swing.JButton Purchase_Pan_Btn;
    private javax.swing.JTextField Qty_Add_Tf;
    private javax.swing.JTextField Qty_Prch_TF;
    private javax.swing.JButton SaveUpdate;
    private javax.swing.JButton Search_Pan_Btn;
    private javax.swing.JTextField TPrice_Rcpt_TF;
    private javax.swing.JTable Table_Display;
    private javax.swing.JTable Table_Purchase;
    private javax.swing.JButton Update_Pan_Btn;
    private javax.swing.JTextArea area;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField qty_Upd_TF;
    // End of variables declaration//GEN-END:variables
}
