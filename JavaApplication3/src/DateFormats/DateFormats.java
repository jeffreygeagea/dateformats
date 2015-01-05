package DateFormats;

public class DateFormats {
    
   private String day;
   private String month;
   private String year;
    private boolean type;
    private String shortDate;
    private String longDate;
    
    
     public DateFormats(String day, String month, String year
          , boolean type , String shortDate , String longDate ){
        this.day=day;
        this.month=month;
        this.year=year;
        this.type=type;
        this.shortDate=shortDate;
        this.longDate=longDate;
        
    }
     
     public String getDay(){
        return day;
     }
    public void setDay(String day){
        this.day=day;
    }
    
    public String month(){
        return month;
    }
    
    public void setMonth(String month){
        this.month=month;
    }
    
    public String year(){
        return year;
    }
    
    public void setYear(String year){
        this.year=year;
    }
    
    public boolean getType(){
        return type;
    }
    
    public void setType(boolean type){
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
    
    public String getShortD(){
        String shortD;
        
        switch(shortDate){
            case"dd/MM/yy":
                shortD =day+ "/"+month+ "/"+year;
                break;
                default: 
               shortD=month+"-"+day+"-"+year;
               break;        
                
        }
       return shortD;
    }
    
    public String getLongD(){
        String longD;
        String months;
        
        switch(month){
            case "1":
                months="january";
                break;
                case"2":
                    months ="february";
                    break;
                case "3":
                    months ="march";
                    break;
                     case "4":
                    months ="april";
                    break;
                          case "5":
                    months ="may";
                    break;
                               case "6":
                    months ="june";
                    break;
                                    case "7":
                    months ="july";
                    break;
                                         case "8":
                    months ="august";
                    break;
                                              case "9":
                    months ="september";
                    break;
                                                   case "10":
                    months ="october";
                    break;
                                                        case "11":
                    months ="november";
                    break;
                default:
                    months="december";
                          
            
            return months;
        }
        
        switch(longDate){
        case"MMMM dd,yyyy":
        longD= months + " "+ day + ","+year;
        break;
        default:
            longD= day +","+ year +" "+ months;
            break;
        }
        
        return longD;
    }
    
    
}
