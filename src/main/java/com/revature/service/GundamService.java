package com.revature.service;

import com.revature.model.Gundam;
import com.revature.model.User;
import com.revature.repository.GundamRepository;
import com.revature.repository.GundamRepositoryImpl;
import com.revature.repository.UserRepositoryImpl;

import java.util.List;

public class GundamService {

    GundamRepository gundamRepository;

    public GundamService() {
        gundamRepository = new GundamRepositoryImpl();
    }

    public void saveGundam(Gundam gundam) {
        if(gundamRepository.getById(gundam.getGundamId()) == null) {
            gundamRepository.save(gundam);
        }
    }

    public void updateGundam(Gundam gundam) {
        if(gundamRepository.getById(gundam.getGundamId()) != null) {
            gundamRepository.update(gundam);
        }
    }

    public Gundam getGundamById(int id) {
        return gundamRepository.getById(id);
    }

    public void deleteGundam(int id) {
        if(gundamRepository.getById(id) != null) {
            gundamRepository.delete(id);
        }
    }

    public List<Gundam> getAllGundam() {
        return gundamRepository.getAll();
    }
}
