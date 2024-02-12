package com.RestTest.restAPI.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RestTest.restAPI.Model.CloudVendor;
import com.RestTest.restAPI.Service.cloudVendorService;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorcontroller {
	
	cloudVendorService CVService;

	public CloudVendorcontroller(cloudVendorService cVService) {
		CVService = cVService;
	}
	
	@GetMapping("/")
	public List<CloudVendor> GetAllCloudVendorDetail() {
		return CVService.getAllCloudVendor();
	}

	@GetMapping("{vendorId}")
	public CloudVendor GetCloudVendorDetail(@PathVariable("vendorId") String vendorId) {
		return CVService.getCloudVendor(vendorId);
	}
	
	@PostMapping
	public String CreatecloudvendorDetail(@RequestBody CloudVendor cloudVendor) {
		CVService.createCloudVendor(cloudVendor);
		return "Cloud Vendor has been successfully Created";
	}
	
	@PutMapping
	public String UpdatecloudvendorDetail(@RequestBody CloudVendor cloudVendor) {
		CVService.updateCloudVendor(cloudVendor);
		return "Cloud Vendor has been successfully Updated";
	}
	
	
	@DeleteMapping("{vendorId}")
	public String DeletecloudvendorDetail(@PathVariable("vendorId") String cloudVendorId) {
		CVService.deleteCloudVendor(cloudVendorId);
		return "Cloud Vendor has been successfully deleted";
	}
	

}
