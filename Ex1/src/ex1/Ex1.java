
package ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex1 extends JFrame{
    JLabel n1, n2, re;
    JRadioButton so, sub, mul, div, res;
    ButtonGroup grupo;
    JTextField t1, t2, t3;
    JButton cal;
    
    public Ex1(){
        super("Calculadora");
        Container tela = getContentPane();
        setLayout(null);
        
        n1 = new JLabel ("N1");
        n2 = new JLabel ("N2");
        re = new JLabel ("Resultado");
        
        so = new JRadioButton ("Soma(+)");
        sub = new JRadioButton ("Subtração(-)");
        mul = new JRadioButton ("Multiplicação(*)");
        div = new JRadioButton ("Divisão(/)");
        res = new JRadioButton ("Resto(%)");
        
        grupo = new ButtonGroup();
        grupo.add(so);
        grupo.add(sub);
        grupo.add(mul);
        grupo.add(div);
        grupo.add(res);
        grupo.add(so);
        
        t1 = new JTextField ("");
        t2 = new JTextField ("");
        t3 = new JTextField ("");
        
        cal = new JButton ("Calcular");
        
        n1.setBounds(50,20,150,20);
        n2.setBounds(50,60,150,20);
        
        so.setBounds(50,100,90,20);
        sub.setBounds(50,140,150,20);
        mul.setBounds(50,180,150,20);
        div.setBounds(50,220,150,20);
        res.setBounds(50,260,150,20);
        re.setBounds(50,300,150,20);
        
        t1.setBounds(90,20,200,20);
        t2.setBounds(90,60,200,20);
        t3.setBounds(110,300,200,20);
        
        cal.setBounds(160,100,110,20);
        
        tela.add(cal);
        cal.setVisible(true);
        
        cal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(so.isSelected() == true){
                    int n1, n2, r;
                    n1 = Integer.parseInt(t1.getText());
                    n2 = Integer.parseInt(t2.getText());
                    
                   r = n1 + n2;
                   t3.setText("" +r);
                }
                if(sub.isSelected() == true){
                    int n1, n2, r;
                    n1 = Integer.parseInt(t1.getText());
                    n2 = Integer.parseInt(t2.getText());
                    
                   r = n1 - n2;
                   t3.setText("" +r);
                }
                if(mul.isSelected() == true){
                    double n1, n2, r;
                    n1 = Double.parseDouble(t1.getText());
                    n2 = Double.parseDouble(t2.getText());
                    
                   r = n1 * n2;
                   t3.setText("" +r);
                }
                if(div.isSelected() == true){
                    double n1, n2, r;
                    n1 =  Double.parseDouble(t1.getText());
                    n2 =  Double.parseDouble(t2.getText());
                    
                   r = n1 / n2;
                   t3.setText("" +r);
                }
                if(res.isSelected() == true){
                    int n1, n2, r;
                    n1 = Integer.parseInt(t1.getText());
                    n2 = Integer.parseInt(t2.getText());
                    
                   r = n1 % n2;
                   t3.setText("" +r);
                }
            }
        });
        
        tela.add(n1); tela.add(n2);
        tela.add(so); tela.add(sub);
        tela.add(mul); tela.add(div);
        tela.add(res); tela.add(re);
        tela.add(t1); tela.add(t2);
        tela.add(t3); 
        tela.add(cal);
        
        setSize(400,400);
        setVisible(true);
    }

    public static void main(String[] args) {
       Ex1 app = new Ex1();
       app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
