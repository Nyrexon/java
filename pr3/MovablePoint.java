package nyrex;

public class MovablePoint implements Movable{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "Point's data: x = " + this.x + ", y = " + this.y + ", xSpeed = " + xSpeed + ", ySpeed = " + ySpeed;
    }
    @Override
    public void moveDown() {this.y -= this.ySpeed;}
    @Override
    public void moveUp() {this.y += this.ySpeed;}
    @Override
    public void moveLeft() {this.x -= this.xSpeed;}
    @Override
    public void moveRight() {this.x += this.xSpeed;}
}
