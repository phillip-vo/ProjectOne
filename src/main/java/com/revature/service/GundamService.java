package com.revature.service;

import com.revature.model.Gundam;
import com.revature.model.User;
import com.revature.repository.GundamRepository;
import com.revature.repository.GundamRepositoryImpl;
import com.revature.repository.UserRepositoryImpl;
import com.revature.util.HibernateUtil;
import org.apache.log4j.Logger;

import java.util.List;

public class GundamService {

    private static Logger logger = Logger.getLogger(HibernateUtil.class);

    GundamRepository gundamRepository;

    public GundamService() {
        gundamRepository = new GundamRepositoryImpl();
    }

    public void saveGundam(Gundam gundam) {
        if(gundamRepository.getById(gundam.getGundamId()) == null) {
            gundamRepository.save(gundam);
            logger.info("saveGundam: saving new gundam");
        }
    }

    public void updateGundam(Gundam gundam) {
        if(gundamRepository.getById(gundam.getGundamId()) != null) {
            gundamRepository.update(gundam);
            logger.info("updatingGundam: updating exiting gundam");
        }
    }

    public Gundam getGundamById(int id) {
        logger.info("getGundamById: retrieving gundam");
        return gundamRepository.getById(id);
    }

    public void deleteGundam(int id) {
        if(gundamRepository.getById(id) != null) {
            gundamRepository.delete(id);
            logger.info("deletingGundam: deleting gundam");
        }
    }

    public List<Gundam> getAllGundam() {
        logger.info("getAllGundam: retrieving all gundam");
        return gundamRepository.getAll();
    }
}
