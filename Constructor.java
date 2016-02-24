package Study;

class MyClass {
    int x;
    
    MyClass(int i) {
        x = i;
    }
}

class Constructor {
    public static void main(String[] args) {
        MyClass t1 = new MyClass(10);
        
        System.out.println(t1.x);
    }
}