
package filmes;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Filmes extends JFrame {
    JLabel sel;
    JRadioButton aca, com, comr, fic, ro, sus, ter;
    ButtonGroup grupo;
    JButton ok, cancelar;
    
        public Filmes (){
            super("Filmes");
            Container tela = getContentPane();
            setLayout(null);
            
            sel = new JLabel("Seleção de Filmes");
            
            aca = new JRadioButton ("Ação");
            com = new JRadioButton ("Comédia");
            comr = new JRadioButton ("Comédia Romântica");
            fic = new JRadioButton ("Ficção");
            ro = new JRadioButton ("Romance");
            sus = new JRadioButton ("Suspense");
            ter = new JRadioButton ("Terror");
            
            ok = new JButton ("OK");
            cancelar = new JButton("Cancelar");
            
            grupo = new ButtonGroup();
            grupo.add(aca);
            grupo.add(com);
            grupo.add(comr);
            grupo.add(fic);
            grupo.add(ro);
            grupo.add(sus);
            grupo.add(ter);
            
            sel.setBounds(135,20,150,20);
            
            aca.setBounds(50,80,80,20);
            com.setBounds(50,110,80,20);
            comr.setBounds(50,140,150,20);
            fic.setBounds(50,170,80,20);
            ro.setBounds(50,200,80,20);
            sus.setBounds(50,230,150,20);
            ter.setBounds(50,260,80,20);
            
            ok.setBounds(80,290,90,20);
            cancelar.setBounds(200,290,120,20);
            
            tela.add(sel);
            tela.add(aca); tela.add(com);
            tela.add(comr); tela.add(fic);
            tela.add(ro); tela.add(sus);
            tela.add(ter);
            tela.add(ok); tela.add(cancelar);
            
            setVisible(true);
            setSize(400,400);
           
        }
    public static void main(String[] args) {
        Filmes app = new Filmes();
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
