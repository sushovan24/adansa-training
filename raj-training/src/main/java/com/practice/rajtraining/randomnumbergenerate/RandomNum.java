package com.practice.rajtraining.randomnumbergenerate;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public class RandomNum {

    public void getRandomDetails() {
        RandomHelp rh = new RandomHelp();
        rh.generatFourteenDigitRandomNum();
        rh.generatSixteenDigitAlphaNumbericNum();
        rh.sixtennDigitRandomNumEndWithOH();
        rh.sixteenDigitRandomAlphaNumStartWithYear();
    }

}
