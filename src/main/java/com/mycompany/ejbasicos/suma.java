package com.mycompany.ejbasicos;

public class suma {
    public static void main(String args[]) {
        int a=1;
        int b=7;
        
        for(int c=a+1; c<=b; c++){
            if(c%2==0 && a%2==0){
                a=c+a;
            }
            else if(a%2!=0){
                a++;
            }
        }
        
        System.out.println(a);
    }
}
