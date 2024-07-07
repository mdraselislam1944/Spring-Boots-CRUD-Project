package com.thinkConstructive.rest_demo.controller;

import com.thinkConstructive.rest_demo.model.CloudVendor;

import com.thinkConstructive.rest_demo.service.Implementation.CloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudVendors")
public class CloudVendorController {

    @Autowired
    private CloudVendorService cloudVendorService;

    @PostMapping
    public String createCloudVendor(@RequestBody CloudVendor cloudVendor) {
        return cloudVendorService.createCloudVendor(cloudVendor);
    }

    @PutMapping("/{id}")
    public String updateCloudVendor(@PathVariable String id, @RequestBody CloudVendor cloudVendor) {
        cloudVendor.setId(id); // Set the ID from the path variable
        return cloudVendorService.updateCloudVendor(cloudVendor);
    }

    @DeleteMapping("/{id}")
    public String deleteCloudVendor(@PathVariable String id) {
        return cloudVendorService.deleteCloudVendor(id);
    }

    @GetMapping("/{id}")
    public CloudVendor getCloudVendor(@PathVariable String id) {
        return cloudVendorService.getCloudVendor(id);
    }

    @GetMapping
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorService.getAllCloudVendors();
    }
}