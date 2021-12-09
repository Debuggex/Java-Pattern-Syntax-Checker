package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            int count=0;

            String pattern = in.nextLine();
            try{
                Pattern pattern1=Pattern.compile(pattern);
                count++;
            }catch (PatternSyntaxException e){
                count=0;
            }
            if (count==1){
                System.out.println("Valid");
            }else{
                System.out.println("Invalid");
            }

            testCases=testCases-1;
        }
    }
}
