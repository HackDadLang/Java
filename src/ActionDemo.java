abstract class Action{
    public static final int EAT = 1;
    public static final int SLEEP = 5;
    public static final int WORK = 7;
    public void command(int flag){
        switch(flag){
            case EAT:
                this.eat();
                break;
            case SLEEP:
                this.sleep();
                break;
            case WORK:
                this.work();
                break;
        }
    }
    public abstract void eat();
    public abstract void sleep();
    public abstract void work();
}
class Robot extends Action{
    public void eat(){
        System.out.println("机器人补充能量");
    }
    public void sleep(){
        System.out.println("机器人关机");
    }
    public void work(){
        System.out.println("机器人工作");
    }
}
class Human extends Action{
    public void eat(){
        System.out.println("人类吃饭");
    }
    public void sleep(){
        System.out.println("人类睡觉");
    }
    public void work(){
        System.out.println("人类工作");
    }
}
class Pig extends Action{
    public void eat(){
        System.out.println("猪拱食");
    }
    public void sleep(){
        System.out.println("猪睡觉");
    }
    public void work(){
    }
}
public class ActionDemo {
    public static void main(String[] args) {
        fun(new Robot());
        fun(new Human());
        fun(new Pig());
    }
    public static void fun(Action act){
        act.command(Action.EAT);
        act.command(Action.SLEEP);
        act.command(Action.WORK);
    }
}
