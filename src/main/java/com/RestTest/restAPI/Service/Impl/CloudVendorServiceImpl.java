package com.RestTest.restAPI.Service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.RestTest.restAPI.Model.CloudVendor;
import com.RestTest.restAPI.Service.cloudVendorService;
import com.RestTest.restAPI.exception.CloudVendorNotFoundException;
import com.RestTest.restAPI.repository.cloudVendorRepository;

@Service
public class CloudVendorServiceImpl implements cloudVendorService {
	cloudVendorRepository cloudVendorRepo;

	public CloudVendorServiceImpl(cloudVendorRepository cloudVendorRepo) {
		this.cloudVendorRepo = cloudVendorRepo;
	}

	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepo.save(cloudVendor);
		return "Cloud Vendor Created Successfully";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepo.save(cloudVendor);
		return "Cloud Vendor Updated Successfully";
	}

	@Override
	public String deleteCloudVendor(String cloudVendorId) {
		cloudVendorRepo.deleteById(cloudVendorId);
		return "Cloud Vendor Deleted Successfully";
	}

	@Override
	public CloudVendor getCloudVendor(String cloudVendorId) {
		if(cloudVendorRepo.findById(cloudVendorId).isEmpty()) {
			throw new CloudVendorNotFoundException("Requested Cloud Vendor Does not Exists.");
		}
		return cloudVendorRepo.findById(cloudVendorId).get();
	}

	@Override
	public List<CloudVendor> getAllCloudVendor() {
		return cloudVendorRepo.findAll();
	}

}
