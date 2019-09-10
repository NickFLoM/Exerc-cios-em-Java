
package ex2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.*;
import javax.swing.text.*;

public class Ex2 extends JFrame {
    JLabel cep, tel, cpf, data;
    JFormattedTextField ficep, fitel, ficpf, fidata;
    MaskFormatter mascacep, mascatel, mascacpf, mascadata;
    JButton enviar;
    
    public Ex2(){
        super("Cadastro");
        Container tela = getContentPane();
        setLayout(null);
        
        cep = new JLabel("CEP");
        tel = new JLabel("Telefone");
        cpf = new JLabel("CPF");
        data = new JLabel("Data");
        
        enviar = new JButton ("Enviar");
        
        try{
        mascacep = new MaskFormatter ("#####-###");
        mascatel = new MaskFormatter ("(##)####-#####");
        mascacpf = new MaskFormatter ("#########-##");
        mascadata = new MaskFormatter ("##/##/####");
        mascacep.setPlaceholderCharacter('_');
        mascatel.setPlaceholderCharacter('_');
        mascacpf.setPlaceholderCharacter('_');
        mascadata.setPlaceholderCharacter('_');
        }catch(ParseException expc){}
        
        ficep = new JFormattedTextField(mascacep);
        fitel = new JFormattedTextField(mascatel);
        ficpf = new JFormattedTextField(mascacpf);
        fidata = new JFormattedTextField(mascadata);
        
        enviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 String cep1, te1, cpf1, data1;
                 cep1 =  (ficep.getText().toString());
                 te1 =  (fitel.getText().toString());
                 cpf1 =  (ficpf.getText().toString());
                 data1 = (fidata.getText().toString());
                 
                 JOptionPane.showMessageDialog(null,"Cep: " + cep1+ "\n"+
                                "Telefone: " + te1 + 
                                 "\n"+"CPF: " +cpf1+
                                  "\n "+"Data de nascimento: "+ data1);
                         
            
            }
        });
        
        enviar.setBounds(100,180,100,20);
        cep.setBounds(50,20,80,20);
        tel.setBounds(50,60,80,20);
        cpf.setBounds(50,100,80,20);
        data.setBounds(50,140,80,20);
        ficep.setBounds(120,20,150,20);
        fitel.setBounds(120,60,150,20);
        ficpf.setBounds(120,100,150,20);
        fidata.setBounds(120,140,150,20);
    
        tela.add(cep);
        tela.add(tel);
        tela.add(cpf);
        tela.add(data);
        tela.add(ficep);
        tela.add(fitel);
        tela.add(ficpf);
        tela.add(fidata);
        tela.add(enviar);

        setSize(350,300);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        Ex2 app = new Ex2();
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
     
    }
    
}
