import java.awt.*;

public class Rectangle extends Shape{
    // extends significa herança

    // Attributes
    private int width;
    private int height;


    // Constructors
    public Rectangle(){
        this.width = super.r.nextInt(91)+10; // super refere-se a classe pai
        this.height = super.r.nextInt(91)+10;

    }

    public Rectangle(int width, int height) {
        this.width=width;
        this.height=height;
    }

    public Rectangle(Color color, int x, int y, int speedX, int speedY, int width, int height) {
        super(color, x, y, speedX, speedY);
        this.width=width;
        this.height=height;

    }

    // Methods
    public void draw(Graphics g){
        g.setColor(super.getColor()); // pega a cor do pai
        g.fillRect(super.getX(), super.getY(), this.width, this.height);
    }

    @Override
    public void move(int screenWidth, int screenHeight){
        super.move(screenWidth, screenHeight);

        // colision Treatment
        if(super.getX()<0|| super.getX()+this.width>screenWidth)
            super.setSpeedX(super.getX()*-1);

        if (super.getY()<0|| super.getY()+this.height>screenWidth)
            super.setSpeedY(super.getX()*-1);

    }

    // Getters & Setters

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    // toString()


    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}'+
                super.toString();
    }
}