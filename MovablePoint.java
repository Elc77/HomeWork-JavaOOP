public class MovablePoint implements Movable{
    private int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString(){
        return "("+x+","+y+"),speed=("+x+","+y+")";
    }

    public void moveUp(){
        y -= ySpeed;
    }
    public void moveDown(){
        y += ySpeed;
    }
    public void moveRight(){
        x += xSpeed;
    }
    public void moveLeft(){
        x -= xSpeed;
    }

}