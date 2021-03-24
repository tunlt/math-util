/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunlt.mathutil.main;

import com.tunlt.mathutil.MathUtility;

/**
 *
 * @author Tu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("Hello GitHub!!!");
//        System.out.println("This is 1st upload from local to remote GitHub");
        //tui muon test 5! co dung 120 hem???
        int n = 5;
        long expected = 120; // hy vong 120 tra ve 
        long actual = MathUtility.getFactorial(n);// thuc te ham chay la may vay???
        // minh so sanh de biet dung sai???
        System.out.println("5! expected:" +expected +                 
                                    "; " +actual);
    }
    // viet code xong thi phai test code- nguyen tac phai theo 
    // test ngay tung ham, tung class trc khi rap chung voi cac class khac 
    // test ngay khi xong cac class dc goi la test muc do 1, muc Unit test(test don vi)
    // lam sao phai test co nhieu cach 
    //1. Cach 1: sout (goi ham) de in ra ket qua xu li cua ham
    //2. cach 2: JoptionPane de popup len ket qua xu li cua ham 
    //3. cach 3: ghi ra LOG file, trang web (JW)
    //3 cach nay thi phai dung mat de xem ket qua va tu ket luon dung sai 
    //dung: ham chay ra 1 gia tri - ACTUAL VALUE
    //           va ta thay ACTUAL VALUE khop, bang voi cai gia tri ma ta mong doi, ta tinh trc = tay, goi la EXPECTED VALUE
    //vd :5! thi ta hy vong expected ham tra ve 120, nnhung ham tra ve 120 - actual ham chay dung cho 5!
    
    //*sai: tui test 6!, expected =720. khon nan thay, chay ra actual = 120 ham xu li sai
    
    //  MÁY SẼ LO CHO
    // NẾU TẤT CẢ TÌNH HUỐNG CHẠY HÀM ĐỀU ĐÚNG -> HÀM ĐÚNG -> MÀU XANH
    // HẦU HẾT TÌNH HUỐNG CHẠY HÀM ĐỀU ĐÚNG, CÓ 1 CÁI SAI -> HÀM SAI 
//                                                          -> HÀM ĐỎ
    // ĐỎ: CHỈ CẦN 1 THẰNG SAI
    // XANH: TẤT CẢ PHẢI ĐỀU ĐÚNG
    
    // MÚN LÀM ĐC ĐIỀU NÀY TA CẦN THƯ VIỆN PHỤ TRỢ GIÚP CHO JAVA XANH ĐỎ
    // ĐIỀU NÀY CŨNG CÓ BÊN C# PHP, JS, RUBY
    // JAVA: Unit 
    
}
