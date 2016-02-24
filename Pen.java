package Study;

// примеры методов equals hashCode toString


public class Pen {
    int price;
    String producerName;
    
   
    // конструктор
    public Pen(int price, String producerName) {
        this.price = price;
        this.producerName = producerName;
    }
    
    // сравнивает между собой два объекта класса Pen
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (null == obj) return false;
        if (getClass() != obj.getClass()) return false;
        
        Pen pen = (Pen) obj;
        if (price != pen.price) return false;
        if (null == producerName) return (producerName == pen.producerName);
        else {
            if (!producerName.equals(pen.producerName)) return false;
        }
        return true;
    }

    // возвращает хэш-код объекта класса Pen
    public int hashCode() {
        return (int) (31 * price + ((null == producerName) ? 0 : producerName.hashCode()));
    }

    // выводит в строку содержимое объекта класса Pen
    public String toString() {
        return getClass().getName() + "@" + "price: " + price + ", producerName: " + producerName;
    }

    public static void main(String[] args) {
        Pen onePen = new Pen(25, "Kohinoor");
        Pen twoPen = new Pen(26, "Kohinoor");
        System.out.println(onePen.toString());
        System.out.println(onePen.equals(twoPen));
        System.out.println(onePen.hashCode());        
        System.out.println(twoPen.hashCode());       
    }
    
}