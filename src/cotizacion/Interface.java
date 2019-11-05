/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cotizacion;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Sistemas
 */
public class Interface extends JFrame implements ActionListener {

    Archivo a = new Archivo();
    JTextField tMedic = new JTextField(30);
    JTextField tPatient = new JTextField(30);
    JTextField tDiacnostic = new JTextField(30);
    JMenu mDepartment = new JMenu("Especialidad");
    JMenu mSurgery1 = new JMenu("1");
    JMenu mSurgery2 = new JMenu("2");
    JMenu mSurgery3 = new JMenu("3");
    JMenu mSurgery4 = new JMenu("4");
    JMenu mSurgery5 = new JMenu("5");
    JMenu mSurgery6 = new JMenu("6");
    JMenu mSurgery7 = new JMenu("7");
    JMenu mSurgery8 = new JMenu("8");
    JMenu mSurgery9 = new JMenu("9");
    JMenu mSurgeryTipe = new JMenu("Tipo de Cirugia");
    JMenu mAnesthesia = new JMenu("Tipo de Anestesia");
    JTextField tTime = new JTextField(30);
    JTextField tEquipement = new JTextField(30);
    JTextArea tNote = new JTextArea(1, 30);

    public Interface() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("resource/cruzroja.png"));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 530);
        //this.setExtendedState(MAXIMIZED_BOTH);
        this.setVisible(true);
        this.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width / 2) - this.getWidth() / 2,
                (Toolkit.getDefaultToolkit().getScreenSize().height / 3) - this.getHeight() / 2);
        this.setTitle("Sistemas de Control de Ambulancias");

        JPanel mainPanel = new JPanel();

        JLabel lMedic = new JLabel("Medico");
        JLabel lPatient = new JLabel("Paciente");
        JLabel lDiacnostic = new JLabel("Diacnostico");
        JLabel lTime = new JLabel("Estancia sugerida en días");
        JLabel lEquipement = new JLabel("Equipo electromédco adicional");
        JLabel lNote = new JLabel("Observaciones");
        JMenuBar mBarDepartment = new JMenuBar();
        JMenuBar mBarSurgery1 = new JMenuBar();
        JMenuBar mBarSurgery2 = new JMenuBar();
        JMenuBar mBarSurgery3 = new JMenuBar();
        JMenuBar mBarSurgery4 = new JMenuBar();
        JMenuBar mBarSurgery5 = new JMenuBar();
        JMenuBar mBarSurgery6 = new JMenuBar();
        JMenuBar mBarSurgery7 = new JMenuBar();
        JMenuBar mBarSurgery8 = new JMenuBar();
        JMenuBar mBarSurgery9 = new JMenuBar();
        JMenuBar mBarSurgeryTipe = new JMenuBar();
        JMenuBar mBarAnesthesia = new JMenuBar();
        JMenuItem iDepartment1 = new JMenuItem("CIRUGIA GENERAL");
        JMenuItem iDepartment2 = new JMenuItem("GINECOLOGIA Y OBSTETRICA");
        JMenuItem iDepartment3 = new JMenuItem("ORTOPEDIA Y TRAUMATOLOGIA");
        JMenuItem iDepartment4 = new JMenuItem("OTORRINOLARINGOLOGIA");
        JMenuItem iDepartment5 = new JMenuItem("UROLOGIA");
        JMenuItem iDepartment6 = new JMenuItem("OFTALMOLOGIA");
        JMenuItem iDepartment7 = new JMenuItem("ARTROSCOPIA");
        JMenuItem iDepartment8 = new JMenuItem("ORTODONCIA");
        JMenuItem iDepartment9 = new JMenuItem("CIRUGIA MAXILOFACIAL");
        iDepartment1.addActionListener(this);
        iDepartment2.addActionListener(this);
        iDepartment3.addActionListener(this);
        iDepartment4.addActionListener(this);
        iDepartment5.addActionListener(this);
        iDepartment6.addActionListener(this);
        iDepartment7.addActionListener(this);
        iDepartment8.addActionListener(this);
        iDepartment9.addActionListener(this);
        mDepartment.add(iDepartment1);
        mDepartment.add(iDepartment2);
        mDepartment.add(iDepartment3);
        mDepartment.add(iDepartment4);
        mDepartment.add(iDepartment5);
        mDepartment.add(iDepartment6);
        mDepartment.add(iDepartment7);
        mDepartment.add(iDepartment8);
        mDepartment.add(iDepartment9);
        mBarDepartment.add(mDepartment);
        mBarSurgery1.add(mSurgery1);
        mBarSurgery2.add(mSurgery2);
        mBarSurgery3.add(mSurgery3);
        mBarSurgery4.add(mSurgery4);
        mBarSurgery5.add(mSurgery5);
        mBarSurgery6.add(mSurgery6);
        mBarSurgery7.add(mSurgery7);
        mBarSurgery8.add(mSurgery8);
        mBarSurgery9.add(mSurgery9);
        mDepartment.setPreferredSize(new Dimension(330, 20));
        mSurgery1.setPreferredSize(new Dimension(330, 20));
        mSurgery2.setPreferredSize(new Dimension(330, 20));
        mSurgery3.setPreferredSize(new Dimension(330, 20));
        mSurgery4.setPreferredSize(new Dimension(330, 20));
        mSurgery5.setPreferredSize(new Dimension(330, 20));
        mSurgery6.setPreferredSize(new Dimension(330, 20));
        mSurgery7.setPreferredSize(new Dimension(330, 20));
        mSurgery8.setPreferredSize(new Dimension(330, 20));
        mSurgery9.setPreferredSize(new Dimension(330, 20));
        mSurgery1.setVisible(false);
        mSurgery2.setVisible(false);
        mSurgery3.setVisible(false);
        mSurgery4.setVisible(false);
        mSurgery5.setVisible(false);
        mSurgery6.setVisible(false);
        mSurgery7.setVisible(false);
        mSurgery8.setVisible(false);
        mSurgery9.setVisible(false);
        updateMenu();

        mainPanel.add(lMedic);
        mainPanel.add(tMedic);
        mainPanel.add(lPatient);
        mainPanel.add(tPatient);
        mainPanel.add(lDiacnostic);
        mainPanel.add(tDiacnostic);
        mainPanel.add(mBarDepartment);
        mainPanel.add(mBarSurgery1);
        mainPanel.add(mBarSurgery2);
        mainPanel.add(mBarSurgery3);
        mainPanel.add(mBarSurgery4);
        mainPanel.add(mBarSurgery5);
        mainPanel.add(mBarSurgery6);
        mainPanel.add(mBarSurgery7);
        mainPanel.add(mBarSurgery8);
        mainPanel.add(mBarSurgery9);
        mainPanel.add(mBarSurgeryTipe);
        mainPanel.add(mBarAnesthesia);
        mainPanel.add(lTime);
        mainPanel.add(tTime);
        mainPanel.add(lEquipement);
        mainPanel.add(tEquipement);
        mainPanel.add(lNote);
        mainPanel.add(tNote);
        this.add(mainPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().getClass().getSimpleName().equals("JMenuItem")) {
            mSurgery1.setVisible(false);
            mSurgery2.setVisible(false);
            mSurgery3.setVisible(false);
            mSurgery4.setVisible(false);
            mSurgery5.setVisible(false);
            mSurgery6.setVisible(false);
            mSurgery7.setVisible(false);
            mSurgery8.setVisible(false);
            mSurgery9.setVisible(false);
            switch (e.getActionCommand()) {
                case "CIRUGIA GENERAL":
                    mSurgery1.setVisible(true);
                    mDepartment.setText(e.getActionCommand());
                    break;
                case "GINECOLOGIA Y OBSTETRICA":
                    mSurgery2.setVisible(true);
                    mDepartment.setText(e.getActionCommand());
                    break;
                case "ORTOPEDIA Y TRAUMATOLOGIA":
                    mSurgery3.setVisible(true);
                    mDepartment.setText(e.getActionCommand());
                    break;
                case "OTORRINOLARINGOLOGIA":
                    mSurgery4.setVisible(true);
                    mDepartment.setText(e.getActionCommand());
                    break;
                case "UROLOGIA":
                    mSurgery5.setVisible(true);
                    mDepartment.setText(e.getActionCommand());
                    break;
                case "OFTALMOLOGIA":
                    mSurgery6.setVisible(true);
                    mDepartment.setText(e.getActionCommand());
                    break;
                case "ARTROSCOPIA":
                    mSurgery7.setVisible(true);
                    mDepartment.setText(e.getActionCommand());
                    break;
                case "ORTODONCIA":
                    mSurgery8.setVisible(true);
                    mDepartment.setText(e.getActionCommand());
                    break;
                case "CIRUGIA MAXILOFACIAL":
                    mSurgery9.setVisible(true);
                    mDepartment.setText(e.getActionCommand());
                    break;
                default:
                    mSurgery1.setText(e.getActionCommand());
                    mSurgery2.setText(e.getActionCommand());
                    mSurgery3.setText(e.getActionCommand());
                    mSurgery4.setText(e.getActionCommand());
                    mSurgery5.setText(e.getActionCommand());
                    mSurgery6.setText(e.getActionCommand());
                    mSurgery7.setText(e.getActionCommand());
                    mSurgery8.setText(e.getActionCommand());
                    mSurgery9.setText(e.getActionCommand());
                    break;
            }
        }
        //a.replaceWordData("resource/formatoOrdenCirugia.docx","[fecha]","19-10-19");
    }

    public void updateMenu() {
        String sItems = "";
        char[] cadena;
        String word;
        sItems = a.leerTxt("resource/cirugiaGeneral.txt");
        cadena = sItems.toCharArray();
        word = "";
        for (int i = 0; i < sItems.length(); i++) {
            if (cadena[i] == '\n') {
                JMenuItem Surgery = new JMenuItem(word);
                mSurgery1.add(Surgery);
                Surgery.addActionListener(this);
                word = "";
            } else {
                word += cadena[i];
            }
        }
        sItems = a.leerTxt("resource/ginecologiaYObstetrica.txt");
        cadena = sItems.toCharArray();
        word = "";
        for (int i = 0; i < sItems.length(); i++) {
            if (cadena[i] == '\n') {
                JMenuItem Surgery = new JMenuItem(word);
                mSurgery2.add(Surgery);
                Surgery.addActionListener(this);
                word = "";
            } else {
                word += cadena[i];
            }
        }
        sItems = a.leerTxt("resource/ortopediaYTraumatologia.txt");
        cadena = sItems.toCharArray();
        word = "";
        for (int i = 0; i < sItems.length(); i++) {
            if (cadena[i] == '\n') {
                JMenuItem Surgery = new JMenuItem(word);
                mSurgery3.add(Surgery);
                Surgery.addActionListener(this);
                word = "";
            } else {
                word += cadena[i];
            }
        }
        sItems = a.leerTxt("resource/otorrinolaringologia.txt");
        cadena = sItems.toCharArray();
        word = "";
        for (int i = 0; i < sItems.length(); i++) {
            if (cadena[i] == '\n') {
                JMenuItem Surgery = new JMenuItem(word);
                mSurgery4.add(Surgery);
                Surgery.addActionListener(this);
                word = "";
            } else {
                word += cadena[i];
            }
        }
        sItems = a.leerTxt("resource/urologia.txt");
        cadena = sItems.toCharArray();
        word = "";
        for (int i = 0; i < sItems.length(); i++) {
            if (cadena[i] == '\n') {
                JMenuItem Surgery = new JMenuItem(word);
                mSurgery5.add(Surgery);
                Surgery.addActionListener(this);
                word = "";
            } else {
                word += cadena[i];
            }
        }
        sItems = a.leerTxt("resource/oftalmologia.txt");
        cadena = sItems.toCharArray();
        word = "";
        for (int i = 0; i < sItems.length(); i++) {
            if (cadena[i] == '\n') {
                JMenuItem Surgery = new JMenuItem(word);
                mSurgery6.add(Surgery);
                Surgery.addActionListener(this);
                word = "";
            } else {
                word += cadena[i];
            }
        }
        sItems = a.leerTxt("resource/artroscopia.txt");
        cadena = sItems.toCharArray();
        word = "";
        for (int i = 0; i < sItems.length(); i++) {
            if (cadena[i] == '\n') {
                JMenuItem Surgery = new JMenuItem(word);
                mSurgery7.add(Surgery);
                Surgery.addActionListener(this);
                word = "";
            } else {
                word += cadena[i];
            }
        }
        sItems = a.leerTxt("resource/ortodoncia.txt");
        cadena = sItems.toCharArray();
        word = "";
        for (int i = 0; i < sItems.length(); i++) {
            if (cadena[i] == '\n') {
                JMenuItem Surgery = new JMenuItem(word);
                mSurgery8.add(Surgery);
                Surgery.addActionListener(this);
                word = "";
            } else {
                word += cadena[i];
            }
        }
        sItems = a.leerTxt("resource/cirugiaMaxilofacial.txt");
        cadena = sItems.toCharArray();
        word = "";
        for (int i = 0; i < sItems.length(); i++) {
            if (cadena[i] == '\n') {
                JMenuItem Surgery = new JMenuItem(word);
                mSurgery9.add(Surgery);
                Surgery.addActionListener(this);
                word = "";
            } else {
                word += cadena[i];
            }
        }
    }
}
