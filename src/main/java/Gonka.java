public class Gonka {
private String Leader;
private int distLeader;

public Gonka(){
    this.Leader="";
    this.distLeader=0;
}

public void searchLeader(AutoMobile newAutoMobile){
    if (newAutoMobile.getSpeed()*24>this.distLeader){
        this.Leader=newAutoMobile.getName();
        this.distLeader=newAutoMobile.getSpeed()*24;
    }
}
public void printLeader(){
    System.out.println("Самый быстрый автомобиль "+this.Leader);
}

}

