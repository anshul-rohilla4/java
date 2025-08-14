public class LC13RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {

        int result=0;

        int index=-1;
        for( int i=0; i<s.length()-1 ;i++){
                if(s.charAt(i)=='I'){
                    if(s.charAt(i+1)=='V'){
                    result+=4;
                    i++;
                }
                else if(s.charAt(i+1)=='X'){
                    result+=9;
                    i++;
                }
                else{
                    result+=1;
                }
            }

            else if(s.charAt(i)=='V'){
                result+=5;
            }

            else if(s.charAt(i)=='X'){
                if(s.charAt(i+1)=='L'){
                    result+=40;
                    i++;
                }
                else if(s.charAt(i+1)=='C'){
                    result+=90;
                    i++;
                }
                else{
                    result+=10;
                }
            }

            else if(s.charAt(i)=='L'){
                result+=50;
            }

            else if(s.charAt(i)=='C'){
                if(s.charAt(i+1)=='D'){
                    result+=400;
                    i++;
                }
                else if(s.charAt(i+1)=='M'){
                    result+=900;
                    i++;
                }
                else{
                    result+=100;
                }
            }

            else if(s.charAt(i)=='D'){
                result+=500;
            }

            else if(s.charAt(i)=='M'){
                result+=1000;
            }

            index=i;
        }

        if(index!=s.length()-1){
            char ch = s.charAt(s.length()-1);
            if (ch == 'I') result += 1;
            else if (ch == 'V') result += 5;
            else if (ch == 'X') result += 10;
            else if (ch == 'L') result += 50;
            else if (ch == 'C') result += 100;
            else if (ch == 'D') result += 500;
            else if (ch == 'M') result += 1000;
        }
        return result;
    }
}

