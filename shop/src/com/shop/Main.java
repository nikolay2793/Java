package com.shop;

import com.shop.bag.ATBPacket;
import com.shop.bag.Bag;
import com.shop.bag.BagImpl;
import com.shop.manager.ShopManager;


import com.shop.shelf.Shelf;
import com.shop.shelf.ShelfApple;
import com.shop.position.impl.Apple;

import com.shop.position.impl.Pen;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Created by cube on 21.02.2018.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bag bag;

        System.out.println("S chem poidem vasia?");
        System.out.println("1: ATB power");
        System.out.println("2: Standart edition Galia");
        switch (scanner.nextInt()){
            case 1:
                bag = new ATBPacket();
                break;
            case 2:
                bag= new BagImpl();
                break;
            default:
                System.out.println("sho zirkaech? pognali s rukzacom");
                bag= new BagImpl();
        }
        while (true){
            System.out.println("Shito delaem desy?");
            System.out.println("1: go za pokupkami person-san");
            System.out.println("2: go na cassu");
            switch (scanner.nextInt()){
                case 1:
                    doPokupki(bag);
                    break;
                case 2:
                    goNaCassu(bag);
                    break;
                default:
                    System.out.println("dich. ti vtiraech mne dich");
            }
        }
    }



//    private static void doPokupki(Bag bag)
//    {
//        Scanner scanner = new Scanner(System.in);
//        while(bag.getNotUsedSize() != 0){
//            System.out.println("1:Pen");
//            System.out.println("2:Apple");
//            System.out.println("3:dumay");
//            switch (scanner.nextInt()){
//                //    case 1: bag.add(new Pen(10,"karandashik"));break;
//                //    case 2: bag.add(new Apple(25, "Iabloc")); break;
//
//                case 1:
//
//                case 3: return;
//                default:
//                    System.out.println("dich. ti vtiraech mne dich");
//            }
//        }
//        System.out.println("Galia, I te sho grushick");
//    }



    //*** Здесь пробую модифицировать doPokupki с полкой, вроде бы выполняется.
    // В тоже время совсем не уверен что так правильно.

    //Над вторым пунктом задания, пока еще еще думаю как его решить..
    //"Если покупаешь три товара, платишь только за первые два...."


    private static void doPokupki(Bag bag)
    {
        Apple aprrr = new Apple(2.977,"ratatui");
        Shelf shelf1 = new ShelfApple(6, new Apple[6] );


        for(int i = 1; i < 6; i++)
        {shelf1.put(aprrr);}

        Scanner scanner = new Scanner(System.in);

            while (bag.getNotUsedSize() != 0) {
                System.out.println("1:Pen");
                System.out.println("2:Apple");
                System.out.println("3:dumay");
                switch (scanner.nextInt()) {
                    case 1: bag.add(new Pen(10,"karandashik"));break;


                    case 2:
                        if( shelf1.checkAvailable())
                        {
                       // bag.add(new Apple(25, "Iabloc"));
                        bag.add(aprrr);
                        shelf1.get();
                        }
                        else
                        System.out.println("No more Apples for YOU !!!!");
                        break;


                    case 3:
                        return;
                    default:
                        System.out.println("dich. ti vtiraech mne dich");
                }
            }

        System.out.println("Galia, I te sho grushick");
    }

    private static void goNaCassu(Bag bag){

      //  Arrays.sort();

        ShopManager babaGala = new ShopManager();
        try {
            babaGala.sum(bag);
            System.out.println("oi mama, hera tac dorogo");
            System.exit(0);
        } catch (InterruptedException e) {
            System.out.println("SCORUYY!!BABA GALA ");
        }
    }

}
