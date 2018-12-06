package GUI;

import Logic.*;
import Util.Point;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.util.Set;

import javax.swing.JFrame;

/**
 *
 * @author Hume
 */
public class GUI extends JFrame{

    /**
     * Creates new form NewJFrame
     * @param t
     */
    public GUI(Thread t) {
        initComponents();
        s=null;
        pare = t;
    }
    
    
    // Private
    static OthelloData data;
    static OthelloMove move;
  //  static Jugador jugador1;
  //  static Random jugador2;
    static int  Step;
    boolean acabat = false;
    Thread pare = null;
    
    private Point s;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        fill_73 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_03 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_13 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_23 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_33 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_43 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_53 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_63 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_74 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_64 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_54 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_44 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_34 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_24 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_14 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_04 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_72 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_62 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_52 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_42 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_32 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_22 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_12 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_02 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_75 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_65 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_55 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_45 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_35 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_25 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_15 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_05 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_76 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_66 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_56 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_46 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_36 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_26 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_16 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_06 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_71 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_61 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_51 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_41 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_31 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_21 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_11 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_01 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_57 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_47 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_37 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_27 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_07 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_17 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_67 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_77 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_70 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_60 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_50 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_40 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_30 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_20 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_10 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        fill_00 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        jTextField3 = new javax.swing.JTextField();
        Estat_Joc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Versus");

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLayeredPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ratoliPres(evt);
            }
        });

        fill_73.setBackground(new java.awt.Color(128, 255, 0));
        fill_73.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_73.setOpaque(true);
        jLayeredPane1.add(fill_73);
        fill_73.setBounds(150, 0, 50, 50);

        fill_03.setBackground(new java.awt.Color(128, 255, 0));
        fill_03.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_03.setOpaque(true);
        jLayeredPane1.add(fill_03);
        fill_03.setBounds(150, 350, 50, 50);

        fill_13.setBackground(new java.awt.Color(128, 255, 0));
        fill_13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_13.setOpaque(true);
        jLayeredPane1.add(fill_13);
        fill_13.setBounds(150, 300, 50, 50);

        fill_23.setBackground(new java.awt.Color(128, 255, 0));
        fill_23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_23.setOpaque(true);
        jLayeredPane1.add(fill_23);
        fill_23.setBounds(150, 250, 50, 50);

        fill_33.setBackground(new java.awt.Color(128, 255, 0));
        fill_33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_33.setOpaque(true);
        jLayeredPane1.add(fill_33);
        fill_33.setBounds(150, 200, 50, 50);

        fill_43.setBackground(new java.awt.Color(128, 255, 0));
        fill_43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_43.setOpaque(true);
        jLayeredPane1.add(fill_43);
        fill_43.setBounds(150, 150, 50, 50);

        fill_53.setBackground(new java.awt.Color(128, 255, 0));
        fill_53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_53.setOpaque(true);
        jLayeredPane1.add(fill_53);
        fill_53.setBounds(150, 100, 50, 50);

        fill_63.setBackground(new java.awt.Color(128, 255, 0));
        fill_63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_63.setOpaque(true);
        jLayeredPane1.add(fill_63);
        fill_63.setBounds(150, 50, 50, 50);

        fill_74.setBackground(new java.awt.Color(128, 255, 0));
        fill_74.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_74.setOpaque(true);
        jLayeredPane1.add(fill_74);
        fill_74.setBounds(200, 0, 50, 50);

        fill_64.setBackground(new java.awt.Color(128, 255, 0));
        fill_64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_64.setOpaque(true);
        jLayeredPane1.add(fill_64);
        fill_64.setBounds(200, 50, 50, 50);

        fill_54.setBackground(new java.awt.Color(128, 255, 0));
        fill_54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_54.setOpaque(true);
        jLayeredPane1.add(fill_54);
        fill_54.setBounds(200, 100, 50, 50);

        fill_44.setBackground(new java.awt.Color(128, 255, 0));
        fill_44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_44.setOpaque(true);
        jLayeredPane1.add(fill_44);
        fill_44.setBounds(200, 150, 50, 50);

        fill_34.setBackground(new java.awt.Color(128, 255, 0));
        fill_34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_34.setOpaque(true);
        jLayeredPane1.add(fill_34);
        fill_34.setBounds(200, 200, 50, 50);

        fill_24.setBackground(new java.awt.Color(128, 255, 0));
        fill_24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_24.setOpaque(true);
        jLayeredPane1.add(fill_24);
        fill_24.setBounds(200, 250, 50, 50);

        fill_14.setBackground(new java.awt.Color(128, 255, 0));
        fill_14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_14.setOpaque(true);
        jLayeredPane1.add(fill_14);
        fill_14.setBounds(200, 300, 50, 50);

        fill_04.setBackground(new java.awt.Color(128, 255, 0));
        fill_04.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_04.setOpaque(true);
        jLayeredPane1.add(fill_04);
        fill_04.setBounds(200, 350, 50, 50);

        fill_72.setBackground(new java.awt.Color(128, 255, 0));
        fill_72.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_72.setOpaque(true);
        jLayeredPane1.add(fill_72);
        fill_72.setBounds(100, 0, 50, 50);

        fill_62.setBackground(new java.awt.Color(128, 255, 0));
        fill_62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_62.setOpaque(true);
        jLayeredPane1.add(fill_62);
        fill_62.setBounds(100, 50, 50, 50);

        fill_52.setBackground(new java.awt.Color(128, 255, 0));
        fill_52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_52.setOpaque(true);
        jLayeredPane1.add(fill_52);
        fill_52.setBounds(100, 100, 50, 50);

        fill_42.setBackground(new java.awt.Color(128, 255, 0));
        fill_42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_42.setOpaque(true);
        jLayeredPane1.add(fill_42);
        fill_42.setBounds(100, 150, 50, 50);

        fill_32.setBackground(new java.awt.Color(128, 255, 0));
        fill_32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_32.setOpaque(true);
        jLayeredPane1.add(fill_32);
        fill_32.setBounds(100, 200, 50, 50);

        fill_22.setBackground(new java.awt.Color(128, 255, 0));
        fill_22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_22.setOpaque(true);
        jLayeredPane1.add(fill_22);
        fill_22.setBounds(100, 250, 50, 50);

        fill_12.setBackground(new java.awt.Color(128, 255, 0));
        fill_12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_12.setOpaque(true);
        jLayeredPane1.add(fill_12);
        fill_12.setBounds(100, 300, 50, 50);

        fill_02.setBackground(new java.awt.Color(128, 255, 0));
        fill_02.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_02.setOpaque(true);
        jLayeredPane1.add(fill_02);
        fill_02.setBounds(100, 350, 50, 50);

        fill_75.setBackground(new java.awt.Color(128, 255, 0));
        fill_75.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_75.setOpaque(true);
        jLayeredPane1.add(fill_75);
        fill_75.setBounds(250, 0, 50, 50);

        fill_65.setBackground(new java.awt.Color(128, 255, 0));
        fill_65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_65.setOpaque(true);
        jLayeredPane1.add(fill_65);
        fill_65.setBounds(250, 50, 50, 50);

        fill_55.setBackground(new java.awt.Color(128, 255, 0));
        fill_55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_55.setOpaque(true);
        jLayeredPane1.add(fill_55);
        fill_55.setBounds(250, 100, 50, 50);

        fill_45.setBackground(new java.awt.Color(128, 255, 0));
        fill_45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_45.setOpaque(true);
        jLayeredPane1.add(fill_45);
        fill_45.setBounds(250, 150, 50, 50);

        fill_35.setBackground(new java.awt.Color(128, 255, 0));
        fill_35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_35.setOpaque(true);
        jLayeredPane1.add(fill_35);
        fill_35.setBounds(250, 200, 50, 50);

        fill_25.setBackground(new java.awt.Color(128, 255, 0));
        fill_25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_25.setOpaque(true);
        jLayeredPane1.add(fill_25);
        fill_25.setBounds(250, 250, 50, 50);

        fill_15.setBackground(new java.awt.Color(128, 255, 0));
        fill_15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_15.setOpaque(true);
        jLayeredPane1.add(fill_15);
        fill_15.setBounds(250, 300, 50, 50);

        fill_05.setBackground(new java.awt.Color(128, 255, 0));
        fill_05.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_05.setOpaque(true);
        jLayeredPane1.add(fill_05);
        fill_05.setBounds(250, 350, 50, 50);

        fill_76.setBackground(new java.awt.Color(128, 255, 0));
        fill_76.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_76.setOpaque(true);
        jLayeredPane1.add(fill_76);
        fill_76.setBounds(300, 0, 50, 50);

        fill_66.setBackground(new java.awt.Color(128, 255, 0));
        fill_66.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_66.setOpaque(true);
        jLayeredPane1.add(fill_66);
        fill_66.setBounds(300, 50, 50, 50);

        fill_56.setBackground(new java.awt.Color(128, 255, 0));
        fill_56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_56.setOpaque(true);
        jLayeredPane1.add(fill_56);
        fill_56.setBounds(300, 100, 50, 50);

        fill_46.setBackground(new java.awt.Color(128, 255, 0));
        fill_46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_46.setOpaque(true);
        jLayeredPane1.add(fill_46);
        fill_46.setBounds(300, 150, 50, 50);

        fill_36.setBackground(new java.awt.Color(128, 255, 0));
        fill_36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_36.setOpaque(true);
        jLayeredPane1.add(fill_36);
        fill_36.setBounds(300, 200, 50, 50);

        fill_26.setBackground(new java.awt.Color(128, 255, 0));
        fill_26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_26.setOpaque(true);
        jLayeredPane1.add(fill_26);
        fill_26.setBounds(300, 250, 50, 50);

        fill_16.setBackground(new java.awt.Color(128, 255, 0));
        fill_16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_16.setOpaque(true);
        jLayeredPane1.add(fill_16);
        fill_16.setBounds(300, 300, 50, 50);

        fill_06.setBackground(new java.awt.Color(128, 255, 0));
        fill_06.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_06.setOpaque(true);
        jLayeredPane1.add(fill_06);
        fill_06.setBounds(300, 350, 50, 50);

        fill_71.setBackground(new java.awt.Color(128, 255, 0));
        fill_71.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_71.setOpaque(true);
        jLayeredPane1.add(fill_71);
        fill_71.setBounds(50, 0, 50, 50);

        fill_61.setBackground(new java.awt.Color(128, 255, 0));
        fill_61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_61.setOpaque(true);
        jLayeredPane1.add(fill_61);
        fill_61.setBounds(50, 50, 50, 50);

        fill_51.setBackground(new java.awt.Color(128, 255, 0));
        fill_51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_51.setOpaque(true);
        jLayeredPane1.add(fill_51);
        fill_51.setBounds(50, 100, 50, 50);

        fill_41.setBackground(new java.awt.Color(128, 255, 0));
        fill_41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_41.setOpaque(true);
        jLayeredPane1.add(fill_41);
        fill_41.setBounds(50, 150, 50, 50);

        fill_31.setBackground(new java.awt.Color(128, 255, 0));
        fill_31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_31.setOpaque(true);
        jLayeredPane1.add(fill_31);
        fill_31.setBounds(50, 200, 50, 50);

        fill_21.setBackground(new java.awt.Color(128, 255, 0));
        fill_21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_21.setOpaque(true);
        jLayeredPane1.add(fill_21);
        fill_21.setBounds(50, 250, 50, 50);

        fill_11.setBackground(new java.awt.Color(128, 255, 0));
        fill_11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_11.setOpaque(true);
        jLayeredPane1.add(fill_11);
        fill_11.setBounds(50, 300, 50, 50);

        fill_01.setBackground(new java.awt.Color(128, 255, 0));
        fill_01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_01.setOpaque(true);
        jLayeredPane1.add(fill_01);
        fill_01.setBounds(50, 350, 50, 50);

        fill_57.setBackground(new java.awt.Color(128, 255, 0));
        fill_57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_57.setOpaque(true);
        jLayeredPane1.add(fill_57);
        fill_57.setBounds(350, 100, 50, 50);

        fill_47.setBackground(new java.awt.Color(128, 255, 0));
        fill_47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_47.setOpaque(true);
        jLayeredPane1.add(fill_47);
        fill_47.setBounds(350, 150, 50, 50);

        fill_37.setBackground(new java.awt.Color(128, 255, 0));
        fill_37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_37.setOpaque(true);
        jLayeredPane1.add(fill_37);
        fill_37.setBounds(350, 200, 50, 50);

        fill_27.setBackground(new java.awt.Color(128, 255, 0));
        fill_27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_27.setOpaque(true);
        jLayeredPane1.add(fill_27);
        fill_27.setBounds(350, 250, 50, 50);

        fill_07.setBackground(new java.awt.Color(128, 255, 0));
        fill_07.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_07.setOpaque(true);
        jLayeredPane1.add(fill_07);
        fill_07.setBounds(350, 350, 50, 50);

        fill_17.setBackground(new java.awt.Color(128, 255, 0));
        fill_17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_17.setOpaque(true);
        jLayeredPane1.add(fill_17);
        fill_17.setBounds(350, 300, 50, 50);

        fill_67.setBackground(new java.awt.Color(128, 255, 0));
        fill_67.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_67.setOpaque(true);
        jLayeredPane1.add(fill_67);
        fill_67.setBounds(350, 50, 50, 50);

        fill_77.setBackground(new java.awt.Color(128, 255, 0));
        fill_77.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_77.setOpaque(true);
        jLayeredPane1.add(fill_77);
        fill_77.setBounds(350, 0, 50, 50);

        fill_70.setBackground(new java.awt.Color(128, 255, 0));
        fill_70.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_70.setOpaque(true);
        jLayeredPane1.add(fill_70);
        fill_70.setBounds(0, 0, 50, 50);

        fill_60.setBackground(new java.awt.Color(128, 255, 0));
        fill_60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_60.setOpaque(true);
        jLayeredPane1.add(fill_60);
        fill_60.setBounds(0, 50, 50, 50);

        fill_50.setBackground(new java.awt.Color(128, 255, 0));
        fill_50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_50.setOpaque(true);
        jLayeredPane1.add(fill_50);
        fill_50.setBounds(0, 100, 50, 50);

        fill_40.setBackground(new java.awt.Color(128, 255, 0));
        fill_40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_40.setOpaque(true);
        jLayeredPane1.add(fill_40);
        fill_40.setBounds(0, 150, 50, 50);

        fill_30.setBackground(new java.awt.Color(128, 255, 0));
        fill_30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_30.setOpaque(true);
        jLayeredPane1.add(fill_30);
        fill_30.setBounds(0, 200, 50, 50);

        fill_20.setBackground(new java.awt.Color(128, 255, 0));
        fill_20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_20.setOpaque(true);
        jLayeredPane1.add(fill_20);
        fill_20.setBounds(0, 250, 50, 50);

        fill_10.setBackground(new java.awt.Color(128, 255, 0));
        fill_10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_10.setOpaque(true);
        jLayeredPane1.add(fill_10);
        fill_10.setBounds(0, 300, 50, 50);

        fill_00.setBackground(new java.awt.Color(128, 255, 0));
        fill_00.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fill_00.setOpaque(true);
        jLayeredPane1.add(fill_00);
        fill_00.setBounds(0, 350, 50, 50);

        Estat_Joc.setText("ESTAT ACTUAL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(Estat_Joc)
                        .addGap(39, 39, 39))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(Estat_Joc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ratoliPres(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ratoliPres
        int rata_x = evt.getX();
        int rata_y = evt.getY();
        double pan_x = jLayeredPane1.getSize().getWidth();
        double pan_y = jLayeredPane1.getSize().getHeight();
        Step = (int) pan_x/8;
        
        int fila = rata_x / 8;
        int col = rata_y / 8;
        
        System.out.println("MIDA TAULER : " + pan_x + " " + pan_y);
        System.out.println("Rata : " + rata_x + " " + rata_y);
        
        
        int aux = (int) (rata_x / (pan_x / 8 ));
        int aux2 = (int) (rata_y / (pan_y / 8));
        
        
        s = new Point (aux,aux2);
        
        pare.interrupt();

        
    }//GEN-LAST:event_ratoliPres
   
    
     @Override
    public void paint(Graphics g)
    {
     super.paint(g);
     
    for (int i=0; i<8; i++){
        for (int j=0; j<8; j++){
            g.setColor(Color.RED);
            if (true){
                g.drawOval(whichx(i),whichy(j),40,40);
                g.fillOval(whichx(i),whichy(j),40,40);                
            }
            else{
                g.setColor(Color.BLUE);
                g.drawOval(whichx(i),whichy(j),40,40);
                g.fillOval(whichx(i),whichy(j),40,40);
                
            }
            
        }
     }
     
    }
    
        
    private static int whichx(int col){
        return ((50*col+12));
    }
    
    private static int whichy(int fil){
        return (50*fil+77);
    }
    
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        // Declaracio dels dos jugadors
     //   jugador1 = new Jugador();
     //   jugador2 = new Jugador();
        
        
    }
    
    
    




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Estat_Joc;
    private javax.swing.Box.Filler fill_00;
    private javax.swing.Box.Filler fill_01;
    private javax.swing.Box.Filler fill_02;
    private javax.swing.Box.Filler fill_03;
    private javax.swing.Box.Filler fill_04;
    private javax.swing.Box.Filler fill_05;
    private javax.swing.Box.Filler fill_06;
    private javax.swing.Box.Filler fill_07;
    private javax.swing.Box.Filler fill_10;
    private javax.swing.Box.Filler fill_11;
    private javax.swing.Box.Filler fill_12;
    private javax.swing.Box.Filler fill_13;
    private javax.swing.Box.Filler fill_14;
    private javax.swing.Box.Filler fill_15;
    private javax.swing.Box.Filler fill_16;
    private javax.swing.Box.Filler fill_17;
    private javax.swing.Box.Filler fill_20;
    private javax.swing.Box.Filler fill_21;
    private javax.swing.Box.Filler fill_22;
    private javax.swing.Box.Filler fill_23;
    private javax.swing.Box.Filler fill_24;
    private javax.swing.Box.Filler fill_25;
    private javax.swing.Box.Filler fill_26;
    private javax.swing.Box.Filler fill_27;
    private javax.swing.Box.Filler fill_30;
    private javax.swing.Box.Filler fill_31;
    private javax.swing.Box.Filler fill_32;
    private javax.swing.Box.Filler fill_33;
    private javax.swing.Box.Filler fill_34;
    private javax.swing.Box.Filler fill_35;
    private javax.swing.Box.Filler fill_36;
    private javax.swing.Box.Filler fill_37;
    private javax.swing.Box.Filler fill_40;
    private javax.swing.Box.Filler fill_41;
    private javax.swing.Box.Filler fill_42;
    private javax.swing.Box.Filler fill_43;
    private javax.swing.Box.Filler fill_44;
    private javax.swing.Box.Filler fill_45;
    private javax.swing.Box.Filler fill_46;
    private javax.swing.Box.Filler fill_47;
    private javax.swing.Box.Filler fill_50;
    private javax.swing.Box.Filler fill_51;
    private javax.swing.Box.Filler fill_52;
    private javax.swing.Box.Filler fill_53;
    private javax.swing.Box.Filler fill_54;
    private javax.swing.Box.Filler fill_55;
    private javax.swing.Box.Filler fill_56;
    private javax.swing.Box.Filler fill_57;
    private javax.swing.Box.Filler fill_60;
    private javax.swing.Box.Filler fill_61;
    private javax.swing.Box.Filler fill_62;
    private javax.swing.Box.Filler fill_63;
    private javax.swing.Box.Filler fill_64;
    private javax.swing.Box.Filler fill_65;
    private javax.swing.Box.Filler fill_66;
    private javax.swing.Box.Filler fill_67;
    private javax.swing.Box.Filler fill_70;
    private javax.swing.Box.Filler fill_71;
    private javax.swing.Box.Filler fill_72;
    private javax.swing.Box.Filler fill_73;
    private javax.swing.Box.Filler fill_74;
    private javax.swing.Box.Filler fill_75;
    private javax.swing.Box.Filler fill_76;
    private javax.swing.Box.Filler fill_77;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
