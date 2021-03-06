
public class Plate {
    private int foodAvailable;

    public Plate(int foodAvailable) {
        this.foodAvailable = foodAvailable;
    }

    public int getFoodAvailable() {
        return foodAvailable;
    }

    public void printInfo(){
        System.out.println(this);
    }
    public void decreaseFood(int decreaseFood){
        if (decreaseFood <= foodAvailable){
            foodAvailable -= decreaseFood;
        }
    }
    public void addFood(int additionalFoodCount){
        foodAvailable += additionalFoodCount;
        System.out.printf("В тарелку добавили %d еды", additionalFoodCount);
    }
    @Override
    public String toString(){
        return "В тарелке осталось" + foodAvailable + "еды";
    }
}
