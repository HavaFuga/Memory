public class Item {
    private int id;
    private int positionX;
    private int positionY;
    private String color;


    public Item(int id, int positionX, int positionY, String color) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.color = color;
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

    public void setColor(String color) {
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

    public String getColor() {
        return color;
    }
}
