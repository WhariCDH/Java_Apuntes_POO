package Semana11.Ejercicio.Fase04Botones;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class SistemaBanco extends JFrame {

    JTextField txtCuenta, txtNombre, txtSaldo, txtRetiro;
    JButton btnAgregar, btnRetirar, btnReporte;
    JList<Cliente> listaVisual;
    DefaultListModel<Cliente> modelo;

    ArrayList<Cliente> lista = new ArrayList<>();

    public SistemaBanco() {

        setTitle("Sistema Bancario");
        setSize(400,500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(new JLabel("Cuenta"));
        txtCuenta = new JTextField(10);
        add(txtCuenta);

        add(new JLabel("Nombre"));
        txtNombre = new JTextField(10);
        add(txtNombre);

        add(new JLabel("Saldo"));
        txtSaldo = new JTextField(10);
        add(txtSaldo);

        btnAgregar = new JButton("Agregar Cliente");
        add(btnAgregar);

        add(new JLabel("Monto Retiro"));
        txtRetiro = new JTextField(10);
        add(txtRetiro);

        btnRetirar = new JButton("Retirar");
        add(btnRetirar);

        btnReporte = new JButton("Reporte Total");
        add(btnReporte);

        modelo = new DefaultListModel<>();
        listaVisual = new JList<>(modelo);
        add(new JScrollPane(listaVisual));

        // EVENTOS
        btnAgregar.addActionListener(e -> agregar());
        btnRetirar.addActionListener(e -> retirar());
        btnReporte.addActionListener(e -> reporte());

    }

    void agregar() {
        try {
            String c = txtCuenta.getText();
            String n = txtNombre.getText();
            double s = Double.parseDouble(txtSaldo.getText());

            Cliente cli = new Cliente(c,n,s);

            lista.add(cli);
            modelo.addElement(cli);

            JOptionPane.showMessageDialog(this,"Cliente agregado");

        } catch(Exception e){
            JOptionPane.showMessageDialog(this,"Error datos");
        }
    }

    void retirar() {
        int pos = listaVisual.getSelectedIndex();

        if(pos == -1){
            JOptionPane.showMessageDialog(this,"Seleccione cliente");
            return;
        }

        try{
            double m = Double.parseDouble(txtRetiro.getText());

            Cliente cli = lista.get(pos);
            cli.retirar(m);

            modelo.set(pos, cli);

        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Error monto");
        }
    }

    void reporte(){
        double total = 0;

        for(Cliente c : lista){
            total += c.getSaldo();
        }

        JOptionPane.showMessageDialog(this,"Total dinero banco: " + total);
    }

    public static void main(String[] args) {
        new SistemaBanco().setVisible(true);
    }
}