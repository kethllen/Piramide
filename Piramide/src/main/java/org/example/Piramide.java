package org.example;

public class Piramide {
    private int a;

    public Piramide(int a){
        this.a=a;
    }

    public void imprimiPiramide(){
        for(int i=1; i<=a;i++){
            for(int j=1; j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
