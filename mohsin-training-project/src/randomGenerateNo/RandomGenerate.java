/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomGenerateNo;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
 class RandomNoGenerate {
    public static void main(String[] args) {
        Random random=new Random();
        random.nextLong();
        System.out.println(random.nextLong());
        System.out.println(random.nextDouble());
        System.out.println(random.nextFloat());
        System.out.println(random.nextInt());
    }
    
}
