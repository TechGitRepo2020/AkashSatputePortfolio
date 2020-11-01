package com.nt.programs;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int grade = in.nextInt();
            if(grade<38){
                System.out.println(grade);
                continue;
            }
            int rem=grade%5;
            rem=5-rem;
            if(rem<3){
                System.out.println(grade+rem);
            }
            else{
                System.out.println(grade);
            }
            // your code goes here
        }
    }
}