public class Snake {

    private int x;
    private int y;

    Snake(int PositionX, int PositioneY){
        this.x = PositionX;
        this.y = PositioneY;
    }

    void Up(String[][] field){
        if(this.y<10) {
            field[this.y][this.x - 1] = "#";
            field[this.y][this.x] = " ";
        }
        MainClass.PrintField(field);
    }

    void Down(String[][] field){
        if (this.y < 9) {
            field[this.y][this.x+1] = "#";
            field[this.y][this.x] = " ";
        }
        MainClass.PrintField(field);
    }

    void Left(String[][] field){
        if(this.x<10) {
            field[this.y - 1][this.x] = "#";
            field[this.y][this.x] = " ";
        }
        MainClass.PrintField(field);
    }

    void Right(String[][] field){
        if(this.x<9) {
            field[this.y + 1][this.x] = "#";
            field[this.y][this.x] = " ";
        }
        MainClass.PrintField(field);
    }

}
