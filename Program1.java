class Parent{
    private int privateData = 42; // Private member

    public int getPrivateData(){
        return privateData;
    }
}

class Child extends Parent{  // Subclass
    public void display(){
        System.out.println("Private Data via method: " + getPrivateData()); 
    }
}


public class Program1{       // Main class
    public static void main(String[] args){
        Child obj = new Child();
        obj.display();
    }
}