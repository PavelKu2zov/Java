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

    public Animal(String name, double run_distance, double jump_ )
    {
        this.name = name;
        this.run = run_distance;
        this.jump = jump_;
    }

    void running(double run_distance)
    {
        if (run_distance < this.run)
            System.out.println("run true");
        else
            System.out.println("run false");;
    }

    void jumping(double jump_)
    {
        if (jump_ < this.jump)
            System.out.println("jump true");
        else
            System.out.println("jump false");;
    }

    void swimming(double swim_distance)
    {
        if (swim_distance < this.swim)
            System.out.println("swim true");
        else
            System.out.println("swim false");
    }



}
