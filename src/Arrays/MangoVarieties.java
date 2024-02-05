package Arrays;

public class MangoVarieties {
    enum Mango{
        Carrie(10), FairChild(9), Haden(12);
        private int price;
        Mango (int p){
            price = p;
        }

        int getPrice(){
            return price;
        }
    }
}

class EnumTest{
    public static void main(String[] args) {
        MangoVarieties.Mango p = MangoVarieties.Mango.Carrie;
        System.out.println(p.getPrice());
    }
}