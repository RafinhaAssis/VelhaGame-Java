
package Model;


import static View.TelaGame_GUI.nono;
import static View.TelaGame_GUI.oitavo;
import static View.TelaGame_GUI.primeiro;
import java.util.Random;
import static View.TelaGame_GUI.segundo;
import static View.TelaGame_GUI.terceiro;
import static View.TelaGame_GUI.quarto;
import static View.TelaGame_GUI.quinto;
import static View.TelaGame_GUI.setimo;
import static View.TelaGame_GUI.sexto;
import View.Vencedor_GUI;
import static View.Vencedor_GUI.texto;
import static View.TelaGame_GUI.O;
import static View.TelaGame_GUI.X;
import static View.TelaGame_GUI.velha;

public class Funcoes {
    private final String Tabuleiro[][] = new String[3][3];
    private int i;
    private int j;
    private String marc=primeiroJogador();
    private int placar[] = new int[3];
   
    public String[][] getTabuleiro(){
        return this.Tabuleiro;
    }
    public void setI(int i){
        this.i = i;
    }
    public int getI(){
        return this.i;
    }
    public void setJ(int j){
        this.j = j;
    }
    public int getJ(){
        return this.j;
    }
     public void setMarc(){
        this.marc = primeiroJogador();
    }
    public String getMarc(){
        return this.marc;
    }
    
    private String primeiroJogador(){
        Random random = new Random();
        int numero = random.nextInt(2);
        
        if(numero == 0) {
            return "X";
        } 
        else {
            return "O";
        }
    }
    
    private void TrocaMarcador(){
        if(marc.equals("X")){
            marc = "O";
        }
        else{
            marc = "X";
        }
    }
    
    private void colocaMarcador(){
        Tabuleiro[i][j] = marc;
    }
    
    private boolean verificaEspacoLivre(){
        return (Tabuleiro[this.i][this.j]==null);
    }
    
    private boolean empate(){
            byte pontos = 0;
            for(i=0; i<3;i++){
            for(j=0;j<3;j++){
                if(Tabuleiro[i][j]!=null){
                    pontos++;
                }
            }
            
        }
        return (pontos==9);
        
    }
    
    private boolean Vencedor(){
        for(i=0; i<3;i++){
            for(j=0;j<3;j++){
                if(Tabuleiro[i][j]==null){
                    Tabuleiro[i][j]=" ";
                }
            } 
        }
        
    
            if(Tabuleiro[0][0].equals(marc) && Tabuleiro[0][1].equals(marc) && Tabuleiro[0][2].equals(marc)||
               Tabuleiro[1][0].equals(marc) && Tabuleiro[1][1].equals(marc) && Tabuleiro[1][2].equals(marc)|| 
               Tabuleiro[2][0].equals(marc) && Tabuleiro[2][1].equals(marc) && Tabuleiro[2][2].equals(marc)||
               Tabuleiro[0][0].equals(marc) && Tabuleiro[1][0].equals(marc) && Tabuleiro[2][0].equals(marc)||
               Tabuleiro[0][1].equals(marc) && Tabuleiro[1][1].equals(marc) && Tabuleiro[2][1].equals(marc)||
               Tabuleiro[0][2].equals(marc) && Tabuleiro[1][2].equals(marc) && Tabuleiro[2][2].equals(marc)||
               Tabuleiro[0][0].equals(marc) && Tabuleiro[1][1].equals(marc) && Tabuleiro[2][2].equals(marc)||
               Tabuleiro[0][2].equals(marc) && Tabuleiro[1][1].equals(marc) && Tabuleiro[2][0].equals(marc)
                    ){
                return true;
            }
        
            for(i=0; i<3;i++){
            for(j=0;j<3;j++){
                if(" ".equals(Tabuleiro[i][j])){
                    Tabuleiro[i][j]=null;
                }
            } 
        }
       
       return false;
    }
    
    
    private void mostraTela(){
        quarto.setText(Tabuleiro[0][0]);
        segundo.setText(Tabuleiro[0][1]);
        terceiro.setText(Tabuleiro[0][2]);
        primeiro.setText(Tabuleiro[1][0]);
        quinto.setText(Tabuleiro[1][1]);
        sexto.setText(Tabuleiro[1][2]);
        setimo.setText(Tabuleiro[2][0]);
        oitavo.setText(Tabuleiro[2][1]);
        nono.setText(Tabuleiro[2][2]);
        
    }
    
    
    public void refresh(){
        for(i=0; i<3;i++){
            for(j=0;j<3;j++){
                Tabuleiro[i][j]=null;
            } 
        }
        mostraTela();
    }
    
    private void placar(String a){
        if(a.equals("X")){
            placar[0]++;
            String str = Integer.toString(placar[0]);
            X.setText(str);
        }
        else if(a.equals("O")){
            placar[2]++;
            String str = Integer.toString(placar[2]);
            O.setText(str);
        }
        else{
            placar[1]++;
            String str = Integer.toString(placar[1]);
            velha.setText(str);
        }
    }
    public void jogo(){
        if(verificaEspacoLivre()){
            colocaMarcador();
            mostraTela();
            if(Vencedor()){
                placar(marc);
                new Vencedor_GUI().setVisible(true);
                texto.setText(marc+"   TAKES THE ROUND");
            }
            else{
                if(empate()){
                    placar(" ");
                    new Vencedor_GUI().setVisible(true);
                    texto.setText("X   Empataram   O");
            }else{
                  //nada  
        }
        }  
        }
        TrocaMarcador();
        View.TelaGame_GUI.vez_txt.setText(getMarc());
    }
       

    

}
