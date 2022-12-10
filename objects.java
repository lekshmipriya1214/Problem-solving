class Objects{
    public int regno;
    public String name;

    public Objects(int regno,String name){
        this.regno=regno;
        this.name=name;
    }
    public int getRegno(){
        return regno;
    }
    public String getName(){
        return name;
    }
    public void setRegno(int regno){
        this.regno=regno;
    }
    public void setName(String name){
        this.name=name;
    }

 public static void main(String[] args){
               
                Objects obj1=new Objects(10,"priya");
                Objects obj2=new Objects(10,"priya");
                System.out.println(obj1.name+" and "+obj1.regno);
                System.out.println(obj2.regno+" and "+obj2.name);

                System.out.println(obj1.equals(obj2));

                System.out.println("Hashcode of obj1 is "+obj1.hashCode());
                System.out.println("Hashcode of obj2 is "+obj2.hashCode());

                System.out.println(obj1.equals(obj2));
    }
}