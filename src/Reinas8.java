import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

class Reinas8 extends JFrame{   //columna -> || fila ^ 
    private JButton[][] bot=new JButton[8][8];//Crear una matriz de botones de 8 x 8
    private int[][] n=new int[8][8];//Crea una matriz de enteros 
    private int gan=0,bloq=0;
    private JMenuBar Barra; // variable de tipo menu bar 
    private JMenu Menu; //
    private JMenuItem reiniciar;// 

    public Reinas8(){ // 
        super("8 Reinas");//nuevo menu se llama 8 reinas
	setSize(600,600);
	setLocation(300,100);
	setLayout(new GridLayout(8,8));// GridLayout para colocar a las reinas
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                bot[i][j]=new JButton("");
                bot[i][j].setToolTipText("");
                if(i%2==0){// 
                    if(j%2==0) bot[i][j].setBackground(Color.white);// si el boton colocado es blanco
                    else bot[i][j].setBackground(Color.gray);// el siguiente  gris
                }
                else{
                    if(j%2!=0) bot[i][j].setBackground(Color.white);// entra el boton blanco
                    else bot[i][j].setBackground(Color.gray); // boton siguiente es gris
                }
                add(bot[i][j]);
                n[i][j]=0;
            }
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 
        Eventos();

        Barra = new JMenuBar();// crear Barra a partir de JMenu Bar
        Menu = new JMenu();// Crea un nuevo menu a partir de meu
        Menu.setMnemonic('M');//asigna la letra r para reiniciar con letra r del teclado
        Menu.setText("Menu");//Asigna nombre al menu

        Barra.add(Menu);//añadir el menu al jmenubar

        reiniciar=new JMenuItem();//se crea un nuevo item
        reiniciar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, 0));//
        reiniciar.setMnemonic('R');// Reiniciar con la tecla R del teclado
        reiniciar.setText("Reiniciar");// reiniciar con click en el menu
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                for(int i=0;i<8;i++){
                    for(int j=0;j<8;j++){
                        bot[i][j].setIcon(new ImageIcon(""));
                        bot[i][j].setToolTipText("");
                        n[i][j]=0;
                        gan=0;
                        bloq=0;
                    }
                }
            }
        });
        Menu.add(reiniciar);//añadir reiniciar a menu

     

        setJMenuBar(Barra);
        setVisible(true);
    }

    public static void main(String args[]){
        new Reinas8();
    }

    private void Eventos(){       //agregar eventos a botones creados

        bot[0][0].addActionListener(new ActionListener(){//boton en la posicion cero cero
            public void actionPerformed(ActionEvent e){// asiganar evento de action listener y action event.
                determinar(0,0);
            }
        });

        bot[0][1].addActionListener(new ActionListener(){//boton en la posicion cero uno
            public void actionPerformed(ActionEvent e){// asignar eventos de action listener y action event.
                determinar(0,1);
            }
        });

        bot[0][2].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(0,2);
            }
        });

        bot[0][3].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(0,3);
            }
        });

        bot[0][4].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(0,4);
            }
        });

        bot[0][5].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(0,5);
            }
        });

        bot[0][6].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(0,6);
            }
        });

        bot[0][7].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(0,7);
            }
        });

        bot[1][0].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(1,0);
            }
        });

        bot[1][1].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(1,1);
            }
        });

        bot[1][2].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(1,2);
            }
        });

        bot[1][3].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(1,3);
            }
        });

        bot[1][4].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(1,4);
            }
        });

        bot[1][5].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(1,5);
            }
        });

        bot[1][6].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(1,6);
            }
        });

        bot[1][7].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(1,7);
            }
        });

        bot[2][0].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(2,0);
            }
        });

        bot[2][1].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(2,1);
            }
        });

        bot[2][2].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(2,2);
            }
        });

        bot[2][3].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(2,3);
            }
        });

        bot[2][4].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(2,4);
            }
        });

        bot[2][5].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(2,5);
            }
        });

        bot[2][6].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(2,6);
            }
        });

        bot[2][7].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(2,7);
            }
        });

        bot[3][0].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(3,0);
            }
        });

        bot[3][1].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(3,1);
            }
        });

        bot[3][2].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(3,2);
            }
        });

        bot[3][3].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(3,3);
            }
        });

        bot[3][4].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(3,4);
            }
        });

        bot[3][5].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(3,5);
            }
        });

        bot[3][6].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(3,6);
            }
        });

        bot[3][7].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(3,7);
            }
        });

       bot[4][0].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(4,0);
            }
        });

        bot[4][1].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(4,1);
            }
        });

        bot[4][2].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(4,2);
            }
        }); 

        bot[4][3].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(4,3);
            }
        });

        bot[4][4].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(4,4);
            }
        });

        bot[4][5].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(4,5);
            }
        });

        bot[4][6].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(4,6);
            }
        });

        bot[4][7].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(4,7);
            }
        });

        bot[5][0].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(5,0);
            }
        });

        bot[5][1].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(5,1);
            }
        });

        bot[5][2].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(5,2);
            }
        });

        bot[5][3].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(5,3);
            }
        });

        bot[5][4].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(5,4);
            }
        });

        bot[5][5].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(5,5);
            }
        });

        bot[5][6].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(5,6);
            }
        });

        bot[5][7].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(5,7);
            }
        });

        bot[6][0].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(6,0);
            }
        });

        bot[6][1].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(6,1);
            }
        });

        bot[6][2].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(6,2);
            }
        });

        bot[6][3].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(6,3);
            }
        });

        bot[6][4].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(6,4);
            }
        });

        bot[6][5].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(6,5);
            }
        });

        bot[6][6].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(6,6);
            }
        });

        bot[6][7].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(6,7);
            }
        });

        bot[7][0].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(7,0);
            }
        });

        bot[7][1].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(7,1);
            }
        });

        bot[7][2].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(7,2);
            }
        });

        bot[7][3].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(7,3);
            }
        });

        bot[7][4].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(7,4);
            }
        });

        bot[7][5].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(7,5);
            }
        });

        bot[7][6].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(7,6);
            }
        });

        bot[7][7].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                determinar(7,7);
            }
        });

        
    }

    public void determinar(int col,int fil){
        int c=col;
        int f=fil;
        int aux=0;

        //diagonal de arriba derecha
        while(true){
            col=col-1;
            fil=fil+1;
            if(col<0 || fil>7){
                aux=aux+1;
                break;
            }
            if(n[col][fil]==1){   
                break;
            }            
        }

        //diagonal de arriba izquierda
        col=c;
        fil=f;
        while(true){
            col=col-1;
            fil=fil-1;
            if(col<0 || fil<0){
                aux=aux+1;
                break;
            }
            if(n[col][fil]==1){
                break;
            }
        }

        //diagonal de abajo derecha
        col=c;
        fil=f;
        while(true){
            col=col+1;
            fil=fil+1;
            if(col>7 || fil>7){
                aux=aux+1;
                break;
            }
            if(n[col][fil]==1){
                break;
            }
        }

        //diagonal de abajo izquierda
        col=c;
        fil=f;
        while(true){
            col=col+1;
            fil=fil-1;
            if(col>7 || fil<0){
                aux=aux+1;
                break;
            }
            if(n[col][fil]==1){
                break;
            }
        }

        //derecha de la reina
        col=c;
        fil=f;
        while(true){
            fil=fil+1;
            if(fil>7){
                aux=aux+1;
                break;
            }
            if(n[col][fil]==1){
                break;
            }
        }

        //izquierda de la reina
        col=c;
        fil=f;
        while(true){
            fil=fil-1;
            if(fil<0){
                aux=aux+1;
                break;
            }
            if(n[col][fil]==1){
                break;
            }
        }

        //arriba de donde esta la reina
        col=c;
        fil=f;
        while(true){
            col=col-1;
            if(col<0){
                aux=aux+1;
                break;
            }
            if(n[col][fil]==1){
                break;
            }
        }

        //abajo de la reina
        col=c;
        fil=f;
        while(true){
            col=col+1;
            if(col>7){
                aux=aux+1;
                break;
            }
            if(n[col][fil]==1){
                break;
            }
        }
        if(bloq==0){
            if(n[c][f]==1){
                bot[c][f].setIcon(new ImageIcon(""));
                bot[c][f].setToolTipText("¿Colocar Reina?");
                n[c][f]=0;
                gan=gan-1;
            }
            else {
                if(aux==8){
                    bot[c][f].setIcon(new ImageIcon("reina.png"));
                    bot[c][f].setToolTipText("¿Quitar Reina?");
                    n[c][f]=1;
                    aux=0;
                    gan=gan+1;
                    if(gan==8){
                        JOptionPane.showMessageDialog(null,"¡¡ :) RESUELTO!!");
                        bloq=1;
                        for(int i=0;i<8;i++){
                            for(int j=0;j<8;j++){
                                bot[i][j].setToolTipText("Reinicie el juego Para volver a jugar ");
                            }
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"Esta Reina ataca si se coloca aqui!!");
                    aux=0;
                }
            }
        }
    }
}