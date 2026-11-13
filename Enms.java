public class Enms {
    public static void main(String[] args) {

        Directions d = Directions.NORTH;
//        System.out.println("The direction is : " + d + " " +  d.getDegree() + " degree");
//        d.print();

        System.out.println(d.name());
        System.out.println(d.valueOf("SOUTH"));
//        for(Directions di : d.values()){
//            System.out.println(di);
//        }
        System.out.println(d.ordinal());
    }
}



enum Directions{
    NORTH{
        public void print(){
            System.out.println("This is the movement towards y + 1");
        }
        },
    EAST{
        public void print(){
            System.out.println("This is the movement towards x + 1 ");
        }
        },
    WEST{
        public void print(){
            System.out.println("This is the movement towards  x - 1 ");
        }
    },
    SOUTH{
        public void print(){
            System.out.println("This is the movement towards y - 1 ");
        }
    };


     abstract void print();
}



//
//enum Directions{
//    NORTH(10),
//    EAST(20),
//    WEST(30),
//    SOUTH(40);
//
//    private int degree;
//
//    Directions(int degree){
//        this.degree = degree;
//    }
//
//    public int getDegree(){
//        return  this.degree;
//    }
//}

//final class Directions extends Enum<Directions>{
//
//    private static final NORTH = new Directions();
//    private static final SOUTH  = new Directions();
//    private static final WEST = new Directions();
//    private static final SOUTH = new Directions();
//
//    private Directions(){};
//
//}
