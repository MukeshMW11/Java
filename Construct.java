/*
Can we call a constructor manually ?


 */


public class Construct {

    public static void main(String[] args){
    Payment p1= new Payment("Gara");
        System.out.println("The name is : " + p1.name  + " amount is : " + p1.amount + " the sender is : " + p1.sender  + " the receiver is : " + p1.receiver);
    }

}


 class Payment{
    String name;
    int amount;
    String sender;
    String receiver;

    Payment(){
//        this("Unknown",0, "Unknown","Unknown");
            this("Unknown");
        System.out.println("This is the default constructor");
    }

    Payment(String name){
//        this.name = name;
//            this(name, 0, "Unknown","Unknown");
        this(name,0);
        System.out.println("This is the 1 parameter constructor");
    }

    Payment(String name,int amount){
//        this.name = name;
//        this.amount = amount;
//        this(name,amount, "Unknown","Unknown");
        this(name,amount,"Unknown");
        System.out.println("This is the 2 parameter constructor");
    }

    Payment (String name,int amount,String sender){
//        this.name = name;
//        this.amount = amount;
//        this.sender = sender;
        this(name,amount, sender ,"Unknown");
        System.out.println("This is the 3 parameter constructor");
    }

    Payment(String name,int amount,String sender,String receiver){
        this.name = name;
        this.amount = amount;
        this.sender = sender;
        this.receiver = receiver;
        System.out.println("This is the 4 parameter constructor");
    }

}