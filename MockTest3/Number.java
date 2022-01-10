public class Number
{
    private int system;
    private String value;
    private int result=0;
    
    public void setSystem(int system){
        this.system = system;
    }
    
    public void setValue(String value){
        this.value = value;
    }

    public int get10(){
        int REDIX = 10;
        char c=Character.forDigit(system,REDIX);
        for(int i = 0; i<value.length(); i++){
            if(c == value.charAt(i)){
                result = -1;
                break;
            }else if(i==0){
                result += Math.pow(system, value.length()-1)*Character.getNumericValue(value.charAt(i));
            }else{
                result += Math.pow(Character.getNumericValue(value.charAt(i)), value.length()-i);
            }
        }
        return result; 
    }
    
    public static void main(String[] args){
        Number num = new Number();
        
        num.setSystem(5);
        num.setValue("400");
        System.out.println(num.get10());
    }
}