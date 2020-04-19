package com.predictbay;

public class Main {

    public static void main(String[] args) {

        byte myChallengeByte = 127;
        short myChallengeShort = 767;
        int myChallengeInt = 1000;
        long myChallengeLong = 50000L + 10L * (myChallengeByte + myChallengeInt + myChallengeShort);
        System.out.println("Long Total = " + myChallengeLong);

        short myShortTotal = (short) (1000 + 10 * (myChallengeByte + myChallengeInt + myChallengeShort));
        System.out.println("Short Total = " + myShortTotal);


    }
}
