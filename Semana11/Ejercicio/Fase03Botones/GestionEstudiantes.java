package Semana11.Ejercicio.Fase03Botones;

import javax.swing.*;
import java.util.ArrayList;

public class GestionEstudiantes extends JFrame {  //Mi clase es un ventana por que "JFrame" es una ventana

    private JTextField txtNombre;
    private JTextField txtEdad;
    private JButton btnAgregar;          //"JButton" Estoy creando una variable botón
    private JButton btnEliminar;
    private JButton btnEditar;

    private JList<Estudiante> listaVisual;        //Creas objeto, aca se conepta con @Override de la clase "estudiante"
    private DefaultListModel<Estudiante> modelo;  //modelo visual de la lista osea el puente entre Array y JList

    private ArrayList<Estudiante> lista;

    public GestionEstudiantes(){

        setTitle("Gestion Estudiantes");
        setSize(400,420);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        lista = new ArrayList<>();
        modelo = new DefaultListModel<>();

        txtNombre = new JTextField();
        txtNombre.setBounds(40,30,130,25);
        add(txtNombre);

        txtEdad = new JTextField();
        txtEdad.setBounds(200,30,130,25);
        add(txtEdad);

        btnAgregar = new JButton("Agregar");             //Aca se crea la ventana
        btnAgregar.setBounds(40,70,90,30);
        add(btnAgregar);                                      //Aca se agrega a la ventana

        btnEditar = new JButton("Editar");
        btnEditar.setBounds(145,70,90,30);
        add(btnEditar);

        btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(250,70,90,30);
        add(btnEliminar);

        listaVisual = new JList<>(modelo);
        JScrollPane sp = new JScrollPane(listaVisual);
        sp.setBounds(40,120,300,220);
        add(sp);

        //EVENTOS
        btnAgregar.addActionListener(e -> agregar());       //Cuando el usuario haga click → llama al método agregar()
        btnEliminar.addActionListener(e -> eliminar());
        btnEditar.addActionListener(e -> editar());

        listaVisual.addListSelectionListener(e -> cargarCampos());
    }

    private void agregar(){

        try{  //"try catch" sirve para que el codigo no se rompa, si el usuario pone mal algo mostrara mensaje de "invalido"

            String nom = txtNombre.getText();               //Trae lo que el usuario escribió en la caja
            int edad = Integer.parseInt(txtEdad.getText());

            Estudiante est = new Estudiante(nom,edad);      //Crea objeto

            lista.add(est);                                 //Garda en el ArrayList
            modelo.addElement(est);                         //Lo muestra en la lista visual

            txtNombre.setText("");
            txtEdad.setText("");

        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Ingrese edad válida");
        }
    }

    private void eliminar(){

        int pos = listaVisual.getSelectedIndex();

        if(pos != -1){
            lista.remove(pos);
            modelo.remove(pos);
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione estudiante");
        }
    }

    private void editar(){

        try{

            int pos = listaVisual.getSelectedIndex();

            if(pos != -1){

                String nom = txtNombre.getText();
                int edad = Integer.parseInt(txtEdad.getText());

                Estudiante est = lista.get(pos);

                est.setNombre(nom);
                est.setEdad(edad);

                modelo.set(pos, est);

            }else{
                JOptionPane.showMessageDialog(this,
                        "Seleccione estudiante");
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(this,
                    "Datos incorrectos");
        }
    }

    private void cargarCampos(){

        int pos = listaVisual.getSelectedIndex();

        if(pos != -1){

            Estudiante est = lista.get(pos);

            txtNombre.setText(est.getNombre());
            txtEdad.setText(String.valueOf(est.getEdad()));
        }
    }

    public static void main(String[] args) {
        new GestionEstudiantes().setVisible(true);
    }
}