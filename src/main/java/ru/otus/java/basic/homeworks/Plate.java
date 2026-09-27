package ru.otus.java.basic.homeworks;

public class Plate {
    private int maxFood;
    private int currentFood;
    private boolean isFoodMax = false;

    public int getMaxFood() {
        return maxFood;
    }

    public int getCurrentFood() {
        return currentFood;
    }

    public Plate(int maxFood) {
        this.maxFood = maxFood;
        this.currentFood = maxFood;
    }

    public void info() {
        System.out.println("Max Food: " + maxFood + "\nCurrent Food: " + currentFood);
    }

    public boolean addFood(int food) {
        if (currentFood + food > maxFood) {
            System.out.println("В тарелке недостаточно места");
            return false;
        } else {
            currentFood = currentFood + food;
            System.out.println("Вы добавили в тарелку: " + food + " Теперь в тарелке: " + currentFood);
            return true;
        }
    }
    public boolean decreaseFood (int decrease) {
      if (currentFood - decrease < 0) {
          System.out.println("Вы не можете уменьшить еду на это значение");
          return false;
      } else {
          currentFood = currentFood - decrease;
          System.out.println("Теперь в тарелке: " + currentFood);
          return true;
      }
    }

}



