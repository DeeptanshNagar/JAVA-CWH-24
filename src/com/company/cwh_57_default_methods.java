package com.company;

interface MyCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Hola! Amigo Good Morning!");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4K...");
    }
}
interface MyWifi{
    String [] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling" + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MyCellPhone implements MyWifi , MyCamera{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Recording Video");
    }
//    public void record4KVideo(){
//        System.out.println("Taking Snap and Recording Video in 4K");
//    }
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"Harry" , "Prashanth" , "Anjali56"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }

}
public class cwh_57_default_methods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4KVideo();
//        ms.greet(); // --> Throws an error
        String [] ar = ms.getNetworks();
        for(String item: ar){
            System.out.println(item);
        }
    }
}
