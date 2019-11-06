/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cotizacion;

import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;
import javax.swing.*;
import com.mxrck.autocompleter.TextAutoCompleter;

/**
 *
 * @author Sistemas
 */
public class Interface extends JFrame implements ActionListener {

    Archivo a = new Archivo();
    SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss");
    JTextField tMedic = new JTextField(30);
    JTextField tCedula = new JTextField(30);
    JTextField tPatient = new JTextField(30);
    JTextField tSolicitante = new JTextField(30);
    JTextField tDiacnostic = new JTextField(30);
    JTextField tSurgery1 = new JTextField(30);
    JTextField tSurgery2 = new JTextField(30);
    JTextField tSurgery3 = new JTextField(30);
    JTextField tSurgery4 = new JTextField(30);
    JTextField tSurgery5 = new JTextField(30);
    JTextField tSurgery6 = new JTextField(30);
    JTextField tSurgery7 = new JTextField(30);
    JTextField tSurgery8 = new JTextField(30);
    JTextField tSurgery9 = new JTextField(30);
    JMenu mDepartment = new JMenu("Especialidad");
    JMenu mSurgery1 = new JMenu("Cirugia");
    JMenu mSurgery2 = new JMenu("Cirugia");
    JMenu mSurgery3 = new JMenu("Cirugia");
    JMenu mSurgery4 = new JMenu("Cirugia");
    JMenu mSurgery5 = new JMenu("Cirugia");
    JMenu mSurgery6 = new JMenu("Cirugia");
    JMenu mSurgery7 = new JMenu("Cirugia");
    JMenu mSurgery8 = new JMenu("Cirugia");
    JMenu mSurgery9 = new JMenu("Cirugia");
    JMenu mSurgeryTipe = new JMenu("Tipo de Cirugia");
    JMenu mAnesthesia = new JMenu("Tipo de Anestesia");
    JCheckBox cTeam1 = new JCheckBox("Anestesiólogo");
    JCheckBox cTeam2 = new JCheckBox("Cirujano");
    JCheckBox cTeam3 = new JCheckBox("Instrumentista");
    JCheckBox cTeam4 = new JCheckBox("1er ayudante");
    JCheckBox cTeam5 = new JCheckBox("2do ayudante");
    JCheckBox cTeam6 = new JCheckBox("3er ayudante");
    JCheckBox cTeam7 = new JCheckBox("Pediadra");
    JTextField tTime = new JTextField(30);
    JTextField tEquipement = new JTextField(30);
    JTextArea tNote = new JTextArea(5, 30);
    JPanel p = new JPanel();
    TextAutoCompleter autoSurgery1;
    TextAutoCompleter autoSurgery2;
    TextAutoCompleter autoSurgery3;
    TextAutoCompleter autoSurgery4;
    TextAutoCompleter autoSurgery5;
    TextAutoCompleter autoSurgery6;
    TextAutoCompleter autoSurgery7;
    TextAutoCompleter autoSurgery8;
    TextAutoCompleter autoSurgery9;

    public Interface() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("resource/cruzroja.png"));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 720);
        //this.setExtendedState(MAXIMIZED_BOTH);
        this.setVisible(true);
        this.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width / 2) - this.getWidth() / 2,
                (Toolkit.getDefaultToolkit().getScreenSize().height * 2 / 5) - this.getHeight() / 2);
        this.setTitle("Cotización");

        JPanel mainPanel = new JPanel();
        JButton bSend = new JButton("Enviar");
        JLabel lMedic = new JLabel("Medico");
        JLabel lCedula = new JLabel("  Cedula  ");
        JLabel lPatient = new JLabel("Paciente");
        JLabel lSolicitante = new JLabel("Solicitante");
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
        JMenuItem iSurgeryTipe1 = new JMenuItem("Ordinario");
        JMenuItem iSurgeryTipe2 = new JMenuItem("Urgente");
        JMenuItem iAnesthesia1 = new JMenuItem("General");
        JMenuItem iAnesthesia2 = new JMenuItem("Local");
        JMenuItem iAnesthesia3 = new JMenuItem("Local más sedación");
        JMenuItem iAnesthesia4 = new JMenuItem("Regional");
        bSend.addActionListener(this);
        iDepartment1.addActionListener(this);
        iDepartment2.addActionListener(this);
        iDepartment3.addActionListener(this);
        iDepartment4.addActionListener(this);
        iDepartment5.addActionListener(this);
        iDepartment6.addActionListener(this);
        iDepartment7.addActionListener(this);
        iDepartment8.addActionListener(this);
        iDepartment9.addActionListener(this);
        iSurgeryTipe1.addActionListener(this);
        iSurgeryTipe2.addActionListener(this);
        iAnesthesia1.addActionListener(this);
        iAnesthesia2.addActionListener(this);
        iAnesthesia3.addActionListener(this);
        iAnesthesia4.addActionListener(this);
        mDepartment.add(iDepartment1);
        mDepartment.add(iDepartment2);
        mDepartment.add(iDepartment3);
        mDepartment.add(iDepartment4);
        mDepartment.add(iDepartment5);
        mDepartment.add(iDepartment6);
        mDepartment.add(iDepartment7);
        mDepartment.add(iDepartment8);
        mDepartment.add(iDepartment9);
        mSurgeryTipe.add(iSurgeryTipe1);
        mSurgeryTipe.add(iSurgeryTipe2);
        mAnesthesia.add(iAnesthesia1);
        mAnesthesia.add(iAnesthesia2);
        mAnesthesia.add(iAnesthesia3);
        mAnesthesia.add(iAnesthesia4);
        mBarDepartment.add(mDepartment);
        mBarSurgeryTipe.add(mSurgeryTipe);
        mBarAnesthesia.add(mAnesthesia);
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
        mSurgeryTipe.setPreferredSize(new Dimension(330, 20));
        mAnesthesia.setPreferredSize(new Dimension(330, 20));
        cTeam1.setPreferredSize(new Dimension(165, 20));
        cTeam2.setPreferredSize(new Dimension(165, 20));
        cTeam3.setPreferredSize(new Dimension(165, 20));
        cTeam4.setPreferredSize(new Dimension(165, 20));
        cTeam5.setPreferredSize(new Dimension(165, 20));
        cTeam6.setPreferredSize(new Dimension(165, 20));
        cTeam7.setPreferredSize(new Dimension(330, 20));
        mSurgery1.setVisible(false);
        mSurgery2.setVisible(false);
        mSurgery3.setVisible(false);
        mSurgery4.setVisible(false);
        mSurgery5.setVisible(false);
        mSurgery6.setVisible(false);
        mSurgery7.setVisible(false);
        mSurgery8.setVisible(false);
        mSurgery9.setVisible(false);
        tSurgery1.setVisible(false);
        tSurgery2.setVisible(false);
        tSurgery3.setVisible(false);
        tSurgery4.setVisible(false);
        tSurgery5.setVisible(false);
        tSurgery6.setVisible(false);
        tSurgery7.setVisible(false);
        tSurgery8.setVisible(false);
        tSurgery9.setVisible(false);
        autoSurgery1 = new TextAutoCompleter(tSurgery1);
        autoSurgery2 = new TextAutoCompleter(tSurgery2);
        autoSurgery3 = new TextAutoCompleter(tSurgery3);
        autoSurgery4 = new TextAutoCompleter(tSurgery4);
        autoSurgery5 = new TextAutoCompleter(tSurgery5);
        autoSurgery6 = new TextAutoCompleter(tSurgery6);
        autoSurgery7 = new TextAutoCompleter(tSurgery7);
        autoSurgery8 = new TextAutoCompleter(tSurgery8);
        autoSurgery9 = new TextAutoCompleter(tSurgery9);
        autoSurgery1.setMode(0);
        updateMenu();

        mainPanel.add(lMedic);
        mainPanel.add(tMedic);
        mainPanel.add(lCedula);
        mainPanel.add(tCedula);
        mainPanel.add(lPatient);
        mainPanel.add(tPatient);
        mainPanel.add(lSolicitante);
        mainPanel.add(tSolicitante);
        mainPanel.add(lDiacnostic);
        mainPanel.add(tDiacnostic);
        mainPanel.add(mBarDepartment);
        mainPanel.add(tSurgery1);
        mainPanel.add(tSurgery2);
        mainPanel.add(tSurgery3);
        mainPanel.add(tSurgery4);
        mainPanel.add(tSurgery5);
        mainPanel.add(tSurgery6);
        mainPanel.add(tSurgery7);
        mainPanel.add(tSurgery8);
        mainPanel.add(tSurgery9);
        mainPanel.add(mBarSurgeryTipe);
        mainPanel.add(mBarAnesthesia);
        mainPanel.add(cTeam1);
        mainPanel.add(cTeam2);
        mainPanel.add(cTeam3);
        mainPanel.add(cTeam4);
        mainPanel.add(cTeam5);
        mainPanel.add(cTeam6);
        mainPanel.add(cTeam7);
        mainPanel.add(lTime);
        mainPanel.add(tTime);
        mainPanel.add(lEquipement);
        mainPanel.add(tEquipement);
        mainPanel.add(lNote);
        mainPanel.add(tNote);
        mainPanel.add(bSend);
        this.add(mainPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().getClass().getSimpleName().equals("JMenuItem")) {
            switch (e.getActionCommand()) {
                case "CIRUGIA GENERAL":
                    tSurgery1.setVisible(true);
                    tSurgery2.setVisible(false);
                    tSurgery3.setVisible(false);
                    tSurgery4.setVisible(false);
                    tSurgery5.setVisible(false);
                    tSurgery6.setVisible(false);
                    tSurgery7.setVisible(false);
                    tSurgery8.setVisible(false);
                    tSurgery9.setVisible(false);
                    mDepartment.setText(e.getActionCommand());
                    break;
                case "GINECOLOGIA Y OBSTETRICA":
                    tSurgery1.setVisible(false);
                    tSurgery2.setVisible(true);
                    tSurgery3.setVisible(false);
                    tSurgery4.setVisible(false);
                    tSurgery5.setVisible(false);
                    tSurgery6.setVisible(false);
                    tSurgery7.setVisible(false);
                    tSurgery8.setVisible(false);
                    tSurgery9.setVisible(false);
                    mDepartment.setText(e.getActionCommand());
                    break;
                case "ORTOPEDIA Y TRAUMATOLOGIA":
                    tSurgery1.setVisible(false);
                    tSurgery2.setVisible(false);
                    tSurgery3.setVisible(true);
                    tSurgery4.setVisible(false);
                    tSurgery5.setVisible(false);
                    tSurgery6.setVisible(false);
                    tSurgery7.setVisible(false);
                    tSurgery8.setVisible(false);
                    tSurgery9.setVisible(false);
                    mDepartment.setText(e.getActionCommand());
                    break;
                case "OTORRINOLARINGOLOGIA":
                    tSurgery1.setVisible(false);
                    tSurgery2.setVisible(false);
                    tSurgery3.setVisible(false);
                    tSurgery4.setVisible(true);
                    tSurgery5.setVisible(false);
                    tSurgery6.setVisible(false);
                    tSurgery7.setVisible(false);
                    tSurgery8.setVisible(false);
                    tSurgery9.setVisible(false);
                    mDepartment.setText(e.getActionCommand());
                    break;
                case "UROLOGIA":
                    tSurgery1.setVisible(false);
                    tSurgery2.setVisible(false);
                    tSurgery3.setVisible(false);
                    tSurgery4.setVisible(false);
                    tSurgery5.setVisible(true);
                    tSurgery6.setVisible(false);
                    tSurgery7.setVisible(false);
                    tSurgery8.setVisible(false);
                    tSurgery9.setVisible(false);
                    mDepartment.setText(e.getActionCommand());
                    break;
                case "OFTALMOLOGIA":
                    tSurgery1.setVisible(false);
                    tSurgery2.setVisible(false);
                    tSurgery3.setVisible(false);
                    tSurgery4.setVisible(false);
                    tSurgery5.setVisible(false);
                    tSurgery6.setVisible(true);
                    tSurgery7.setVisible(false);
                    tSurgery8.setVisible(false);
                    tSurgery9.setVisible(false);
                    mDepartment.setText(e.getActionCommand());
                    break;
                case "ARTROSCOPIA":
                    tSurgery1.setVisible(false);
                    tSurgery2.setVisible(false);
                    tSurgery3.setVisible(false);
                    tSurgery4.setVisible(false);
                    tSurgery5.setVisible(false);
                    tSurgery6.setVisible(false);
                    tSurgery7.setVisible(true);
                    tSurgery8.setVisible(false);
                    tSurgery9.setVisible(false);
                    mDepartment.setText(e.getActionCommand());
                    break;
                case "ORTODONCIA":
                    tSurgery1.setVisible(false);
                    tSurgery2.setVisible(false);
                    tSurgery3.setVisible(false);
                    tSurgery4.setVisible(false);
                    tSurgery5.setVisible(false);
                    tSurgery6.setVisible(false);
                    tSurgery7.setVisible(false);
                    tSurgery8.setVisible(true);
                    tSurgery9.setVisible(false);
                    mDepartment.setText(e.getActionCommand());
                    break;
                case "CIRUGIA MAXILOFACIAL":
                    tSurgery1.setVisible(false);
                    tSurgery2.setVisible(false);
                    tSurgery3.setVisible(false);
                    tSurgery4.setVisible(false);
                    tSurgery5.setVisible(false);
                    tSurgery6.setVisible(false);
                    tSurgery7.setVisible(false);
                    tSurgery8.setVisible(false);
                    tSurgery9.setVisible(true);
                    mDepartment.setText(e.getActionCommand());
                    break;
                case "Ordinario":
                case "Urgente":
                    mSurgeryTipe.setText(e.getActionCommand());
                    break;
                case "General":
                case "Local":
                case "Local más sedación":
                case "Regional":
                    mAnesthesia.setText(e.getActionCommand());
                    break;
                default:
                    switch (mDepartment.getText()) {
                        case "CIRUGIA GENERAL":
                            mSurgery1.setText(e.getActionCommand());
                            break;
                        case "GINECOLOGIA Y OBSTETRICA":
                            mSurgery2.setText(e.getActionCommand());
                            break;
                        case "ORTOPEDIA Y TRAUMATOLOGIA":
                            mSurgery3.setText(e.getActionCommand());
                            break;
                        case "OTORRINOLARINGOLOGIA":
                            mSurgery4.setText(e.getActionCommand());
                            break;
                        case "UROLOGIA":
                            mSurgery5.setText(e.getActionCommand());
                            break;
                        case "OFTALMOLOGIA":
                            mSurgery6.setText(e.getActionCommand());
                            break;
                        case "ARTROSCOPIA":
                            mSurgery7.setText(e.getActionCommand());
                            break;
                        case "ORTODONCIA":
                            mSurgery8.setText(e.getActionCommand());
                            break;
                        case "CIRUGIA MAXILOFACIAL":
                            mSurgery9.setText(e.getActionCommand());
                            break;
                    }
                    break;
            }
        } else if (e.getSource().getClass().getSimpleName().equals("JButton")) {
            Calendar calendario = new GregorianCalendar();
            String[][] data = new String[14][2];
            data[0][0] = "medic";
            data[1][0] = "cedula";
            data[2][0] = "patient";
            data[3][0] = "solicitante";
            data[4][0] = "date";
            data[5][0] = "diacnostic";
            data[6][0] = "department";
            data[7][0] = "surgery";
            data[8][0] = "tipe";
            data[9][0] = "anesthesia";
            data[10][0] = "team";
            data[11][0] = "time";
            data[12][0] = "equipement";
            data[13][0] = "note";
            data[0][1] = tMedic.getText();
            data[1][1] = tCedula.getText();
            data[2][1] = tPatient.getText();
            data[3][1] = tSolicitante.getText();
            data[4][1] = date.format(calendario.getTime());
            data[5][1] = tDiacnostic.getText();
            data[6][1] = mDepartment.getText();
            switch (mDepartment.getText()) {
                case "CIRUGIA GENERAL":
                    data[7][1] = tSurgery1.getText();
                    break;
                case "GINECOLOGIA Y OBSTETRICA":
                    data[7][1] = tSurgery2.getText();
                    break;
                case "ORTOPEDIA Y TRAUMATOLOGIA":
                    data[7][1] = tSurgery3.getText();
                    break;
                case "OTORRINOLARINGOLOGIA":
                    data[7][1] = tSurgery4.getText();
                    break;
                case "UROLOGIA":
                    data[7][1] = tSurgery5.getText();
                    break;
                case "OFTALMOLOGIA":
                    data[7][1] = tSurgery6.getText();
                    break;
                case "ARTROSCOPIA":
                    data[7][1] = tSurgery7.getText();
                    break;
                case "ORTODONCIA":
                    data[7][1] = tSurgery8.getText();
                    break;
                case "CIRUGIA MAXILOFACIAL":
                    data[7][1] = tSurgery9.getText();
                    break;
            }
            data[8][1] = mSurgeryTipe.getText();
            data[9][1] = mAnesthesia.getText();
            String team = "";
            if (cTeam1.isSelected()) {
                team += " " + cTeam1.getText() + "  ";
            }
            if (cTeam2.isSelected()) {
                team += " " + cTeam2.getText() + "  ";
            }
            if (cTeam3.isSelected()) {
                team += " " + cTeam3.getText() + "  ";
            }
            if (cTeam4.isSelected()) {
                team += " " + cTeam4.getText() + "  ";
            }
            if (cTeam5.isSelected()) {
                team += " " + cTeam5.getText() + "  ";
            }
            if (cTeam6.isSelected()) {
                team += " " + cTeam6.getText() + "  ";
            }
            if (cTeam7.isSelected()) {
                team += " " + cTeam7.getText() + "  ";
            }
            data[10][1] = team;
            data[11][1] = tTime.getText();
            data[12][1] = tEquipement.getText();
            data[13][1] = tNote.getText();
            System.out.println("enviar");
            a.replaceWordData("resource/formatoOrdenCirugia.docx", "resource/Orden de Cirugia "
                    + tPatient.getText() + " " + date.format(calendario.getTime())
                    + ".docx", data);
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
                autoSurgery1.addItem(word);
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
                autoSurgery2.addItem(word);
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
                autoSurgery3.addItem(word);
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
                autoSurgery4.addItem(word);
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
                autoSurgery5.addItem(word);
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
                autoSurgery6.addItem(word);
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
                autoSurgery7.addItem(word);
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
                autoSurgery8.addItem(word);
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
                autoSurgery9.addItem(word);
                mSurgery9.add(Surgery);
                Surgery.addActionListener(this);
                word = "";
            } else {
                word += cadena[i];
            }
        }
    }
}
