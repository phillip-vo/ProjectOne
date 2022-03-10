package com.revature;

import com.revature.model.Gundam;
import com.revature.repository.GundamRepository;
import com.revature.repository.GundamRepositoryImpl;
import com.revature.repository.UserRepository;
import com.revature.repository.UserRepositoryImpl;
import com.revature.service.GundamService;

import java.io.IOException;
import java.util.List;

public class Driver {
    public static void main(String[] args) throws IOException {

        GundamService gs = new GundamService();

        List<Gundam> gundams = gs.getAllGundam();

        String model = "XXXG-01W";

        Gundam gundam = null;

        for(Gundam g : gundams) {
            if(model.equals(g.getModel())) {
                gundam = g;
            }
        }

        System.out.println("Found gundam: " + gundam);

    }
}
