package DateFormats;

public class DateFormats {
    
   private int day;
   private int month;
   private int year;
    private String type;
    private String shortDate;
    private String longDate;
    
    
     public DateFormats(int day, int month, int year
          , String type , String shortDate , String longDate ){
        this.day=day;
        this.month=month;
        this.year=year;
        this.type=type;
        this.shortDate=shortDate;
        this.longDate=longDate;
        
    }
     
     public int getDay(){
        return day;
     }
    public void setDay(int day){
        this.day=day;
    }
    
    public int month(){
        return month;
    }
    
    public void setMonth(int month){
        this.month=month;
    }
    
    public int year(){
        return year;
    }
    
    public void setYear(int year){
        this.year=year;
    }
    
    public String getType(){
        return type;
    }
    
    public void setType(String type){
        this.type=type;
    }
    
    public String getShortDate(){
        return shortDate;
    }
    
    public void setShortDate(String shortDate){
        this.shortDate=shortDate;
    }
    
    public String getLongDate(){
        return longDate;
    }
    
    public void setLongDate(String longDate){
        this.longDate=longDate;
    }
    
    
}
