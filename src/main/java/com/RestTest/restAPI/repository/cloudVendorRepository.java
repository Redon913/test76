package com.RestTest.restAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RestTest.restAPI.Model.CloudVendor;

public interface cloudVendorRepository extends JpaRepository<CloudVendor, String> {
	List<CloudVendor> findByVendorName(String vendorName);
}
