public class Pizza {
	private int price;
	private Boolean veg;
	
	private int extraCheesePrice = 100;
	private int extraToppingsPrice = 200;
	private int backpackPrice = 10;
	private int basePizzaPrice;
	
	private boolean isExtraCheeseAdded = false;
	private boolean isExtraToppingsAdded = false;
	private boolean isOptedForTakeAway = false;
   public Pizza(Boolean veg) {
	   this.veg = veg;
	   if(this.veg) {
		 this.price = 250;
	   } else {
		   this.price = 300;
	   }
	   basePizzaPrice = this.price;
   }

  public void addExtraCheese() {
	  isExtraCheeseAdded = true;
	this.price += extraCheesePrice;
  }
  
  public void addExtraToppings() {
	    isExtraToppingsAdded = true;
	  this.price += extraToppingsPrice;
  }
  
  public void takeAway() {
	    isOptedForTakeAway = true;
	  this.price += backpackPrice;
  }
  
  public void getBill() {
    String bill ="";
	System.out.println("Pizza:"+basePizzaPrice);
	if(isExtraCheeseAdded) {
		bill += "Extra cheese added: "+extraCheesePrice+"\n";
	}
	
	if(isExtraToppingsAdded) {
		bill +="Extra Toppings added: "+extraToppingsPrice+"\n";
	}
	
	if(isOptedForTakeAway) {
		bill +="Take away: "+backpackPrice+"\n";
	}
	bill += "Bill: "+this.price +"\n";
	System.out.println(bill);
	  
  }
  
}
/**
 * Base pizza: 250
 * Cheese: 100
 * Toppings: 200
 * Take away: 10
 */
