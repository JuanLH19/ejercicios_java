package com.juan.ejerciciostarea.main;
//Este codigo no compilara debido a que la llamada a super() no puede ser satisfecha por que no hay un cosntructor en
//Top.


class Top {
    public Top(String s) {
        System.out.print("B");
    }


}

public class Bottom2 extends Top {

    public Bottom2(String s) {

        System.out.print("D");
    }

    public static void main(String[] args) {
        new Bottom2("C");
        System.out.print(" ");
    }
}

