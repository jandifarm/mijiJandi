package com.algorithm.easy.warmup;

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String[] str = s.split(":");
        String time = s.substring(8,10);
        int num = Integer.parseInt(str[0]);

        String answer = "";

//        for(int j=0; j<str.length; j++){
//            System.out.println(str[j]);
//        }
//
//        System.out.println("num= "+num );

//        System.out.println(time);

        if(time.equals("AM")){
            if(num >  12){
//                str[0] = ;
            }else if(num == 12){
                str[0] = "00";
            }
        }else if(time.equals("PM")){
            if(num < 12){
                str[0] = Integer.toString(num+12);
            }else if(num == 12){
                str[0] = "12";
            }
        }

        for(int i=0; i<str.length; i++){
            if(str[i] != str[str.length-1]){
                answer += str[i] + ":";
            }else if(str[i] == str[str.length-1]){
                answer += str[i];
            }

        }

    return answer.substring(0,8);
    }



    public static void main(String[] args) {
       String s = "07:05:45PM";

       //timeConversion(s);

        System.out.println(timeConversion(s));
    }
}
