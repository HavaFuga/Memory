import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.util.ArrayList;

public class Board extends JPanel{
    private int amoutnItemsX;
    private int amountItemsY;
    private ArrayList<Item> items = new ArrayList<Item>();

    Border blackline = BorderFactory.createLineBorder(Color.black);
    Border loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);

    public Board (JFrame frame){
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.setBorder(loweredetched);
        this.setSize(500, frame.getHeight()-10);

        this.createItems();

        frame.add(this);
    }


    private void createItems() {
        int j = 0;
        while (j < 10) {
            System.out.print(j);
            //new Item(j,)
            j++;
        }
        System.out.println();
        while (j < 20) {
            System.out.print(j);
            //new Item(j,)
            j++;
        }
    }
}
