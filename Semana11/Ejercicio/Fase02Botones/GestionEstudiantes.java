package Semana11.Ejercicio.Fase02Botones;

import javax.swing.*;
import java.util.ArrayList;

public class GestionEstudiantes extends JFrame {

    private JTextField txtNombre;
    private JTextField txtEdad;
    private JButton btnAgregar;
    private JButton btnEliminar;
    private JList<Estudiante> listaVisual;

    private DefaultListModel<Estudiante> modelo;

    private ArrayList<Estudiante> lista;

    public GestionEstudiantes(){

        setTitle("Gestion Estudiantes");
        setSize(400,400);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        lista = new ArrayList<>();

        modelo = new DefaultListModel<>();

        txtNombre = new JTextField();
        txtNombre.setBounds(50,30,120,25);
        add(txtNombre);

        txtEdad = new JTextField();
        txtEdad.setBounds(200,30,120,25);
        add(txtEdad);

        btnAgregar = new JButton("Agregar");
        btnAgregar.setBounds(50,70,120,30);
        add(btnAgregar);

        btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(200,70,120,30);
        add(btnEliminar);

        listaVisual = new JList<>(modelo);
        JScrollPane sp = new JScrollPane(listaVisual);
        sp.setBounds(50,120,270,180);
        add(sp);

        //EVENTO AGREGAR
        btnAgregar.addActionListener(e -> agregar());

        //EVENTO ELIMINAR
        btnEliminar.addActionListener(e -> eliminar());

    }

    private void agregar(){

        String nom = txtNombre.getText();
        int edad = Integer.parseInt(txtEdad.getText());

        Estudiante est = new Estudiante(nom,edad);

        lista.add(est);
        modelo.addElement(est);

        txtNombre.setText("");
        txtEdad.setText("");
    }

    private void eliminar(){

        int pos = listaVisual.getSelectedIndex();

        if(pos != -1){
            lista.remove(pos);
            modelo.remove(pos);
        }else{
            JOptionPane.showMessageDialog(this,
                    "Seleccione un estudiante");
        }
    }

    public static void main(String[] args) {
        new GestionEstudiantes().setVisible(true);
    }
}