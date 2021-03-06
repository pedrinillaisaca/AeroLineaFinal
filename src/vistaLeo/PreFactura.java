package vistaLeo;

import controlador.GestionAeroLinea;
import modelo.ModeloPreFactura;
import modelo.ModeloTablaPreFactura;

import javax.swing.*;
import java.awt.*;


public class PreFactura extends JFrame {

    GestionAeroLinea gestionAeroLinea;
    private JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lblImagen;

    private JLabel lblCodigo, lblOrigen, lblDestino, lblFechaSalida, lblHoraSalida, lblAsiento, lblVuelo, lblCosto,
            lblTipoPer, lblPlaca;
    private JComboBox comboAsientos, comboVuelo, comboTipoPersona;

    private JTextField txt1, txt2, txt3, txt4, txt5, txt6, txt7;

    private JTextField txtCodigo, txtOrigen, txtDestino, txtFechaSalida, txtHoraSalida, txtCosto, txtPlaca;

    private JButton btn1, btn2, btn3;

    public PreFactura(){
        ejecutar();
    }

    public void ejecutar(){
        getContentPane().setBackground(Color.WHITE);
        setSize(750,900);
        setTitle("PreFactura");
        setVisible(true);
        setLayout(null);

        init();

    }

    public void init(){
        //crearTabla();

        txt1 = new JTextField();
        txt1.setSize(175,25);
        txt1.setLocation(160,155);
        add(txt1);

        lblImagen = new JLabel();
        lblImagen.setIcon(new ImageIcon(this.getClass().getResource("Imagenes/avionsito.jpg")));
        lblImagen.setSize(128,128);
        lblImagen.setLocation(10,10);
        add(lblImagen);

        lbl1 = new JLabel("Señor(a): ");
        lbl1.setSize(lbl1.getPreferredSize());
        lbl1.setLocation(10,155);
        add(lbl1);

        lbl2 = new JLabel("Direccion: ");
        lbl2.setSize(lbl2.getPreferredSize());
        lbl2.setLocation(10,185);
        add(lbl2);

        lbl3 = new JLabel("Cedula: ");
        lbl3.setSize(lbl3.getPreferredSize());
        lbl3.setLocation(10,215);
        add(lbl3);

        lbl4 = new JLabel("Fecha: ");
        lbl4.setSize(lbl4.getPreferredSize());
        lbl4.setLocation(10,245);
        add(lbl4);

        llenarCombo(); // x 10 y 275
        lblVuelo = new JLabel("Vuelo #: ");
        lblVuelo.setSize(lblVuelo.getPreferredSize());
        lblVuelo.setLocation(10,275);
        add(lblVuelo);

        lblHoraSalida = new JLabel("Hora Salida:");
        lblHoraSalida.setSize(lblHoraSalida.getPreferredSize());
        lblHoraSalida.setLocation(10,305);
        add(lblHoraSalida);

        txtHoraSalida = new JTextField();
        txtHoraSalida.setSize(txt1.getSize());
        txtHoraSalida.setLocation(160, 305);
        add(txtHoraSalida);

        // Segundo combo x 10 y 335

        lblAsiento = new JLabel("Asiento #: ");
        lblAsiento.setSize(lblAsiento.getPreferredSize());
        lblAsiento.setLocation(10,335);
        add(lblAsiento);

        lblOrigen = new JLabel("Origen:");
        lblOrigen.setSize(lblOrigen.getPreferredSize());
        lblOrigen.setLocation(10,365);
        add(lblOrigen);

        txtOrigen = new JTextField();
        txtOrigen.setSize(txt1.getSize());
        txtOrigen.setLocation(160, 365);
        add(txtOrigen);

        lblDestino = new JLabel("Destino:");
        lblDestino.setSize(lblDestino.getPreferredSize());
        lblDestino.setLocation(10,395);
        add(lblDestino);

        txtDestino = new JTextField();
        txtDestino.setSize(txt1.getSize());
        txtDestino.setLocation(160, 395);
        add(txtDestino);

        lblCosto = new JLabel("Costo:");
        lblCosto.setSize(lblCosto.getPreferredSize());
        lblCosto.setLocation(10,425);
        add(lblCosto);

        txtCosto = new JTextField();
        txtCosto.setSize(txt1.getSize());
        txtCosto.setLocation(160, 425);
        add(txtCosto);

        lblFechaSalida = new JLabel("Fecha Salida:");
        lblFechaSalida.setSize(lblFechaSalida.getPreferredSize());
        lblFechaSalida.setLocation(10, 455);
        add(lblFechaSalida);

        txtFechaSalida = new JTextField();
        txtFechaSalida.setSize(txt1.getSize());
        txtFechaSalida.setLocation(160, 455);
        add(txtFechaSalida);

        lblTipoPer = new JLabel("Tipo de persona:");
        lblTipoPer.setSize(lblTipoPer.getPreferredSize());
        lblTipoPer.setLocation(10,485);
        add(lblTipoPer);

        lblPlaca = new JLabel("Placa del avion:");
        lblPlaca.setSize(lblPlaca.getPreferredSize());
        lblPlaca.setLocation(10,515);
        add(lblPlaca);

        txtPlaca = new JTextField();
        txtPlaca.setSize(txt1.getSize());
        txtPlaca.setLocation(160, 515);
        add(txtPlaca);

        lbl5 = new JLabel("Subtotal: ");
        lbl5.setSize(lbl5.getPreferredSize());
        lbl5.setLocation(480,675);
        add(lbl5);

        lbl6 = new JLabel("IVA 12%: ");
        lbl6.setSize(lbl6.getPreferredSize());
        lbl6.setLocation(480,705);
        add(lbl6);

        lbl7 = new JLabel("Total: ");
        lbl7.setSize(lbl7.getPreferredSize());
        lbl7.setLocation(480,735);
        add(lbl7);

        btn1 = new JButton("Limpiar texto");
        btn1.setSize(btn1.getPreferredSize());
        btn1.setLocation(10, 675);
        add(btn1);

        btn2 = new JButton("Confirmar factura");
        btn2.setSize(btn2.getPreferredSize());
        btn2.setLocation(10, 705);
        add(btn2);

        btn3 = new JButton("Cancelar");
        btn3.setSize(btn3.getPreferredSize());
        btn3.setLocation(10, 735);
        add(btn3);

        txt2 = new JTextField();
        txt2.setSize(txt1.getSize());
        txt2.setLocation(160, 185);
        add(txt2);

        txt3 = new JTextField();
        txt3.setSize(txt1.getSize());
        txt3.setLocation(160, 215);
        add(txt3);

        txt4 = new JTextField();
        txt4.setSize(txt1.getSize());
        txt4.setLocation(160,245);
        add(txt4);

        //Textos del resto
        txt5 = new JTextField();
        txt5.setSize(txt1.getSize());
        txt5.setLocation(550,675);
        add(txt5);

        txt6 = new JTextField();
        txt6.setSize(txt1.getSize());
        txt6.setLocation(550,705);
        add(txt6);

        txt7 = new JTextField();
        txt7.setSize(txt1.getSize());
        txt7.setLocation(550,735);
        add(txt7);


        repaint();
    }

    public void llenarCombo(){
      //  List<Asiento> asientoList = new ArrayList<>();
    //    List<Vuelos> vuelosList = new ArrayList<>();
        String tiposPer[] = {"Seleccione una opcion","Tercera edad/Ninos", "Discapacitados"};

        comboTipoPersona = new JComboBox(tiposPer);
        comboTipoPersona.setSize(174,25);
        comboTipoPersona.setLocation(160,485);
        add(comboTipoPersona);
    }



}
