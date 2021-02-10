public class Snake {

    public int x;
    public int y;

    Snake(int PositionX, int PositioneY){
        this.x = PositionX;
        this.y = PositioneY;
    }

    void Up(String[][] field){
        if(this.x<9 && this.x>0) {
            field[this.y][this.x - 1] = "#";
            field[this.y][this.x] = " ";
            this.x = this.x-1;
        }
    }

    void Down(String[][] field){
        if (this.x < 9 && this.x>0) {
            field[this.y][this.x+1] = "#";
            field[this.y][this.x] = " ";
            this.x = this.x+1;
        }
    }

    void Left(String[][] field){
        if(this.y<9 && this.y>0) {
            field[this.y - 1][this.x] = "#";
            field[this.y][this.x] = " ";
            this.y=this.y-1;
        }
    }

    void Right(String[][] field){
        if(this.y<9 && this.y>0) {
            field[this.y + 1][this.x] = "#";
            field[this.y][this.x] = " ";
            this.y=this.y+1;
        }
    }

}
