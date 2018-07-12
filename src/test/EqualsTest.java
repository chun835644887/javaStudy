package test;

public class EqualsTest {
    public static void main(String[] args){
        Employee alice1 = new Employee("Alice adams", 75000, 1994,6,20);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("Alice adams", 75000, 1994,6,20);
        Employee bob = new Employee("Bob Brandson",50000,1993,9,26);
        System.out.println("alice1==alice2:" + (alice1 == alice2) );
        System.out.println("alice1==alice3:" + (alice1 == alice3) );
        System.out.println("alice1.equals(alice2):" + (alice1.equals(alice2)) );
        System.out.println("alice1.equals(bob):" + (alice1.equals(bob)) );
        System.out.println("bob.toString" + (bob.toString()) );

        Manager cr7 = new Manager("CR7",89000,1990,12,25);
        Manager messi = new Manager("messi",90000,1991,4,15);
        messi.setBonus(5000);
        cr7.setBonus(10000);
        System.out.println("cr7.toString()" + (cr7.toString()));
        System.out.println("messi.toString()" + messi.toString());
        System.out.println("alice1.hashCode" + (alice1.hashCode()));
        System.out.println("alice2.hashCode" + (alice2.hashCode()));
        System.out.println("messi.hashCode" + (messi.hashCode()));
        System.out.println("cr7.hashCode" + (cr7.hashCode()));
    }
}
