/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.rreyesc.a11;
import java.awt.*;
/**
 *
 * @author roxana
 */
public class ventana2 extends Frame{
 
    //Atributos: 5 botones
    private final Button btnNorte,btnSur,btnEste,btnOeste,btnCentro;
    //Constructor
    @SuppressWarnings("OverridableMethodCallInConstructor")
    
public ventana2 (){
        super("Esta es una ventana de prueba");
        setLayout(new BorderLayout());
        
        btnNorte = new Button("Soy el botón 1");
        add (btnNorte,BorderLayout.NORTH);
        
        btnSur = new Button ("Soy el botón 2");
        add (btnSur,BorderLayout.SOUTH);
        
        btnEste = new Button ("Soy el botón 3");
        add (btnEste,BorderLayout.EAST);
        
        btnOeste = new Button ("Soy el botón 4");
        add (btnOeste,BorderLayout.WEST);
        
        btnCentro = new Button ("Gemas gratis");
        add (btnCentro,BorderLayout.CENTER);
        
        setSize(800,600);
        setVisible(true);
    
    }
    
}
    

