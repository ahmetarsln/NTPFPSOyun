/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Random;

/**
 *
 * @author ahmet
 */
public class TPS {
    public  static void main(String[] args){
        anaKarakter n = new anaKarakter(int 12345,int 23);
    }
}
interface Canli{
    void yurume();
    void kosma();
}
interface Savasci{
    Etki yumrukAt(Etki etki);
    Etki zararVer(Etki etki);
}
abstract public class karakterler implements Savasci,Canli{
    static int baslangicCanSayisi=100;
    int gucSeviyesi;
    abstract Etki zararVer(String silahTipi);
    float zararGor(Etki etki){
        return baslangicCanSayisi=baslangicCanSayisi-(etki.isabetYuzdesi+etki.etkiDegeri)/4;
    }
}
public class Etki{
    public int isabetYuzdesi;
    public int etkiDegeri;
    public String silahTipi;
    Random rn =new Random();
    public Etki(String silahTipi){
        if("yumruk".equals(silahTipi)){
            etkiDegeri=rn.nextInt(10 + 1) + 1;
        }
        if("tabanca".equals(silahTipi)){
            etkiDegeri=rn.nextInt(50 + 10) + 10;
        }
        if("yumruk".equals(silahTipi)){
            etkiDegeri=rn.nextInt(100 + 50) + 50;
        }
    }

}
public class anaKarakter extends karakterler implements Canli,Savasci{
    
    public int sifre;
    public int gusSeviyesi;
    
    public anaKarakter(int sifre,int gucSeviyesi){
        this.sifre=sifre;
        if(sifre=123){
            System.out.println("Şifere doğru bro devam!!!");
            this.gucSeviyesi=gucSeviyesi;
        } else {
            System.out.println("Şifre yanlış devam edilemez");
        } 
    }
 
    
    @Override
    public void yurume(){
        System.out.println("Yürüme yordamı çağrıldı");
    }
    @Override
    public void kosma(){
        System.out.println("Koşma yordamı çağrıldı");
    }
    @Override
    public Etki yumrukAt(Etki etki){
        zararVer("yumruk");
        return etki;
    }
}
public class dusmanKarakter extends karakterler implements Canli,Savasci{
    
    public int gucSeviyesi;
    
    public dusmanKarakter(int gucSeviyesi){
        this.gucSeviyesi=gucSeviyesi;
    }
    @Override
    public void yurume(){
        System.out.println("Düşman karakter yürüme yordamı çağrıldı");
    }
    @Override
    public void kosma(){
        System.out.println("Düşman karakter koşma yordamı çağrıldı");
    }
    @Override
    public Etki yumrukAt(Etki etki){
        zararVer("yumruk");
        return etki;
    }
}
public class dusmanZombiKarakter extends karakterler implements Canli,Savasci{
    
    public int gucSeviyesi;
    
    public dusmanZombiKarakter(int gucSeviyesi){
        this.gucSeviyesi=gucSeviyesi;
    }
    @Override
    public void yurume(){
        System.out.println("Düşman zombi karakter yürüme yordamı çağrıldı");
    }
    @Override
    public void kosma(){
        System.out.println("Düşman zombi karakter koşma yordamı çağrıldı");
    }
    @Override
    public Etki yumrukAt(Etki etki){
        zararVer("yumruk");
        return etki;
    }
}