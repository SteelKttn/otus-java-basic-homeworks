package ru.otus.java.basic.homeworks;

public class Animal {
    protected String name;
    protected int speed;
    protected int endurance;
    protected int runningEnduranceCosts;
    protected int swimmingEnduranceCosts;
    protected boolean tired = false;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getEndurance() {
        return endurance;
    }

    public int getRunningEnduranceCosts() {
        return runningEnduranceCosts;
    }

    public int getSwimmingEnduranceCosts() {
        return swimmingEnduranceCosts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public Animal(String name, int speed, int endurance, int swimmingEnduranceCosts) {
        this.name = name;
        this.speed = speed;
        this.endurance = endurance;
        this.runningEnduranceCosts = 1;
        this.swimmingEnduranceCosts = swimmingEnduranceCosts;
    }

    public boolean isTired() {
        return tired;
    }


    public int run(int distance) {
        int rTime = distance / speed;
        if (distance * runningEnduranceCosts <= endurance) {
            endurance -= distance * runningEnduranceCosts;
            System.out.println("Животное " + name + " пробежало за: " + rTime + " секунд");
            return rTime;
        } else {
            tired = true;
            System.out.println("Животное " + name + " устало");
            return -1;
        }

    }

    public int swim(int distance) {
        int sTime = distance / speed;
        if (distance * swimmingEnduranceCosts <= endurance) {
            endurance -= distance * swimmingEnduranceCosts;
            System.out.println("Животное " + name + " проплыло за: " + sTime + " секунд");
            return sTime;
        } else {
            tired = true;
            System.out.println("Животное " + name + " устало");
            return -1;
        }
    }

    public void info() {
        System.out.println("Имя: " + name + ", скорость: " + speed + ", выносливость: " + endurance + ", устало: " + tired);
    }
}



