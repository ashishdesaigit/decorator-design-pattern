public class DecoratorDesignPattern {

    public static void main(String[] args) {

        //Create Chiken pizza with cheese topping = price should be 200 + 35
        Pizza cheeseBurstChkn = new CheeseBurst(new ChikenPizza());
        System.out.println(cheeseBurstChkn.getDescription());
        System.out.println(cheeseBurstChkn.getCost());

        //create Chiken pizza double Cheese and tomato = price should be = 200 + 35 + 35 + 20
        Pizza freshTomatoDoubleCheeseChikenPizza = new FreshTomato(new CheeseBurst(new CheeseBurst(new ChikenPizza())));
        System.out.println(freshTomatoDoubleCheeseChikenPizza.getDescription());
        System.out.println(freshTomatoDoubleCheeseChikenPizza.getCost());


    }
}
