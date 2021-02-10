import java.io.IOException;
import java.util.Random;
import java.util.*;

public class MainClass {

    static int heghtOfField = 10;
    static int widthOfField = 10;


    public static void main(String[] args) {
        String[][] field = CreateField();
        Random rand = new Random();
        Snake snake = new Snake(rand.nextInt(8), rand.nextInt(8));
        field[snake.x][snake.y] = "#";
        int fps = 0, fpslimit = 10;
        while(true) {
            if(fps==fpslimit) {
                int currentInt = rand.nextInt(4);
                if (currentInt == 1) snake.Up(field);
                else if (currentInt == 2) snake.Right(field);
                else if (currentInt == 3) snake.Down(field);
                else if (currentInt == 4) snake.Left(field);
                fps=0;
            }
            PrintField(field);
            fps++;
        }

    }


    public static String[][] CreateField(){
        String[][] field = new String[heghtOfField][widthOfField];
        for(int i=0; i<heghtOfField; i++){
            for(int j=0; j<widthOfField; j++){
                field[i][j]=" ";
            }
        }
        return field;
    }

    public static void PrintField(String[][] field){
        for (int i=0;i<heghtOfField;i++){
            for (int j=0;j<widthOfField;j++){
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }

}


