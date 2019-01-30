import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.text.View;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Board extends JPanel implements WindowListener,ActionListener {

    private static int itemsWidth = 20;
    private Frame frame;
    private int foundItems = 0;
    private ArrayList<Item> amountItemsFaceup = new ArrayList<Item>();
    private ArrayList<Item> items = new ArrayList<Item>();
    private ArrayList<Color> colors = new ArrayList<Color>();
    Random rand = new Random();


    private JLabel lbl_foundItems = new JLabel();
    private JLabel lbl_unknownItems = new JLabel();

    Border blackline = BorderFactory.createLineBorder(Color.black);
    Border loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);

    float r = rand.nextFloat();
    float g = rand.nextFloat();
    float b = rand.nextFloat();


    public Board (JFrame frame) {
        this.frame = frame;

        Dimension dimension = new Dimension();
        dimension.setSize(450, 370);

        //this.setBackground( Color.blue );
        this.setBorder(loweredetched);
        this.setPreferredSize(dimension);
        this.addItems();
        frame.add(this);
        this.addInfos();

    }

    private void addInfos() {
        lbl_foundItems.setText("Found Items: " + foundItems);
        lbl_foundItems.setLocation(470, 10);

        lbl_unknownItems.setText("Unknown Items: " + (20 - foundItems));
        lbl_unknownItems.setLocation(470, 15);
        frame.add(lbl_foundItems);
        frame.add(lbl_unknownItems);
    }

    private void addItems() {
        int posY = 0;
        this.generateColor();
        for (int i = 0 ; i < 2 ; i++) {
            int posX = 0;

            for (int j = 0 ; j < 10 ; j++) {
                Item item = createItems(posX, posY, colors.get(j));
                items.add(item);
                posX += 20;
            }

            posY += 20;
        }

        Collections.shuffle(items);
        for ( Item item : items
             ) {
            this.add(item);
        }

    }

    private Item createItems(int posX, int posY, Color color){
        Item item = new Item(posX, posY, color);
        items.add(item);
        item.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                amountItemsFaceup.add(item);
                item.setBackground(item.getColor());
                if ( amountItemsFaceup.size() == 2){
                    CheckItems(amountItemsFaceup);
                    amountItemsFaceup.clear();
                }
                System.out.println("kliiick");
            }
        });
        return item;
    }

    private void generateColor() {
        for (int i = 0; i < 10 ; i++) {
            colors.add(new Color(rand.nextInt(0xFFFFFF)));
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    private void CheckItems(ArrayList<Item> items) {
        if (items.get(0).getColor() == items.get(1).getColor()
        && items.get(0) != items.get(1)){
            foundItems++;
            this.addInfos();
        } else {
            items.get(0).setBackground(Color.gray);
            items.get(1).setBackground(Color.gray);
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
