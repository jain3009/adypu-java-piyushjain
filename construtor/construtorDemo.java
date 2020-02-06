package construtor;

import keywords.statickey;

public class construtorDemo {

   private construtorDemo(){
        System.out.println("default Constructor");
    }

    construtorDemo(int a){
        System.out.println("Constructor : "+a);
    }


    public static void main(String[] args) 
    {
        construtorDemo constructorDemo=new construtorDemo();
      statickey staticKey=new statickey();
        staticKey.getData();
        staticKey.showData();
    }
}