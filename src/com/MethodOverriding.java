package com;

//method overriding with inheritance :-

 class Rbi {
     public void roi(int a){
         System.out.println("Repo rate is 6.7");
     }
}

class Sbi extends Rbi {
     public void roi(int a){
         System.out.println("Repo rate is 6.8");
     }
}

class Hdfc extends Rbi{
     public void roi(int a){
         System.out.println("Repo rate is 6.65");
     }
}
