public class Cat extends Animal {


    public Cat(String name, double run_distance,double jump_)
    {
        super.name = name;
        super.run = run_distance;
        super.jump = jump_;
    }

    boolean swimming(double swim_distance)
    {
       return false;
    }

}
