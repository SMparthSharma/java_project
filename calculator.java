import java.util.Scanner;

public class calculator {
    
    public static void main(String[] args) {
        System.out.println("enter string");
        String input = new String();
        String value1 = new String();
        String value2 = new String();
        String temp = new String();
        Scanner sc = new Scanner(System.in);
        input = sc.next();
        
       
        for (int i = 0; i < input.length() ; i++) {
            
            if ((input.charAt(i) != '*') && (input.charAt(i) != '/') && (input.charAt(i) != '-')
                    && (input.charAt(i) != '+')) {
                value1 = value1 + input.charAt(i);
               
            } else if ((input.charAt(i) == '+') || (input.charAt(i) == '-')) {
                value1 = "";
                
            }
            if (input.charAt(i) == '*') {
                
                
                for (int j = i + 1; j < input.length(); j++) {
                    
                    if ((input.charAt(j) != '*') && (input.charAt(j) != '/') && (input.charAt(j) != '-')
                            && (input.charAt(j) != '+')) {
                               
                       
                        value2 = value2 + input.charAt(j);
                       
                    } else {
                       
                        break;
                    }
                }
                temp = Float.toString(Float.parseFloat(value1) * Float.parseFloat(value2));

                input = input.replace(value1 + input.charAt(i) + value2, temp);
               
                value1=""; //MAKING VALUE 1 EMPTY
                value2="";//MAKING VALUE 2 EMPTY
               
                //System.out.println("input : " + input);

                i=-1; // RESET VALUE OF I

            } else if (input.charAt(i) == '/') {
              
                for (int j = i + 1; j < input.length(); j++) {
                   
                    if ((input.charAt(j) != '*') && (input.charAt(j) != '/') && (input.charAt(j) != '-')
                            && (input.charAt(j) != '+')) {                        
                        value2 = value2 + input.charAt(j);
                    } else {
                        
                        break;
                    }

                }

                try {
                    temp = Float.toString(Float.parseFloat(value1) / Float.parseFloat(value2));
                    
                } catch (ArithmeticException e) {
                    // TODO: handle exception
                    System.out.println("0 is not a devisible number");
                    break;
                }
                input = input.replace(value1 + input.charAt(i) + value2, temp);
                
                
               // System.out.println("input : " + input);

                i=-1; // RESET VALUE OF I

                value1=""; //MAKING VALUE 1 EMPTY
                value2="";//MAKING VALUE 2 EMPTY

            }
            
        }
        for(int i=0;i<input.length();i++){
            if ((input.charAt(i) != '+') && (input.charAt(i) != '-')) {
                value1=value1+input.charAt(i);
            }
            
            if (input.charAt(i)=='+') {
                for(int j=i+1;j<input.length();j++){
                    if ((input.charAt(j) != '+') && (input.charAt(j) != '-')) {
                        value2=value2+input.charAt(j);
                    }else{break;}
                }
                temp = Float.toString(Float.parseFloat(value1) + Float.parseFloat(value2));

                input = input.replace(value1 + input.charAt(i) + value2, temp);
                
                
              //  System.out.println("input : " + input);

                i=-1; // RESET VALUE OF I

                value1=""; //MAKING VALUE 1 EMPTY
                value2="";//MAKING VALUE 2 EMPTY
            }
            else if (input.charAt(i)=='-') {
                for(int j=i+1;j<input.length();j++){
                    if ((input.charAt(j) != '+') && (input.charAt(j) != '-')) {
                        value2=value2+input.charAt(j);
                    }else{break;}
                }
                try {
                    temp = Float.toString(Float.parseFloat(value1) - Float.parseFloat(value2));
                } catch (Exception e) {
                    // TODO: handle exception
                   
                    break;
                }

                input = input.replace(value1 + input.charAt(i) + value2, temp);
                
                
               // System.out.println("input : " + input);

                i=-1; // RESET VALUE OF I

                value1=""; //MAKING VALUE 1 EMPTY
                value2="";//MAKING VALUE 2 EMPTY
            }

        }
        System.out.println("output : " + input);
    }
}