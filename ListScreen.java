/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package intro;

import java.util.Enumeration;
import java.util.Vector;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;

/**
 *
 * @author Biruk
 */
public class ListScreen extends javax.swing.JFrame {

    /**
     * Creates new form ListScreen
     */
    
    SwimData clonedData;
    
    public ListScreen() {
        initComponents();
        
        SwimData data = new SwimData();
        
        
        clonedData = (SwimData) data.cloneMe();
        
        DefaultListModel listModel = new DefaultListModel();
        DefaultListModel listUnderModel = new DefaultListModel();
        DefaultListModel listAboveModel = new DefaultListModel();
        
        for(int i = 0; i < data.getSwimmers().size(); i++) {
            System.out.println("Swimmer "+ data.getSwimmer(i).getName());
            listModel.addElement(data.getSwimmer(i).getName() + " " + data.getSwimmer(i).getTime());
        }
        

        for(Object v: data.getAboveEighteenSwimmers()) {
            listAboveModel.addElement(((Swimmer) v).getName() + " " + ((Swimmer) v).getTime());
        }
        
        
        for(Object v: data.getUnderEighteenSwimmers()) {
            listUnderModel.addElement(((Swimmer) v).getName() + " " + ((Swimmer) v).getTime());
        }
        
        
        
        comboSex.removeAllItems();
        
        comboSex.addItem("Both");
        comboSex.addItem("F");
        comboSex.addItem("M");
        jList1.setModel(listModel);
        jList3.setModel(listUnderModel);
        jList4.setModel(listAboveModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        comboSex = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        comboSex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboSex.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboSexItemStateChanged(evt);
            }
        });
        comboSex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSexActionPerformed(evt);
            }
        });

        jLabel1.setText("Sex");

        jButton1.setText("By Time");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("By Age");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jList3.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList3);

        jList4.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList4);

        jLabel2.setText("Age Group <18");

        jLabel3.setText("Age Group > 18");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboSex, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane4))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(20, 20, 20)
                .addComponent(jButton2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        DefaultListModel listModel = new DefaultListModel();
        
        clonedData.sortByTime();
        for(int i = 0; i < clonedData.getSwimmers().size(); i++) {
            System.out.println("Swimmer "+ clonedData.getSwimmer(i).getName());
            listModel.addElement(clonedData.getSwimmer(i).getName() + " " + clonedData.getSwimmer(i).getTime());
        }
        jList2.setModel(listModel);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboSexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSexActionPerformed
        // TODO add your handling code here:
        JComboBox cb = (JComboBox)evt.getSource();
        String petName = (String)cb.getSelectedItem();
        System.out.println("ComboPerfromed " + petName);
        DefaultListModel listModel = new DefaultListModel();
        if(petName == "F") {
        
            for(int i = 0; i < clonedData.getSwimmers().size(); i++) {
                System.out.println("Swimmer "+ clonedData.getSwimmer(i).getName());
                if(clonedData.getSwimmer(i).female) {
                    listModel.addElement(clonedData.getSwimmer(i).getName() + " " + clonedData.getSwimmer(i).getTime() + " F ");
                }
            }
            for(int i = 0; i < clonedData.getSwimmers().size(); i++) {
                System.out.println("Swimmer "+ clonedData.getSwimmer(i).getName());
                if(!clonedData.getSwimmer(i).female) {
                    listModel.addElement(clonedData.getSwimmer(i).getName() + " " + clonedData.getSwimmer(i).getTime());
                }
            }
            
        } else if(petName == "M") {
            for(int i = 0; i < clonedData.getSwimmers().size(); i++) {
                System.out.println("Swimmer "+ clonedData.getSwimmer(i).getName());
                if(!clonedData.getSwimmer(i).female) {
                    listModel.addElement(clonedData.getSwimmer(i).getName() + " " + clonedData.getSwimmer(i).getTime());
                }
            }
            for(int i = 0; i < clonedData.getSwimmers().size(); i++) {
                System.out.println("Swimmer "+ clonedData.getSwimmer(i).getName());
                if(clonedData.getSwimmer(i).female) {
                    listModel.addElement(clonedData.getSwimmer(i).getName() + " " + clonedData.getSwimmer(i).getTime() + " F" );
                }
            }
            
        } else{
            for(int i = 0; i < clonedData.getSwimmers().size(); i++) {
                System.out.println("Swimmer "+ clonedData.getSwimmer(i).getName());
                listModel.addElement(clonedData.getSwimmer(i).getName() + " " + clonedData.getSwimmer(i).getTime());
            }
        }
        
        jList2.setModel(listModel);

        
    }//GEN-LAST:event_comboSexActionPerformed

    private void comboSexItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboSexItemStateChanged
        // TODO add your handling code here:
        System.out.println("Combo Item changed ");

    }//GEN-LAST:event_comboSexItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        DefaultListModel listModel = new DefaultListModel();
        DefaultListModel listUnderModel = new DefaultListModel();
        DefaultListModel listAboveModel = new DefaultListModel();

        clonedData.sortByAge();
        for(int i = 0; i < clonedData.getSwimmers().size(); i++) {
            System.out.println("Swimmer "+ clonedData.getSwimmer(i).getName());
            listModel.addElement(clonedData.getSwimmer(i).getName() + " " + clonedData.getSwimmer(i).getTime() + " " + clonedData.getSwimmer(i).getAge());
            if(clonedData.getSwimmer(i).getAge() < 18){
               listUnderModel.addElement(clonedData.getSwimmer(i).getName());
            }else{
               listAboveModel.addElement(clonedData.getSwimmer(i).getName());

            }
        }
        jList2.setModel(listModel);
        jList3.setModel(listUnderModel);
        jList4.setModel(listAboveModel);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboSex;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JList jList3;
    private javax.swing.JList jList4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
