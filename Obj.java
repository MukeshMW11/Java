import javax.management.loading.PrivateClassLoader;

public class Obj {
    public static void main(String[] args){
//        int x= 4;
//        int y= 5;
        Payments p1 = new Payments(4,5);
        Payments p2 = new Payments(p1);
        System.out.println(p2.x + " , " + p2.y);

        add(p2);
        System.out.println(p2.x + " , " + p2.y);

        System.out.println(p1.x + " , " + p1.y);
        add(p1);
        System.out.println(p1.x + " , " + p1.y);

    }





    static void add(Payments p){
        p.x = p.x + 10;
        p.y = p.y + 10;
    }
}


class Payments{
    int x;
    int y;

    Payments(int x, int y){
        this.x = x;
        this.y  = y;
    }

    Payments(Payments p){
        this.x = p.x;
        this.y = p.y;
    }
}
