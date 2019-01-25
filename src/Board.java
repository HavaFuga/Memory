import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Board extends JPanel{

    private static int itemsWidth = 20;
    private int amoutnItemsX;
    private int amountItemsY;
    private ArrayList<Item> items = new ArrayList<Item>();
    private ArrayList<Color> colors = new ArrayList<Color>();
    Random rand = new Random();

    Border blackline = BorderFactory.createLineBorder(Color.black);
    Border loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);

    float r = rand.nextFloat();
    float g = rand.nextFloat();
    float b = rand.nextFloat();
    Color randomColor = new Color(r, g, b);


    public Board (JFrame frame){
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.setBorder(loweredetched);
        this.setSize(500, frame.getHeight()-10);

        this.createItems();

        frame.add(this);
    }


    private void createItems() {
        int posX = 0;
        int posY = 0;
        this.generateColor();
        for (int i = 0 ; i < 2 ; i++) {
            for (int j = 0 ; j < 10 ; j++) {
                items.add(new Item(posX, posY, colors.get(j)));
                posX += 20;
                System.out.print(posX + ", ");
            }
            posY += 20;
            System.out.println(posY);
        }

    }

    private void generateColor() {
        for (int i = 0; i < 10 ; i++) {
            colors.add(randomColor);
        }
    }
}
