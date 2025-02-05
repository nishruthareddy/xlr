class Demo054 {
    void display(int a) {
        System.out.println("Integer: " + a);
    }
    void display(int a, int b) {
        System.out.println("Sum of integers: " + (a + b));
    }
    void display(double a) {
        System.out.println("Double: " + a);
    }
    void display(String str) {
        System.out.println("String: " + str);
    }
    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();
        obj.display(10);
        obj.display(5, 15);    
        obj.display(3.14);       
        obj.display("Hello");    
    }
}
