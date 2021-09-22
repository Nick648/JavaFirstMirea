package ru.mirea.task5.dish;

class Pan extends Dish{
    private String name;
    private String form;

    public Pan(String type, String color, int cost, String form) {
        super(type, color, cost);
        this.form = form;
    }

    @Override
    public void findDish() {
        System.out.println("We have " + super.getType() + "s, its " + super.getColor() + " and " + form + ", also it's cost " + super.getCost() + "$");
    }
}
