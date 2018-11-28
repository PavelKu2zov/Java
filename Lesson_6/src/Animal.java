public  class Animal {

 private String name;
    private  double run;
    private  double jump;
    private  double swim;

 public Animal()
    {}

 public Animal(String name, double run_distance, double jump_, double swim_distance )
 {
     this.name = name;
     this.run = run_distance;
     this.jump = jump_;
     this.swim = swim_distance;
 }


    boolean running(double run_distance)
    {
        if (run_distance < this.run)
            return true;
        else
            return false;
    }

    boolean jumping(double jump_)
    {
        if (jump_ < this.jump)
            return true;
        else
            return false;
    }

    boolean swimming(double swim_distance)
    {
        if (swim_distance < this.swim)
            return true;
        else
            return false;
    }



}
