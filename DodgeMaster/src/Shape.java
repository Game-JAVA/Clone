import java.awt.*;

public abstract class Shape {
    // Attributes
    private int x;
    private int y;
    private int speedX;
    private int speedY;

    // Constructors {
        // Position Constructor
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
        this.speedX = 0;
        this.speedY = 0;
    }
    // }

    // Methods {
    public void move() {
        this.x += speedX;
        this.y += speedY;
    }
        // Signatures to handle collision treatment with the window border
    protected void move(int screenWidth, int screenHeight) {
        this.x += speedX;
        this.y += speedY;
    }

    public abstract void draw(Graphics g);
    // }

    // Getters and Setters
    public int getX() {return x;}
    public int getY() {return y;}
    public int getSpeedX() {return speedX;}
    public int getSpeedY() {return speedY;}

    public void setX(int posX) {this.x = posX;}
    public void setY(int posY) {this.y = posY;}
    public void setSpeedX(int speedX) {this.speedX = speedX;}
    public void setSpeedY(int speedY) {this.speedY = speedY;}

    //ToString
    @Override
    public String toString() {
        return "Shape{" +
                "posX=" + x +
                ", posY=" + y +
                ", speedX=" + speedX +
                ", speedY=" + speedY +
                '}';
    }
}