package daw.programacion.tiempo;

public class ClaseTiempo {
    private int hour = 3;
    private int minute = 4;
    private int second = 3;

    public ClaseTiempo (int hour, int minute, int second){};

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) throws IllegalAccessException {
        if (hour > 23 || hour < 1) {
            throw new IllegalAccessException();
        }
        this.hour = hour;
    }
 
    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) throws IllegalAccessException {
        if (minute > 59 || minute < 0) {
            throw new IllegalAccessException();
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) throws IllegalAccessException {
        if (second > 59 || second < 0) {
            throw new IllegalAccessException();
        }
        this.second = second;
    };

    public void setTime(int hour, int minute, int second) throws IllegalAccessException {
        if (hour > 23 || hour < 0) {
            throw new IllegalAccessException();
        }
        if (minute > 59 || minute < 0) {
            throw new IllegalAccessException();
        }
        if (second > 59 || second < 0) {
            throw new IllegalAccessException();
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return "La hora es "+ hour + ":" + minute + ":" + second;
    }

    public String nextSecond (int hour, int minute, int second) {
        second++;
        if (second == 59) {
            second = 0;
            minute++;
        }
        if (minute == 59) {
            minute = 0;
            hour++;
        }
        if (hour == 23 && minute == 59 && second == 59) {
            hour = 0;
            minute = 0;
            second = 0;
        }
        return hour + ":" + minute + ":" + second;
    }

    public String previousSecond (int hour, int minute, int second) {
        second--;
        if (hour == 0 && minute == 0 && second == -1) {
            hour = 23;
            minute = 59;
            second = 59;
        }
        if (minute == -1) {
            minute = 59;
            hour--;
        }
        if (second == -1) {
            second = 59;
            minute--;
        }
        
        
        return hour + ":" + minute + ":" + second;
    }
    
    
}
