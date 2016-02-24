package Study;

class MyClass {
    int x;
      
    int range (int x) {
        x++;
        return x;
    }
}

class Constructor1 {
    public static void main(String[] args) {
        MyClass t1 = new MyClass();
        
        int Key = 10;
        System.out.println("Key " + Key);
        
        System.out.println("Key " + t1.range(Key));
    }
}