/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunlt.mathutil;

/**
 *
 * @author Tu
 */
public class MathUtility {
    //class nay chua mot loat nhom ham toan hoc, fake tu class chuan
    // java.util.Math cua jdk
    // vi la do xai chung cho nen se la static
    public static final double PI=3.1415;
    
    //ham tinh n!
    
    // vi giai thua tang rat nhanh 21! tran kieu long
    // long ~10^18 18 con so ko.lon hon laf thua
    // am khong tinh
    // ham chi nhan tu 0..20! -> long
    //0! = 1! = 1
    public static long getFactorial(int n){
        if(n<0 || n>20) 
            throw new IllegalArgumentException("invalid argument. n must be between 0..20");
        if(n==0 || n==1)
            return 1; // khoi mat cong tinh
        // sure n = 2..20
        long result = 1; 
        
        for (int i = 2; i <= n; i++) 
            result *= i;
            
        
        return result;
//        if(n>0){
//            return getFactorial(n-1)*n;
//        }else{            
//        return 1;
//        }
    }
}
