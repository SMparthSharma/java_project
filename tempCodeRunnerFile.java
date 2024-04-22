 // for (int i = 0; i < input.length() ; i++) {
            
        //     if ((input.charAt(i) != '*') && (input.charAt(i) != '/') && (input.charAt(i) != '-')
        //             && (input.charAt(i) != '+')) {
        //         value1 = value1 + input.charAt(i);
               
        //     } else if ((input.charAt(i) == '+') || (input.charAt(i) == '-')) {
        //         value1 = "";
                
        //     }
        //     if (input.charAt(i) == '*') {
                
                
        //         for (int j = i + 1; j < input.length(); j++) {
                    
        //             if ((input.charAt(j) != '*') && (input.charAt(j) != '/') && (input.charAt(j) != '-')
        //                     && (input.charAt(j) != '+')) {
                               
                       
        //                 value2 = value2 + input.charAt(j);
                       
        //             } else {
                       
        //                 break;
        //             }
        //         }
        //         temp = Integer.toString(Integer.parseInt(value1) * Integer.parseInt(value2));

        //         input = input.replace(value1 + input.charAt(i) + value2, temp);
               
        //         value1=""; //MAKING VALUE 1 EMPTY
        //         value2="";//MAKING VALUE 2 EMPTY
               
        //         System.out.println("input : " + input);

        //         i=-1; // RESET VALUE OF I

        //     } else if (input.charAt(i) == '/') {
              
        //         for (int j = i + 1; j < input.length(); j++) {
                   
        //             if ((input.charAt(j) != '*') && (input.charAt(j) != '/') && (input.charAt(j) != '-')
        //                     && (input.charAt(j) != '+')) {                        
        //                 value2 = value2 + input.charAt(j);
        //             } else {
                        
        //                 break;
        //             }

        //         }

        //         temp = Integer.toString(Integer.parseInt(value1) / Integer.parseInt(value2));

        //         input = input.replace(value1 + input.charAt(i) + value2, temp);
                
                
        //         System.out.println("input : " + input);

        //         i=-1; // RESET VALUE OF I

        //         value1=""; //MAKING VALUE 1 EMPTY
        //         value2="";//MAKING VALUE 2 EMPTY

        //     }
            
        // }