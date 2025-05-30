import java.util.Scanner;

class Item<Q>{
    private Q data;

    public void set(Q data){
        this.data = data;
    }

    public Q get(){
        return data;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Interger: ");
        int inv = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter an String: ");
        String str = sc.nextLine();


        Item<Integer>integerItem = new Item<>();
        integerItem.set(inv);

        Item<String>stringItem = new Item<>();
        stringItem.set(str);

        System.out.println("Interger Value:"+integerItem.get());
        System.out.println("String Value:"+stringItem.get());
    }
}