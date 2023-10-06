public class Date {
    private int md;
    private int month;
    private int year;

    public int getMd() {
        return md;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setMd(int md) {
        this.md = md;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){
        String displayDate=String.format("\t%d\\%s\\%2d",md,month,year);
        return displayDate;
    }
    Date(int d,int m,int y){
        this.md=d;
        this.month=m;
        this.year=y;
    }
    public static Date largestDate(Date d1,Date d2) {


        if (d1.getYear()!= d2.getYear())
        { if (d1.getYear() > d2.getYear()) {
            return d1;
        } else return d2;}

        else if (d1.getMonth()!= d2.getMonth()) {
            if (d1.getMonth() > d2.getMonth()) {

                return d1;
            } else return d2;

        }


        else {
            if (d1.getMd() > d2.getMd()) {
                return d1;
            } else return d2;
        }

    }
    }
