import java.io.IOException;
import java.util.Random;
import java.util.*;

public class MainClass {

    static int heghtOfField = 10;
    static int widthOfField = 10;


    public static void main(String[] args) {
        String[][] field = CreateField();
        Random rand = new Random();
        Snake snake = new Snake(rand.nextInt(9), rand.nextInt(9));
        snake.Up(field);
        while(true) {
            int currentInt = rand.nextInt(3);
            if(currentInt == 0) snake.Up(field);
            else if(currentInt == 1) snake.Right(field);
            else if(currentInt == 2) snake.Down(field);
            else if(currentInt == 3) snake.Left(field);
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


