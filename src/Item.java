import javax.swing.*;
import java.awt.*;

public class Item extends JButton {
    private int id;
    private int positionX;
    private int positionY;
    private Color color;
    private Dimension dimension = new Dimension();


    public Item(int positionX, int positionY, Color color) {
        dimension.setSize(80, 80);
        this.positionX = positionX;
        this.positionY = positionY;
        this.color = color;
        this.setBackground(Color.gray);
        this.setLocation(positionX, positionY);
        this.setPreferredSize(dimension);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public Color getColor() {
        return color;
    }

    public void addActionListener(Board board, Item item) {
    }
}
