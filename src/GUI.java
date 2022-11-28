import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class GUI extends JPanel{

    //ChessBoard board;
    //Piece[] pieces;

    GUI(){
        // board = new ChessBoard();
        // pieces = new Piece[16];
        
        // //create other components of the GUI
    }

    @Override
    public void paintComponent(Graphics g){
        // setBackground(Color.white);
        // board.paintBoard(g);
        // //this.paintPieces(g);
    }

    public void createStartingPieces(){

        // for(int i = 0; i < 8; i++){
        //     pieces[i] = new Piece(board.getSquare(i, 1));
        // }
    }

    public void paintPieces(Graphics g){

        // for(int i = 0; i < 8; i++){
        //     pieces[i].paint(g);
        // }
    }
}