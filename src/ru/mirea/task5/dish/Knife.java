package ru.mirea.task5.dish;

class Knife extends Dish{
    private String name;
    private String material;

    public Knife(String type, String color, int cost, String material){
        super(type, color, cost);
        this.material = material;
    }

    @Override
    public void findDish() {
        System.out.println("We have " + super.getType() + "s, its " + super.getColor() + ". And material is " + material + ", also it's cost " + super.getCost() + "$");
    }
}