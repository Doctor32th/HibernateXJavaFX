/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Hibernate_FX;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 * FXML Controller class
 *
 * @author Doctor32
 */
public class PrimaryController implements Initializable {

    @FXML
    private TextField txtUsuario;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private Button btnAceptar;
    @FXML
    private Button btnCancelar;
    @FXML
    private Hyperlink enlace;
    @FXML
    private CheckBox mantenerAbierta;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        //Llamamos a la clase HibernateUtil para que inicie un Session
        //Factory
        Session s = HibernateUtil.getSessionFactory().openSession();
        
        /*Query q = s.createQuery("FROM Usuario");
        q.list().forEach((e) -> System.out.println(e));*/
        
        
    }    

    @FXML
    private void aceptar(ActionEvent event) {
        System.out.println("Botón aceptar");
        System.out.println( txtUsuario.getText() );
        System.out.println( txtPassword.getText() );
        
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Aceptar");
        alerta.setHeaderText("Nuevo login");
        alerta.setContentText("El usuario "+txtUsuario.getText() 
                + " con contraseña "+txtPassword.getText()+" ha iniciado sesión.");
        alerta.showAndWait();
    }

    @FXML
    private void cancelar(ActionEvent event) {
        System.out.println("Botón cancelar");
    }

    @FXML
    private void recordar(ActionEvent event) {
        System.out.println("Enlace");
    }

    @FXML
    private void mantener(ActionEvent event) {
        System.out.println("Mantener abierta la sesión");
        System.out.println( mantenerAbierta.isSelected() );
    }
    
}
