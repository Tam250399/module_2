public class tv {
    int channer = 1;
    int volumeLevel = 1;
    boolean on = true;

    public tv() {
    }

    ;

    public void TurnOn() {
        on = true;
    }

    public void TurnOff() {
        on = false;
    }

    public void setChanner(int newChanel1) {
        if (on && newChanel1 >= 1 && newChanel1 <= 120) {
            channer = newChanel1;
        }
    }
    public void  setVolumeLevel ( int newvolumelevel1){
        if (on && newvolumelevel1 >= 1 && newvolumelevel1 <= 7){
            volumeLevel = newvolumelevel1;
        }
    }
    public void channelUp(){
        if(on && channer < 120){
            channer++;
        }
    }
    public  void channelDown(){
        if (on && channer > 1){
            channer --;
        }
    }
    public void volumeUp(){
        if(on && volumeLevel < 7){
            volumeLevel++;
        }
    }
    public  void volumeDown(){
        if (on && volumeLevel > 1){
            volumeLevel --;
        }
    }


}

