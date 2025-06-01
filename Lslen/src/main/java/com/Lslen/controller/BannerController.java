package com.Lslen.controller;

import com.Lslen.entity.banner;
import com.Lslen.service.bannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/banners")
public class BannerController {

    @Autowired
    private bannerService bannerService;

    @GetMapping
    public List<banner> getAllBanners() {
        return bannerService.getAllBanners();
    }

    @GetMapping("/{id}")
    public banner getBannerById(@PathVariable Integer id) {
        return bannerService.getBannerById(id);
    }

    @PostMapping
    public void insertBanner(@RequestBody banner b) {
        bannerService.insertBanner(b);
    }

    @PutMapping("/{id}")
    public void updateBanner(@PathVariable Integer id, @RequestBody banner b) {
        b.setId(id);
        bannerService.updateBanner(b);
    }

    @DeleteMapping("/{id}")
    public void deleteBanner(@PathVariable Integer id) {
        bannerService.deleteBanner(id);
    }

    @GetMapping("/active")
    public List<banner> getActiveBanners() {
        return bannerService.getActiveBanners();
    }
}
