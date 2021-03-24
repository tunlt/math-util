/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunlt.mathutil.test;

import static com.tunlt.mathutil.MathUtility.*;
//tao muon cac ham,bien trong nay ro truc tiep luon ma ko can class. 
import org.junit.Test;
import static org.junit.Assert.*;
//import  org.junit.Assert.*;

/**
 *
 * @author Tu
 */
public class MathUtilityTest {
    @Test
   public void testFactorialGivenRightArgumentReturnsGoodResult(){
       int n = 5;    // tui muon test 5! co dung la 120 hay ko
       long expected = 120;
       long actual = getFactorial(n);
       // hàm so sánh coi 2 thằng đó giống nhau không
       assertEquals(expected, actual);
       
       // minh test tiep cac truong hop khac dung dau vao, dung dau ra
       // khoi can bien trung gian, choi luon trong lenh
        assertEquals(720, getFactorial(6));
        assertEquals(24, getFactorial(4));
        assertEquals(6, getFactorial(3));
        assertEquals(1, getFactorial(1));
        assertEquals(1, getFactorial(0));
       
   }
    // dieu gi xay ra neu ta dua vao tham so ca chon, am, hoac > 20
   // theo thiet ke cua ham, dua vao ca chon se nem ra ngoaij le 
   // va ta can test xem ngoai le co dc nem ra khong neu ta ca chon
   // tuc la thay xuat hien ngoai le neu co ca chon dua vao -> ham dung
   // thay ngoai le khi co ca chon, minh mung vi ham da dung 
   @Test(expected = IllegalArgumentException.class) // them ti ki xao o day de bat ngoai le
   // co dung la khi chay ham nay thi nem ra ngoai le ten la IllegalArgument
   // neu dung nem ra ngai le cung ten, code dung r, phai xanh cơ
   public void testFactorialWrongArgumentThrowsExceptoion(){
       // minh test tinh huong ham phai nem ra ngoai le neu tham so ca chon
       // ngoai le la thu KHONG PHAI LA VALUE de so sanh, khong dung assertEquals()
       //ta phai dung chieu khac. JUnit4 khac JUnit5 o cho bat ngoai le
       // ki 5 di du thinhs SWT301 cua thay Hoang: DI , Lambda Expresstion lien quan
       //JUnit 5                                  Dependency Injection/ SOLID
       getFactorial(-5);
        getFactorial(21);
         getFactorial(40);
       
   }
}
