package daw.programacion.fecha;

public class ClaseFecha {
    private int day = 1;
    private int month = 1;
    private int year = 2000;

    public ClaseFecha (int day, int month, int year){};

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) throws IllegalAccessException {
        if (day > 31 || day < 1) {
            throw new IllegalAccessException();
        }
        this.day = day;
    }

    public void setMonth(int month) throws IllegalAccessException {
        if (month > 12 || month < 1) {
            throw new IllegalAccessException();
        }
        this.month = month;
    }

    public void setYear(int year) throws IllegalAccessException {
        if (year > 9999 || year < 1900) {
            throw new IllegalAccessException();
        }
        this.year = year;
    };

    public void setDate(int day, int month, int year) throws IllegalAccessException {
        if (day > 31 || day < 1) {
            throw new IllegalAccessException();
        }
        if (month > 12 || month < 1) {
            throw new IllegalAccessException();
        }
        if (year > 9999 || year < 1900) {
            throw new IllegalAccessException();
        }
        
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "ClaseFecha [day = " + day + ", month = " + month + ", year = " + year + "]";
    }
}
