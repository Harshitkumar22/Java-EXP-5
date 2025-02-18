class Chef{   // Base class
    void makeSpecialDish(){
        System.out.println("The chef is making a special dish.");
    }
}


class ItalianChef extends Chef{   // Subclass: ItalianChef
    @Override
    void makeSpecialDish(){
        System.out.println("Making pasta.");
    }
}

class ChineseChef extends Chef{   // Subclass: ChineseChef
    @Override
    void makeSpecialDish() {
        System.out.println("Making dumplings.");
    }
}


class MexicanChef extends Chef{   // Subclass: MexicanChef
    @Override
    void makeSpecialDish() {
        System.out.println("Making tacos.");
    }
}

public class Restaurant{
    public static void main(String[] args) {
        Chef[] chefs = {new ItalianChef(), new ChineseChef(), new MexicanChef()};
        for (Chef chef : chefs) {
            chef.makeSpecialDish();
        }
    }
}