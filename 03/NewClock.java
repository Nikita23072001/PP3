public class NewClock {
    byte hour;
    byte minute;
    byte alarmHour;
    byte alarmMinute;
    boolean isAlarmSet;
    
    NewClock(){
        hour = 0;
        minute = 0;
    }
    
    NewClock(byte hour, byte minute){
        this.minute = minute;
        this.hour = hour;
        this.isAlarmSet = false;
    }
    
    void SetClock(byte hour, byte minute){
        this.minute = minute;
        this.hour = hour;
    }
    
    void DisplayTime(){
        System.out.print((hour>9?"":"0")+hour+":"+(minute>9?"":"0")+minute + "\n");
    }
    
    void AddOneMinute(){
        if(this.minute>58){
            minute = 0;
            if(this.hour>22){
                hour = 0;
            }

            else hour += 1;
        }
        
        else minute += 1;
        
        if(isAlarmSet) {
            if (hour == alarmHour && minute == alarmMinute) {
                RunAlarm();
            }
        }
    }
    
    void SetAlarm(byte hour, byte minute){
        this.alarmHour = hour;
        this.alarmMinute = minute;
        this.isAlarmSet = true;
    }
    
    void RunAlarm(){
        System.out.println("beep-beep-beep-beep !!");
    }
}
