package com.justahead.kvantbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class KvantBackendApplication {

    public static void main(String[] args) {

//        Upgrade fingerUpgrade = new FingerUpgrade("Finger", 1, 100, 1.07, 1);
//        Upgrade robotUpgrade = new RobotUpgrade("Robot", 2, 200, 1.1, 1);
//
//        System.out.println(fingerUpgrade.calcPrice());
//        System.out.println(robotUpgrade.calcPrice());
//
//        fingerUpgrade.incrementOwned();
//        robotUpgrade.incrementOwned();
//
//        System.out.println(fingerUpgrade.getOwned());
//        System.out.println(robotUpgrade.getOwned());
//
//        System.out.println(fingerUpgrade.calcPrice());
//        System.out.println(robotUpgrade.calcPrice());

        SpringApplication.run(KvantBackendApplication.class, args);
    }

}
