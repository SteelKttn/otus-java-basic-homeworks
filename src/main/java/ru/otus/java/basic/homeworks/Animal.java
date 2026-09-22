package ru.otus.java.basic.homeworks;

public class Animal {
    protected String name;
    protected int runSpeed;
    protected int swimSpeed;
    protected int endurance;
    protected int runningEnduranceCosts;
    protected int swimmingEnduranceCosts;
    protected boolean tired = false;

    public String getName() {
        return name;
    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
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

    public void setRunSpeed(int runSpeed) {
        this.runSpeed = runSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public Animal(String name, int runSpeed, int swimSpeed, int endurance, int swimmingEnduranceCosts) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.endurance = endurance;
        this.runningEnduranceCosts = 1;
        this.swimmingEnduranceCosts = swimmingEnduranceCosts;
    }

    public boolean isTired() {
        return tired;
    }


    public double run(int distance) {
        double rTime = (double) distance / runSpeed;
        if (distance * runningEnduranceCosts <= endurance) {
            endurance -= distance * runningEnduranceCosts;
            System.out.println("Животное " + name + " пробежало за: " + rTime + " секунд");
            if (endurance == 0) {
                tired = true;
            }
            return rTime;
        } else {
            tired = true;
            System.out.println("Животное " + name + " устало");
            return -1;
        }

    }

    public double swim(int distance) {
        double sTime = (double) distance / swimSpeed;
        if (distance * swimmingEnduranceCosts <= endurance) {
            endurance -= distance * swimmingEnduranceCosts;
            System.out.println("Животное " + name + " проплыло за: " + sTime + " секунд");
            if (endurance == 0) {
                tired = true;
            }
                return sTime;
            } else {
                tired = true;
                System.out.println("Животное " + name + " устало");
                return -1;
            }
        }


        public void info () {
            System.out.println("Имя: " + name + ", скорость бега: " + runSpeed + ", скорость плавания: " + swimSpeed + ", выносливость: " + endurance + ", устало: " + tired);
        }
    }



