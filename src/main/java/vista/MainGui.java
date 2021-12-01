/*
 * Created by JFormDesigner on Tue Nov 30 14:05:41 CLST 2021
 */

package vista;

import servicio.Listas;
import modelo.Desastre;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

import static servicio.Listas.getDisasterByCountry;

/**
 * @author Billy Martinez
 */
public class MainGui extends JFrame {

    private String country;
    private Integer year;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public MainGui() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | UnsupportedLookAndFeelException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        initComponents();
        llenarComboBox();
        pantalla1();
        pantalla3();
    }

    private void pantalla1() {
        ArrayList<String> countrys= Listas.listCountry();
        Collections.sort(countrys);
        for (String pais:countrys
        ) {
            comboBox1.addItem(pais);
        }
        button5.addActionListener(e ->  previusly());

    }

    private void dañosLabels(Desastre uwu) {
        label20.setText(String.valueOf(uwu.getNoInjured()));
        label21.setText(String.valueOf(uwu.getTotalDeaths()));
        label22.setText(String.valueOf(uwu.getNoAffected()));
        label23.setText(String.valueOf(uwu.getNoHomeless()));
        label24.setText(String.valueOf(uwu.getTotalAffected()));


    }

    private void previusly() {
        String country= String.valueOf(comboBox1.getItemAt(comboBox1.getSelectedIndex()));
        System.out.println(country);
        setCountry(country);
        consultarTipo(this.country);
    }

    private void consultarTipo(String country) {
        Desastre uwu;
        comboBox2.removeAllItems();
        ArrayList<Desastre> listaDesastres=getDisasterByCountry(country);
        for (Desastre d:listaDesastres) {
            comboBox2.addItem(d.getDisasterType()+" "+d.getYear()+" "+d.getLocation());
        }
        button7.addActionListener(e -> seleccionDesastre(listaDesastres));
    }

    private void seleccionDesastre(ArrayList<Desastre> listaDesastres) {
        int index= comboBox2.getSelectedIndex();
        dañosLabels(listaDesastres.get(index));
    }
/*
DisasterGroup(Natural){
Disaster Subgroup(Geophysical)
Disaster Type(Volcanic activity)
Disaster Subtype(Ash fall, Lahar, Pyroclastic flow, Lava flow)
*/


    private void pantalla3() {
        ArrayList<String> countrys= Listas.listCountry();
        Collections.sort(countrys);
        for (String pais:countrys
        ) {
            comboBox4.addItem(pais);
        }
        comboBox4.getItemAt(comboBox4.getSelectedIndex());
        llenarComboBoxDesastres();
    }

    private void llenarComboBoxDesastres() {
        llenarComboGroup();
        llenarComboSubgroup();
        llenarComboType();
        llenarComboSubtype();
    }

    private void llenarComboSubtype() {
        ArrayList<String> countrys= Listas.listDisasterSubtype();
        Collections.sort(countrys);
        for (String pais:countrys
        ) {
            comboBoxSubtype.addItem(pais);
        }
    }

    private void llenarComboType() {
        ArrayList<String> countrys= Listas.listDisasterType();
        Collections.sort(countrys);
        for (String pais:countrys
        ) {
            comboBoxType.addItem(pais);
        }
    }

    private void llenarComboSubgroup() {
        ArrayList<String> countrys= Listas.listDisasterSubgroup();
        Collections.sort(countrys);
        for (String pais:countrys
        ) {
            comboBoxSubGroup.addItem(pais);
        }
    }


    private void llenarComboGroup() {
        ArrayList<String> countrys= Listas.listDisasterGroup();
        Collections.sort(countrys);
        for (String pais:countrys
        ) {
            comboBoxGroup.addItem(pais);
        }
    }



    private void FillLabels() {
        setYear((Integer) comboBox9.getItemAt(comboBox9.getSelectedIndex()));
        System.out.println(year+country);
        var list= new Listas();
        LabelTotal.setText("$ "+ list.totalDamageAdjustedbyCountry(country, year) +" USD");
        labelAsegurado.setText("$ "+ list.insuredDamageAdjustedCountry(getCountry(), getYear())+" USD");
        labelReconstruc.setText("$ "+ list.ReconstructionbyCountry(getCountry(), getYear())+" USD");
    }
    public void llenarComboBox(){
        ArrayList<String> countrys= Listas.listCountry();
        Collections.sort(countrys);
        for (String pais:countrys
             ) {
            comboBox3.addItem(pais);
        }
        if(comboBox9.getSelectedIndex() == -1){
            button3.addActionListener(e -> fillYearBox());
        }
        button4.addActionListener(e -> FillLabels());

    }


    public void fillYearBox(){
        comboBox9.removeAllItems();
        String country= String.valueOf(comboBox3.getItemAt(comboBox3.getSelectedIndex()));
        setCountry(country);
        ArrayList<Integer> years= Listas.CountryYearList(country);
        Collections.sort(years);
        for (Integer year:years
        ) {
            comboBox9.addItem(year);
        }
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - billy
        dialogPane = new JPanel();
        tabbedPane3 = new JTabbedPane();
        panel1 = new JPanel();
        panel5 = new JPanel();
        panel6 = new JPanel();
        button5 = new JButton();
        button7 = new JButton();
        label3 = new JLabel();
        label12 = new JLabel();
        label13 = new JLabel();
        label18 = new JLabel();
        label19 = new JLabel();
        label20 = new JLabel();
        label21 = new JLabel();
        label22 = new JLabel();
        label23 = new JLabel();
        label24 = new JLabel();
        label1 = new JLabel();
        comboBox1 = new JComboBox();
        label14 = new JLabel();
        comboBox2 = new JComboBox();
        label17 = new JLabel();
        panel2 = new JPanel();
        comboBox3 = new JComboBox();
        label2 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        label11 = new JLabel();
        LabelTotal = new JLabel();
        labelAsegurado = new JLabel();
        labelReconstruc = new JLabel();
        label15 = new JLabel();
        comboBox9 = new JComboBox();
        button3 = new JButton();
        button4 = new JButton();
        panel3 = new JPanel();
        comboBox4 = new JComboBox();
        label4 = new JLabel();
        label5 = new JLabel();
        comboBoxSubGroup = new JComboBox();
        label6 = new JLabel();
        comboBoxGroup = new JComboBox();
        label7 = new JLabel();
        comboBoxSubtype = new JComboBox();
        label8 = new JLabel();
        comboBoxType = new JComboBox();
        panel7 = new JPanel();
        scrollPane2 = new JScrollPane();
        list1 = new JList();
        panel8 = new JPanel();
        button2 = new JButton();

        //======== this ========
        setTitle("Desastres");
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax
            .swing.border.EmptyBorder(0,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion",javax.swing
            .border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.
            Font("Dia\u006cog",java.awt.Font.BOLD,12),java.awt.Color.red
            ),dialogPane. getBorder()));dialogPane. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override
            public void propertyChange(java.beans.PropertyChangeEvent e){if("bord\u0065r".equals(e.getPropertyName(
            )))throw new RuntimeException();}});
            dialogPane.setLayout(new BorderLayout());

            //======== tabbedPane3 ========
            {

                //======== panel1 ========
                {

                    //======== panel5 ========
                    {

                        //======== panel6 ========
                        {

                            //---- button5 ----
                            button5.setText("Consultar Tipo");

                            //---- button7 ----
                            button7.setText("Buscar");

                            GroupLayout panel6Layout = new GroupLayout(panel6);
                            panel6.setLayout(panel6Layout);
                            panel6Layout.setHorizontalGroup(
                                panel6Layout.createParallelGroup()
                                    .addGroup(GroupLayout.Alignment.TRAILING, panel6Layout.createSequentialGroup()
                                        .addGap(0, 314, Short.MAX_VALUE)
                                        .addComponent(button5, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(button7, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
                                        .addGap(91, 91, 91))
                            );
                            panel6Layout.setVerticalGroup(
                                panel6Layout.createParallelGroup()
                                    .addGroup(panel6Layout.createSequentialGroup()
                                        .addGroup(panel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(button5)
                                            .addComponent(button7))
                                        .addGap(0, 68, Short.MAX_VALUE))
                            );
                        }

                        //---- label3 ----
                        label3.setText("Heridos");

                        //---- label12 ----
                        label12.setText("Muertos");

                        //---- label13 ----
                        label13.setText("Afectados");

                        //---- label18 ----
                        label18.setText("Perdida de morada");

                        //---- label19 ----
                        label19.setText("Total De Afectados");

                        //---- label20 ----
                        label20.setText("text");

                        //---- label21 ----
                        label21.setText("text");

                        //---- label22 ----
                        label22.setText("text");

                        //---- label23 ----
                        label23.setText("text");

                        //---- label24 ----
                        label24.setText("text");

                        GroupLayout panel5Layout = new GroupLayout(panel5);
                        panel5.setLayout(panel5Layout);
                        panel5Layout.setHorizontalGroup(
                            panel5Layout.createParallelGroup()
                                .addComponent(panel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panel5Layout.createSequentialGroup()
                                    .addGap(79, 79, 79)
                                    .addGroup(panel5Layout.createParallelGroup()
                                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label12, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label13, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label18)
                                        .addComponent(label19))
                                    .addGap(54, 54, 54)
                                    .addGroup(panel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(label20, GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                        .addComponent(label21, GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                        .addComponent(label22, GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                        .addComponent(label23, GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                        .addComponent(label24, GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                                    .addContainerGap(307, Short.MAX_VALUE))
                        );
                        panel5Layout.setVerticalGroup(
                            panel5Layout.createParallelGroup()
                                .addGroup(panel5Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(panel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label3)
                                        .addComponent(label20))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label12)
                                        .addComponent(label21))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label13)
                                        .addComponent(label22))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label18)
                                        .addComponent(label23))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label19)
                                        .addComponent(label24))
                                    .addGap(81, 81, 81)
                                    .addComponent(panel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        );
                    }

                    //---- label1 ----
                    label1.setText("Selecionar pais");

                    //---- label14 ----
                    label14.setText("Tipo de Desastre");

                    GroupLayout panel1Layout = new GroupLayout(panel1);
                    panel1.setLayout(panel1Layout);
                    panel1Layout.setHorizontalGroup(
                        panel1Layout.createParallelGroup()
                            .addComponent(panel5, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label14, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label17, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    panel1Layout.setVerticalGroup(
                        panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label14)
                                    .addComponent(label1)
                                    .addComponent(label17)
                                    .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    );
                }
                tabbedPane3.addTab("Desastres por pais", panel1);

                //======== panel2 ========
                {

                    //---- label2 ----
                    label2.setText("Seleccionar Pais");

                    //---- label9 ----
                    label9.setText("Costes de Reconstrucci\u00f3n:");

                    //---- label10 ----
                    label10.setText("Da\u00f1os Asegurados:");

                    //---- label11 ----
                    label11.setText("Da\u00f1os Totales:");

                    //---- label15 ----
                    label15.setText("A\u00f1o");

                    //---- button3 ----
                    button3.setText("Buscar Fechas");

                    //---- button4 ----
                    button4.setText("Buscar");

                    GroupLayout panel2Layout = new GroupLayout(panel2);
                    panel2.setLayout(panel2Layout);
                    panel2Layout.setHorizontalGroup(
                        panel2Layout.createParallelGroup()
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel2Layout.createParallelGroup()
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addComponent(label9)
                                            .addComponent(label10)
                                            .addComponent(label11))
                                        .addGap(63, 63, 63)
                                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(LabelTotal, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                            .addComponent(labelAsegurado, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                            .addComponent(labelReconstruc, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(comboBox3, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                        .addComponent(label15, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboBox9, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                        .addGap(73, 73, 73))))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                .addContainerGap(347, Short.MAX_VALUE)
                                .addComponent(button3, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button4, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                    );
                    panel2Layout.setVerticalGroup(
                        panel2Layout.createParallelGroup()
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboBox9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label15)
                                    .addComponent(comboBox3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label2))
                                .addGap(43, 43, 43)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label11)
                                    .addComponent(LabelTotal))
                                .addGap(32, 32, 32)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label10)
                                    .addComponent(labelAsegurado))
                                .addGap(38, 38, 38)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label9)
                                    .addComponent(labelReconstruc))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(button4)
                                    .addComponent(button3))
                                .addContainerGap())
                    );
                }
                tabbedPane3.addTab("Da\u00f1os", panel2);

                //======== panel3 ========
                {

                    //---- label4 ----
                    label4.setText("Subgrupo Desastre");

                    //---- label5 ----
                    label5.setText("Pais");

                    //---- label6 ----
                    label6.setText("Grupo Desastre");

                    //---- label7 ----
                    label7.setText("Subtipo Desastre");

                    //---- label8 ----
                    label8.setText("Desastre Tipo");

                    //======== panel7 ========
                    {

                        //======== scrollPane2 ========
                        {
                            scrollPane2.setViewportView(list1);
                        }

                        GroupLayout panel7Layout = new GroupLayout(panel7);
                        panel7.setLayout(panel7Layout);
                        panel7Layout.setHorizontalGroup(
                            panel7Layout.createParallelGroup()
                                .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                        );
                        panel7Layout.setVerticalGroup(
                            panel7Layout.createParallelGroup()
                                .addGroup(panel7Layout.createSequentialGroup()
                                    .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                    .addContainerGap())
                        );
                    }

                    //======== panel8 ========
                    {

                        //---- button2 ----
                        button2.setText("text");

                        GroupLayout panel8Layout = new GroupLayout(panel8);
                        panel8.setLayout(panel8Layout);
                        panel8Layout.setHorizontalGroup(
                            panel8Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, panel8Layout.createSequentialGroup()
                                    .addContainerGap(536, Short.MAX_VALUE)
                                    .addComponent(button2)
                                    .addContainerGap())
                        );
                        panel8Layout.setVerticalGroup(
                            panel8Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, panel8Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(button2))
                        );
                    }

                    GroupLayout panel3Layout = new GroupLayout(panel3);
                    panel3.setLayout(panel3Layout);
                    panel3Layout.setHorizontalGroup(
                        panel3Layout.createParallelGroup()
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label5)
                                .addGap(18, 18, 18)
                                .addComponent(comboBox4, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel3Layout.createParallelGroup()
                                    .addComponent(label6, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label4))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel3Layout.createParallelGroup()
                                    .addComponent(comboBoxSubGroup, GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                    .addComponent(comboBoxGroup, GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel3Layout.createParallelGroup()
                                    .addComponent(label8, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label7, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboBoxType, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                    .addComponent(comboBoxSubtype, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)))
                            .addComponent(panel8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    );
                    panel3Layout.setVerticalGroup(
                        panel3Layout.createParallelGroup()
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label5)
                                    .addComponent(label6)
                                    .addComponent(label8)
                                    .addComponent(comboBoxType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBoxGroup, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBox4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label4)
                                    .addComponent(label7)
                                    .addComponent(comboBoxSubtype, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBoxSubGroup, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                    );
                }
                tabbedPane3.addTab("Buscador por tipo", panel3);
            }
            dialogPane.add(tabbedPane3, BorderLayout.CENTER);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - billy
    private JPanel dialogPane;
    private JTabbedPane tabbedPane3;
    private JPanel panel1;
    private JPanel panel5;
    private JPanel panel6;
    private JButton button5;
    private JButton button7;
    private JLabel label3;
    private JLabel label12;
    private JLabel label13;
    private JLabel label18;
    private JLabel label19;
    private JLabel label20;
    private JLabel label21;
    private JLabel label22;
    private JLabel label23;
    private JLabel label24;
    private JLabel label1;
    private JComboBox comboBox1;
    private JLabel label14;
    private JComboBox comboBox2;
    private JLabel label17;
    private JPanel panel2;
    private JComboBox comboBox3;
    private JLabel label2;
    private JLabel label9;
    private JLabel label10;
    private JLabel label11;
    private JLabel LabelTotal;
    private JLabel labelAsegurado;
    private JLabel labelReconstruc;
    private JLabel label15;
    private JComboBox comboBox9;
    private JButton button3;
    private JButton button4;
    private JPanel panel3;
    private JComboBox comboBox4;
    private JLabel label4;
    private JLabel label5;
    private JComboBox comboBoxSubGroup;
    private JLabel label6;
    private JComboBox comboBoxGroup;
    private JLabel label7;
    private JComboBox comboBoxSubtype;
    private JLabel label8;
    private JComboBox comboBoxType;
    private JPanel panel7;
    private JScrollPane scrollPane2;
    private JList list1;
    private JPanel panel8;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
