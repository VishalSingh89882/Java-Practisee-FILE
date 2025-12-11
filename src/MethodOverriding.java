class MethodOverriding {
    public void display()
    {
        System.out.println("Parents class is implemented. ");
    }
}

 class Childclass extends MethodOverriding {
     public void display()
     {
         System.out.println("child class is implemented. ");
     }

     public static void main(String[] args){
         Childclass var = new Childclass();
         var.display();

     }

}
