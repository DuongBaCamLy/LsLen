package com.Lslen.service.impl;

import com.Lslen.entity.banner;
import com.Lslen.repository.bannerRepository;
import com.Lslen.service.bannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class bannerServiceImpl implements bannerService {

    @Autowired
    private bannerRepository bannerRepository;

    @Override
    public List<banner> getAllBanners() {
        return bannerRepository.findAll();
    }

    @Override
    public banner getBannerById(Integer id) {
        return bannerRepository.findById(id).orElse(null);
    }

    @Override
    public void insertBanner(banner b) {
        bannerRepository.save(b);
    }

    @Override
    public void updateBanner(banner b) {
        bannerRepository.save(b);
    }

    @Override
    public void deleteBanner(Integer id) {
        bannerRepository.deleteById(id);
    }

    @Override
    public List<banner> getActiveBanners() {
        return bannerRepository.findByActiveTrue();
    }
}
