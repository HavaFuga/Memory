import javax.swing.*;
import java.awt.*;

public class Table {

    private int width;
    private int length;
    private Dimension dimension;
    private int foundItems;
    private JFrame frame;
    private Board board;

    public Table( int width, int length, String name){
        this.width = width;
        this.length = length;
        dimension = new Dimension(width, length);
        this.createFrame(name, width, length);
    }

    private void createFrame(String name, int width, int length) {
        //create Frame
        this.frame = new JFrame(name);
        //frame.getContentPane().setBackground( Color.RED );

        frame.setSize(width, length);
        frame.setMinimumSize(dimension);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.setResizable(false);

        this.board = new Board(frame);

        frame.setVisible(true);
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getFoundItems() {
        return foundItems;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setFoundItems(int foundItems) {
        this.foundItems = foundItems;
    }
}
