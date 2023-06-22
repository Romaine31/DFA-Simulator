

package MainPackage;


public class automataSolver {
    
    public String reg1(String regIn){
        String regEx = " " + regIn;
        int counter = 0;
        int currentState = 0;
        int maxLength = regEx.length();
        String validity1 = "Invalid";
        
        
        do{
            char currentLetter = regEx.charAt(counter);
            counter++;
           
        switch(currentState)
        {
            case 0:
                if (currentLetter == 'a')
                {
                    currentState = 1;
                    
                }
                else if (currentLetter == 'b')
                {
                    currentState = 4;
                    
                }
                break;
            case 1:
                if (currentLetter == 'a')
                {
                    currentState = 2;
                    
                }
                else if (currentLetter == 'b')
                {
                    currentState = 5;
                    
                }
                break;
            case 2:
                if (currentLetter == 'a' || currentLetter == 'b')
                {
                    currentState = 3;
                    
                }
                break;
            case 3:
                if (currentLetter == 'a' || currentLetter == 'b')
                {
                    currentState = 6;
                    validity1 = "valid";
                }
                break;
            case 4:
                if (currentLetter == 'b')
                {
                    currentState = 2;
                    
                }
                else if (currentLetter == 'a')
                {
                    currentState = 5;
                    
                }
                break;
            case 5:
                validity1 = "invalid";
                if (currentLetter == 'a' || currentLetter == 'b')
                {
                    currentState = 5;
                    return validity1;
                }
                break;
            case 6:
                validity1 = "valid";
                if (currentLetter == 'a' || currentLetter == 'b')
                {
                    currentState = 6;
                    return validity1;
                }
                break;
        }

    } while(counter < maxLength);
        return validity1;
    }
    
    public String reg2 (String regIn){
        String regEx = " "+regIn;
        int counter = 0;
        int currentState = 0;
        int maxLength = regEx.length();
        String validity2 = "invalid";
        
        if (maxLength <= 1)
            return "valid";
        else {
        
        do {
            char currentLetter = regEx.charAt(counter);
            counter++;
            
            switch(currentState)
            {
                case 0:
                    if(currentLetter == '1')
                    {
                        currentState = 1;
                    }
                    else if (currentLetter == '0')
                    {
                        currentState = 6;
                    }

                    break;
                case 1:
                    if (currentLetter == '1')
                    {
                        currentState = 3;
                    }
                    else if (currentLetter == '0')
                    {
                        currentState = 2;
                    }
                    break;
                case 2:
                    if (currentLetter == '1')
                    {
                        currentState = 9;
                        validity2 = "valid";
                    }
                    else if (currentLetter == '0')
                    {
                        currentState = 8;
                        validity2 = "valid";
                    }
                    break;
                case 3:
                    if (currentLetter == '1')
                    {
                        currentState = 9;
                        validity2 = "valid";
                    }
                    else if (currentLetter == '0')
                    {
                        currentState = 4;
                    }
                    break;
                case 4:
                    if (currentLetter == '1')
                    {
                        currentState = 9;
                        validity2 = "valid";
                    }
                    else if (currentLetter == '0')
                    {
                        currentState = 7;
                    }
                    break;
                case 5:
                    if (currentLetter == '1')
                    {
                        currentState = 3;
                    }
                    else if (currentLetter == '0')
                    {
                        currentState = 4;
                    }
                    break;
                case 6:
                    if (currentLetter == '1')
                    {
                        currentState = 5;
                    }
                    else if (currentLetter == '0')
                    {
                        currentState = 7;
                    }
                    break;
                case 7:
                    if (currentLetter == '1')
                    {
                        currentState = 5;
                    }
                    else if (currentLetter == '0')
                    {
                        currentState = 9;
                        validity2 = "valid";
                    }
                    break;
                case 8:
                    if (currentLetter == '1')
                    {
                        currentState = 5;
                        validity2 = "invalid";
                    }
                    else if (currentLetter == '0')
                    {
                        currentState = 9;
                    }
                    else
                        return validity2;
                    break;
                case 9:
                    if (currentLetter == '1' || currentLetter == '0')
                    {
                        currentState = 9;
                        return validity2;
                    }
                    break;
            }
        }
        while(counter < maxLength);
        return validity2;
    }
    }
}
