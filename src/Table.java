public class Table {

    private int width;
    private int length;
    private int foundItems;

    public Table( int width, int length){
        this.width = width;
        this.length = length;
        System.out.printf("created a table");
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
