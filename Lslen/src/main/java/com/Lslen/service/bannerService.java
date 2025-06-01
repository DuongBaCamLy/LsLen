package com.Lslen.service;

import com.Lslen.entity.banner;

import java.util.List;

public interface bannerService {
    List<banner> getAllBanners();
    banner getBannerById(Integer id);
    void insertBanner(banner b);
    void updateBanner(banner b);
    void deleteBanner(Integer id);
    List<banner> getActiveBanners();
}
