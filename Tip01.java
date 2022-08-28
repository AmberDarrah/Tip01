public class Tip01 {
    public static void main(String[] args) {
        //Find everyone's individual total after tax(5%) and tip(15%)

        //Shows the value of tax and tip
        double tax = 0.05;
        double tip = 0.15;

        //Shows every person's total before, and it shows what their new amount is
        double Person1 = 10;
        double total1 = Person1*(1 +tax +tip);
        System.out.println("Person 1: "+total1);

        double Person2 = 12;
        double total2 = Person2*(1 +tax +tip);
        System.out.println("Person 2: "+total2);

        double Person3 = 9;
        double total3 = Person3*(1 +tax +tip);
        System.out.println("Person 3: "+total3);

        double Person4 = 8;
        double total4 = Person4*(1 +tax +tip);
        System.out.println("Person 4: "+total4);

        double Person5 = 7;
        double total5 = Person5*(1 +tax +tip);
        System.out.println("Person 5: "+total5);

        double Person6 = 15;
        double total6 = Person6*(1 +tax +tip);
        System.out.println("Person 6: "+total6);

        double Person7 = 11;
        double total7 = Person7*(1 +tax +tip);
        System.out.println("Person 7: "+total7);

        double Person8 = 30;
        double total8 = Person8*(1 +tax +tip);
        System.out.println("Person 8: "+total8);
    }    
}
